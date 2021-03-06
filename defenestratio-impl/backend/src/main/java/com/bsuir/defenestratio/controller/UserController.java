package com.bsuir.defenestratio.controller;

import com.bsuir.defenestratio.entity.Profile;
import com.bsuir.defenestratio.entity.User;
import com.bsuir.defenestratio.service.ProfileService;
import com.bsuir.defenestratio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private ProfileService profileService;

    @Autowired
    public UserController(UserService userService, ProfileService profileService) {
        this.userService = userService;
        this.profileService = profileService;
    }

    @GetMapping
    public ResponseEntity findAllUsers() {
        final List<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/leaders")
    public ResponseEntity getProfilesLeaderboard() {
        final List<Profile> profiles = profileService.getProfilesSortedByRating();
        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity findUser(
            @PathVariable(name = "userId") Long userId) {
        final User user = userService.findUser(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping(value = "/{userId}/profile")
    public ResponseEntity findUserProfile(@PathVariable(name = "userId") Long userId) {
        final Profile profile = userService.findUserProfile(userId);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{userId}")
    public ResponseEntity disableUser(@PathVariable(name = "userId") Long userId) {
        userService.disable(userId);
        return new ResponseEntity<>("User disabled successfully", HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity unblockUser(@RequestBody User user) {
        userService.unlockUser(user);
        return new ResponseEntity<>("User unlocked successfully", HttpStatus.NO_CONTENT);
    }

    @PostMapping(value = "/{userId}/profile")
    public ResponseEntity updateUserProfile(
            @RequestBody Profile profile, @PathVariable(name = "userId") Long userId) {
        userService.updateUserProfile(profile);
        return new ResponseEntity<>("User profile updated", HttpStatus.OK);
    }
}

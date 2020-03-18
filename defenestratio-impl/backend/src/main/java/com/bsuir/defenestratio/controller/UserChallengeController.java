package com.bsuir.defenestratio.controller;

import com.bsuir.defenestratio.entity.UserChallenge;
import com.bsuir.defenestratio.service.UserChallengeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{roleId}/users/{userId}/challenges")
public class UserChallengeController {
    private UserChallengeService challengeService;

    public UserChallengeController(UserChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping
    public ResponseEntity findAll(
            @PathVariable(name = "userId") Long userId) {
        return new ResponseEntity<>(challengeService.findAllUserChallenges(userId), HttpStatus.OK);
    }

    @GetMapping(value = "/{challengeId}")
    public ResponseEntity findUserChallenge(
            @PathVariable(name = "userId") Long userId,
            @PathVariable(name = "challengeId") Long challengeId) {
        return new ResponseEntity<>(challengeService.findUserChallengeById(userId, challengeId), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteAllUserChallenges(
            @PathVariable(name = "userId") Long userId) {
        challengeService.deleteAllUserChallenges(userId);
        return new ResponseEntity<>("User challenges deleted", HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/{challengeId}")
    public ResponseEntity deleteUserChallenge(
            @PathVariable(name = "userId") Long userId,
            @PathVariable(name = "challengeId") Long challengeId) {
        challengeService.deleteUserChallenge(userId, challengeId);
        return new ResponseEntity<>("User challenge deleted", HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity createUserChallenge(
            @PathVariable(name = "userId") Long userId,
            @RequestBody UserChallenge userChallenge) {
        return new ResponseEntity<>(
                challengeService.createUserChallenge(userChallenge), HttpStatus.CREATED);
    }
}
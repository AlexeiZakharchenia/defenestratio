package com.bsuir.defenestratio.service;

import com.bsuir.defenestratio.entity.UserChallenge;

import java.util.List;

public interface UserChallengeService {

    UserChallenge createUserChallenge(UserChallenge userChallenge);

    List<UserChallenge> findAllUserChallenges(Long userId);

    UserChallenge findUserChallengeById(Long userId, Long challengeId);

    void deleteUserChallenge(Long userId, Long challengeId);

    void deleteAllUserChallenges(Long userId);
}
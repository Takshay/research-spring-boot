package com.reward.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.reward.domain.Reward;

public interface RewardRepository extends MongoRepository<Reward, String> {

}

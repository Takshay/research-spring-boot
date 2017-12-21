package com.mission.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mission.domain.Mission;

public interface MissionRepository extends MongoRepository<Mission, String> {

}

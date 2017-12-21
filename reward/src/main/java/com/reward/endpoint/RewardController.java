package com.reward.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reward.domain.Reward;
import com.reward.repository.RewardRepository;

@RestController
@RequestMapping("/v1.0/reward")
public class RewardController {
	
	@Autowired
	RewardRepository rewardRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Reward create(@RequestBody Reward mission){
		
		Reward result = rewardRepository.save(mission);
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{missionId}")
	public Reward get(@PathVariable String missionId){
		return rewardRepository.findOne(missionId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	public List<Reward> getAll(){
		return rewardRepository.findAll();
	}
}

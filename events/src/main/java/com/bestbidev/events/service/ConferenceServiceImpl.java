package com.bestbidev.events.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bestbidev.events.exception.NotFoundException;
import com.bestbidev.events.model.Conference;
import com.bestbidev.events.repo.ConferenceRepo;

@Service
public class ConferenceServiceImpl implements IConferenceService{

	private ConferenceRepo repo;
	
	
	public ConferenceServiceImpl(ConferenceRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Conference addConference(Conference conference) {
		// TODO Auto-generated method stub
		return repo.save(conference);
	}

	@Override
	public Conference getConferenceById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new NotFoundException("Conference not found: "+ id));
	}

	@Override
	public List<Conference> getAllConferences() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
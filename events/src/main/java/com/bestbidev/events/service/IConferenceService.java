package com.bestbidev.events.service;

import java.util.List;

import com.bestbidev.events.model.Conference;

public interface IConferenceService {
	public Conference addConference(Conference conference);
	public Conference getConferenceById(Integer id);
	public List<Conference> getAllConferences();
}
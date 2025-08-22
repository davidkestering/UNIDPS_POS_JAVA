package com.bestbidev.events.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bestbidev.events.exception.NotFoundException;
import com.bestbidev.events.model.Session;
import com.bestbidev.events.repo.SessionRepo;

@Service
public class SessionServiceImpl implements ISessionService{

	private SessionRepo repo;
	
	
	public SessionServiceImpl(SessionRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Session addSession(Session session) {
		// TODO Auto-generated method stub
		return repo.save(session);
	}

	@Override
	public Session getSessionById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()-> new NotFoundException("Session "+id+" not found"));
	}

	@Override
	public List<Session> getAllSessions() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
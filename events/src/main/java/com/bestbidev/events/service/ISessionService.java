package com.bestbidev.events.service;

import java.util.List;

import com.bestbidev.events.model.Session;

public interface ISessionService {
	public Session addSession(Session session);
	public Session getSessionById(Integer id);
	public List<Session> getAllSessions();
}
package com.bestbidev.events.controller;

import com.bestbidev.events.model.Session;
import com.bestbidev.events.model.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class SubscriptionID {
	
	@ManyToOne
	@JoinColumn(name = "subscribed_used_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "session_id")
	private Session session;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	
}

package com.bestbidev.events.service;

import java.util.List;

import com.bestbidev.events.model.Session;
import com.bestbidev.events.model.Subscription;
import com.bestbidev.events.model.User;

public interface ISubscriptionService {
	public Subscription addSubscription(Subscription subscription);
	
	public List<Subscription> getAllByUser(User user);
	
	public List<Subscription> getAllBySession(Session session);
}

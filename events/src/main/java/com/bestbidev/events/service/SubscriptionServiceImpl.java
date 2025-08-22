package com.bestbidev.events.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.bestbidev.events.model.Session;
import com.bestbidev.events.model.Subscription;
import com.bestbidev.events.model.User;
import com.bestbidev.events.repo.SubscriptionRepo;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {
	
	private SubscriptionRepo repo;
	
	public SubscriptionServiceImpl(SubscriptionRepo repo) {
		this.repo = repo;
	}

	@Override
	public Subscription addSubscription(Subscription subscription) {
		subscription.setCreatedAt(LocalDateTime.now());
		subscription.setUniqueID(UUID.randomUUID().toString());
		return repo.save(subscription);
	}

	@Override
	public List<Subscription> getAllByUser(User user) {
		return repo.findByIdUser(user);
	}

	@Override
	public List<Subscription> getAllBySession(Session session) {
		return repo.findByIdSession(session);
	}

}

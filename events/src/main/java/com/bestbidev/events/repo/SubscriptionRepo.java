package com.bestbidev.events.repo;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.bestbidev.events.model.Session;
import com.bestbidev.events.model.Subscription;
import com.bestbidev.events.model.SubscriptionID;
import com.bestbidev.events.model.User;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {
	public List<Subscription> findByIdUser(User user);
	
	public List<Subscription> findByIdSession(Session session);
}

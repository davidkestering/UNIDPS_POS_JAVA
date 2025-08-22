package com.bestbidev.events.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bestbidev.events.model.Session;
import com.bestbidev.events.model.Subscription;
import com.bestbidev.events.model.User;
import com.bestbidev.events.service.ISubscriptionService;

@RestController
public class SubscriptionController {
	private ISubscriptionService service;

	public SubscriptionController(ISubscriptionService service) {
		this.service = service;
	}
	
	@PostMapping("/subscriptions")
	public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription){
		return ResponseEntity.status(201).body(service.addSubscription(subscription));
	}
	
	@GetMapping("/subscription/user/{id}")
	public ResponseEntity<List<Subscription>> getByUser(@PathVariable(name = "userId") Integer id){
		User user = new User();
		user.setUserId(id);
		return ResponseEntity.ok(service.getAllByUser(user));
	}
	
	@GetMapping("/subscription/session/{id}")
	public ResponseEntity<List<Subscription>> getBySession(@PathVariable(name = "idSession") Integer id){
		Session session = new Session();
		session.setIdSession(id);
		return ResponseEntity.ok(service.getAllBySession(session));
	}
	
}

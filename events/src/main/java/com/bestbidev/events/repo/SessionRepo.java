package com.bestbidev.events.repo;

import org.springframework.data.repository.ListCrudRepository;

import com.bestbidev.events.model.Session;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {

}

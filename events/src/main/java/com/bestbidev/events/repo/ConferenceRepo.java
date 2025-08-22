package com.bestbidev.events.repo;

import org.springframework.data.repository.ListCrudRepository;

import com.bestbidev.events.model.Conference;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer>{

}

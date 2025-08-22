package com.bestbidev.events.model;

import java.time.LocalDateTime;

import com.bestbidev.events.controller.SubscriptionID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_subscription")
public class Subscription {
	
	@Id
	private SubscriptionID id;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "level")
	private Integer level;
	@Column(name = "unique_id", nullable = false, length = 255)
	private String UniqueID;
	
	public SubscriptionID getId() {
		return id;
	}
	public void setId(SubscriptionID id) {
		this.id = id;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getUniqueID() {
		return UniqueID;
	}
	public void setUniqueID(String uniqueID) {
		UniqueID = uniqueID;
	}
	
	
}

package com.bestbidev.events.model;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_session")
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "session_id")
	private Integer idSession;
	@Column(name = "title", length = 255, nullable = false)
	private String title;
	@Column(name = "startDate", nullable = false)
	private LocalDate startDate;
	@Column(name = "startTime", nullable = false)
	private LocalTime startTime;
	
	@ManyToOne
	@JoinColumn(name = "tbl_conference_id_conference")
	private Conference conference;
	
	//o exemplo abaixo eh apenas para caso a tabela de juncao ter os dois ids de referencia como colunas e nenhuma outra coluna
	/*@ManyToMany
	@JoinTable(
		name = "tbl_subscription",
		joinColumns = @JoinColumn(name = "session_id"),
		inverseJoinColumns = @JoinColumn(name = "subscribed_user_id")
	)
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}*/
	
	public Integer getIdSession() {
		return idSession;
	}
	public void setIdSession(Integer idSession) {
		this.idSession = idSession;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public Conference getConference() {
		return conference;
	}
	public void setConference(Conference conference) {
		this.conference = conference;
	}
	@Override
	public String toString() {
		return "Session [idSession=" + idSession + ", title=" + title + ", startDate=" + startDate + ", startTime="
				+ startTime + ", conference=" + conference + "]";
	}
	
	

}

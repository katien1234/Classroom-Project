package com.qa.persistence.domain;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	
	private Long classroomId;
	private String trainerName;
	
	public Classroom() {

	}
	
	public Classroom(Long classroomId, String trainerName) {
		this.classroomId = classroomId;
		this.trainerName = trainerName;
	}
	
	
	public Long getClassroomId() {
		return classroomId;
	}

	public void setId(Long ClassroomId) {
		this.classroomId = ClassroomId;
	}
	
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	/* Trying to join using primary key and foreign key, needs more time 
	@OneToMany
	@JoinTable
	(name="traineeid",
	joinColumns= {@JoinColumn(name="traineeid", referencedColumnName="traineid")},
	inverseJoinColumns={ @JoinColumn(name="Classroomid", referencdColumnName="id"),
		unique=true)}

	
	(mappedBy="classroom")private List<Trainee> trainees;
	*/
	
	
	
	
}

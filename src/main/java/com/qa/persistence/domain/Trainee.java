package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	
	private Long traineeId;
	private Long classroomId;
	private String traineeName;
	
	public Trainee() {

	}
	
	public Trainee(Long traineeId, Long classroomId, String traineeName) {
		this.traineeId = traineeId;
		this.classroomId = classroomId;
		this.traineeName = traineeName;
	}
	
	
	public Long gettraineeId() {
		return traineeId;
	}

	public void setId(Long traineeId) {
		this.traineeId = traineeId;
	}

	
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}


	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	
	public Long getClassroomId() {
		return classroomId;
	}
	
}

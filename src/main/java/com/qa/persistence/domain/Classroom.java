package com.qa.persistence.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
}

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
	private Long traineeId;
	private String traineeName;
	
	public Classroom() {

	}
	
	
	public Classroom(String trainerName, Long traineeId, String traineeName) {
		this.trainerName = trainerName;
		this.traineeId = traineeId;
		this.traineeName = traineeName;
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
	public Long getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
}

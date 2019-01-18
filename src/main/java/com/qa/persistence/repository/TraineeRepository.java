package com.qa.persistence.repository;

public interface TraineeRepository {

	String getAllTrainees();
	String createTrainee(Long classroomId, String trainee);
	String deleteTrainee(Long id);
	String updateTrainee(Long id, Long classroomId, String trainee);


	
}

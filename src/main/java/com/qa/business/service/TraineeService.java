package com.qa.business.service;

public interface TraineeService {

	String getAllTrainees();
	
	String addTrainee(Long classroomId, String trainee);
	
	String deleteTrainee(Long id);

	String updateTrainee(Long id, Long classroomId, String trainee);
	
	
	
}

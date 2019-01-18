package com.qa.persistence.repository;

public interface ClassroomRepository {

	String getAllClassrooms();
	
	String getAllTrainers();
	
	String getAllTrainees();
	
	String createClassroom(String classroom);
	
	String createTrainer(String trainer);
	
	String createTrainee(String trainee);
	
	String deleteClassroom(Long id);
	
	String deleteTrainer(Long id);
	
	String deleteTrainee(Long id);

	
}

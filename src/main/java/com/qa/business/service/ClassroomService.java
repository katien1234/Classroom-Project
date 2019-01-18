package com.qa.business.service;

public interface ClassroomService {

		String getAllClassrooms();
		
		String getAllTrainers();
		
		String getAllTrainees();
		
		String addClassroom(String classroom);
		
		String addTrainer(String trainer);
		
		String addTrainee(String trainee);
		
		String deleteClassroom(Long id);
		
		String deleteTrainer(Long id);
		
		String deleteTrainee(Long id);

	
		
	
}

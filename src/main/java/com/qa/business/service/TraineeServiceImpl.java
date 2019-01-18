package com.qa.business.service;

import javax.inject.Inject;
import com.qa.persistence.repository.TraineeRepository;

public class TraineeServiceImpl implements TraineeService {

	@Inject
	private TraineeRepository repo;

	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	public String addTrainee(Long classroomId, String trainee) {
		return repo.createTrainee(classroomId, trainee);
	}

	public String deleteTrainee(Long id) {
		return repo.deleteTrainee(id);
	}

	public void setRepo(TraineeRepository repo) {
		this.repo = repo;
	}

	public String updateTrainee(Long id, Long classroomId, String trainee) {

		return repo.updateTrainee(id, classroomId, trainee);

	}


}

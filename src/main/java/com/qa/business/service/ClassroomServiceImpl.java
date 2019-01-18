package com.qa.business.service;
import javax.inject.Inject;
import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {

	
	@Inject
	private ClassroomRepository repo;
	

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String getAllTrainers() {
		return repo.getAllTrainers();
	}

	public String getAllTrainees() {
		return repo.getAllTrainees();
	}
	
	@Override
	public String addClassroom(String classroom) {
		return repo.createClassroom(classroom);
	}
	
	@Override
	public String addTrainer(String trainer) {
		return repo.createTrainer(trainer);
	}
	
	@Override
	public String addTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}

	public String deleteTrainer(Long id) {
		return repo.deleteTrainer(id);
	}

	public String deleteTrainee(Long id) {
		return repo.deleteTrainee(id);
	}
	
	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}
	
}

package com.qa.business.service;
import javax.inject.Inject;
import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {

	
	@Inject
	private ClassroomRepository repo;
	

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	
	public String addClassroom(String classroom) {
		return repo.createClassroom(classroom);
	}
	

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}

	
	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}


	public String updateClassroom(Long id, String classroom) {
		
		return repo.updateClassroom(id, classroom);
		
	}
	
}

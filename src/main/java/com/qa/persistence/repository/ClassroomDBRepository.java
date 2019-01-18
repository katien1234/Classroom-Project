package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import com.qa.business.service.ClassroomService;
import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default

public class ClassroomDBRepository implements ClassroomRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	public String getAllClassrooms() {
		Query query = manager.createQuery("Select a FROM Classroom a");
		Collection<Classroom> classrooms = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classrooms);
		
	}
		
	@Transactional(REQUIRED)
	public String createClassroom(String classro) {
		Classroom anClassroom = util.getObjectForJSON(classro, Classroom.class);
		manager.persist(anClassroom);
		return "{\"message\": \"classroom has been sucessfully added\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		Classroom classroomInDB = findClassroom(id);
		if (classroomInDB != null) {
			manager.remove(classroomInDB);
		}
		return "{\"message\": \"classroom sucessfully deleted\"}";
	}
	
	public String updateClassroom(Long id, String classroom) {
		Classroom theClassroom = findClassroom(id);
		manager.remove(theClassroom);;
		Classroom anClassroom = util.getObjectForJSON(classroom,  Classroom.class);
		manager.persist(anClassroom);
		
		return null;
	}
	
	
	private Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}
	
	
}
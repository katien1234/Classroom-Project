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

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default

public class TraineeDBRepository implements TraineeRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	public String getAllTrainees() {
		Query query = manager.createQuery("Select a FROM Trainee a");
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainees);
		
	}
		
	@Transactional(REQUIRED)
	public String createTrainee(Long classroomId, String train) {
		Trainee anTrainee = util.getObjectForJSON(train, Trainee.class);
		manager.persist(anTrainee);
		return "{\"message\": \"trainee has been sucessfully added\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		Trainee traineeInDB = findTrainee(id);
		if (traineeInDB != null) {
			manager.remove(traineeInDB);
		}
		return "{\"message\": \"trainee sucessfully deleted\"}";
	}
	
	public String updateTrainee(Long id, Long classroomId, String trainee) {
		Trainee theTrainee = findTrainee(id);
		manager.remove(theTrainee);;
		Trainee anTrainee = util.getObjectForJSON(trainee,  Trainee.class);
		manager.persist(anTrainee);
		
		return null;
	}
	
	
	private Trainee findTrainee(Long id) {
		return manager.find(Trainee.class, id);
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	
	
}
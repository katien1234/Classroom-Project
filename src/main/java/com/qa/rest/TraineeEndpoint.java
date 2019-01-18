package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.business.service.TraineeService;

@Path("/trainee")
public class TraineeEndpoint {

	@Inject
	private TraineeService service;
	
	@Path("/getAllTrainees")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainees() {
		return service.getAllTrainees();
	}
	

	@Path("/createTrainee")
	@POST
	@Produces({ "application/json" })
	public String addTrainee(Long classroomId, String trainee) {
		return service.addTrainee(classroomId,trainee);
	}
	

	@Path("/deleteTrainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") Long id) {
		return service.deleteTrainee(id);
	}
	
	@Path("/updateTrainee/{id}")
	@DELETE 
	@Produces({"application/json"})
	public String updateTrainee(@PathParam("id") Long id, Long classroomId, String trainee) {
		return service.updateTrainee(id, classroomId, trainee);
	}
	
	
	
	public void setService(TraineeService service) {
		this.service = service;
	}
}

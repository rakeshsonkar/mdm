package gov.sanction;

import javax.inject.Inject;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import gov.sanction.request.AdminDepartmentDto;
import gov.sanction.request.WorkflowRequest;
import io.helidon.microprofile.tests.junit5.HelidonTest;

@HelidonTest
public class MDMTest {
	@Inject
	WebTarget webTarget;

	@Test
	void getMajorHeadTest() {
		Response response = webTarget.path("SanctionSvc/mdm/v1.0/getSubMajorHead").request()
				.post(Entity.entity("{\"majorHeadCode\" : \"1601\"}", MediaType.APPLICATION_JSON));
		Assertions.assertEquals(200, response.getStatus(), "Get Sub Major Head Test Failed");
	}
	
	@Test
	void getAdminDeptDetails() {
		AdminDepartmentDto adminDepartmentDto = new AdminDepartmentDto();
		adminDepartmentDto.setAdminDeptId(1);
		try (Response r = webTarget.path("SanctionSvc/mdm/v1.0/getAdminDepartment").request()
				.post(Entity.entity(adminDepartmentDto, MediaType.APPLICATION_JSON))) {
			Assertions.assertEquals(200, r.getStatus(), "Get Admin Department Test Failed");
		}
	}
	
	@Test
	void getWorkflowDetails() {
		WorkflowRequest workflowRequest = new WorkflowRequest();
		workflowRequest.setAssignmentId(1001);
		workflowRequest.setFormID(1);
		try (Response r = webTarget.path("SanctionSvc/wf/v1.0/getWorkflowID").request()
				.post(Entity.entity(workflowRequest, MediaType.APPLICATION_JSON))) {

			System.out.println("testing Rakesh -> " + r.bufferEntity());
			Assertions.assertEquals(200, r.getStatus(), "Workflow Request Details Test Failed");
		}
	}
}

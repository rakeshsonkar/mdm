package gov.sanction.entity;

import javax.enterprise.context.Dependent;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import gov.sanction.request.DepartmentRequest;

@RegisterRestClient(baseUri = "http://172.22.32.100:8085")
@Path("/GlobalMasterSvc/mdm/v1.0")
@Dependent
public interface DepartmentRestClient {
    @POST
    @Path("/createDepartment")
    public Response postDetails(DepartmentRequest departmentRequest);
    
}
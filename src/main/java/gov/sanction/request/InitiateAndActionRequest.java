package gov.sanction.request;

import java.sql.Clob;

import lombok.Data;

@Data
public class InitiateAndActionRequest {

	private Clob payload;
	
}

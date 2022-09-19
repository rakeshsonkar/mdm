package gov.sanction.response;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class RemarksResponse {
	private Integer assignmentId;
	private String assigneeName;
	private String remarks;
	private String  actionTaken;
	private Integer taskTranId;
	private Timestamp modifiedDt;
}

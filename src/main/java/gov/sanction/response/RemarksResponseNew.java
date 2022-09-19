package gov.sanction.response;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class RemarksResponseNew {
	private Timestamp modifiedDt;
	private String assigneeName;
	private String  actionTaken;
	private String remarks;
	private Integer taskTranId;
	private Integer assignmentId;
	private String levelType;
	private String roleName;
	private String displayName;
	private String name;
}

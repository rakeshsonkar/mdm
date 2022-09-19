package gov.sanction.entity;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="REQUEST_WF_TRANSACTION")
public class RequestWfTransaction {
	
	@Id
	@Column(name = "TASK_TRAN_ID")
	private Integer taskTranId;
	
	@Column(name = "REQUEST_ID")
	private Integer requestId;
	
	@Column(name = "PROCESS_TASK_ID")
	private Integer processTaskId;
	
	@Column(name = "ROLE_ID")
	private Integer roleId;
	
	@Column(name = "ASSIGNMENT_ID")
	private Integer assignmentId;
	
	@Column(name = "ASSIGNEE_ID")
	private Integer  assigneeId;
	
	@Column(name = "ASSIGNEE_NAME")
	private String  assigneeName;
	
	@Column(name = "ACTION_TAKEN")
	private String  actionTaken;
	
	@Column(name = "REMARKS")
	private String  remarks;
	
	@Column(name = "IP_ADDRESS")
	private String  ipAddress;
	
	@Column(name = "ASSIGN_NOTIFY")
	private String  assignNotify;
	
	@Column(name = "ACTION_NOTIFY")
	private String  actionNotify;
	
	@Column(name = "TASK_EXPIRY")
	private String  taskExpriry;
	
	@Column(name = "CREATED_BY")
	private Integer createdBy;

	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	@Column(name = "CREATED_DT")
	private Timestamp createdDt;

	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDt;
	
}

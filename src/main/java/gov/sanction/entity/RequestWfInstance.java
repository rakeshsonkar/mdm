package gov.sanction.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "REQUEST_WF_INSTANCE")
public class RequestWfInstance {
	@Id
	@Column(name = "REQUEST_ID")
	private Long requestId;

	@Column(name = "PROCESS_ID")
	private Integer processId;

	@Column(name = "REQ_DESC")
	private String requestDescription;

	@Column(name = "INITIATOR")
	private Integer initiator;

	@Column(name = "CURRENT_STAGE")
	private Integer currentStage;
	
	@Column(name = "MASTER_ID")
	private Integer masterID;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	@Column(name = "REMARKS")
	private String remark;

	@Column(name = "CURRENT_ASSIGNMENT_ID")
	private Integer currentAssignmentId;

	@Column(name = "EFF_START_DT")
	private Timestamp effStartDt;

	@Column(name = "EFF_END_DT")
	private Timestamp effEndDt;

	@Column(name = "CREATED_BY")
	private Integer createdBy;

	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	@Column(name = "CREATED_DT")
	private Timestamp createdDt;
	
	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDt;
	
	@Column(name="PREVIOUS_ASSIGNEE")
	private String  previousAsignee;

}

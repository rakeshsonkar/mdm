package gov.sanction.entity;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "REQUEST_WF_DATA")
public class TaskIdData {
	@Id
	@Column(name = "TASK_DATA_ID")
	private Integer taskDataId;

	@Column(name = "TASK_TRAN_ID")
	private Integer taskTranId;
	
	@Lob
	@Column(insertable = true, name = "DATA", columnDefinition="CLOB NOT NULL", updatable = true)
	private String data;

	@Column(name = "CREATED_DT")
	private Timestamp createdDt;

}

package gov.sanction.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="MST_DOCUMENTS",schema ="WF")
public class MstDocuments {
	
	@Id
	@Column(name = "DOCUMENT_ID")
	private Integer documentId;
	
	@Column(name = "DOCUMENT_NM_HI")
	private String documentNmHi;
	
	@Column(name = "DOCUMENT_NM_ENG")
	private String documentNmEng;
	
	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "IS_ACTIVE")
	private String isActive;
	
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
	
}

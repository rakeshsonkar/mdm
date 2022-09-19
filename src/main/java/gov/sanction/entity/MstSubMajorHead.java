package gov.sanction.entity;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MST_SUB_MAJOR_HEAD" , schema ="MDM")
public class MstSubMajorHead {
	@Id
	@Column(name = "MAJOR_HEAD_CODE", nullable = false)
	private String  majorHeadCode;
	
	@Column(name = "SUB_MAJOR_HEAD_CODE", nullable = false)
	private String  subMajorHeadCode;
	
	@Column(name = "SUB_MAJOR_HEAD_NAME_EN", nullable = false)
	private String  subMajorHeadNameEn;
	
	@Column(name = "SUB_MAJOR_HEAD_NAME_HI", nullable = false)
	private String  subMajorHeadNameHi;
	
	@Column(name = "IS_ACTIVE", nullable = false)
	private String  isActive;
	
	@Basic(optional = false)
	@Column(name = "EFF_START_DT")
	private Timestamp effStartDt;

	@Basic(optional = false)
	@Column(name = "EFF_END_DT")
	private Timestamp effEndDt;
	
	@Column(name = "CREATED_BY")
	private Integer createdBy;
	
	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	@Basic(optional = false)
	@Column(name = "CREATED_DT")

	private Timestamp createdDt;

	@Basic(optional = false)
	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDt;
	
}

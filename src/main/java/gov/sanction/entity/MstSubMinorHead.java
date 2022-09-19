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
@Table(name = "MST_SUB_MINOR_HEAD", schema = "MDM")
public class MstSubMinorHead {
	@Id
	@Column(name = "MAJOR_HEAD_CODE")
	private String majorHeadCode;

	@Column(name = "SUB_MAJOR_HEAD_CODE")
	private String subMajorHeadCode;

	@Column(name = "MINOR_HEAD_CODE")
	private String minorHeadCode;

	@Column(name = "SUB_MINOR_HEAD_CODE")
	private String subMinorHeadCode;

	@Column(name = "SUB_MINOR_HEAD_NAME_EN")
	private String subMinorHeadNameEn;

	@Column(name = "SUB_MINOR_HEAD_NAME_HI")
	private String subMinorHeadNameHi;

	@Column(name = "IS_ACTIVE", nullable = false)
	private String isActive;

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

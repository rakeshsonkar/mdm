package gov.sanction.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MST_SUB_GROUP_HEAD", schema = "MDM")
public class MstSubGroupHead implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "BUDGET_HEAD_ID")
	private Integer budgetHeadId;

	@Column(name = "MAJOR_HEAD_CODE")
	private String majorHeadCode;

	@Column(name = "SUB_MAJOR_HEAD_CODE")
	private String subMajorHeadCode;

	@Column(name = "MINOR_HEAD_CODE")
	private String minorHeadCode;

	@Column(name = "SUB_MINOR_HEAD_CODE")
	private String subMinorHeadCode;

	@Column(name = "GROUP_SUB_HEAD_CODE")
	private String groupSubHeadCode;

	@Column(name = "GROUP_SUB_HEAD_NAME_EN")
	private String groupSubHeadNameEN;

	@Column(name = "GROUP_SUB_HEAD_NAME_HI")
	private String groupSubHeadNameHI;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	@Column(name = "EFF_START_DT")
	private Timestamp effStartDT;

	@Column(name = "EFF_END_DT")
	private Timestamp effEndDT;

	@Column(name = "CREATED_BY")
	private Integer createdBY;

	@Column(name = "MODIFIED_BY")
	private Integer modifiedBY;

	@Column(name = "CREATED_DT")
	private Timestamp createdDT;

	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDT;

}

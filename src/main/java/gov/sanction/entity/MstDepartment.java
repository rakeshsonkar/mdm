package gov.sanction.entity;



import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_DEPARTMENT" , schema ="MDM")
public class MstDepartment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "DEPT_ID")
	private Integer departmentId;

	@Column(name = "ADMIN_DEPT_ID")
	private String adminDeptId;

	@Column(name = "DEPT_NAME_EN")
	private String departmentNameEng;

	@Column(name = "DEPT_NAME_HI")
	private String departmentNameHin;

	@Column(name = "HOD_OFFICE_ID")
	private Integer hodOfficeId;

	@Column(name = "DEPT_TYPE_ID")
	private Integer departmentTypeId;

	@Column(name = "IS_ACTIVE")
	private String isACTIVE;

	@Column(name = "EFF_START_DT")
	private Timestamp effStartDate;

	@Column(name = "EFF_END_DT")
	private Timestamp effEndDate;

	@Column(name = "CREATED_BY")
	private Integer createdBy;

	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	@Column(name = "CREATED_DT")
	private Timestamp createdDate;

	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDate;

	public MstDepartment() {
	}

	public MstDepartment(Integer departmentId, String adminDeptId, String departmentNameEng, String departmentNameHin,
			Integer hodOfficeId, Integer departmentTypeId, String isACTIVE, Timestamp effStartDate,
			Timestamp effEndDate, Integer createdBy, Integer modifiedBy, Timestamp createdDate,
			Timestamp modifiedDate) {
		super();
		this.departmentId = departmentId;
		this.adminDeptId = adminDeptId;
		this.departmentNameEng = departmentNameEng;
		this.departmentNameHin = departmentNameHin;
		this.hodOfficeId = hodOfficeId;
		this.departmentTypeId = departmentTypeId;
		this.isACTIVE = isACTIVE;
		this.effStartDate = effStartDate;
		this.effEndDate = effEndDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getAdminDeptId() {
		return adminDeptId;
	}

	public void setAdminDeptId(String adminDeptId) {
		this.adminDeptId = adminDeptId;
	}

	public String getDepartmentNameEng() {
		return departmentNameEng;
	}

	public void setDepartmentNameEng(String departmentNameEng) {
		this.departmentNameEng = departmentNameEng;
	}

	public String getDepartmentNameHin() {
		return departmentNameHin;
	}

	public void setDepartmentNameHin(String departmentNameHin) {
		this.departmentNameHin = departmentNameHin;
	}

	public Integer getHodOfficeId() {
		return hodOfficeId;
	}

	public void setHodOfficeId(Integer hodOfficeId) {
		this.hodOfficeId = hodOfficeId;
	}

	public Integer getDepartmentTypeId() {
		return departmentTypeId;
	}

	public void setDepartmentTypeId(Integer departmentTypeId) {
		this.departmentTypeId = departmentTypeId;
	}

	public String getIsACTIVE() {
		return isACTIVE;
	}

	public void setIsACTIVE(String isACTIVE) {
		this.isACTIVE = isACTIVE;
	}

	public Timestamp getEffStartDate() {
		return effStartDate;
	}

	public void setEffStartDate(Timestamp effStartDate) {
		this.effStartDate = effStartDate;
	}

	public Timestamp getEffEndDate() {
		return effEndDate;
	}

	public void setEffEndDate(Timestamp effEndDate) {
		this.effEndDate = effEndDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", adminDeptId=" + adminDeptId + ", departmentNameEng="
				+ departmentNameEng + ", departmentNameHin=" + departmentNameHin + ", hodOfficeId=" + hodOfficeId
				+ ", departmentTypeId=" + departmentTypeId + ", isACTIVE=" + isACTIVE + ", effStartDate=" + effStartDate
				+ ", effEndDate=" + effEndDate + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}


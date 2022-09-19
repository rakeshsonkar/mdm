package gov.sanction.entity;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_DEPT_TYPE" , schema ="MDM")
public class DepartmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DEPT_TYPE_ID")
	private Integer deptTypeId;

	@Column(name = "DEPT_TYPE_CATERGORY")
	private String deptTypeCategory;

	@Column(name = "TYPE_OF_DEPT")
	private String typeOfDepartment;

	@Column(name = "IS_ACTIVE")
	private String isActive;

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

	public DepartmentType() {
	}

	public DepartmentType(Integer deptTypeId, String deptTypeCategory, String typeOfDepartment, String isActive,
			Timestamp effStartDate, Timestamp effEndDate, Integer createdBy, Integer modifiedBy, Timestamp createdDate,
			Timestamp modifiedDate) {
		super();
		this.deptTypeId = deptTypeId;
		this.deptTypeCategory = deptTypeCategory;
		this.typeOfDepartment = typeOfDepartment;
		this.isActive = isActive;
		this.effStartDate = effStartDate;
		this.effEndDate = effEndDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public Integer getDeptTypeId() {
		return deptTypeId;
	}

	public void setDeptTypeId(Integer deptTypeId) {
		this.deptTypeId = deptTypeId;
	}

	public String getDeptTypeCategory() {
		return deptTypeCategory;
	}

	public void setDeptTypeCategory(String deptTypeCategory) {
		this.deptTypeCategory = deptTypeCategory;
	}

	public String getTypeOfDepartment() {
		return typeOfDepartment;
	}

	public void setTypeOfDepartment(String typeOfDepartment) {
		this.typeOfDepartment = typeOfDepartment;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DepartmentType [deptTypeId=" + deptTypeId + ", deptTypeCategory=" + deptTypeCategory
				+ ", typeOfDepartment=" + typeOfDepartment + ", isActive=" + isActive + ", effStartDate=" + effStartDate
				+ ", effEndDate=" + effEndDate + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}


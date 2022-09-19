package gov.sanction.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_ADMIN_DEPT" , schema ="MDM")
public class AdminDepartment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ADMIN_DEPT_ID")
	private Integer adminDeptId;

	@Column(name = "ADMIN_NAME_ENGLISH")
	private String adminNameEng;

	@Column(name = "ADMIN_NAME_HINDI")
	private String adminNameHin;

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

	public AdminDepartment() {
		
	}

	public AdminDepartment(Integer adminDeptId, String adminNameEng, String adminNameHin, String isActive,
			Timestamp effStartDate, Timestamp effEndDate, Integer createdBy, Integer modifiedBy, Timestamp createdDate,
			Timestamp modifiedDate) {
		super();
		this.adminDeptId = adminDeptId;
		this.adminNameEng = adminNameEng;
		this.adminNameHin = adminNameHin;
		this.isActive = isActive;
		this.effStartDate = effStartDate;
		this.effEndDate = effEndDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public Integer getAdminDeptId() {
		return adminDeptId;
	}

	public void setAdminDeptId(Integer adminDeptId) {
		this.adminDeptId = adminDeptId;
	}

	public String getAdminNameEng() {
		return adminNameEng;
	}

	public void setAdminNameEng(String adminNameEng) {
		this.adminNameEng = adminNameEng;
	}

	public String getAdminNameHin() {
		return adminNameHin;
	}

	public void setAdminNameHin(String adminNameHin) {
		this.adminNameHin = adminNameHin;
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

	@Override
	public String toString() {
		return "AdminDepartment [adminDeptId=" + adminDeptId + ", adminNameEng=" + adminNameEng + ", adminNameHin="
				+ adminNameHin + ", isActive=" + isActive + ", effStartDate=" + effStartDate + ", effEndDate="
				+ effEndDate + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}

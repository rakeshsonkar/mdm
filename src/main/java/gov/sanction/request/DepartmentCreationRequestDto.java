package gov.sanction.request;

import java.sql.Timestamp;

public class DepartmentCreationRequestDto 
{
	//Auto Generated
	//private Integer departmentId;
	//Request
	private String adminDeptId;
	private String departmentNameEng;
	private String departmentNameHin;
	private Integer hodOfficeId;
	private Integer departmentTypeId;
	private Integer createdBy;
	//Hard code
	private String isACTIVE;
	private Timestamp effStartDate;
	private Timestamp effEndDate;
	private Integer modifiedBy;
	private Timestamp createdDate;
	private Timestamp modifiedDate;

	public DepartmentCreationRequestDto()
	{}

	public DepartmentCreationRequestDto(String adminDeptId, String departmentNameEng, String departmentNameHin,
			Integer hodOfficeId, Integer departmentTypeId, Integer createdBy, String isACTIVE, Timestamp effStartDate,
			Timestamp effEndDate, Integer modifiedBy, Timestamp createdDate, Timestamp modifiedDate) {
		super();
		this.adminDeptId = adminDeptId;
		this.departmentNameEng = departmentNameEng;
		this.departmentNameHin = departmentNameHin;
		this.hodOfficeId = hodOfficeId;
		this.departmentTypeId = departmentTypeId;
		this.createdBy = createdBy;
		this.isACTIVE = isACTIVE;
		this.effStartDate = effStartDate;
		this.effEndDate = effEndDate;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
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

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
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
		return "DepartmentCreationRequestDto [adminDeptId=" + adminDeptId + ", departmentNameEng=" + departmentNameEng
				+ ", departmentNameHin=" + departmentNameHin + ", hodOfficeId=" + hodOfficeId + ", departmentTypeId="
				+ departmentTypeId + ", createdBy=" + createdBy + ", isACTIVE=" + isACTIVE + ", effStartDate="
				+ effStartDate + ", effEndDate=" + effEndDate + ", modifiedBy=" + modifiedBy + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
}

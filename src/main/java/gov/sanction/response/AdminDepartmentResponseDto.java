package gov.sanction.response;

import java.sql.Timestamp;

public class AdminDepartmentResponseDto {
	
    private  Integer adminDeptId; 	
	private String adminNameEng;
	private String adminNameHin;
	private String isActive;
	private Timestamp effStartDate;
	private Timestamp effEndDate;
	
	public AdminDepartmentResponseDto()
	{}

	public AdminDepartmentResponseDto(Integer adminDeptId, String adminNameEng, String adminNameHin, String isActive,
			Timestamp effStartDate, Timestamp effEndDate) {
		super();
		this.adminDeptId = adminDeptId;
		this.adminNameEng = adminNameEng;
		this.adminNameHin = adminNameHin;
		this.isActive = isActive;
		this.effStartDate = effStartDate;
		this.effEndDate = effEndDate;
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

	@Override
	public String toString() {
		return "AdminDepartmentResponseDto [adminDeptId=" + adminDeptId + ", adminNameEng=" + adminNameEng
				+ ", adminNameHin=" + adminNameHin + ", isActive=" + isActive + ", effStartDate=" + effStartDate
				+ ", effEndDate=" + effEndDate + "]";
	}
	
	
}

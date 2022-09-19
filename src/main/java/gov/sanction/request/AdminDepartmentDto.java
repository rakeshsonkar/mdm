package gov.sanction.request;

public class AdminDepartmentDto
{
	private Integer adminDeptId;
   
   public AdminDepartmentDto()
   {}

	public AdminDepartmentDto(Integer adminDeptId) {
		super();
		this.adminDeptId = adminDeptId;
	}
	
	public Integer getAdminDeptId() {
		return adminDeptId;
	}
	
	public void setAdminDeptId(Integer adminDeptId) {
		this.adminDeptId = adminDeptId;
	}
	
	@Override
	public String toString() {
		return "AdminDepartmentDto [adminDeptId=" + adminDeptId + "]";
	}
   
}

package gov.sanction.request;
import lombok.Data;

@Data
public class DepartmentRequest {
	 private Integer adminDeptId;
	 private String departmentNameEng;
	 private String departmentNameHin;
	 private Integer hodOfficeId;
	 private Integer departmentTypeId;
	 private Integer createdBy;
}

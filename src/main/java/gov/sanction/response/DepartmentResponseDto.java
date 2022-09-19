package gov.sanction.response;

import java.sql.Timestamp;

import lombok.Data;


@Data
public class DepartmentResponseDto {

	private Integer departmentId;
	private String adminDeptId;
	private String departmentNameEng;
	private String departmentNameHin;
	private Integer hodOfficeId;
	private String isACTIVE;
	private Timestamp effStartDate;
	private Timestamp effEndDate;
	private Integer deptTypeId;
	private String deptTypeCategory;
	private String typeOfDepartment;


}

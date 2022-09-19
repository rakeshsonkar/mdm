package gov.sanction.response;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MinorHeadResponseDto {
	private String majorHeadCode;
	private String subMajorHeadCode;
	private String minorHeadCode;
	private String minorHeadNameEng;
	private String minorHeadNameHin;
	private String isActive;
	private Timestamp effStartDate;
	private Timestamp effEndDate;
	private Integer createdBy;
	private Integer modifiedBy;
	private Timestamp createdDate;
	private Timestamp modifiedDate;

}

package gov.sanction.dto;


import java.sql.Timestamp;

import lombok.Data;

@Data
public class MstMajorHeadDTO {

	private String  majorHeadCode;
	private String  majorHeadNameEn;
	private String  majorHeadNameHi;
	 private String romanName;
	 private String  isActive;
	 private  Timestamp effStartDt;
	 private Timestamp effEndDt;
	 private  int createdBy;
	 private int modifiedBy;
	 private Timestamp createdDt;
	 private Timestamp modifiedDt;
}

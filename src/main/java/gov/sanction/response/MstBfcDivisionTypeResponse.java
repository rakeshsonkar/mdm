package gov.sanction.response;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MstBfcDivisionTypeResponse {

	private Long  BfcDivisionId;
	private String  bfcDivTypeNameEnglish;
	private String  bfDivTypeNameHindi;
	private String  isActive;
	private Timestamp effStartDt;
	private Timestamp effEndDt;
	private Integer createdBy;
	private Integer modifiedBy;
	private Timestamp createdDt;
	private Timestamp modifiedDt;
}

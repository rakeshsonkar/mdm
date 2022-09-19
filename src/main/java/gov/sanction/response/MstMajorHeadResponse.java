package gov.sanction.response;
import java.sql.Timestamp;


import lombok.Data;

@Data
public class MstMajorHeadResponse {

	private String  majorHeadCode;
	private String  majorHeadNameEn;
	private String  majorHeadNameHi;
	 private String romanName;
	 private String  isActive;
	 private  Timestamp effStartDt;
	 private Timestamp effEndDt;
	 private  Integer createdBy;
	 private Integer modifiedBy;
	 private Timestamp createdDt;
	 private Timestamp modifiedDt;
	
}

package gov.sanction.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MST_BFC_DIVISION" , schema ="MDM")
public class MstBfcDivision {

	
	@Id
	@Column(name = "BFC_DIVISION_ID", nullable = false)
	private Long  BfcDivisionId;
	
	@Column(name = "BFC_DIVISION_NAME_ENGLISH", nullable = false)
	private String  bfcDivisionNameEnglish;
	
	
	@Column(name = "BFC_DIVISION_NAME_HINDI", nullable = false)
	private String  bfcDivisionNameHindi;
	
	@Column(name = "BFC_DIV_TYPE_ID", nullable = false)
	private int  bfcDivTypeId;
	
	@Column(name = "IS_ACTIVE", nullable = false)
	private String  isActive;
	
	
	@Column(name = "EFF_START_DT")
	private Timestamp effStartDt;

	
	@Column(name = "EFF_END_DT")
	private Timestamp effEndDt;
	
	@Column(name = "CREATED_BY")
	private Integer createdBy;
	
	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	
	@Column(name = "CREATED_DT")
	private Timestamp createdDt;

	
	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDt;
}

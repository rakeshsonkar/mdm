package gov.sanction.entity;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="MST_BFC_DIVISION_TYPE" , schema ="MDM")
public class MstBfcDivisionType {
	
	@Id
	@Column(name="BFC_DIV_TYPE_ID")
	private Long  bfcDivTypeId;
	
	@Column(name = "BFC_DIV_TYPE_NAME_ENGLISH", nullable = false)
	private String  bfcDivTypeNameEnglish;
	
	@Column(name = "BFC_DIV_TYPE_NAME_HINDI", nullable = false)
	private String  bfDivTypeNameHindi;
	
	@Column(name = "IS_ACTIVE", nullable = false)
	private String  isActive;
	
	@Basic(optional = false)
	@Column(name = "EFF_START_DT")
	private Timestamp effStartDt;

	@Basic(optional = false)
	@Column(name = "EFF_END_DT")
	private Timestamp effEndDt;
	
	@Column(name = "CREATED_BY")
	private Integer createdBy;
	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	@Basic(optional = false)
	@Column(name = "CREATED_DT")

	private Timestamp createdDt;

	@Basic(optional = false)
	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDt;
}

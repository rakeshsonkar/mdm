package gov.sanction.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_DESG" , schema ="MDM")
public class MstDesignation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DESG_ID")
	private BigDecimal designationId;

	@Column(name = "DESG_DESC_EN")
	private String designationDesEn;

	@Column(name = "DESG_DESC_HI")
	private String designationDesHi;

	@Column(name = "IS_ACTIVE")
	private String isActive;

	@Column(name = "EFF_START_DT")
	private Timestamp effStartDate;

	@Column(name = "EFF_END_DT")
	private Timestamp effEndDate;

	@Column(name = "CREATED_BY")
	private Integer createdBy;

	@Column(name = "MODIFIED_BY")
	private Integer modifiedBy;

	@Column(name = "CREATED_DT")
	private Timestamp createdDate;

	@Column(name = "MODIFIED_DT")
	private Timestamp modifiedDate;

	public MstDesignation() {
	}

	public MstDesignation(BigDecimal designationId, String designationDesEn, String designationDesHi, String isActive,
			Timestamp effStartDate, Timestamp effEndDate, Integer createdBy, Integer modifiedBy, Timestamp createdDate,
			Timestamp modifiedDate) {
		super();
		this.designationId = designationId;
		this.designationDesEn = designationDesEn;
		this.designationDesHi = designationDesHi;
		this.isActive = isActive;
		this.effStartDate = effStartDate;
		this.effEndDate = effEndDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public BigDecimal getDesignationId() {
		return designationId;
	}

	public void setDesignationId(BigDecimal designationId) {
		this.designationId = designationId;
	}

	public String getDesignationDesEn() {
		return designationDesEn;
	}

	public void setDesignationDesEn(String designationDesEn) {
		this.designationDesEn = designationDesEn;
	}

	public String getDesignationDesHi() {
		return designationDesHi;
	}

	public void setDesignationDesHi(String designationDesHi) {
		this.designationDesHi = designationDesHi;
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

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Designation [designationId=" + designationId + ", designationDesEn=" + designationDesEn
				+ ", designationDesHi=" + designationDesHi + ", isActive=" + isActive + ", effStartDate=" + effStartDate
				+ ", effEndDate=" + effEndDate + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}


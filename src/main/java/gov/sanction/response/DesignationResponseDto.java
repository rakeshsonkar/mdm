package gov.sanction.response;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class DesignationResponseDto {

	private BigDecimal designationId;
	private String designationDesEn;
	private String designationDesHi;
	private String isActive;
	private Timestamp effStartDt;
	private Timestamp effEndDt;

	public DesignationResponseDto() {
	}

	public DesignationResponseDto(BigDecimal designationId, String designationDesEn, String designationDesHi,
			String isActive, Timestamp effStartDt, Timestamp effEndDt) {
		super();
		this.designationId = designationId;
		this.designationDesEn = designationDesEn;
		this.designationDesHi = designationDesHi;
		this.isActive = isActive;
		this.effStartDt = effStartDt;
		this.effEndDt = effEndDt;
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

	public Timestamp getEffStartDt() {
		return effStartDt;
	}

	public void setEffStartDt(Timestamp effStartDt) {
		this.effStartDt = effStartDt;
	}

	public Timestamp getEffEndDt() {
		return effEndDt;
	}

	public void setEffEndDt(Timestamp effEndDt) {
		this.effEndDt = effEndDt;
	}

	@Override
	public String toString() {
		return "DesignationResponseDto [designationId=" + designationId + ", designationDesEn=" + designationDesEn
				+ ", designationDesHi=" + designationDesHi + ", isActive=" + isActive + ", effStartDt=" + effStartDt
				+ ", effEndDt=" + effEndDt + "]";
	}

}

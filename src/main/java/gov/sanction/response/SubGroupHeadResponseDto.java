package gov.sanction.response;

import java.sql.Timestamp;

public class SubGroupHeadResponseDto 
{
	private Integer budgetHeadId;
	private String majorHeadCode;
	private String subMajorHeadCode;
	private String minorHeadCode;
	private String subMinorHeadCode;
	private String groupSubHeadCode ;
	private String groupSubHeadNameEN ;
	private String groupSubHeadNameHI;
	private String isActive;
	private Timestamp effStartDT ;
	private Timestamp effEndDT ;
	private Integer createdBY;
	private Integer modifiedBY;
	private Timestamp createdDT;
	private Timestamp modifiedDT;
	
	public SubGroupHeadResponseDto()
	{}

	public SubGroupHeadResponseDto(Integer budgetHeadId, String majorHeadCode, String subMajorHeadCode,
			String minorHeadCode, String subMinorHeadCode, String groupSubHeadCode, String groupSubHeadNameEN,
			String groupSubHeadNameHI, String isActive, Timestamp effStartDT, Timestamp effEndDT, Integer createdBY,
			Integer modifiedBY, Timestamp createdDT, Timestamp modifiedDT) {
		super();
		this.budgetHeadId = budgetHeadId;
		this.majorHeadCode = majorHeadCode;
		this.subMajorHeadCode = subMajorHeadCode;
		this.minorHeadCode = minorHeadCode;
		this.subMinorHeadCode = subMinorHeadCode;
		this.groupSubHeadCode = groupSubHeadCode;
		this.groupSubHeadNameEN = groupSubHeadNameEN;
		this.groupSubHeadNameHI = groupSubHeadNameHI;
		this.isActive = isActive;
		this.effStartDT = effStartDT;
		this.effEndDT = effEndDT;
		this.createdBY = createdBY;
		this.modifiedBY = modifiedBY;
		this.createdDT = createdDT;
		this.modifiedDT = modifiedDT;
	}

	public Integer getBudgetHeadId() {
		return budgetHeadId;
	}

	public void setBudgetHeadId(Integer budgetHeadId) {
		this.budgetHeadId = budgetHeadId;
	}

	public String getMajorHeadCode() {
		return majorHeadCode;
	}

	public void setMajorHeadCode(String majorHeadCode) {
		this.majorHeadCode = majorHeadCode;
	}

	public String getSubMajorHeadCode() {
		return subMajorHeadCode;
	}

	public void setSubMajorHeadCode(String subMajorHeadCode) {
		this.subMajorHeadCode = subMajorHeadCode;
	}

	public String getMinorHeadCode() {
		return minorHeadCode;
	}

	public void setMinorHeadCode(String minorHeadCode) {
		this.minorHeadCode = minorHeadCode;
	}

	public String getSubMinorHeadCode() {
		return subMinorHeadCode;
	}

	public void setSubMinorHeadCode(String subMinorHeadCode) {
		this.subMinorHeadCode = subMinorHeadCode;
	}

	public String getGroupSubHeadCode() {
		return groupSubHeadCode;
	}

	public void setGroupSubHeadCode(String groupSubHeadCode) {
		this.groupSubHeadCode = groupSubHeadCode;
	}

	public String getGroupSubHeadNameEN() {
		return groupSubHeadNameEN;
	}

	public void setGroupSubHeadNameEN(String groupSubHeadNameEN) {
		this.groupSubHeadNameEN = groupSubHeadNameEN;
	}

	public String getGroupSubHeadNameHI() {
		return groupSubHeadNameHI;
	}

	public void setGroupSubHeadNameHI(String groupSubHeadNameHI) {
		this.groupSubHeadNameHI = groupSubHeadNameHI;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Timestamp getEffStartDT() {
		return effStartDT;
	}

	public void setEffStartDT(Timestamp effStartDT) {
		this.effStartDT = effStartDT;
	}

	public Timestamp getEffEndDT() {
		return effEndDT;
	}

	public void setEffEndDT(Timestamp effEndDT) {
		this.effEndDT = effEndDT;
	}

	public Integer getCreatedBY() {
		return createdBY;
	}

	public void setCreatedBY(Integer createdBY) {
		this.createdBY = createdBY;
	}

	public Integer getModifiedBY() {
		return modifiedBY;
	}

	public void setModifiedBY(Integer modifiedBY) {
		this.modifiedBY = modifiedBY;
	}

	public Timestamp getCreatedDT() {
		return createdDT;
	}

	public void setCreatedDT(Timestamp createdDT) {
		this.createdDT = createdDT;
	}

	public Timestamp getModifiedDT() {
		return modifiedDT;
	}

	public void setModifiedDT(Timestamp modifiedDT) {
		this.modifiedDT = modifiedDT;
	}

	@Override
	public String toString() {
		return "MajorHeadResponseDto [budgetHeadId=" + budgetHeadId + ", majorHeadCode=" + majorHeadCode
				+ ", subMajorHeadCode=" + subMajorHeadCode + ", minorHeadCode=" + minorHeadCode + ", subMinorHeadCode="
				+ subMinorHeadCode + ", groupSubHeadCode=" + groupSubHeadCode + ", groupSubHeadNameEN="
				+ groupSubHeadNameEN + ", groupSubHeadNameHI=" + groupSubHeadNameHI + ", isActive=" + isActive
				+ ", effStartDT=" + effStartDT + ", effEndDT=" + effEndDT + ", createdBY=" + createdBY + ", modifiedBY="
				+ modifiedBY + ", createdDT=" + createdDT + ", modifiedDT=" + modifiedDT + "]";
	}
	
	
	
}

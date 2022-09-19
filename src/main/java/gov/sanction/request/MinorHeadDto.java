package gov.sanction.request;

public class MinorHeadDto {
	
	private String majorHeadCode ;
	
	public MinorHeadDto()
	{}

	public MinorHeadDto(String majorHeadCode) {
		super();
		this.majorHeadCode = majorHeadCode;
	}

	public String getMajorHeadCode() {
		return majorHeadCode;
	}

	public void setMajorHeadCode(String majorHeadCode) {
		this.majorHeadCode = majorHeadCode;
	}

	@Override
	public String toString() {
		return "MinorHeadDto [majorHeadCode=" + majorHeadCode + "]";
	}
	
	

}

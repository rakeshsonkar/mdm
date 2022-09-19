package gov.sanction.response;

import lombok.Data;

@Data
public class ActionResponse {

	private Integer responseId;
	private Integer errCode;
	private String errMsg;
	private Boolean taskComplete;
}

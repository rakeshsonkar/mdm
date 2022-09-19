package gov.sanction.response;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class WfmInboxResponse {
    private BigDecimal requestID;
	private BigDecimal ProcessID;
	private String reqDescription;
	private BigDecimal taskTranId;
	private String remarks;
	private String  initiator;
	private String status;
	private String  previousAsignee;
	private Timestamp createdDate;

}

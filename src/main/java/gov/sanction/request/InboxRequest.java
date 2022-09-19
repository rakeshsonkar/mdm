package gov.sanction.request;
import lombok.Data;

@Data
public class InboxRequest {
	private Integer assignmentId;
	private String  type;
}

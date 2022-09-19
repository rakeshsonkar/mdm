package gov.sanction.response;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class TaskResponse {
	private Map<String, Object> payload;
	private List<Action> actionData;
	
}

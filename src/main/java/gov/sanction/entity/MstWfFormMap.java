package gov.sanction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MST_WF_FORM_MAP")
@NamedQuery(name = "find by formId",query = "Select f from MstWfFormMap f where f.formId = :formId")
public class MstWfFormMap {
	@Id
	@Column(name="MAP_ID")
	private Long  mapId;
	
	@Column(name="FORM_ID")
	private Integer  formId;
	
	@Column(name="WF_PROCESS_ID")
	private Integer  wfProcessId;
}

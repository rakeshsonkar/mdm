package gov.sanction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MST_REMARKS_SUGGESTION",schema = "WF")
public class RemarkSuggestion {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "REMARKS_ID")
	private Integer remarksId;

	@Column(name = "ROLE_ID")
	private Integer roleId;

	@Column(name = "REMARKS")
	private String remarks;
}

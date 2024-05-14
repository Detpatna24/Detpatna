package cms.com.det.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="admission_workflow")
public class Admissionworkflow {

	
	@Id
	@Column(name="admission_workflow_id")
	public String admissionworkflowid;
	
	
	
	@Column(name="workflow_name")
	public String workflowname ;
	
	@Column(name="workflow_description")
	public String workflowdescription;
	
	@Column(name="assigned_userrole")
	public String assigneduserrole;
	
	@Column(name="status")
	public String status;
	
	
	
}

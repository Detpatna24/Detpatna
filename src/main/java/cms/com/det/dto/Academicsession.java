package cms.com.det.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "m_session")
@Data

public class Academicsession {

	@Id
	@GeneratedValue
	public String session_id;
	public String session_name;
	public String start_datetime;
	public String end_datetime;
	public String status;
	public String created_on;
	public String created_by;
	public String updated_on;
	public String updated_by;

}

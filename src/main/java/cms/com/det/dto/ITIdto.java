package cms.com.det.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="m_iti_master_new")
@Data
public class ITIdto {

	
	@Id @GeneratedValue
	public int id ;
	
	public String MIS ;
	
	public String ITI ;
}

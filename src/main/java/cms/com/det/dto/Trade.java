package cms.com.det.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name="m_trade")
@Data
public class Trade {

	
	@Id @GeneratedValue
	public String trade_id;
	public String trade_code;
	public String trade_name;
	public String trade_duration;
	public String trade_status;
	public String created_on;
	public String created_by;
	public String updated_on;
	public String updated_by;
	
}

package cms.com.det.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="m_district")
public class District {
	@Id @GeneratedValue
	private int distt_id;
	private String distt_name;
	private String commissionary;
	private String state_id;
	private char status;
	private Date created_on;
	private String created_by;
	private Date updated_on;
	private String updated_by;
	public int getDistt_id() {
		return distt_id;
	}
	public void setDistt_id(int distt_id) {
		this.distt_id = distt_id;
	}
	public String getDistt_name() {
		return distt_name;
	}
	public void setDistt_name(String distt_name) {
		this.distt_name = distt_name;
	}
	public String getCommissionary() {
		return commissionary;
	}
	public void setCommissionary(String commissionary) {
		this.commissionary = commissionary;
	}
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

}

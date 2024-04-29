package cms.com.det.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="m_commissionary")
public class InstituteComissionary {
	@Id @GeneratedValue
	private int commissionary_id;
	private String commissionary_name;
	private String state_id;
	private char status;
	private Date created_on;
	private String created_by;
	private Date updated_on;
	private String updated_by;
	
	public int getCommissionary_id() {
		return commissionary_id;
	}
	public void setCommissionary_id(int commissionary_id) {
		this.commissionary_id = commissionary_id;
	}
	public String getCommissionary_name() {
		return commissionary_name;
	}
	public void setCommissionary_name(String commissionary_name) {
		this.commissionary_name = commissionary_name;
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

package cms.com.det.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "det_department_ftr")
@Data
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long department_ftr_id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "middle_name")
	private String middle_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "state")
	private String state;

	@Column(name = "district")
	private String district;

	@Column(name = "block")
	private String block;

	@Column(name = "iti_college_name")
	private String iti_college_name;

	public Department(String first_name, String middle_name, String last_name, String state, String district,
			String block, String iti_college_name, String branch, String mobile_no, String email_id, String aadhar_no) {
		super();
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.state = state;
		this.district = district;
		this.block = block;
		this.iti_college_name = iti_college_name;
		this.branch = branch;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.aadhar_no = aadhar_no;
	}

	public Department() {

	}

	@Column(name = "branch")
	private String branch;

	@Column(name = "mobile_no")
	private String mobile_no;

	@Column(name = "email_id")
	private String email_id;

	@Column(name = "aadhar_no")
	private String aadhar_no;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getIti_college_name() {
		return iti_college_name;
	}

	public void setIti_college_name(String iti_college_name) {
		this.iti_college_name = iti_college_name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

}

package cms.com.det.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "det_student_ftr")
@Data
public class Student {

	public Student() {

	}

	public Student(Long student_ftr_id, String first_name, String middle_name, String last_name, String mobile_no,
			String email_id, long aadhaar, String status, String st_userid, String st_password, String created_date,
			String updated_date, String updated_by, String created_by, String tempid, String father_name,
			String date_of_birth) {
		super();
		this.student_ftr_id = student_ftr_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.aadhaar = aadhaar;
		this.status = status;
		this.st_userid = st_userid;
		this.st_password = st_password;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.created_by = created_by;
		this.tempid = tempid;
		this.father_name = father_name;
		this.date_of_birth = date_of_birth;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long student_ftr_id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "middle_name")
	private String middle_name;
	@Column(name = "last_name")
	private String last_name;

	@Column(name = "mobile_no")
	private String mobile_no;

	@Column(name = "email_id")
	private String email_id;

	public Long getStudent_ftr_id() {
		return student_ftr_id;
	}

	@Column(name = "aadhaar")
	private long aadhaar;

	@Column(name = "status")
	private String status;

	@Column(name = "st_userid")
	private String st_userid;

	@Column(name = "st_password")
	private String st_password;

	@Column(name = "created_date")
	private String created_date;

	@Column(name = "updated_date")
	private String updated_date;

	@Column(name = "updated_by")
	private String updated_by;

	@Column(name = "created_by")
	private String created_by;

	@Column(name = "tempid")
	private String tempid;

	@Column(name = "father_name")
	private String father_name;

	@Column(name = "date_of_birth")
	private String date_of_birth;

	public void setStudent_ftr_id(Long student_ftr_id) {
		this.student_ftr_id = student_ftr_id;
	}

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

	public long getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSt_userid() {
		return st_userid;
	}

	public void setSt_userid(String st_userid) {
		this.st_userid = st_userid;
	}

	public String getSt_password() {
		return st_password;
	}

	public void setSt_password(String st_password) {
		this.st_password = st_password;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getTempid() {
		return tempid;
	}

	public void setTempid(String tempid) {
		this.tempid = tempid;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

}

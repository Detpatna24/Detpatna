package cms.com.det.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(name = "det_dashboard_studentdata",uniqueConstraints = {@UniqueConstraint(columnNames = {"sno"})})
@Data
public class DashboardStudentFormData {

	@Id
	@Column(name = "applicationnumber")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "det_dashboard_studentdata_seq")
    @SequenceGenerator(name="det_dashboard_studentdata_seq", sequenceName = "det_dashboard_studentdata_seq", allocationSize = 1)
	private Long applicationnumber;

	
	@Column(name = "registration_number")
	private String studentid;

	public Long getapplicationnumber() {
		return applicationnumber;
	}

	public void setapplicationnumber(Long applicationnumber) {
		this.applicationnumber = applicationnumber;
	}

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_middlename")
	private String studentmiddleName;

	@Column(name = "student_lastName")
	private String studentlastName;

	@Column(name = "student_fathername")
	private String fatherName;

	@Column(name = "student_mothername")
	private String motherName;

	@Column(name = "student_dob")
	private LocalDate dateOfBirth;

	@Column(name = "student_age")
	private String age;

	@Column(name = "student_gender")
	private String gender;

	@Column(name = "student_minority_category")
	private String minorityCategory;

	@Column(name = "student_category")
	private String category;

	@Column(name = "student_economically_weakersection")
	private boolean economicallyWeakerSection;

	@Column(name = "student_aadharno")
	private String aadharNo;

	@Column(name = "student_emailid")
	private String emailId;

	@Column(name = "student_mobileno")
	private String mobileNo;

	@Column(name = "student_alternatemobileno")
	private String alternateMobileNo;

	@Column(name = "student_maritalstatus")
	private String maritalStatus;

	@Column(name = "student_father_lastname")
	private String fatherlastName;

	@Column(name = "student_father_middlename")
	private String fathermiddleName;

	@Column(name = "student_mother_middlename")
	private String mothermiddleName;

	@Column(name = "student_mother_lastname")
	private String motherlastName;

	public DashboardStudentFormData() {
	}

	public DashboardStudentFormData(Long applicationnumber, String studentid, String studentName, String studentmiddleName,
			String studentlastName, String fatherName, String motherName, LocalDate dateOfBirth, String age,
			String gender, String minorityCategory, String category, boolean economicallyWeakerSection, String aadharNo,
			String emailId, String mobileNo, String alternateMobileNo, String maritalStatus, String fatherlastName,
			String fathermiddleName, String mothermiddleName, String motherlastName) {
		super();
		this.applicationnumber = applicationnumber;
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentmiddleName = studentmiddleName;
		this.studentlastName = studentlastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.minorityCategory = minorityCategory;
		this.category = category;
		this.economicallyWeakerSection = economicallyWeakerSection;
		this.aadharNo = aadharNo;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.alternateMobileNo = alternateMobileNo;
		this.maritalStatus = maritalStatus;
		this.fatherlastName = fatherlastName;
		this.fathermiddleName = fathermiddleName;
		this.mothermiddleName = mothermiddleName;
		this.motherlastName = motherlastName;
	}

	public String getstudentid() {
		return studentid;
	}

	public void setstudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentmiddleName() {
		return studentmiddleName;
	}

	public void setStudentmiddleName(String studentmiddleName) {
		this.studentmiddleName = studentmiddleName;
	}

	public String getStudentlastName() {
		return studentlastName;
	}

	public void setStudentlastName(String studentlastName) {
		this.studentlastName = studentlastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMinorityCategory() {
		return minorityCategory;
	}

	public void setMinorityCategory(String minorityCategory) {
		this.minorityCategory = minorityCategory;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isEconomicallyWeakerSection() {
		return economicallyWeakerSection;
	}

	public void setEconomicallyWeakerSection(boolean economicallyWeakerSection) {
		this.economicallyWeakerSection = economicallyWeakerSection;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAlternateMobileNo() {
		return alternateMobileNo;
	}

	public void setAlternateMobileNo(String alternateMobileNo) {
		this.alternateMobileNo = alternateMobileNo;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getFatherlastName() {
		return fatherlastName;
	}

	public void setFatherlastName(String fatherlastName) {
		this.fatherlastName = fatherlastName;
	}

	public String getFathermiddleName() {
		return fathermiddleName;
	}

	public void setFathermiddleName(String fathermiddleName) {
		this.fathermiddleName = fathermiddleName;
	}

	public String getMothermiddleName() {
		return mothermiddleName;
	}

	public void setMothermiddleName(String mothermiddleName) {
		this.mothermiddleName = mothermiddleName;
	}

	public String getMotherlastName() {
		return motherlastName;
	}

	public void setMotherlastName(String motherlastName) {
		this.motherlastName = motherlastName;
	}

}
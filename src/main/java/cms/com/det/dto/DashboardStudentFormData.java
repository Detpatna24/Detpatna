package cms.com.det.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
	public Long applicationnumber;

	
	@Column(name = "registration_number")
	public String studentid;

	public Long getapplicationnumber() {
		return applicationnumber;
	}

	public void setapplicationnumber(Long applicationnumber) {
		this.applicationnumber = applicationnumber;
	}

	@Column(name = "student_name")
	public String studentName;

	@Column(name = "student_middlename")
	public String studentmiddleName;

	@Column(name = "student_lastName")
	public String studentlastName;

	@Column(name = "student_fathername")
	public String fatherName;

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "student_mothername")
	public String motherName;

	@Column(name = "student_dob")
	public LocalDate dateOfBirth;

	@Column(name = "student_age")
	public String age;

	@Column(name = "student_gender")
	public String gender;

	@Column(name = "student_minority_category")
	public String minorityCategory;

	@Column(name = "student_category")
	public String category;

	@Column(name = "student_economically_weakersection")
	public String economicallyWeakerSection;

	@Column(name = "student_aadharno")
	public String aadharNo;

	@Column(name = "student_emailid")
	public String emailId;

	@Column(name = "student_mobileno")
	public String mobileNo;

	@Column(name = "student_alternatemobileno")
	public String alternateMobileNo;

	@Column(name = "student_maritalstatus")
	public String maritalStatus;

	@Column(name = "student_father_lastname")
	public String fatherlastName;

	@Column(name = "student_father_middlename")
	public String fathermiddleName;

	@Column(name = "student_mother_middlename")
	public String mothermiddleName;

	@Column(name = "student_mother_lastname")
	public String motherlastName;

	
	
	@Column(name = "created_date")
	public LocalDateTime createdDate;
	
	@Column(name="workflowstatus")
	public String admissionWorkflowId;
	
	
	public String getAdmissionWorkflowId() {
		return admissionWorkflowId;
	}

	public void setAdmissionWorkflowId(String admissionWorkflowId) {
		this.admissionWorkflowId = admissionWorkflowId;
	}

	public DashboardStudentFormData() {
	}

	public DashboardStudentFormData(Long applicationnumber, String studentid, String studentName, String studentmiddleName,
			String studentlastName, String fatherName, String motherName, LocalDate dateOfBirth, String age,
			String gender, String minorityCategory, String category, String economicallyWeakerSection, String aadharNo,
			String emailId, String mobileNo, String alternateMobileNo, String maritalStatus, String fatherlastName,
			String fathermiddleName, String mothermiddleName, String motherlastName,LocalDateTime createdDate,String admissionWorkflowId) {
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
		this.createdDate=createdDate;
		this.admissionWorkflowId=admissionWorkflowId;
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

	public String isEconomicallyWeakerSection() {
		return economicallyWeakerSection;
	}

	public void setEconomicallyWeakerSection(String economicallyWeakerSection) {
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
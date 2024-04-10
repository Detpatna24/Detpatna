package cms.com.det.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "det_dashboard_studentdata")
@Data
public class DashboardStudentFormData {

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

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
	private int age;

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

	@Column(name = "student_correspondencedddress")
	private String correspondenceAddress;

	@Column(name = "student_correspondencevillage")
	private String correspondenceVillage;

	@Column(name = "student_correspondencestreet")
	private String correspondenceStreet;

	@Column(name = "student_correspondencearea")
	private String correspondenceArea;

	@Column(name = "student_correspondencepostoffice")
	private String correspondencePostOffice;

	@Column(name = "student_correspondencepincode")
	private String correspondencePinCode;

	@Column(name = "student_correspondencestate")
	private String correspondenceState;

	@Column(name = "student_correspondencedistrict")
	private String correspondenceDistrict;

	@Column(name = "student_correspondenceblock")
	private String correspondenceBlock;

	@Column(name = "student_correspondencepolicestation")
	private String correspondencePoliceStation;

	@Column(name = "student_sameascorrespondence")
	private boolean sameAsCorrespondence;

	@Column(name = "student_permanentvillage")
	private String permanentVillage;

	@Column(name = "student_permanentstreet")
	private String permanentStreet;

	@Column(name = "student_permanentarea")
	private String permanentArea;

	@Column(name = "student_permanentpostoffice")
	private String permanentPostOffice;

	@Column(name = "student_permanentpincode")
	private String permanentPinCode;

	@Column(name = "student_permanentstate")
	private String permanentState;

	@Column(name = "student_permanentdistrict")
	private String permanentDistrict;

	@Column(name = "student_permanentblock")
	private String permanentBlock;

	@Column(name = "student_permanentpolicestation")
	private String permanentPoliceStation;

	@Column(name = "student_father_lastname")
	private String fatherlastName;

	@Column(name = "student_father_middlename")
	private String fathermiddleName;

	@Column(name = "student_mother_middlename")
	private String mothermiddleName;

	@Column(name = "student_mother_lastname")
	private String motherlastName;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	

	public DashboardStudentFormData() {

	}

	public DashboardStudentFormData(Long id, String studentName, String studentmiddleName, String studentlastName,
			String fatherName, String motherName, LocalDate dateOfBirth, int age, String gender,
			String minorityCategory, String category, boolean economicallyWeakerSection, String aadharNo,
			String emailId, String mobileNo, String alternateMobileNo, String maritalStatus,
			String correspondenceAddress, String correspondenceVillage, String correspondenceStreet,
			String correspondenceArea, String correspondencePostOffice, String correspondencePinCode,
			String correspondenceState, String correspondenceDistrict, String correspondenceBlock,
			String correspondencePoliceStation, boolean sameAsCorrespondence, String permanentVillage,
			String permanentStreet, String permanentArea, String permanentPostOffice, String permanentPinCode,
			String permanentState, String permanentDistrict, String permanentBlock, String permanentPoliceStation,
			String fatherlastName, String fathermiddleName, String mothermiddleName, String motherlastName) {
		super();
		this.id = id;
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
		this.correspondenceAddress = correspondenceAddress;
		this.correspondenceVillage = correspondenceVillage;
		this.correspondenceStreet = correspondenceStreet;
		this.correspondenceArea = correspondenceArea;
		this.correspondencePostOffice = correspondencePostOffice;
		this.correspondencePinCode = correspondencePinCode;
		this.correspondenceState = correspondenceState;
		this.correspondenceDistrict = correspondenceDistrict;
		this.correspondenceBlock = correspondenceBlock;
		this.correspondencePoliceStation = correspondencePoliceStation;
		this.sameAsCorrespondence = sameAsCorrespondence;
		this.permanentVillage = permanentVillage;
		this.permanentStreet = permanentStreet;
		this.permanentArea = permanentArea;
		this.permanentPostOffice = permanentPostOffice;
		this.permanentPinCode = permanentPinCode;
		this.permanentState = permanentState;
		this.permanentDistrict = permanentDistrict;
		this.permanentBlock = permanentBlock;
		this.permanentPoliceStation = permanentPoliceStation;
		this.fatherlastName = fatherlastName;
		this.fathermiddleName = fathermiddleName;
		this.mothermiddleName = mothermiddleName;
		this.motherlastName = motherlastName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMiddleName() {
		return studentmiddleName;
	}

	public void setMiddleName(String studentmiddleName) {
		this.studentmiddleName = studentmiddleName;
	}

	public String getLastName() {
		return studentlastName;
	}

	public void setLastName(String studentlastName) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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

	public String getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(String correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public String getCorrespondenceVillage() {
		return correspondenceVillage;
	}

	public void setCorrespondenceVillage(String correspondenceVillage) {
		this.correspondenceVillage = correspondenceVillage;
	}

	public String getCorrespondenceStreet() {
		return correspondenceStreet;
	}

	public void setCorrespondenceStreet(String correspondenceStreet) {
		this.correspondenceStreet = correspondenceStreet;
	}

	public String getCorrespondenceArea() {
		return correspondenceArea;
	}

	public void setCorrespondenceArea(String correspondenceArea) {
		this.correspondenceArea = correspondenceArea;
	}

	public String getCorrespondencePostOffice() {
		return correspondencePostOffice;
	}

	public void setCorrespondencePostOffice(String correspondencePostOffice) {
		this.correspondencePostOffice = correspondencePostOffice;
	}

	public String getCorrespondencePinCode() {
		return correspondencePinCode;
	}

	public void setCorrespondencePinCode(String correspondencePinCode) {
		this.correspondencePinCode = correspondencePinCode;
	}

	public String getCorrespondenceState() {
		return correspondenceState;
	}

	public void setCorrespondenceState(String correspondenceState) {
		this.correspondenceState = correspondenceState;
	}

	public String getCorrespondenceDistrict() {
		return correspondenceDistrict;
	}

	public void setCorrespondenceDistrict(String correspondenceDistrict) {
		this.correspondenceDistrict = correspondenceDistrict;
	}

	public String getCorrespondenceBlock() {
		return correspondenceBlock;
	}

	public void setCorrespondenceBlock(String correspondenceBlock) {
		this.correspondenceBlock = correspondenceBlock;
	}

	public String getCorrespondencePoliceStation() {
		return correspondencePoliceStation;
	}

	public void setCorrespondencePoliceStation(String correspondencePoliceStation) {
		this.correspondencePoliceStation = correspondencePoliceStation;
	}

	public boolean isSameAsCorrespondence() {
		return sameAsCorrespondence;
	}

	public void setSameAsCorrespondence(boolean sameAsCorrespondence) {
		this.sameAsCorrespondence = sameAsCorrespondence;
	}

	public String getPermanentVillage() {
		return permanentVillage;
	}

	public void setPermanentVillage(String permanentVillage) {
		this.permanentVillage = permanentVillage;
	}

	public String getPermanentStreet() {
		return permanentStreet;
	}

	public void setPermanentStreet(String permanentStreet) {
		this.permanentStreet = permanentStreet;
	}

	public String getPermanentArea() {
		return permanentArea;
	}

	public void setPermanentArea(String permanentArea) {
		this.permanentArea = permanentArea;
	}

	public String getPermanentPostOffice() {
		return permanentPostOffice;
	}

	public void setPermanentPostOffice(String permanentPostOffice) {
		this.permanentPostOffice = permanentPostOffice;
	}

	public String getPermanentPinCode() {
		return permanentPinCode;
	}

	public void setPermanentPinCode(String permanentPinCode) {
		this.permanentPinCode = permanentPinCode;
	}

	public String getPermanentState() {
		return permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public String getPermanentDistrict() {
		return permanentDistrict;
	}

	public void setPermanentDistrict(String permanentDistrict) {
		this.permanentDistrict = permanentDistrict;
	}

	public String getPermanentBlock() {
		return permanentBlock;
	}

	public void setPermanentBlock(String permanentBlock) {
		this.permanentBlock = permanentBlock;
	}

	public String getPermanentPoliceStation() {
		return permanentPoliceStation;
	}

	public void setPermanentPoliceStation(String permanentPoliceStation) {
		this.permanentPoliceStation = permanentPoliceStation;
	}

}

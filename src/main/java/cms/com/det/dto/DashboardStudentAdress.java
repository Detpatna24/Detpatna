package cms.com.det.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "det_dashboard_studentdata_address")
@Data
public class DashboardStudentAdress {

	@Column(name = "applicationnumber")
	private int applicationnumber;

	@Id
	@Column(name = "registration_number")
	private String id;

	
	
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

	
	@Column(name="isaddressissame")
	private boolean isaddressissame;
	
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
	
	@Column(name="student_permanentsubdivision")
	private String permanentsubdivision;
	
	@Column(name="student_subdivision")
	private String correspondencesubdivision;

	public int getApplicationnumber() {
		return applicationnumber;
	}

	public void setApplicationnumber(int applicationnumber) {
		this.applicationnumber = applicationnumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public boolean isIsaddressissame() {
		return isaddressissame;
	}

	public void setIsaddressissame(boolean isaddressissame) {
		this.isaddressissame = isaddressissame;
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

	public String getPermanentsubdivision() {
		return permanentsubdivision;
	}

	public void setPermanentsubdivision(String permanentsubdivision) {
		this.permanentsubdivision = permanentsubdivision;
	}

	public String getCorrespondencesubdivision() {
		return correspondencesubdivision;
	}

	public void setCorrespondencesubdivision(String correspondencesubdivision) {
		this.correspondencesubdivision = correspondencesubdivision;
	}

	public DashboardStudentAdress(int applicationnumber, String id, String correspondenceVillage,
			String correspondenceStreet, String correspondenceArea, String correspondencePostOffice,
			String correspondencePinCode, String correspondenceState, String correspondenceDistrict,
			String correspondenceBlock, String correspondencePoliceStation, boolean isaddressissame,
			String permanentVillage, String permanentStreet, String permanentArea, String permanentPostOffice,
			String permanentPinCode, String permanentState, String permanentDistrict, String permanentBlock,
			String permanentPoliceStation, String permanentsubdivision, String correspondencesubdivision) {
		super();
		this.applicationnumber = applicationnumber;
		this.id = id;
		this.correspondenceVillage = correspondenceVillage;
		this.correspondenceStreet = correspondenceStreet;
		this.correspondenceArea = correspondenceArea;
		this.correspondencePostOffice = correspondencePostOffice;
		this.correspondencePinCode = correspondencePinCode;
		this.correspondenceState = correspondenceState;
		this.correspondenceDistrict = correspondenceDistrict;
		this.correspondenceBlock = correspondenceBlock;
		this.correspondencePoliceStation = correspondencePoliceStation;
		this.isaddressissame = isaddressissame;
		this.permanentVillage = permanentVillage;
		this.permanentStreet = permanentStreet;
		this.permanentArea = permanentArea;
		this.permanentPostOffice = permanentPostOffice;
		this.permanentPinCode = permanentPinCode;
		this.permanentState = permanentState;
		this.permanentDistrict = permanentDistrict;
		this.permanentBlock = permanentBlock;
		this.permanentPoliceStation = permanentPoliceStation;
		this.permanentsubdivision = permanentsubdivision;
		this.correspondencesubdivision = correspondencesubdivision;
	}

	public DashboardStudentAdress() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	



}




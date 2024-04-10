package cms.com.det.dto;

public class InstituteDashboard {
	private String itiType;

	private String lastName;

	private String itiName;

	private String itiMisCode;

	private String websiteURL;

	private String dateOfEstablishment;

	public InstituteDashboard() {

	}

	public InstituteDashboard(String itiType, String lastName, String itiName, String itiMisCode, String websiteURL,
			String dateOfEstablishment, String instituteLongitude, String instituteLatitude, String address1,
			String address2, String state, String district, String block, String pinCode, String itiContactNo,
			String principalName, String principalMobileNo, String principalEmailId, String principalItiMisCode) {
		super();
		this.itiType = itiType;
		this.lastName = lastName;
		this.itiName = itiName;
		this.itiMisCode = itiMisCode;
		this.websiteURL = websiteURL;
		this.dateOfEstablishment = dateOfEstablishment;
		this.instituteLongitude = instituteLongitude;
		this.instituteLatitude = instituteLatitude;
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.district = district;
		this.block = block;
		this.pinCode = pinCode;
		this.itiContactNo = itiContactNo;
		this.principalName = principalName;
		this.principalMobileNo = principalMobileNo;
		this.principalEmailId = principalEmailId;
		this.principalItiMisCode = principalItiMisCode;
	}

	private String instituteLongitude;

	private String instituteLatitude;

	private String address1;

	private String address2;

	private String state;

	private String district;

	private String block;

	private String pinCode;
	private String itiContactNo;

	private String principalName;

	private String principalMobileNo;

	private String principalEmailId;

	public String getItiType() {
		return itiType;
	}

	public void setItiType(String itiType) {
		this.itiType = itiType;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getItiName() {
		return itiName;
	}

	public void setItiName(String itiName) {
		this.itiName = itiName;
	}

	public String getItiMisCode() {
		return itiMisCode;
	}

	public void setItiMisCode(String itiMisCode) {
		this.itiMisCode = itiMisCode;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

	public String getDateOfEstablishment() {
		return dateOfEstablishment;
	}

	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}

	public String getInstituteLongitude() {
		return instituteLongitude;
	}

	public void setInstituteLongitude(String instituteLongitude) {
		this.instituteLongitude = instituteLongitude;
	}

	public String getInstituteLatitude() {
		return instituteLatitude;
	}

	public void setInstituteLatitude(String instituteLatitude) {
		this.instituteLatitude = instituteLatitude;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getItiContactNo() {
		return itiContactNo;
	}

	public void setItiContactNo(String itiContactNo) {
		this.itiContactNo = itiContactNo;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getPrincipalMobileNo() {
		return principalMobileNo;
	}

	public void setPrincipalMobileNo(String principalMobileNo) {
		this.principalMobileNo = principalMobileNo;
	}

	public String getPrincipalEmailId() {
		return principalEmailId;
	}

	public void setPrincipalEmailId(String principalEmailId) {
		this.principalEmailId = principalEmailId;
	}

	public String getPrincipalItiMisCode() {
		return principalItiMisCode;
	}

	public void setPrincipalItiMisCode(String principalItiMisCode) {
		this.principalItiMisCode = principalItiMisCode;
	}

	private String principalItiMisCode;
}

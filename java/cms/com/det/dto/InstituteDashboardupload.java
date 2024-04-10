package cms.com.det.dto;

public class InstituteDashboardupload {

	private String session;
	private String admissionDate;
	private String trade;
	private String shift;
	private String unit;
	private String isTraineeDual;
	private String district;

	public InstituteDashboardupload()

	{

	}

	public InstituteDashboardupload(String session, String admissionDate, String trade, String shift, String unit,
			String isTraineeDual, String district, String itiCode, String traineeType) {
		super();
		this.session = session;
		this.admissionDate = admissionDate;
		this.trade = trade;
		this.shift = shift;
		this.unit = unit;
		this.isTraineeDual = isTraineeDual;
		this.district = district;
		this.itiCode = itiCode;
		this.traineeType = traineeType;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getIsTraineeDual() {
		return isTraineeDual;
	}

	public void setIsTraineeDual(String isTraineeDual) {
		this.isTraineeDual = isTraineeDual;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getItiCode() {
		return itiCode;
	}

	public void setItiCode(String itiCode) {
		this.itiCode = itiCode;
	}

	public String getTraineeType() {
		return traineeType;
	}

	public void setTraineeType(String traineeType) {
		this.traineeType = traineeType;
	}

	private String itiCode;
	private String traineeType;
}

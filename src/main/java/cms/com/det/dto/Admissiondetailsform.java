package cms.com.det.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "det_dashboard_student_admission_details")
public class Admissiondetailsform {

	@Id
	@Column(name = "applicationnumber")
	private Long applicationnumber;

	@Column(name = "registration_number")
	private String studentid;

	@Column(name = "academicsession")
	private String academicsession;

	@Column(name = "tradeOfferedby")
	private String tradeOfferedby;

	@Column(name = "tradename")
	private String tradename;

	@Column(name = "shift")
	private String shift;

	@Column(name = "unit")
	private String unit;

	@Column(name = "istraineedual")
	private String istraineedual;

	@Column(name = "itiname")
	private String itiname;

	@Column(name = "itistatecode")
	private String itistatecode;

	@Column(name = "itimiscode")
	private String itimiscode;

	@Column(name = "district")
	private String district;

	@Column(name = "traineetype")
	private String traineetype;

	public Admissiondetailsform() {
		super();
	}

	public Admissiondetailsform(Long applicationnumber, String studentid, String academicsession, String tradeOfferedby,
			String tradename, String shift, String unit, String istraineedual, String itiname, String itistatecode,
			String itimiscode, String district, String traineetype) {
		super();
		this.applicationnumber = applicationnumber;
		this.studentid = studentid;
		this.academicsession = academicsession;
		this.tradeOfferedby = tradeOfferedby;
		this.tradename = tradename;
		this.shift = shift;
		this.unit = unit;
		this.istraineedual = istraineedual;
		this.itiname = itiname;
		this.itistatecode = itistatecode;
		this.itimiscode = itimiscode;
		this.district = district;
		this.traineetype = traineetype;
	}

	public Long getApplicationnumber() {
		return applicationnumber;
	}

	public void setApplicationnumber(Long applicationnumber) {
		this.applicationnumber = applicationnumber;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getAcademicsession() {
		return academicsession;
	}

	public void setAcademicsession(String academicsession) {
		this.academicsession = academicsession;
	}

	public String getTradeOfferedby() {
		return tradeOfferedby;
	}

	public void setTradeOfferedby(String tradeOfferedby) {
		this.tradeOfferedby = tradeOfferedby;
	}

	public String getTradename() {
		return tradename;
	}

	public void setTradename(String tradename) {
		this.tradename = tradename;
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

	public String getIstraineedual() {
		return istraineedual;
	}

	public void setIstraineedual(String istraineedual) {
		this.istraineedual = istraineedual;
	}

	public String getItiname() {
		return itiname;
	}

	public void setItiname(String itiname) {
		this.itiname = itiname;
	}

	public String getItistatecode() {
		return itistatecode;
	}

	public void setItistatecode(String itistatecode) {
		this.itistatecode = itistatecode;
	}

	public String getItimiscode() {
		return itimiscode;
	}

	public void setItimiscode(String itimiscode) {
		this.itimiscode = itimiscode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTraineetype() {
		return traineetype;
	}

	public void setTraineetype(String traineetype) {
		this.traineetype = traineetype;
	}

}

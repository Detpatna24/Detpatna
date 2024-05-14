package cms.com.det.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "det_dashboard_student_fees_details")

public class Feepayment {

	@Id
	@Column(name = "applicationnumber")
	private Long applicationnumber;

	@Column(name = "registration_number")
	public String studentid;

	@Column(name = "RegistrationFees")
	private String RegistrationFees;

	@Column(name = "TuitionFees")
	private String TuitionFees;

	@Column(name = "CautionFees")
	private String CautionFees;

	@Column(name = "Total")
	private String Total;

	@Column(name = "ChallanReceiptNo")
	private String ChallanReceiptNo;

	@Column(name = "ChallanReceiptDate")
	private String ChallanReceiptDate;

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

	public String getRegistrationFees() {
		return RegistrationFees;
	}

	public void setRegistrationFees(String registrationFees) {
		RegistrationFees = registrationFees;
	}

	public String getTuitionFees() {
		return TuitionFees;
	}

	public void setTuitionFees(String tuitionFees) {
		TuitionFees = tuitionFees;
	}

	public String getCautionFees() {
		return CautionFees;
	}

	public void setCautionFees(String cautionFees) {
		CautionFees = cautionFees;
	}

	public String getTotal() {
		return Total;
	}

	public void setTotal(String total) {
		Total = total;
	}

	public String getChallanReceiptNo() {
		return ChallanReceiptNo;
	}

	public void setChallanReceiptNo(String challanReceiptNo) {
		ChallanReceiptNo = challanReceiptNo;
	}

	public String getChallanReceiptDate() {
		return ChallanReceiptDate;
	}

	public void setChallanReceiptDate(String challanReceiptDate) {
		ChallanReceiptDate = challanReceiptDate;
	}

	public Feepayment(Long applicationnumber, String studentid, String registrationFees, String tuitionFees,
			String cautionFees, String total, String challanReceiptNo, String challanReceiptDate) {
		super();
		this.applicationnumber = applicationnumber;
		this.studentid = studentid;
		RegistrationFees = registrationFees;
		TuitionFees = tuitionFees;
		CautionFees = cautionFees;
		Total = total;
		ChallanReceiptNo = challanReceiptNo;
		ChallanReceiptDate = challanReceiptDate;
	}

	public Feepayment() {
		super();

	}

}

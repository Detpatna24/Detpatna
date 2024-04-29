package cms.com.det.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "det_dashboard_student_academic_details")
@Data
public class AcademicDetailsForm {
	
	
	@Id
	@Column(name = "applicationnumber")
	private Long applicationnumber;

	
	@Column(name = "registration_number")
	private String studentid;
	
	
	@Column(name = "total_marks_scored_eighth")
	private String totalMarksScored8th;
	
	
	@Column(name = "total_subject_marks_eighth")
	private String totalSubjectMarks8th;
	
	@Column(name = "obtained_percentage_eighth")
	private String marksObtainedPercentage8th;
	
	
	@Column(name = "maths_marks_eighth")
	private String mathsMarksScored;
	
	
	@Column(name = "science_marks_eighth")
	private String scienceMarksScored;
	
	
	@Column(name = "total_marks_scored_tenth")
	private String totalMarksScored10th;
	
	
	@Column(name = "total_subject_marks_tenth")
	private String totalSubjectMarks10th;
	
	
	@Column(name = "obtained_percentage_tenth")
	private String marksObtainedPercentage10th;
	
	@Column(name = "maths_marks_twelveth")
	private String mathsMarksScored12th;
	
	@Column(name = "science_marks_twelveth")
	private String scienceMarksScored12th;
	
	@Column(name = "total_marks_scored_twelveth")
	private String totalMarksScored12th;
	
	@Column(name = "total_subject_marks_twelveth")
	private String totalSubjectMarks12th;
	
	@Column(name = "obtained_percentage_twelveth")
	private String marksObtainedPercentage12th;

	
	@Column(name = "apply_for_eighth_standard")
	private boolean applyFor8thStandard;

    
	@Column(name = "apply_for_tenth_standard")
	private boolean applyFor10thQualificationCourses;

    
    
	@Column(name = "apply_for_geoinformatics_assistant")
	private boolean applyForGeoInformaticsAssistant;

	
	public AcademicDetailsForm() {
		super();

	}


	public AcademicDetailsForm(Long applicationnumber, String studentid, String totalMarksScored8th, String totalSubjectMarks8th,
			String marksObtainedPercentage8th, String mathsMarksScored, String scienceMarksScored,
			String totalMarksScored10th, String totalSubjectMarks10th, String marksObtainedPercentage10th,
			String mathsMarksScored12th, String scienceMarksScored12th, String totalMarksScored12th,
			String totalSubjectMarks12th, String marksObtainedPercentage12th, boolean applyFor8thStandard,
			boolean applyFor10thQualificationCourses, boolean applyForGeoInformaticsAssistant) {
		super();
		this.applicationnumber = applicationnumber;
		this.studentid = studentid;
		this.totalMarksScored8th = totalMarksScored8th;
		this.totalSubjectMarks8th = totalSubjectMarks8th;
		this.marksObtainedPercentage8th = marksObtainedPercentage8th;
		this.mathsMarksScored = mathsMarksScored;
		this.scienceMarksScored = scienceMarksScored;
		this.totalMarksScored10th = totalMarksScored10th;
		this.totalSubjectMarks10th = totalSubjectMarks10th;
		this.marksObtainedPercentage10th = marksObtainedPercentage10th;
		this.mathsMarksScored12th = mathsMarksScored12th;
		this.scienceMarksScored12th = scienceMarksScored12th;
		this.totalMarksScored12th = totalMarksScored12th;
		this.totalSubjectMarks12th = totalSubjectMarks12th;
		this.marksObtainedPercentage12th = marksObtainedPercentage12th;
		this.applyFor8thStandard = applyFor8thStandard;
		this.applyFor10thQualificationCourses = applyFor10thQualificationCourses;
		this.applyForGeoInformaticsAssistant = applyForGeoInformaticsAssistant;
	}


	public Long getapplicationnumber() {
		return applicationnumber;
	}

	public void setapplicationnumber(Long applicationnumber) {
		this.applicationnumber = applicationnumber;
	}


	public String getStudentid() {
		return studentid;
	}


	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}


	public String getTotalMarksScored8th() {
		return totalMarksScored8th;
	}


	public void setTotalMarksScored8th(String totalMarksScored8th) {
		this.totalMarksScored8th = totalMarksScored8th;
	}


	public String getTotalSubjectMarks8th() {
		return totalSubjectMarks8th;
	}


	public void setTotalSubjectMarks8th(String totalSubjectMarks8th) {
		this.totalSubjectMarks8th = totalSubjectMarks8th;
	}


	public String getMarksObtainedPercentage8th() {
		return marksObtainedPercentage8th;
	}


	public void setMarksObtainedPercentage8th(String marksObtainedPercentage8th) {
		this.marksObtainedPercentage8th = marksObtainedPercentage8th;
	}


	public String getMathsMarksScored() {
		return mathsMarksScored;
	}


	public void setMathsMarksScored(String mathsMarksScored) {
		this.mathsMarksScored = mathsMarksScored;
	}


	public String getScienceMarksScored() {
		return scienceMarksScored;
	}


	public void setScienceMarksScored(String scienceMarksScored) {
		this.scienceMarksScored = scienceMarksScored;
	}


	public String getTotalMarksScored10th() {
		return totalMarksScored10th;
	}


	public void setTotalMarksScored10th(String totalMarksScored10th) {
		this.totalMarksScored10th = totalMarksScored10th;
	}


	public String getTotalSubjectMarks10th() {
		return totalSubjectMarks10th;
	}


	public void setTotalSubjectMarks10th(String totalSubjectMarks10th) {
		this.totalSubjectMarks10th = totalSubjectMarks10th;
	}


	public String getMarksObtainedPercentage10th() {
		return marksObtainedPercentage10th;
	}


	public void setMarksObtainedPercentage10th(String marksObtainedPercentage10th) {
		this.marksObtainedPercentage10th = marksObtainedPercentage10th;
	}


	public String getMathsMarksScored12th() {
		return mathsMarksScored12th;
	}


	public void setMathsMarksScored12th(String mathsMarksScored12th) {
		this.mathsMarksScored12th = mathsMarksScored12th;
	}


	public String getScienceMarksScored12th() {
		return scienceMarksScored12th;
	}


	public void setScienceMarksScored12th(String scienceMarksScored12th) {
		this.scienceMarksScored12th = scienceMarksScored12th;
	}


	public String getTotalMarksScored12th() {
		return totalMarksScored12th;
	}


	public void setTotalMarksScored12th(String totalMarksScored12th) {
		this.totalMarksScored12th = totalMarksScored12th;
	}


	public String getTotalSubjectMarks12th() {
		return totalSubjectMarks12th;
	}


	public void setTotalSubjectMarks12th(String totalSubjectMarks12th) {
		this.totalSubjectMarks12th = totalSubjectMarks12th;
	}


	public String getMarksObtainedPercentage12th() {
		return marksObtainedPercentage12th;
	}


	public void setMarksObtainedPercentage12th(String marksObtainedPercentage12th) {
		this.marksObtainedPercentage12th = marksObtainedPercentage12th;
	}


	public boolean isApplyFor8thStandard() {
		return applyFor8thStandard;
	}


	public void setApplyFor8thStandard(boolean applyFor8thStandard) {
		this.applyFor8thStandard = applyFor8thStandard;
	}


	public boolean isApplyFor10thQualificationCourses() {
		return applyFor10thQualificationCourses;
	}


	public void setApplyFor10thQualificationCourses(boolean applyFor10thQualificationCourses) {
		this.applyFor10thQualificationCourses = applyFor10thQualificationCourses;
	}


	public boolean isApplyForGeoInformaticsAssistant() {
		return applyForGeoInformaticsAssistant;
	}


	public void setApplyForGeoInformaticsAssistant(boolean applyForGeoInformaticsAssistant) {
		this.applyForGeoInformaticsAssistant = applyForGeoInformaticsAssistant;
	}

	

	
}

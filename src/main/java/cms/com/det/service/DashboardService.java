package cms.com.det.service;

import org.springframework.stereotype.Component;

import cms.com.det.dto.DashboardStudentFormData;

@Component
public interface DashboardService {

	
	int save(DashboardStudentFormData dashboardstudentformdata);

	DashboardStudentFormData getFormDataByApplicationNumber(Integer applicationNumber);

	void update(DashboardStudentFormData formData);

	
}

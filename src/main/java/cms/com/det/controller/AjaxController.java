package cms.com.det.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cms.com.det.model.Block;
import cms.com.det.service.BlockService;
//import cms.com.det.service.DashboardService;
import jakarta.servlet.http.HttpSession;

@Controller
public class AjaxController {
	
	@Autowired
    private BlockService blockService;

	@GetMapping("/generateOtp")
	@ResponseBody
	public ResponseEntity<String> generateOtp(@RequestParam String otpType, HttpSession session) {
		String otp = generateRandomOtp();
		System.out.println("Generated OTP for " + otpType + ": " + otp);

		session.setAttribute("generatedOtp", otp);

		return ResponseEntity.ok(otp);
	}

	private String generateRandomOtp() {
		return String.valueOf((int) (Math.random() * 9000) + 1000);

	}

	@PostMapping("/verifyOtp")
	@ResponseBody
	public ResponseEntity<String> verifyOtp(@RequestParam String userEnteredOtp, HttpSession session) {
		// Get the stored OTP from the session
		String generatedOtp = (String) session.getAttribute("generatedOtp");

		// Your OTP verification logic
		if (userEnteredOtp.equals(generatedOtp)) {
			return ResponseEntity.ok("OTP verified successfully");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid OTP");
		}
	}
	
	

    @GetMapping("/blocks/{distt_name}")
    @ResponseBody
    public List<Block> getBlocksByDistrictName(@PathVariable String distt_name) {
        // Your logic to fetch blocks by district name
        List<Block> blocks = blockService.findByDistt_name(distt_name);
        return blocks;
    }


	
}

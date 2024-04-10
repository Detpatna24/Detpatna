function sendOtp(otpType) {
	$.ajax({
		type: "GET",
		url: "/generateOtp",
		data: { otpType: otpType },
		success: function(data) {
			console.log("Generated OTP for " + otpType + ": " + data);
			$('#' + otpType + 'Otp').prop('disabled', false);
			$('#verify' + capitalizeFirstLetter(otpType) + 'OtpBtn').prop('disabled', false);
		},
		error: function(error) {
			console.log("Error generating OTP:", error);
		}
	});
}

function capitalizeFirstLetter(string) {
	return string.charAt(0).toUpperCase() + string.slice(1);
}


function verifyOtp(otpType) {
	var userEnteredOtp = $('#' + otpType + 'Otp').val();

	$.ajax({
		type: "POST",
		url: "/verifyOtp",
		data: { userEnteredOtp: userEnteredOtp },
		success: function(data) {
			console.log("OTP verification success: " + data);
			alert("OTP verified successfully!");
		},
		error: function(error) {
			console.log("Error verifying OTP:", error.responseText);
			alert("Invalid OTP");
		}
	});
}

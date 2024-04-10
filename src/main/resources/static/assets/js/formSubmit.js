

document.addEventListener('DOMContentLoaded', function() {
    document.getElementById("save-next-btn").addEventListener("click", function (event) {
        event.preventDefault();
       var formData = {
			studentName: $('input[name=studentName]').val(),
			studentmiddleName: $('input[name=studentmiddleName]').val(),
			studentlastName: $('input[name=studentlastName]').val(),
			fatherName: $('input[name=fatherName]').val(),
			fathermiddleName: $('input[name=fathermiddleName]').val(),
			fatherlastName: $('input[name=fatherlastName]').val(),
			motherName: $('input[name=motherName]').val(),
			mothermiddleName: $('input[name=mothermiddleName]').val(),
			motherlastName: $('input[name=motherlastName]').val(),
			dateOfBirth: $('input[name=dateOfBirth]').val(),
			age: $('input[name=age]').val(),
			gender: $('input[name=gender]:checked').val(),

			minorityCategory: $('.btn.dropdown-toggle.minority').text().trim(),
			category: $('.btn.dropdown-toggle.category').text().trim(),

			economicallyWeakerSection: $('.btn.dropdown-toggle.economically-weaker-section').text().trim(),

			aadharNo: $('input[name=aadharNo]').val(),
			emailId: $('input[name=emailId]').val(),
			mobileNo: $('input[name=mobileNo]').val(),
			alternateMobileNo: $('input[name=alternateMobileNo]').val(),
			maritalStatus: $('input[name=maritalStatus]').val(),

			permanentArea: $('input[name=permanentArea]').val(),
			permanentBlock: $('input[name=permanentBlock]').val(),
			permanentPoliceStation: $('input[name=permanentPoliceStation]').val(),
			permanentPostOffice: $('input[name=permanentPostOffice]').val(),
			permanentState: $('input[name=permanentState]').val(),
			permanentStreet: $('input[name=permanentStreet]').val(),
			permanentDistrict: $('input[name=permanentDistrict]').val(),
			permanentPinCode: $('input[name=permanentPinCode]').val(),
			permanentVillage: $('input[name=permanentVillage]').val(),


			correspondenceVillage: $('input[name=correspondenceVillage]').val(),
			correspondenceStreet: $('input[name=correspondenceStreet]').val(),
			correspondenceArea: $('input[name=correspondenceArea]').val(),
			correspondencePostOffice: $('input[name=correspondencePostOffice]').val(),
			correspondencePinCode: $('input[name=correspondencePinCode]').val(),
			correspondenceState: $('input[name=correspondenceState]').val(),
			correspondenceDistrict: $('input[name=correspondenceDistrict]').val(),
			correspondenceBlock: $('input[name=correspondenceBlock]').val(),
			correspondencePoliceStation: $('input[name=correspondencePoliceStation]').val()
		};

        fetch('/personaldetalissave', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            console.log(data);
        })
        .catch(error => {
            console.error('There was a problem with the fetch operation:', error);
        });
    });
});

function setMinorityCategory(category) {
    document.querySelector('.btn.dropdown-toggle.minority').innerText = category;
    document.querySelector('[th\\:field="*{dashboardstudentformdata.minorityCategory}"]').value = category;
}

function setCategory(category) {
    document.querySelector('.btn.dropdown-toggle.category').innerText = category;
    document.querySelector('[th\\:field="*{dashboardstudentformdata.category}"]').value = category;
}

function setEconomicallyWeakerSection(value) {
    document.querySelector('.btn.dropdown-toggle.economically-weaker-section').innerText = value ? 'Yes' : 'No';
    document.querySelector('[th\\:field="*{dashboardstudentformdata.economicallyWeakerSection}"]').value = value;
}

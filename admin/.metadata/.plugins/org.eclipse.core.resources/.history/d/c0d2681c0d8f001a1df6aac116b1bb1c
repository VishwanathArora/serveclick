var addEmployee = () =>
    {
        var formData = new FormData($('#addEmployees')[0]);
        console.log(...formData);
        $.ajax({
            url: '/addEmployee',
            data: formData,
            type: 'POST',
            contentType: false, // NEEDED, DON'T OMIT THIS (requires jQuery 1.6+)
            processData: false, // NEEDED, DON'T OMIT THIS
            success:(res)=>{
            	alert(res);
            }
            // ... Other options like success and etc
        });
        alert("Code to make AJAX Call");
        return false;
    }
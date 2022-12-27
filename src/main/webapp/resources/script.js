$(document).ready(function() {
	
	$("#country").change(function() {
			var selectedCountryId = $("#country").val();
            city = $('#city');
            $.ajax({
                url: '/CityServlet',
                type:'GET',
                dataType: 'json',
                data : {
					countryId : parseInt(selectedCountryId)
				},
                success: function(result) {
					$("#city").find('option').remove();
					$('<option>').val("").text("Select your city").appendTo("#city");
                    $.each(result, function(key, value){
					$('<option>').val(key).text(value).appendTo('#city');
				});
                }
            });
        });
        
    $('.multi_select').selectpicker();
    
    $("#goalMission").hide();
    $("#timeMission").hide();
    $("#MissionType").change(function() {
        value = $(this).val();
        if (value == "Time") {
            $("#timeMission").show();
            $("#goalMission").hide();
        }
        else if (value == "Goal") {
            $("#timeMission").hide();
            $("#goalMission").show();
        }
    });
    
});
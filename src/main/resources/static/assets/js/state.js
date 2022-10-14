$('document').ready(function() {
	$('table #editButtonSate').on('click', function(event) {
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(state, status){
			
			$('#nameEdit').val(state.name);
			$('#capitalEdit').val(state.capital);
			$('#codeEdit').val(state.code);
			$('#ountryEdit').val(state.country);
			$('#detailsEdit').val(state.details);
			
		});
		
		$('#editModalState').modal("show");
	});
	
	$('table #deleteButtonSate').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModalSate #delRef').attr('href', href);
		$('#deleteModalSate').modal("show");		
	});	
	
	$('table #detailButtonState').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(state, status){
			$('#dnameEdit').val(state.name);
			$('#dcapitalEdit').val(state.capital);
			$('#dcodeEdit').val(state.code);
			//$('#ddlCountryDetails').val(state.countryid);
			$('#ddetailsEdit').val(state.details);
			//$('#lastModifiedByDetails').val(state.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailModalState').modal("show");
		$('#detailModalState').modal("static");		
	});	
});



$('document').ready(function() {
	$('table #editButton').on('click', function(event) {
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(user, status){
			$('#idEdit').val(user.id);
			$('#usernameEdit').val(user.username);
			$('#firstnameEdit').val(user.firstname);
			$('#lastnameEdit').val(user.lastname);
			$('#matriculeEdit').val(user.matricule);
			
			
		});
		
		$('#editModal').modal("show");
	});
	
	$('table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal("show");		
	});	
	
	/*$('table #detailButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(user, status){
			$('#id').val(user.id);
			$('#detailDescription').val(user.description);
			$('#details').val(user.details);
	
		});			
		$('#detailModal').modal("show");
		
	});	*/
});



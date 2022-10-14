$('document').ready(function() {
	$('table #editButton').on('click', function(event) {
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(role, status){
			$('#idEdit').val(role.id);
			$('#descriptionEdit').val(role.description);
			$('#detailsEdit').val(role.details);
			
			
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
		$.get(href, function(role, status){
			$('#id').val(role.id);
			$('#detailDescription').val(role.description);
			$('#details').val(role.details);
	
		});			
		$('#detailModal').modal("show");
		
	});	*/
});



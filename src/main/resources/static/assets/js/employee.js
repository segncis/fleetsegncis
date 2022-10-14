$('document').ready(function() {
	$('table #editButtonEmp').on('click', function(event) {
		
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function(employee, status){
			
			$('#Editfirstname').val(employee.firstname);
			$('#Editlastname').val(employee.lastname);
			$('#Edittitle').val(employee.title);
			$('#Editaddress').val(employee.address);
			$('#Editphone').val(employee.phone);
			$('#Editemail').val(employee.email);
			$('#txtUsernameEdit').val(employee.username);
		});
		
		$('#editModalEmp').modal("show");
	});
	
	$('table #cancelModal').on('click',function(event) {
		event.preventDefault();
		
		$('#addModal').modal("hide");		
	});
	
	$('table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal("show");		
	});	
	
	$('table #photoButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#photoModal #employeePhoto').attr('src', href);
		$('#photoModal').modal("show");		
	});	
	
	$('#uploadButton').on('click',function(event){
		var href = $(this).attr('href');
		
		$.post(href, function(data, status){
			console.log(data);
		});
	});	
});



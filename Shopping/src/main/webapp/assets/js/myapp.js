$(function(){
	//solving the active problem
	switch(menu){
	
	case 'About us':
		$('#about').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	
		deafult:
			$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		    break;
	}
		
});
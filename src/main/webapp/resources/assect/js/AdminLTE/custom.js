
var dashboardwidget = ["#widget", "#widget_1"];
//dashboardwidget.push("Kiwi");
	//custom function //
function loadwidget() {
   
    for (i = 0; i < dashboardwidget.length; i++) { 
   // text += cars[i] + "<br>";
         url=dashboardwidget[i].substring(1)+".html";
	// alert(url);
		$.ajax({
	        url: url,
	        dataType: 'html',
	        type: 'get',
	        
	        success: function( data, textStatus, jQxhr )
	        {
		    
	            $("#widget_container").append( data );
	        },
	        error: function( jqXhr, textStatus, errorThrown )
	        {
	            console.log( errorThrown );
	        }
	    });
}
//    jQuery.each(dashboardwidget, function(index, value) {
//       console.log(value);
//        // will stop running after "three"
//  
//
//		
//	 });	
    //code
    
}

	//    $(".widget_open").click(function(){
	//	 url=$(this).attr("id")+".html";
	//	$.ajax({
	//        url: "widget.html",
	//        dataType: 'html',
	//        type: 'get',
	//        
	//        success: function( data, textStatus, jQxhr )
	//        {
	//            $("#widget_container").append( data );
	//        },
	//        error: function( jqXhr, textStatus, errorThrown )
	//        {
	//            console.log( errorThrown );
	//        }
	//    });
	//	
	//	});
	    
	//    $(".widget_open1").click(function(){
	//	 url=$(this).attr("id")+".html";
	//	$.ajax({
	//        url: "widget_1.html",
	//        dataType: 'html',
	//        type: 'get',
	//        
	//        success: function( data, textStatus, jQxhr )
	//        {
	//            $("#widget_container").append( data );
	//        },
	//        error: function( jqXhr, textStatus, errorThrown )
	//        {
	//            console.log( errorThrown );
	//        }
	//    });
	//	
	//	});
	    // loadwidget();
	  //  });
	function load_page(url,element) {
	   $(element).html("Please wait.."); 
	$.ajax({
	        url: url,
	        dataType: 'html',
	        type: 'get',
	        
	        success: function( data, textStatus, jQxhr )
	        {
	            $(element).html( data );
	        },
	        error: function( jqXhr, textStatus, errorThrown )
	        {
	            console.log( errorThrown );
	        }
	    });
	    //code
	   
	}
	
	//functions
	$(function() {
	    
	//add to widget click function start
	 $(".add_to_widget").click(function(){
	    wid=$(this).attr("href");
	    alert("Widget added to Dashboard");
	       dashboardwidget.push(wid);
	       console.log(dashboardwidget);
	       });
	//add to widget click function end
	
	// searchable combobox start
	$('.chosen-select').chosen();
	// searchable combobox end
	
	
	});

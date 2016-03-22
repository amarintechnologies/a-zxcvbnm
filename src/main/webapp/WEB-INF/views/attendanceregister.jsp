
<section class="content-header">
    <h1> Attendance Register</h1>
    <ol class="breadcrumb">
        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href=""><i class="fa"></i> Employee</a></li>
        <li><a href=""><i class="fa"></i> Attendance Management</a></li>
        <li class="active">Attendance Register</li>
    </ol>
</section>
                
<section class="content">
    <div class="row">
        <div class="col-md-12 col-xs-12">
            
            <div class="box box-primary">
            <div class="box-header">
                <div class="box-header">
                        <h3 class="box-title"></h3>
                        <br>
                        
                <div class="box-body">
                      
                <form role="form" class="col-md-12 ">
<!--                    <div class="form-group col-md-4">
                        <label>Employee Number</label>
                        <input class="form-control input-md" type="text">
                    </div>-->
                    <div class="form-group col-md-4">
                        <label>Department</label>
                        <select class="form-control input-md">
                            <option value="zero">Select</option>
                            <option value="one">Information Technology</option>
                            <option value="one">Computer Science</option>
                            <option value="one">Mechanical Engineering</option>
                            <option value="one">Fashion Technology</option>
                            <option value="one">Communication Engineering</option>
                        </select>
                    </div>
<!--                    <div class="form-group col-md-4">
                        <label>Max Leave Count</label>
                        <input class="form-control input-md" type="text">
                    </div>-->
                </form>
          
                </div>
                </div>
            </div>
            </div>
            
                        
                        
             <div class="box one">
                <div class="box-header">
                    <h3 class="box-title">Employee Attendence List</h3>
                </div><!-- /.box-header -->
                <!-- Calendar -->
                
                <div id="cal-scroll">
                    <div id='calendar'></div>
                </div>
  
             </div><!-- /.box -->
                        
        </div>
    </div><!-- /.row (main row) -->

</section><!-- /.content -->

 
    <link href='drag_calendar/fullcalendar/fullcalendar.css' rel='stylesheet' />
    <link href='drag_calendar/fullcalendar/fullcalendar.print.css' rel='stylesheet' media='print' />
    <link href='drag_calendar/css.css' rel='stylesheet' />
    <script src='drag_calendar/jquery/jquery.min.js'></script>
    <script src='drag_calendar/jquery/jquery-ui.custom.min.js'></script>
    <script src='drag_calendar/fullcalendar/fullcalendar.js'></script>
    <script src='drag_calendar/empcalendar.js'></script>

    
    	<!-- Add mousewheel plugin (this is optional) -->
	<script type="text/javascript" src="fancyBox/lib/jquery.mousewheel-3.0.6.pack.js"></script>

	<!-- Add fancyBox main JS and CSS files -->
	<script type="text/javascript" src="fancyBox/source/jquery.fancybox.js?v=2.1.5"></script>
	<link rel="stylesheet" type="text/css" href="fancyBox/source/jquery.fancybox.css?v=2.1.5" media="screen" />

	<!-- Add Button helper (this is optional) -->
	<link rel="stylesheet" type="text/css" href="fancyBox/source/helpers/jquery.fancybox-buttons.css?v=1.0.5" />
	<script type="text/javascript" src="fancyBox/source/helpers/jquery.fancybox-buttons.js?v=1.0.5"></script>
        <!-- fancybox -->
	
        <script type="text/javascript">
        $(document).ready(function(){
        $("select").change(function(){
            $( "select option:selected").each(function(){
                if($(this).attr("value")=="one"){
                    $(".box").show();
                    $(".one").show();
                }
                if($(this).attr("value")=="zero"){
                    $(".box").show();
                    $(".one").hide();
                }

                });
            }).change();
        });

        </script>
	       <script type="text/javascript">
          //functions
	$(function() {
	    
	//add to widget click function start
	 $(".add_to_widget").click(function(){
	    wid=$(this).attr("href");
	       dashboardwidget.push(wid);
	       console.log(dashboardwidget);
	       });
	//add to widget click function end
	

	
	});
        </script>

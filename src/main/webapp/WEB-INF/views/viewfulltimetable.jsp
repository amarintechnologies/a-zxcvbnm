<script>
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
                <section class="content-header">
                    <h1> View Full Timetable</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Timetable</a></li>
                        <li><i class="fa"></i> View Timetable </li>
                        <li class="active"> View Full Timetable</li>
                    </ol>
                </section>
                <section class="col-md-12">
                          
                        
                    </section>

                <!-- Main content -->
                <section class="content col-md-12">
                    <div class="col-md-12">
    
                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                                    <h3 class="box-title">Search Timetable</h3>
                                    <a class="add_to_widget" href="#viewfulltimetable_widget" ><button class="btn btn-warning btn-sm margin pull-right">Add to Widget</button></a>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                    
                                        <div class="form-group col-md-3">
                                                <label>Class Name</label>
                                                <select class="form-control input-md ">
                                                    <option value="zero">Select</option>
                                                    <option value="one">class 1</option>
                                                    <option value="one">class 2</option>
                                                    <option value="one">class 3</option>
                                                    <option value="one">class 4</option>
                                                    <option value="one">class 5</option>
                                                </select>
                                        </div>
                                        <div class="form-group col-md-3">
                                                <label>Course Name</label>
                                                <select class="form-control input-md">
                                                    <option value="zero">Select</option>
                                                    <option value="one">Information Technology</option>
                                                    <option value="one">Computer Science</option>
                                                    <option value="one">Electrical</option>
                                                    <option value="one">Communication</option>
                                                    <option value="one">Fashion Technology</option>
                                                </select>
                                        </div>
                                        <!-- <div class="form-group col-md-3">
                                            <label>Select Mode</label>
                                            <select class="form-control input-md">
                                                <option value="zero">Select</option>
                                                <option value="one">Week</option>
                                                <option value="one">Day</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-3">
                                            <label>Select Day</label>
                                            <select class="form-control input-md" disabled>
                                                <option>Select</option>
                                                <option>Monday</option>
                                                <option>Tuesday</option>
                                                <option>Wednesday</option>
                                                <option>Thursday</option>
                                                <option>Friday</option>
                                                <option>Saturday</option>
                                            </select>
                                        </div>-->
                                        
                                        </form>
                      
                            </div>
                        </div>
                    </div>
                </div>

                    <!-- Small boxes (Stat box) -->
                   <!-- /.row -->

                    <!-- Main row -->
                    <div class="row box1 one">

                    <table border="2" cellspacing="3" align="center" class="table table-responsive table-striped" style="border-color: #B7D5E7;"> 
                        <tr>
                         <td align="center">
                         <th align="center">08:30 - 09:30
                         <th align="center">09:30 - 10:30
                         <th align="center">10:30 - 11:30
                         <th align="center">11:30 - 12:30
                         <th align="center">12:30 - 02:00
                         <th align="center">02:00 - 03:00
                         <th align="center">03:00 - 04:00
                         <th align="center">04:00 - 05:00
                        </tr>
                        <tr>
                         <th align="center">MONDAY
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">OOAD <br> Prof.Iyyanar</span></td>
                         <td align="center"><span class="tbl-assigned">C++ <br> Prof.Vasanthi</span></td>
                         <td rowspan="6"align="center"><br><br>L<br>U<br>N<br>C<br>H
                         <td align="center"><span class="tbl-assigned">Networking <br> Prof.Shanmugaraj</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">Counselling Class<br> Dr.Mohanraj</span></td>
                        </tr>
                        <tr>
                         <th align="center">TUESDAY
                         <td colspan="3" align="center"><font color="green"> <span class="tbl-assigned">OOPS Lab<br> Prof.Iyyanar</span></td> </td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">Networking <br> Prof.Shanmugaraj</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">Library</span></td>
                        </tr>
                        <tr>
                         <th align="center">WEDNESDAY
                         <td align="center"><span class="tbl-assigned">Networking <br> Prof.Shanmugaraj</span></td>
                         <td align="center"><span class="tbl-assigned">OOAD <br> Prof.Iyyanar</span></td>
                         <td align="center"><span class="tbl-assigned">MCS<br> Dr.Senthil</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td colspan="3" align="center"><font color="green"> <span class="tbl-assigned">Networking Lab<br> Prof.Shanmugaraj</span></td> </td>
                        </tr>
                        <tr>
                         <th align="center">THURSDAY
                         <td align="center"><span class="tbl-assigned">MCS<br> Dr.Senthil</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">OOAD <br> Prof.Iyyanar</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">Networking <br> Prof.Shanmugaraj</span></td>
                         <td align="center"><span class="tbl-assigned">Library</span></td>
                        </tr>
                        <tr>
                         <th align="center">FRIDAY
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">OOAD <br> Prof.Iyyanar</span></td>
                         <td align="center"><span class="tbl-assigned">C++ <br> Prof.Vasanthi</span></td>
                         <td align="center"><span class="tbl-assigned">Networking <br> Prof.Shanmugaraj</span></td>
                         <td colspan="3" align="center"><font color="green"> <span class="tbl-assigned">C++ Lab<br> Prof.Vasanthi</span></td> </td>
                         
                        </tr>
                        <tr>
                         <th>SATURDAY
                         <td colspan="3" align="center"><font color="green"> <span class="tbl-assigned">C++ Lab<br> Prof.Vasanthi</span></td> </td>
                         <td align="center"><span class="tbl-assigned">OOAD <br> Prof.Iyyanar</span></td>
                         <td align="center"><span class="tbl-assigned">MCS<br> Dr.Senthil</span></td>
                         <td align="center"><span class="fancyopen tbl-assign">Assign</span></td>
                         <td align="center"><span class="tbl-assigned">Library</span></td>
                        </tr>
                    </table>
                                   
                        
                    </div><!-- /.row (main row) -->
                </section><!-- /.content -->
           
        
      
        
       <link href='drag_calendar/fullcalendar/fullcalendar.css' rel='stylesheet' />
    <link href='drag_calendar/fullcalendar/fullcalendar.print.css' rel='stylesheet' media='print' />
    <link href='drag_calendar/css.css' rel='stylesheet' />
    <script src='drag_calendar/jquery/jquery.min.js'></script>
    <script src='drag_calendar/jquery/jquery-ui.custom.min.js'></script>
    <script src='drag_calendar/fullcalendar/fullcalendar.js'></script>
    <script src='drag_calendar/timetable.js'></script>
    
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
                    $(".box1").show();
                    $(".one").show();
                }
                if($(this).attr("value")=="zero"){
                    $(".box1").show();
                    $(".one").hide();
                }

                });
            }).change();
        $("span.fancyopen").click(function(){
           fancyOpen();
        });
        });

        </script>
        <script>

            function fancyOpen() {
			//code
			 $.fancybox.open([
            {
                
                fitToView: false,
                width: '30%',
                height: '50%',
                autoSize: false,
                closeClick: false,
                openEffect: 'none',
                closeEffect: 'none',
                type: 'ajax',
                href: 'timetbl.html'
            }
        ]);
		}
                
        </script>



<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ischool | Dashboard</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <link href="/school/resources/assect/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="/school/resources/assect/font-awesome-4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="/school/resources/assect/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- Morris chart -->
        <link href="/school/resources/assect/css/morris/morris.css" rel="stylesheet" type="text/css" />
        <!-- jvectormap -->
        <link href="/school/resources/assect/css/jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" type="text/css" />
        <!-- Date Picker -->
        <link href="/school/resources/assect/css/datepicker/datepicker3.css" rel="stylesheet" type="text/css" />
        <!-- Daterange picker -->
        <link href="/school/resources/assect/css/daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
        <!-- bootstrap wysihtml5 - text editor -->
        <link href="/school/resources/assect/css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="/school/resources/assect/css/AdminLTE.css" rel="stylesheet" type="text/css" />
         <!-- search combo -->
        <link rel="stylesheet" href="/school/resources/assect/js/plugins/chosen_v1.3.0/chosen.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
        <script src="/school/resources/assect/js/jquery.min.js"></script>
        <script src="/school/resources/assect/js/AdminLTE/custom.js" type="text/javascript"></script>
        <script src="/school/resources/assect/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="/school/resources/assect/js/jquery.bootstrap.wizard.js"></script>
        <script src="/school/resources/assect/ajax/jquery-ui.min.js" type="text/javascript"></script>
        <!-- Morris.js charts -->
        <script src="/school/resources/assect/ajax/raphael-min.js"></script>
       
        <!-- Sparkline -->
        <script src="/school/resources/assect/js/plugins/sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
        <!-- jvectormap -->
        <script src="/school/resources/assect/js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
        <script src="/school/resources/assect/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
                
        <!-- jQuery Knob Chart -->
        <script src="/school/resources/assect/js/plugins/jqueryKnob/jquery.knob.js" type="text/javascript"></script>
        <!-- daterangepicker -->
        <script src="/school/resources/assect/js/plugins/daterangepicker/daterangepicker.js" type="text/javascript"></script>
        <!-- datepicker -->
        <script src="/school/resources/assect/js/plugins/datepicker/bootstrap-datepicker.js" type="text/javascript"></script>
        <!-- Bootstrap WYSIHTML5 -->
        <script src="/school/resources/assect/js/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" type="text/javascript"></script>
        <!-- iCheck -->
        <script src="/school/resources/assect/js/plugins/iCheck/icheck.min.js" type="text/javascript"></script>

        <!-- AdminLTE App -->
        <script src="/school/resources/assect/js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- search combo -->
        <script src="/school/resources/assect/js/plugins/chosen_v1.3.0/chosen.jquery.js" type="text/javascript"></script>
        
     
        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
        <script>
   $(function(){
	     
	    $(".haslink").click(function(){
	        url=$(this).attr("href").substring(1);
	       //alert(url);
	        load_page(url+".jsp",swap_wrap);
	       
	        });
   });
   </script>
    </head>
    
    
     <body class="skin-black">
        <!-- header logo: style can be found in header.less -->
        <header class="header">
            <a href="home.html" class="logo">
                <!-- Add the class icon to your logo image or logo icon to add the margining -->
                iSchool
            </a>
            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top" role="navigation">
                <!-- Sidebar toggle button-->
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <div class="navbar-right">
                    <ul class="nav navbar-nav">
                       
                   
                        
                        <!-- User Account: style can be found in dropdown.less -->
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span>Admin <i class="caret"></i></span>
                            </a>
                            <ul class="dropdown-menu">
                                <!-- User image -->
                                <li class="user-header bg-light-blue">
                                    <img src="/school/resources/assect/img/avatar2.png" class="img-circle" alt="User Image" />
                                    <p>
                                        admin - Super user
                                        <small>Member since Jan. 2015</small>
                                    </p>
                                </li>
                                <!-- Menu Body 
                                <li class="user-body">
                                    <div class="col-xs-6 text-center">
                                        <a href="#">Activites</a>
                                    </div>
                                    
                                    <div class="col-xs-6 text-center">
                                        <a href="#">Login History</a>
                                    </div>
                                </li>
                                 Menu Footer-->
                                <li class="user-footer">
                                    <!--<div class="pull-left">
                                        <a href="#" class="btn btn-default btn-flat">Profile</a>
                                    </div>-->
                                    <div class="pull-right">
                                        <a href="index.html" class="btn btn-default btn-flat">Sign out</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="left-side sidebar-offcanvas">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="/school/resources/assect/img/avatar5.png" class="img-circle" alt="User Image" />
                        </div>
                        <div class="pull-left info">
                            <p>Hello, Admin</p>

                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>
                    <!-- search form -->
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search..."/>
                            <span class="input-group-btn">
                                <button type='submit' name='search' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </form>
                    <!-- /.search form -->
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <ul class="sidebar-menu">
                        <li class="active">
                            <a class="haslink" href="#dashboard">
                                <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                            </a>
                        </li>
                                                  <li class="treeview"><a href="studentdashboard.html"><i class="fa fa-female"></i>
                                <span>Students</span><i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li class="treeview"><a href="#">
                                
                                <span>Manage Student</span>
                                <i class="fa fa-angle-left pull-right"></i>
                                </a>
                                    <ul class="treeview-menu">
                                        <li><a class="haslink" href="#addstudent" onclick="addstudentclk();"><i class="fa fa-angle-double-right"></i>Create New Student</a></li>
                                        <li><a class="haslink" href="#applicantlist" onclick="applicantlistclk();"><i class="fa fa-angle-double-right"></i>Applicant List</a></li>
                                        <li><a class="haslink" href="#studentlist" onclick="studentlistclk();"  ><i class="fa fa-angle-double-right"></i> Student List</a></li>
                                        <li><a class="haslink" href="#studentcategory" onclick="mngstudctgclk();"><i class="fa fa-angle-double-right"></i> Manage Student Category</a></li>
                                        
                                    </ul>
                                </li>

                                 <li class="treeview"><a href="#">
                                
                                <span>Manage Guardians</span>
                                <i class="fa fa-angle-left pull-right"></i>
                                </a>
                                    <ul class="treeview-menu">
                                     <li><a class="haslink" href="#listguardians" onclick="listgurdclk();"><i class="fa fa-angle-double-right"></i> List Guardians</a></li>   
                                        
                                        
                                    </ul>
                                </li>
                                <li class=""><a class="haslink" href="#complaint" onclick="complaintclk();">Complaint</a></li>
                            </ul>
                        </li>
    <!-- Employee Starts-->                                              
<li class="treeview">
   <a href="employeedashboard.html">
      <i class="fa fa-user"></i>
        <span>Employees</span>
        <i class="fa fa-angle-left pull-right"></i>
   </a>
   <ul class="treeview-menu">
     <li class="treeview"><a href="#"><span>Manage Employee</span><i class="fa fa-angle-left pull-right"></i></a>
       <ul class="treeview-menu">
        <li class=""><a class="haslink" href="#listemployees"><i class="fa fa-angle-double-right"></i> List Employees</a></li>
        <li><a class="haslink" href="#createemployees"><i class="fa fa-angle-double-right"></i> Create Employees</a></li>
       </ul>
     </li>
     <li class="treeview"><a href="#">
     <span>Leave Management</span>
     <i class="fa fa-angle-left pull-right"></i>
     </a>
        <ul class="treeview-menu">
          <li><a class="haslink" href="#addleavetype"><i class="fa fa-angle-double-right"></i>Add Leave Type</a></li>
        </ul>
     </li>
     <li class="treeview"><a href="#">
     <span>Attendance Management</span>
     <i class="fa fa-angle-left pull-right"></i>
     </a>
        <ul class="treeview-menu">
           <li><a class="haslink" href="#attendanceregister"><i class="fa fa-angle-double-right"></i>Attendance Register</a></li>
        </ul>
     </li>
     <li class="treeview"><a href="#">
     <span>Employee Settings</span>
     <i class="fa fa-angle-left pull-right"></i>
     </a>
      <ul class="treeview-menu">
       <li><a class="haslink" href="#subjectassociation"><i class="fa fa-angle-double-right"></i>Subject Association</a></li>
       <li><a class="haslink" href="#managecategories"><i class="fa fa-angle-double-right"></i>Manage Categories</a></li>
       <li><a class="haslink" href="#managedepartments"><i class="fa fa-angle-double-right"></i>Manage Departments</a></li>
       <li><a class="haslink" href="#managepositions"><i class="fa fa-angle-double-right"></i>Manage Positions</a></li>
       <li><a class="haslink" href="#managegrades"><i class="fa fa-angle-double-right"></i>Manage Grades</a></li>
        </ul>
     </li>
   </ul>
</li>

<!-- Employee Ends-->



 <!--Course starts here -->
<li class="treeview">
    <a href="coursedashboard.html">
        <i class="fa fa-slideshare"></i>
        <span>Courses</span>
        <i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
        
        <li class="treeview"><a href="#">
        
        <span>Manage Configuration</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#setup"><i class="fa fa-angle-double-right"></i> General Settings</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Manage Courses</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#class"><i class="fa fa-angle-double-right"></i> Class</a></li>
                <li><a class="haslink" href="#subject"><i class="fa fa-angle-double-right"></i> Subject</a></li>        
                <li><a class="haslink" href="#gradesection"><i class="fa fa-angle-double-right"></i> Grade Section</a></li>
            </ul>
        </li>
        
        <li class="treeview"><a href="#">
        
        <span>Manage Batches</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#batches"><i class="fa fa-angle-double-right"></i> Batches</a></li>
                <li><a class="haslink" href="#batchgroup"><i class="fa fa-angle-double-right"></i> Batch Group</a></li>          
            </ul>
        </li>
    </ul>
</li>
<!-- Course ends here -->

<!-- Examination starts-->

 <li class="treeview">
    <a href="examdashboard.html">
        <i class="fa fa-edit"></i>
        <span>Examination</span>
        <i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
        <li class="treeview"><a href="#">
        
        <span>Exam Management</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#batchexam"><i class="fa fa-angle-double-right"></i> Batch Exam</a></li>
                <li><a class="haslink" href="#batchinternalscore"><i class="fa fa-angle-double-right"></i> Batch Internal Score</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Set Grading Level</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#gradename"><i class="fa fa-angle-double-right"></i> Grade Name</a></li>
            </ul>
        </li>
    </ul>
</li>

<!-- Examination ends -->


<!-- Attendance starts -->
<li class="treeview">
    <a href="attendancedashboard.html">
	<i class="fa fa-table"></i>
	<span>Attendance</span>
	<i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
	<li><a class="haslink" href="#studentattendance"><i class="fa fa-angle-double-right"></i> Student Attendance</a></li>
	<li><a class="haslink" href="#attendanceregister"><i class="fa fa-angle-double-right"></i> Employee Attendance</a></li>
    </ul>
</li>
                        
<!-- Attendance ends -->

<!-- Timetable Starts -->
                        
                        <li class=" treeview">
                            <a href="timetabledashboard.html">
                                <i class="fa fa-calendar"></i>
                                <span>Timetable</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                 <li class="treeview"><a href="#">
                                
                                <span>View Timetable</span>
                                <i class="fa fa-angle-left pull-right"></i>
                                </a>
                                    <ul class="treeview-menu">
                                        <li><a class="haslink" href="#viewfulltimetable"><i class="fa fa-angle-double-right"></i> View Full Timetable</a></li>
                                    </ul>
                                </li>
                                <li class="treeview"><a href="#">
                                <span>Manage Timetable</span>
                                <i class="fa fa-angle-left pull-right"></i>
                                </a>
                                    <ul class="treeview-menu">
                                        <li><a class="haslink" href="#setclasstiming"><i class="fa fa-angle-double-right"></i> Set Class Timing</a></li>
                                        <li><a class="haslink" href="#settimetable"><i class="fa fa-angle-double-right"></i> Set Timetable</a></li>
                                    </ul>
                                </li>
                                
                            </ul>
                        </li>
                         
                        
<!-- Timetable ends -->
  
<!-- Fees starts here -->

<li class=" treeview">
    <a href="Feedashboard.html">
        <i class="fa fa-money"></i>
        <span>Fees</span>
        <i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
        <li class="treeview"><a href="#">
        
        <span>Manage Fees</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#fees"><i class="fa fa-angle-double-right"></i> Fees</a></li>
                <li><a class="haslink" href="#collectfees"><i class="fa fa-angle-double-right"></i> Collect Fees</a></li>
                <li><a class="haslink" href="#paid"><i class="fa fa-angle-double-right"></i> Paid</a></li>
                <li><a class="haslink" href="#unpaid"><i class="fa fa-angle-double-right"></i> Unpaid</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Fee Categories</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li class="treeview"><a href="#"><i class="fa fa-angle-double-right"></i> Transport</a>
                <ul class="treeview-menu">
                    <li><a class="haslink" href="#feesschedule"><i class="fa fa-angle-double-right"></i> Fees Schedule</a></li>
                    <li><a class="haslink" href="#feespayment"><i class="fa fa-angle-double-right"></i> Fees Payment</a></li>
                </ul> </li>   
                <li class="treeview"><a href="#"><i class="fa fa-angle-double-right"></i> Hostel</a>
                <ul class="treeview-menu">
                    <li><a class="haslink" href="#hostelfeesschedule"><i class="fa fa-angle-double-right"></i> Fees Schedule</a></li>
                    <li><a class="haslink" href="#hostelfeespayment"><i class="fa fa-angle-double-right"></i> Fees Payment</a></li>
                </ul></li>
            </ul>
        </li>
        
    </ul>
</li>


<!-- Fees ends here -->
    
<!-- Report starts here -->

<li class="treeview">
     <a href="reportdashboard.html">
         <i class="fa fa-bar-chart-o"></i>
         <span>Report</span>
         <i class="fa fa-angle-left pull-right"></i>
     </a>
     <ul class="treeview-menu">
         
         <li class="treeview"><a href="#">
         
         <span>Manage Report</span>
         <i class="fa fa-angle-left pull-right"></i>
         </a>
             <ul class="treeview-menu">
                 <li><a class="haslink" href="#applicant_report"><i class="fa fa-angle-double-right"></i> Applicant Report</a></li>
                 <li><a class="haslink" href="#student_report"><i class="fa fa-angle-double-right"></i> Student Report</a></li>
             </ul>
         </li>
         <li class="treeview"><a href="#">
         
         <span>Assessment Report</span>
         <i class="fa fa-angle-left pull-right"></i>
         </a>
             <ul class="treeview-menu">
                 <li><a class="haslink" href="#gradesheet"><i class="fa fa-angle-double-right"></i> Grade Sheet</a></li>
                 <li><a class="haslink" href="#reportcard"><i class="fa fa-angle-double-right"></i> Report Card</a></li>        
                 <li><a class="haslink" href="#semester_report"><i class="fa fa-angle-double-right"></i> Semester Report</a></li>
             </ul>
         </li>
         
     </ul>
 </li>

<!-- Report ends here -->

<!--Library starts here -->

<li class=" treeview">
    <a href="librarydashboard.html">
        <i class="fa fa-book"></i>
        <span>Library</span>
        <i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
        
        <li class="treeview"><a href="#">
        
        <span>Manage Book</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#listbook"><i class="fa fa-angle-double-right"></i> List Book</a></li>
                <li><a class="haslink" href="#addbook"><i class="fa fa-angle-double-right"></i> Add Book </a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Book Lend</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#borrowbook"><i class="fa fa-angle-double-right"></i> Borrow Book</a></li>
                <li><a class="haslink" href="#returnbook"><i class="fa fa-angle-double-right"></i> Return Book</a></li>        
                <li><a class="haslink" href="#viewbookdetails"><i class="fa fa-angle-double-right"></i> View Book Details</a></li>
                <li><a class="haslink" href="#duedates"><i class="fa fa-angle-double-right"></i> Due Dates</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Settings</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#addbookcategory"><i class="fa fa-angle-double-right"></i> Add Book Category</a></li>
                <li><a class="haslink" href="#viewstudentdetails"><i class="fa fa-angle-double-right"></i> View Student Details</a></li>        
                <li><a class="haslink" href="#viewauthors"><i class="fa fa-angle-double-right"></i> View Authors</a></li>
            </ul>
        </li>
        
    </ul>
</li>



<!-- Library ends here -->

<!-- Transport Starts -->

<li class=" treeview">
    <a href="transportdashboard.html">
        <i class="fa fa-bus"></i>
        <span>Transport</span>
        <i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
        
        <li class="treeview"><a href="#">
        
        <span>Manage Route</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#listallroute"><i class="fa fa-angle-double-right"></i> List All Route</a></li>
                <li><a class="haslink" href="#assignroute"><i class="fa fa-angle-double-right"></i> Assign Route </a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Routes</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#allotment"><i class="fa fa-angle-double-right"></i> Allotment</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Settings</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#vehicledetails"><i class="fa fa-angle-double-right"></i> Vehicle Details</a></li>
                <li><a class="haslink" href="#routedetails"><i class="fa fa-angle-double-right"></i>Route Details</a></li>        
                <li><a class="haslink" href="#transportmanage"><i class="fa fa-angle-double-right"></i>Transport Manage</a></li>
                <li><a class="haslink" href="#buslog"><i class="fa fa-angle-double-right"></i> Bus Log</a></li>
            </ul>
        </li>
        
    </ul>
</li>


<!-- Transport Ends -->
                        

<!--Hostel-->
<li class="treeview">
    <a href="hosteldashboard.html">
        <i class="fa fa-institution"></i>
        <span>Hostel</span>
        <i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
        <li class="treeview">
            <a href="#">
                <span>Manage Rooms</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#listroomdetails"><i class="fa fa-angle-double-right"></i> List Room Details</a></li>
                <li><a class="haslink" href="#searchroom"><i class="fa fa-angle-double-right"></i> Search Room </a></li>
                <li><a class="haslink" href="#hosteldetails"><i class="fa fa-angle-double-right"></i> Hostel Details </a></li>
                <li><a class="haslink" href="#addroomdetails"><i class="fa fa-angle-double-right"></i>Add Room Details</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Rooms</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#allotrooms"><i class="fa fa-angle-double-right"></i> Allot Rooms</a></li>
                <li><a class="haslink" href="#vacate"><i class="fa fa-angle-double-right"></i> Vacate</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Settings</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#hostelviewstudent"><i class="fa fa-angle-double-right"></i>  View Student Details</a></li>
            </ul>
        </li>
    </ul>
</li>
<!--Hostel-->

<!-- SETUP MENU -->
<li class="treeview  ">
    <a href="setup.html">
        <i class="fa fa-wrench"></i>
        <span>Settings</span>
        <i class="fa fa-angle-left pull-right"></i>
    </a>
    <ul class="treeview-menu">
        <li class="treeview">
            <a href="location.html">
                <span>Location</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#country"><i class="fa fa-angle-double-right"></i> Country</a></li>
                <li><a class="haslink" href="#region"><i class="fa fa-angle-double-right"></i> Region</a></li>
                <li><a class="haslink" href="#state"><i class="fa fa-angle-double-right"></i> State</a></li>
                <li><a class="haslink" href="#city"><i class="fa fa-angle-double-right"></i> City</a></li>
                <li><a class="haslink" href="#currency"><i class="fa fa-angle-double-right"></i> Currency</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="school.html">
                <span>School</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#department"><i class="fa fa-angle-double-right"></i> Department</a></li>
                <li><a class="haslink" href="#schoolsetup"><i class="fa fa-angle-double-right"></i> School</a></li>
                <li><a class="haslink" href="#orgnews"><i class="fa fa-angle-double-right"></i> Org.News</a></li>
                <li><a class="haslink" href="#class"><i class="fa fa-angle-double-right"></i> Class</a></li>
                <li><a class="haslink" href="#subject"><i class="fa fa-angle-double-right"></i> Subject</a></li>
                <li><a class="haslink" href="#gradesection"><i class="fa fa-angle-double-right"></i> Grade Section</a></li>
                <li><a class="haslink" href="#gradename"><i class="fa fa-angle-double-right"></i> Grade Name</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>System</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#systemparameter"><i class="fa fa-angle-double-right"></i> System Parameter</a></li>
                <li><a class="haslink" href="#customfields"><i class="fa fa-angle-double-right"></i> Custom Fields</a></li>
                <li><a class="haslink" href="#logger"><i class="fa fa-angle-double-right"></i> Logger</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Manage Users</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#userslist"><i class="fa fa-angle-double-right"></i> Users List</a></li>
                <li><a class="haslink" href="#managerole"><i class="fa fa-angle-double-right"></i> Manage Role</a></li>   
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Hostel</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#buildingandrooms"><i class="fa fa-angle-double-right"></i> Building and Rooms</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Student</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink"  href="#diseases"><i class="fa fa-angle-double-right"></i> Diseases</a></li>
                <li><a class="haslink" href="#studentcategory"><i class="fa fa-angle-double-right"></i> Student Category</a></li>
                <li><a class="haslink" href="#batches"><i class="fa fa-angle-double-right"></i> Batch</a></li>
                <li><a class="haslink" href="#batchgroup"><i class="fa fa-angle-double-right"></i> Batch Group</a></li>
            </ul>
        </li>
    </ul>
</li>
                        
<!--setup ends -->                       



	    </ul>
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Right side column. Contains the navbar and content of the page -->
           <aside id="swap_wrap" class="right-side">
                 <script src="/school/resources/assect/js/plugins/morris/morris.min.js" type="text/javascript"></script>
                 <script>
                    $(document).ready(function(){
                        loadwidget();
                        });
                  //  
                 </script>
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Dashboard
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>
<!-- Main content -->
                <section class="content">

                    <!-- Small boxes (Stat box) -->
                    <div class="row">
                         <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-yellow">
                                <div class="inner">
                                    <h3>
                                        1500
                                    </h3>
                                    <p>
                                        Students
                                    </p>
                                </div>
                                <div class="icon">
                                    <i class="ion ion-person-stalker"></i>
                                </div>
                                <a href="#" class="small-box-footer">
                                    More info <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div><!-- ./col -->
                        <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-aqua">
                                <div class="inner">
                                    <h3>
                                        5000
                                    </h3>
                                    <p>
                                        Book Collections
                                    </p>
                                </div>
                                <div class="icon">
                                    <i class="ion ion-briefcase"></i>
                                </div>
                                <a href="#" class="small-box-footer">
                                    More info <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div><!-- ./col -->
                        <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-green">
                                <div class="inner">
                                    <h3>
                                        96<sup style="font-size: 20px">%</sup>
                                    </h3>
                                    <p>
                                        Student Grade
                                    </p>
                                </div>
                                <div class="icon">
                                    <i class="ion ion-stats-bars"></i>
                                </div>
                                <a href="#" class="small-box-footer">
                                    More info <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div><!-- ./col -->
                       
                        <div class="col-lg-3 col-xs-6">
                            <!-- small box -->
                            <div class="small-box bg-red">
                                <div class="inner">
                                    <h3>
                                        48
                                    </h3>
                                    <p>
                                     Transport
                                    </p>
                                </div>
                                <div class="icon">
                                    <i class="ion ion-pie-graph"></i>
                                </div>
                                <a href="#" class="small-box-footer">
                                    More info <i class="fa fa-arrow-circle-right"></i>
                                </a>
                            </div>
                        </div><!-- ./col -->
                    </div><!-- /.row -->

               
                 <div class="row" id="widget_container">
                        
                        <section class="col-md-6 connectedSortable" id="result">
                            <div class="nav-tabs-custom">
                                
                                <ul class="nav nav-tabs pull-right">
                                    <li class="active"><a href="#" data-toggle="tab">Student Result</a></li>
                                    <li><a href="#" data-toggle="tab">Student Grade</a></li>
                                    <li class="pull-left header"><i class="fa fa-inbox"></i> School Report</li>
                                </ul>
                                <div class="tab-content no-padding">
                                    
                                    <div class="chart tab-pane active" id="revenue-chart" style="position: relative; height: 300px;">
                                         <img src="/school/resources/assect/img/chart.jpg">
                                    </div>
                                    <div class="chart tab-pane" id="sales-chart" style="position: relative; height: 300px;">
                                        
                                    </div>
                                </div>
                            </div>
                        </section>
                        
                        <!-- right col (We are only adding the ID to make the widgets sortable)-->
                   <!--  <section class="col-md-6 connectedSortable" id="calendar">

                            <div class="box box-solid bg-green-gradient">
                                <div class="box-header">
                                    <i class="fa fa-calendar"></i>
                                    <h3 class="box-title">Event Calendar</h3>
                                 
                                    <div class="pull-right box-tools">
                                        
                                        <div class="btn-group">
                                            <button class="btn btn-success btn-sm dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bars"></i></button>
                                            <ul class="dropdown-menu pull-right" role="menu">
                                                <li><a href="#">Add new event</a></li>
                                                <li><a href="#">Clear events</a></li>
                                                <li class="divider"></li>
                                                <li><a href="#">View calendar</a></li>
                                            </ul>
                                        </div>
                                        <button class="btn btn-success btn-sm" data-widget="collapse"><i class="fa fa-minus"></i></button>
                                        <button class="btn btn-success btn-sm" data-widget="remove"><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                                <div class="box-body no-padding">
                                    
                                    <div id="calendar" style="width: 100%"></div>
                                </div>
                                <div class="box-footer text-black">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            
                                            <div class="clearfix">
                                                <span class="pull-left">Sports Day:</span>
                                                <small class="pull-right">05 Mar 2015</small>
                                            </div>
                                            

                                            <div class="clearfix">
                                                <span class="pull-left">School Annual Day:</span>
                                                <small class="pull-right">22 Mar 2015</small>
                                            </div>
                                           
                                        </div>
                                        <div class="col-sm-6">
                                            <div class="clearfix">
                                                <span class="pull-left">Practicals :</span>
                                                <small class="pull-right">Start From 15 Apr 2015</small>
                                            </div>
                                            

                                            <div class="clearfix">
                                                <span class="pull-left">Semester:</span>
                                                <small class="pull-right">Start from 25 May 2015</small>
                                            </div>
                                            
                                        </div>
                                    </div>
                                </div>
                            </div>
                     </section>-->
                     <section class="col-md-6 connectedSortable" id="">
                        <div class="box box-solid bg-light-blue-gradient">
                                <div class="box-header">
                                    <!-- tools box -->
                                    <div class="pull-right box-tools">
                                        <button class="btn btn-primary btn-sm daterange pull-right" data-toggle="tooltip" title="Date range"><i class="fa fa-calendar"></i></button>
                                        <button class="btn btn-primary btn-sm pull-right" data-widget='collapse' data-toggle="tooltip" title="Collapse" style="margin-right: 5px;"><i class="fa fa-minus"></i></button>
                                    </div><!-- /. tools -->

                                    <i class="fa fa-map-marker"></i>
                                    <h3 class="box-title">
                                        World Map
                                    </h3>
                                </div>
                                <div class="box-body">
                                    <div id="world-map" style="position: relative; height: 300px;">
                                        <img src="/school/resources/assect/img/map.jpg">
                                    </div>
                                </div><!-- /.box-body-->
                                
                            </div>
                </section>
                        <!--<section class="col-md-6 connectedSortable" id="graph">
                         <div class="box box-solid bg-teal-gradient">
                                <div class="box-header">
                                    <i class="fa fa-th"></i>
                                    <h3 class="box-title">Sales Graph</h3>
                                    <div class="box-tools pull-right">
                                        <button class="btn bg-teal btn-sm" data-widget="collapse"><i class="fa fa-minus"></i></button>
                                        <button class="btn bg-teal btn-sm" data-widget="remove"><i class="fa fa-times"></i></button>
                                    </div>
                                </div>
                                <div class="box-body border-radius-none">
                                    <div class="chart" id="line-chart" style="height: 250px;"></div>
                                </div> 
                                <div class="box-footer no-border">
                                    <div class="row">
                                        <div class="col-xs-4 text-center" style="border-right: 1px solid #f4f4f4">
                                            <input type="text" class="knob" data-readonly="true" value="20" data-width="60" data-height="60" data-fgColor="#39CCCC"/>
                                            <div class="knob-label">Mail-Orders</div>
                                        </div> 
                                        <div class="col-xs-4 text-center" style="border-right: 1px solid #f4f4f4">
                                            <input type="text" class="knob" data-readonly="true" value="50" data-width="60" data-height="60" data-fgColor="#39CCCC"/>
                                            <div class="knob-label">Online</div>
                                        </div> 
                                        <div class="col-xs-4 text-center">
                                            <input type="text" class="knob" data-readonly="true" value="30" data-width="60" data-height="60" data-fgColor="#39CCCC"/>
                                            <div class="knob-label">In-Store</div>
                                        </div> 
                                    </div> 
                                </div> 
                            </div>   
                        </section>-->
                 </div>
                </section>
                
            </aside>
        
	</div>


<script type="text/javascript">
        
       function addstudentclk(){    	   
    	   
    	   alert('test--1');
    	   
   		$.ajax({
			type : 'GET',
			url : "/school/addstudent",
			data : {

			},
			success : function(result) {
				$("#swap_wrap").html(result);

			}

		});
       }
         
       
       
       
       function applicantlistclk(){    	   
    	   
    	   alert('test--1');
    	   
   		$.ajax({
			type : 'GET',
			url : "/school/applicantlist",
			data : {

			},
			success : function(result) {
				$("#swap_wrap").html(result);

			}

		});
       }
       
       
       
       
       function studentlistclk(){    	   
    	   
    	   alert('test--1');
    	   
   		$.ajax({
			type : 'GET',
			url : "/school/studentlist",
			data : {

			},
			success : function(result) {
				$("#swap_wrap").html(result);

			}

		});
       }
                    
       
       function mngstudctgclk(){    	   
    	   
    	   alert('test--1');
    	   
   		$.ajax({
			type : 'GET',
			url : "/school/studentcategory",
			data : {

			},
			success : function(result) {
				$("#swap_wrap").html(result);

			}

		});
       }
       
function listgurdclk(){    	   
    	   
    	   alert('test--1');
    	   
   		$.ajax({
			type : 'GET',
			url : "/school/listguardians",
			data : {

			},
			success : function(result) {
				$("#swap_wrap").html(result);

			}

		});
       }
       
       
function complaintclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/complaint",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
       
         
        
        </script>
        
      
    </body>
</html>

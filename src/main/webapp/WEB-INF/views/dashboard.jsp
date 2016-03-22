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
           <li><a class="haslink" href="#attendanceregister" onclick=""><i class="fa fa-angle-double-right"></i>Attendance Register</a></li>
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
                <li><a class="haslink" href="#setup" onclick="generalsettingsclk();"><i class="fa fa-angle-double-right"></i> General Settings</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Manage Courses</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#class" onclick="classclk();" ><i class="fa fa-angle-double-right"></i> Class</a></li>
                <li><a class="haslink" href="#subject" onclick="subjectclk();"><i class="fa fa-angle-double-right"></i> Subject</a></li>        
                <li><a class="haslink" href="#gradesection" onclick="gradesectionclk();"><i class="fa fa-angle-double-right"></i> Grade Section</a></li>
            </ul>
        </li>
        
        <li class="treeview"><a href="#">
        
        <span>Manage Batches</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#batches" onclick="batchclk();"><i class="fa fa-angle-double-right"></i> Batches</a></li>
                <li><a class="haslink" href="#batchgroup" onclick="batchgroupclk();"><i class="fa fa-angle-double-right"></i> Batch Group</a></li>          
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
                <li><a class="haslink" href="#batchexam" onclick="batchexamclk();"><i class="fa fa-angle-double-right"></i> Batch Exam</a></li>
                <li><a class="haslink" href="#batchinternalscore" onclick="batchinternalscoreclk();"><i class="fa fa-angle-double-right"></i> Batch Internal Score</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Set Grading Level</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#gradename" onclick="gradenameclk();"><i class="fa fa-angle-double-right" onclick="gradenameclk();"></i> Grade Name</a></li>
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
	<li><a class="haslink" href="#studentattendance" onclick="studentattendanceclk();"><i class="fa fa-angle-double-right"></i> Student Attendance</a></li>
	<li><a class="haslink" href="#attendanceregister" onclick="attendanceregister();" ><i class="fa fa-angle-double-right"></i> Employee Attendance</a></li>
    </ul>
</li>
                        
<!-- Attendance ends -->

<!-- Timetable Starts -->
                        
                        <li class=" treeview">
                            <a href="timetabledashboard.html">
                                <i class="fa fa-calendar" ></i>
                                <span>Timetable</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                 <li class="treeview"><a href="#">
                                
                                <span>View Timetable</span>
                                <i class="fa fa-angle-left pull-right"></i>
                                </a>
                                    <ul class="treeview-menu">
                                        <li><a class="haslink" href="#viewfulltimetable" onclick="viewfulltimetableclk();"><i class="fa fa-angle-double-right"></i> View Full Timetable</a></li>
                                    </ul>
                                </li>
                                <li class="treeview"><a href="#">
                                <span>Manage Timetable</span>
                                <i class="fa fa-angle-left pull-right"></i>
                                </a>
                                    <ul class="treeview-menu">
                                        <li><a class="haslink" href="#setclasstiming" onclick="setclasstimingclk();"><i class="fa fa-angle-double-right"></i> Set Class Timing</a></li>
                                        <li><a class="haslink" href="#settimetable" onclick="settimetableclk();"><i class="fa fa-angle-double-right"></i> Set Timetable</a></li>
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
                <li><a class="haslink" href="#fees" onclick="feesclk();"><i class="fa fa-angle-double-right"></i> Fees</a></li>
                <li><a class="haslink" href="#collectfees" onclick="collectfeesclk();"><i class="fa fa-angle-double-right"></i> Collect Fees</a></li>
                <li><a class="haslink" href="#paid" onclick="paidclk();"><i class="fa fa-angle-double-right"></i> Paid</a></li>
                <li><a class="haslink" href="#unpaid" onclick="unpaidclk();"><i class="fa fa-angle-double-right"></i> Unpaid</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Fee Categories</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li class="treeview"><a href="#"><i class="fa fa-angle-double-right"></i> Transport</a>
                <ul class="treeview-menu">
                    <li><a class="haslink" href="#feesschedule" onclick="feesscheduleclk();"><i class="fa fa-angle-double-right"></i> Fees Schedule</a></li>
                    <li><a class="haslink" href="#feespayment" onclick="feespaymentclk();"><i class="fa fa-angle-double-right"></i> Fees Payment</a></li>
                </ul> </li>   
                <li class="treeview"><a href="#"><i class="fa fa-angle-double-right"></i> Hostel</a>
                <ul class="treeview-menu">
                    <li><a class="haslink" href="#hostelfeesschedule" onclick="hostelfeesscheduleclk();"><i class="fa fa-angle-double-right"></i> Fees Schedule</a></li>
                    <li><a class="haslink" href="#hostelfeespayment" onclick="hostelfeespaymentclk();"><i class="fa fa-angle-double-right"></i> Fees Payment</a></li>
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
                 <li><a class="haslink" href="#applicant_report" onclick="applicant_reportclk();"><i class="fa fa-angle-double-right"></i> Applicant Report</a></li>
                 <li><a class="haslink" href="#student_report" onclick="student_reportclk();"><i class="fa fa-angle-double-right"></i> Student Report</a></li>
             </ul>
         </li>
         <li class="treeview"><a href="#">
         
         <span>Assessment Report</span>
         <i class="fa fa-angle-left pull-right"></i>
         </a>
             <ul class="treeview-menu">
                 <li><a class="haslink" href="#gradesheet" onclick="gradesheetclk();"><i class="fa fa-angle-double-right"></i> Grade Sheet</a></li>
                 <li><a class="haslink" href="#reportcard" onclick="reportcardclk();"><i class="fa fa-angle-double-right"></i> Report Card</a></li>        
                 <li><a class="haslink" href="#semester_report" onclick="semester_reportclk();"><i class="fa fa-angle-double-right"></i> Semester Report</a></li>
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
                <li><a class="haslink" href="#listbook" onclick="listbookclk();"><i class="fa fa-angle-double-right"></i> List Book</a></li>
                <li><a class="haslink" href="#addbook" onclick="addbookclk();"><i class="fa fa-angle-double-right"></i> Add Book </a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Book Lend</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#borrowbook" onclick="borrowbookclk();"><i class="fa fa-angle-double-right"></i> Borrow Book</a></li>
                <li><a class="haslink" href="#returnbook"onclick="returnbookclk();"><i class="fa fa-angle-double-right"></i> Return Book</a></li>        
                <li><a class="haslink" href="#viewbookdetails" onclick="viewbookdetailsclk();"><i class="fa fa-angle-double-right"></i> View Book Details</a></li>
                <li><a class="haslink" href="#duedates" onclick="duedatesclk();"><i class="fa fa-angle-double-right"></i> Due Dates</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Settings</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#addbookcategory" onclick="addbookcategoryclk();"><i class="fa fa-angle-double-right"></i> Add Book Category</a></li>
                <li><a class="haslink" href="#viewstudentdetails" onclick="viewstudentdetailsclk();"><i class="fa fa-angle-double-right"></i> View Student Details</a></li>        
                <li><a class="haslink" href="#viewauthors" onclick="viewauthorsclk();"><i class="fa fa-angle-double-right"></i> View Authors</a></li>
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
                <li><a class="haslink" href="#listallroute" onclick="listallrouteclk();"><i class="fa fa-angle-double-right"></i> List All Route</a></li>
                <li><a class="haslink" href="#assignroute" onclick="assignrouteclk();"><i class="fa fa-angle-double-right"></i> Assign Route </a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Routes</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#allotment" onclick="allotmentclk();"><i class="fa fa-angle-double-right"></i> Allotment</a></li>
            </ul>
        </li>
        <li class="treeview"><a href="#">
        
        <span>Settings</span>
        <i class="fa fa-angle-left pull-right"></i>
        </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#vehicledetails" onclick="vehicledetailsclk();"><i class="fa fa-angle-double-right"></i> Vehicle Details</a></li>
                <li><a class="haslink" href="#routedetails" onclick="routedetailsclk();"><i class="fa fa-angle-double-right"></i>Route Details</a></li>        
                <li><a class="haslink" href="#transportmanage" onclick="transportmanageclk();"><i class="fa fa-angle-double-right"></i>Transport Manage</a></li>
                <li><a class="haslink" href="#buslog" onclick="buslogclk();"><i class="fa fa-angle-double-right"></i> Bus Log</a></li>
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
                <li><a class="haslink" href="#listroomdetails" onclick="listroomdetailsclk();"><i class="fa fa-angle-double-right"></i> List Room Details</a></li>
                <li><a class="haslink" href="#searchroom" onclick="searchroomclk();"><i class="fa fa-angle-double-right"></i> Search Room </a></li>
                <li><a class="haslink" href="#hosteldetails" onclick="hosteldetailsclk();"><i class="fa fa-angle-double-right"></i> Hostel Details </a></li>
                <li><a class="haslink" href="#addroomdetails" onclick="addroomdetailsclk();"><i class="fa fa-angle-double-right"></i>Add Room Details</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Rooms</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#allotrooms" onclick="allotroomsclk();"><i class="fa fa-angle-double-right"></i> Allot Rooms</a></li>
                <li><a class="haslink" href="#vacate" onclick="vacateclk();"><i class="fa fa-angle-double-right"></i> Vacate</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Settings</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#hostelviewstudent" onclick="hostelviewstudentclk();"><i class="fa fa-angle-double-right"></i>  View Student Details</a></li>
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
                <li><a class="haslink" href="#country" onclick="countryclk();"><i class="fa fa-angle-double-right"></i> Country</a></li>
                <li><a class="haslink" href="#region" onclick="regionclk();"><i class="fa fa-angle-double-right"></i> Region</a></li>
                <li><a class="haslink" href="#state" onclick="stateclk();"><i class="fa fa-angle-double-right"></i> State</a></li>
                <li><a class="haslink" href="#city" onclick="cityclk();"><i class="fa fa-angle-double-right"></i> City</a></li>
                <li><a class="haslink" href="#currency" onclick="currencyclk();"><i class="fa fa-angle-double-right"></i> Currency</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="school.html">
                <span>School</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#department" onclick="departmentclk();"><i class="fa fa-angle-double-right"></i> Department</a></li>
                <li><a class="haslink" href="#schoolsetup" onclick="schoolsetupclk();"><i class="fa fa-angle-double-right"></i> School</a></li>
                <li><a class="haslink" href="#orgnews" onclick="orgnewsclk();"><i class="fa fa-angle-double-right"></i> Org.News</a></li>
                <li><a class="haslink" href="#class" onclick="classclk();"><i class="fa fa-angle-double-right"></i> Class</a></li>
                <li><a class="haslink" href="#subject" onclick="subjectclk();"><i class="fa fa-angle-double-right"></i> Subject</a></li>
                <li><a class="haslink" href="#gradesection" onclick="gradesectionclk();"><i class="fa fa-angle-double-right"></i> Grade Section</a></li>
                <li><a class="haslink" href="#gradename" onclick="gradenameclk();"><i class="fa fa-angle-double-right"></i> Grade Name</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>System</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#systemparameter" onclick="systemparameterclk();"><i class="fa fa-angle-double-right"></i> System Parameter</a></li>
                <li><a class="haslink" href="#customfields" onclick="customfieldsclk();"><i class="fa fa-angle-double-right"></i> Custom Fields</a></li>
                <li><a class="haslink" href="#logger" onclick="loggerclk();"><i class="fa fa-angle-double-right"></i> Logger</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Manage Users</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#userslist"  onclick="userslistclk();"><i class="fa fa-angle-double-right"></i> Users List</a></li>
                <li><a class="haslink" href="#managerole" onclick="manageroleclk();"><i class="fa fa-angle-double-right"></i> Manage Role</a></li>   
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Hostel</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink" href="#buildingandrooms" onclick="buildingandroomsclk();"><i class="fa fa-angle-double-right"></i> Building and Rooms</a></li>
            </ul>
        </li>
        <li class="treeview">
            <a href="#">
                <span>Student</span>
                <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
                <li><a class="haslink"  href="#diseases" onclick="diseasesclk();"><i class="fa fa-angle-double-right"></i> Diseases</a></li>
                <li><a class="haslink" href="#studentcategory" onclick="studentcategoryclk();"><i class="fa fa-angle-double-right"></i> Student Category</a></li>
                <li><a class="haslink" href="#batches" onclick="batchesclk();"><i class="fa fa-angle-double-right"></i> Batch</a></li>
                <li><a class="haslink" href="#batchgroup" onclick="batchgroupclk();"><i class="fa fa-angle-double-right"></i> Batch Group</a></li>
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



function generalsettingsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/setup",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
     
function classclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/class",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
      
function subjectclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/subject",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function gradesectionclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/gradesection",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});	
}


function batchclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/batches",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function batchgroupclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/batchgroup",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
      
function batchexamclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/batchexam",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function batchinternalscoreclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/batchinternalscore",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
   
   
function gradenameclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/gradename",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}


function studentattendanceclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/studentattendance",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}


function attendanceregister(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/attendanceregister",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function timetableclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/timetable",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function viewfulltimetableclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/viewfulltimetable",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function setclasstimingclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/setclasstiming",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function settimetableclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/settimetable",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function feesclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/fees",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function collectfeesclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/collectfees",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function paidclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/paid",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function unpaidclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/unpaid",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function feesscheduleclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/feesschedule",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function feespaymentclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/feespayment",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function hostelfeesscheduleclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/hostelfeesschedule",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function hostelfeespaymentclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/hostelfeespayment",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}



function applicant_reportclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/applicant_report",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function student_reportclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/student_report",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function gradesheetclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/gradesheet",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function reportcardclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/reportcard",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function semester_reportclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/semester_report",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function listbookclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/listbook",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function addbookclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/addbook",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function borrowbookclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/borrowbook",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function returnbookclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/returnbook",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function viewbookdetailsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/viewbookdetails",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function duedatesclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/duedates",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function addbookcategoryclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/addbookcategory",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function viewstudentdetailsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/viewstudentdetails",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function viewauthorsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/viewauthors",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function listallrouteclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/listallroute",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function assignrouteclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/assignroute",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function allotmentclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/allotment",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function vehicledetailsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/vehicledetails",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function routedetailsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/routedetails",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function transportmanageclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/transportmanage",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function buslogclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/buslog",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function listroomdetailsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/listroomdetails",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function searchroomclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/searchroom",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function hosteldetailsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/hosteldetails",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function addroomdetailsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/addroomdetails",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function allotroomsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/allotrooms",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}


function vacateclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/vacate",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}


function hostelviewstudentclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/hostelviewstudent",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function countryclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/country",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function regionclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/region",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function stateclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/state",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function cityclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/city",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function currencyclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/currency",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function systemparameterclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/systemparameter",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function customfieldsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/customfields",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}
function loggerclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/logger",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}


function userslistclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/userslist",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function manageroleclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/managerole",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function buildingandroomsclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/buildingandrooms",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function diseasesclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/diseases",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

/* function studentcategoryclk(){    	   
	   
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

function batchesclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/batches",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
}

function batchgroupclk(){    	   
	   
	   alert('test--1');
	   
	$.ajax({
		type : 'GET',
		url : "/school/batchgroup",
		data : {

		},
		success : function(result) {
			$("#swap_wrap").html(result);

		}

	});
} */

      
        </script>
        
      
    </body>
</html>

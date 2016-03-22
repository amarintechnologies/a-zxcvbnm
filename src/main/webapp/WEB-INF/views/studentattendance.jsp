        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
<script>
   	 $(".haslink").click(function(){
	        url=$(this).attr("href").substring(1);
	       //alert(url);
	        load_page(url+".html",swap_wrap);
	       
	        });
</script>

               <section class="content-header">
                    <h1>Student Attendance</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="attendancedashboard.html"><i class="fa"></i> Attendance</a></li>
                        <li><a href=""><i class="fa"></i> Student Attendance</a></li>
                        
                    </ol>
                </section>
               
                <section class="content">
                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                           
                                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                                    <h3 class="box-title"></h3>
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                               
                                        <div class="form-group col-md-4">
                                         <label>Class Name</label>
                                            <select class="form-control input-md chosen-select">
                                                <option value="zero">Select</option>
                                                <option value="one">Class 001</option>
                                                <option value="one">Class 002</option>
                                                <option value="one">Class 003</option>
                                                <option value="one">Class 004</option>
                                                <option value="one">Class 005</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-4">
                                            <label>Batch Name</label>
                                            <select class="form-control input-md chosen-select">
                                                <option value="zero">Select</option>
                                                <option value="one">Batch-2011</option>
                                                <option value="one">Batch-2012</option>
                                                <option value="one">Batch-2013</option>
                                                <option value="one">Batch-2014</option>
                                                <option value="one">Batch-2015</option>
                                            </select>
                                        </div>
                                       <a href="#addstudentattendance" class="haslink btn bg-olive margin pull-right">Add Student Attendance</a>
                                        </form>
                      
                            </div>
                        </div>
                    </div>
                
                            </div>
                             <div class="box one">
                                <div class="box-header">
                                    <h3 class="box-title">Student Attendance</h3>
                                    <!--<a class="btn bg-olive margin" data-toggle="modal" data-target="#attendance" style="float: right"><i class="fa fa-pencil"></i> Student Attendance </a>-->
                                    
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>S.No</th>
                                                <th>Class Name</th>
                                                <th>Batch Name</th>
                                                <th>Student Name</th>
                                                <th>Attendence</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Class 1</td>
                                                <td>Batch-2004</td>
                                                <td>Raja</td>
                                                <td>
                                                    <select class="form-control input-md">
                                                        <option>Absent</option>
                                                        <option>Present</option>
                                                    </select>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Class 2</td>
                                                <td>Batch-2005</td>
                                                <td>Raja ravi</td>
                                                <td>
                                                    <select class="form-control input-md">
                                                        <option>Absent</option>
                                                        <option>Present</option>
                                                    </select>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Class 3</td>
                                                <td>Batch-2004</td>
                                                <td>Ravi</td>
                                                <td>
                                                    <select class="form-control input-md">
                                                        <option>Absent</option>
                                                        <option>Present</option>
                                                    </select>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Class 2</td>
                                                <td>Batch-2004</td>
                                                <td>Kumar</td>
                                                <td>
                                                    <select class="form-control input-md">
                                                        <option>Absent</option>
                                                        <option>Present</option>
                                                    </select>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>Class 5</td>
                                                <td>Batch-2006</td>
                                                <td>Raj kumar</td>
                                                <td>
                                                    <select class="form-control input-md">
                                                        <option>Absent</option>
                                                        <option>Present</option>
                                                    </select>
                                                </td>
                                            </tr>
                                           
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->
                
                
<div class="modal fade" id="attendance" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Add Attendance </h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                        <div class="col-md-12">
                            <div class="form-group ">
                                 <label>Class Name</label>
                                    <select class="form-control input-md">
                                        <option>Select</option>
                                        <option>Class 001</option>
                                        <option>Class 002</option>
                                        <option>Class 003</option>
                                        <option>Class 004</option>
                                        <option>Class 005</option>
                                    </select>
                            </div>
                            <div class="form-group ">
                                <label>Batch Name</label>
                                    <select class="form-control input-md">
                                        <option>Select</option>
                                        <option>Batch-2011</option>
                                        <option>Batch-2012</option>
                                        <option>Batch-2013</option>
                                        <option>Batch-2014</option>
                                        <option>Batch-2015</option>
                                    </select>
                            </div>
                            <div class="bootstrap-timepicker">
                                    <div class="form-group">
                                        <label>Start Time</label>
                                    <div class="input-group">
                                        <input type="text" class="form-control timepicker"/>
                                        <div class="input-group-addon">
                                            <i class="fa fa-clock-o"></i>
                                        </div>
                                    </div><!-- /.input group -->
                                    </div><!-- /.form group -->
                            </div>
                            <div class="form-group">
                                <label>Subject Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>English</option>
                                    <option>Tamil</option>
                                    <option>Arabic</option>
                                    <option>History</option>
                                    <option>German</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Student Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Saravanan</option>
                                    <option>Mohan</option>
                                    <option>Vinoth</option>
                                    <option>Raja</option>
                                    <option>Jai</option>
                                </select>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="checkbox" />
                                                   Is Present?
                                </label>
                            </div>
                        </div>
                        <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger"  data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary"><i class="fa fa-save"></i> Save</button>
                        </div>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


<script src="js/AdminLTE/custom.js" type="text/javascript"></script>
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

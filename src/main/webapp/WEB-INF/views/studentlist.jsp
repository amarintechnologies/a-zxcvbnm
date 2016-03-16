
                <section class="content-header">
                    <h1> Manage Student </h1>
		 <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Student</li>
                        <li><i class="fa"></i> Manage Student</li>
                        <li class="active"> Student List</li>
                    </ol>
                </section>
              
                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <div class="col-md-12 col-xs-12">
                            <div class="box box-primary">
                                
                                <div class="box-header">
                                    <h3 class="box-title"> </h3>
                                      <!--<a class="btn bg-olive margin" data-toggle="modal" data-target="#add-student" style="float: right"><i class="fa fa-pencil"></i> Add Student </a>-->
                                      
                                <a class="add_to_widget" href="#studentlist_widget" ><button class="btn btn-warning btn-sm margin pull-right">Add to Widget</button></a>
                                
				<div class="box-body">
                                <form role="form"  class="col-md-12">
                                        <div class="form-group col-md-3 ">
                                            <label>Class Name :</label>
                                            <select class="form-control input-md chosen-select">
                                                <option>Select</option>
                                                <option>Class 001</option>
                                                <option>Class 002</option>
                                                <option>Class 003</option>
                                                <option>Class 004</option>
                                                <option>Class 005</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-3 ">
                                            <label>Batch Name :</label>
                                            <select class="form-control input-md chosen-select">
                                                <option>Select</option>
                                                <option>Batch-13</option>
                                                <option>Batch-13</option>
                                                <option>Batch-15</option>
                                                <option>Batch-14</option>
                                                <option>Batch-14</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-3 ">
                                            <label>Admission Date :</label>   
                                                <div class="input-group">
                                                    <input type="text" class="form-control input-md" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="" placeholder="dd/mm/yyyy">
                                                    <div class="input-group-addon">
                                                    <i class="fa fa-calendar"></i>
                                                    </div>
                                                </div>
                                        </div>
                                        <div class="form-group col-md-2">
                                            <label>Status</label>
                                            <select class="form-control input-md">
                                                <option>Select</option>
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                    </form>
                                </div>
                                </div><!-- /.box-header -->
                                </div><!-- /.box -->
                        </div>
                    </div><!-- /.row (main row) -->
                
                
                            <div class="box col-md-12 col-xs-12 box-warning">
                                <div class="box-header">
                                    <h3 class="box-title">Student List</h3>
                                   <!-- <a class="haslink" href="#addstudent"><button class="btn bg-olive margin pull-right">Add New Student Details</button></a>-->
                                </div>
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped" >
                                        <thead>
                                            <tr>
                                                <th>Class Name</th>
                                                <th>Batch Name</th>
                                                <th>Admission No</th>
                                                <th>Student NO</th>
                                                <th>Student Name</th>
                                                <th>Edit</th>
                                                <th>Delete</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Class 1</td>
                                                <td>Batch-2004</td>
                                                <td>ADM NO-20</td>
                                                <td>20</td>
                                                <td>Raja</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                              
                                            </tr>
                                           <tr>
                                                <td>Class 2</td>
                                                <td>Batch-2005</td>
                                                <td>ADM NO-22</td>
                                                <td>22</td>
                                                <td>Raja ravi</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                                
                                            </tr>
                                           <tr>
                                                <td>Class 3</td>
                                                <td>Batch-2004</td>
                                                <td>ADM NO-25</td>
                                                <td>25</td>
                                                <td>Ravi</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                                
                                            </tr>
                                           <tr>
                                                <td>Class 2</td>
                                                <td>Batch-2004</td>
                                                <td>ADM NO-32</td>
                                                <td>32</td>
                                                <td>Kumar</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                                
                                            </tr>
                                           <tr>
                                                <td>Class 5</td>
                                                <td>Batch-2006</td>
                                                <td>ADM NO-28</td>
                                                <td>28</td>
                                                <td>Raj kumar</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                               
                                            </tr>
                                           
                                        </tbody>
                                       
                                    </table>
                                </div><!-- /.box-body -->
                            </div>
                 
                </section>

        <!-- add new calendar event modal -->
<div class="modal fade" id="add-student" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Add Student </h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                            <div class="col-md-6">
                            <div class="form-group ">
                                               
                                                <label>Application No:</label>
                                                <input class="form-control input-md" type="text" placeholder="Applicant No">
                                            </div>
                                            <div class="form-group ">
                                                <label>Appl. Date from</label>   
                                                <div class="input-group">
                                                        <input type="text" class="form-control input-md" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                        <div class="input-group-addon">
                                                        <i class="fa fa-calendar"></i>
                                                        </div>
                                                </div>
                                            </div>
                                            <div class="form-group ">
                                               
                                                <label>First Name:</label>
                                                <input class="form-control input-md" type="text" placeholder="First Name">
                                            </div>
                                            <div class="form-group ">
                                               
                                                <label>Middle Name:</label>
                                                <input class="form-control input-md" type="text" placeholder="Middle Name">
                                            </div>
                                            <div class="form-group ">
                                               
                                                <label>Last Name:</label>
                                                <input class="form-control input-md" type="text" placeholder="Last Name">
                                            </div>
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
                                                    <option>Batch 001</option>
                                                    <option>Batch 002</option>
                                                    <option>Batch 003</option>
                                                    <option>Batch 004</option>
                                                    <option>Batch 005</option>
                                                </select>
                                            </div>
                                            <div class="form-group ">
                                                <label>Date of Birth</label>   
                                                <div class="input-group">
                                                        <input type="text" class="form-control input-md" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                        <div class="input-group-addon">
                                                        <i class="fa fa-calendar"></i>
                                                        </div>
                                                </div>
                                            </div>
                            </div>
                            <div class="col-md-6">
                            <div class="form-group" style="padding-bottom: 27px;">
                                            <label>Gender</label> </br> 
                                                <input type="radio" name="r1" class="minimal" checked/>
                                                    Male
                                                <input type="radio" name="r1" class="minimal"/>
                                                    Female
                                         </div>
                                        <div class="form-group ">
                                            <label>Blood Group</label>
                                            
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>O+</option>
                                                    <option>O-</option>
                                                    <option>A+</option>
                                                    <option>A-</option>
                                                    <option>B+</option>
                                                    <option>B-</option>
                                                    <option>AB+</option>
                                                    <option>AB-</option>
                                                </select>
                                            
                                        </div>
                                        <div class="form-group ">
                                            <label>Nationality</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>India</option>
                                                    <option>England</option>
                                                    <option>America</option>
                                                    <option>Japan</option>
                                                    <option>Dubai</option>
                                                    <option>Pakistan</option>
                                                    <option>Bangladesh</option>
                                                </select>
                                        </div>
                                        <div class="form-group ">
                                               
                                                <label>Primary Language:</label>
                                                <input class="form-control input-md" type="text" placeholder="Primary Language">
                                        </div>
                                        <div class="form-group ">
                                            <label>Religion</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>Hindu</option>
                                                    <option>Muslim</option>
                                                    <option>Christian</option>
                                                </select>
                                        </div>
                                        <div class="form-group ">
                                               
                                                <label>Birth place:</label>
                                                <input class="form-control input-md" type="text" placeholder="Birth place">
                                        </div>
                                        <div class="form-group ">
                                               
                                                <label>Address :</label>
                                                <textarea class="form-control input-md" type="text" placeholder="Address" style="height: 133px;"></textarea>
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


                <section class="content-header">
                    <h1> Student Complaint Blog</h1>
		 <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Student</li>
                        <li class="active"> Complaint</li>
                    </ol>
                </section>
                
                <section class="content">

                    <div class="row">
                        <div class="col-md-12 col-xs-12">
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header">
                                    <h3 class="box-title"></h3>
                                </div>
				<!--<a class="add_to_widget" href="#complaint_widget" ><button class="btn btn-warning btn-sm margin pull-right">Add to Widget</button></a>-->
                                <form role="form" class="col-md-12 ">
                               
                                        <div class="col-md-4 ">
                                            <label>Complaint By:</label>
                                            <select class="form-control input-md chosen-select">
                                                <option>Search</option>
                                                <option>student 001</option>
                                                <option>student 002</option>
                                                <option>student 003</option>
                                                <option>student 004</option>
                                                <option>student 005</option>
                                            </select>
                                        </div>
                                        
                                        <div class="form-group col-md-4">
                                            <label>Status</label>
                                            <select class="form-control input-md">
                                                <option>Select</option>
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                       <a class="add_to_widget" href="#complaint_widget" ><button class="btn btn-warning btn-sm margin pull-right">Add to Widget</button></a>
                                        </form>
                            </div>
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header">
                                    <h3 class="box-title">List of Complaints </h3>
                                     <a class="btn bg-olive margin pull-right" data-toggle="modal" data-target="#post-complaint"><i class="fa fa-pencil"></i> Post Complaint </a>
                                </div>
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Class Name</th>
                                                <th>Batch Name</th>
                                                <th>Admission No</th>
                                                <th>Student Name</th>
                                                <th>Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Class 1</td>
                                                <td>Batch-2004</td>
                                                <td>ADM NO-20</td>
                                                <td>Raja</td>
                                                <td>Active</td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Class 2</td>
                                                <td>Batch-2005</td>
                                                <td>ADM NO-22</td>
                                                <td>Raja ravi</td>
                                                <td>Active</td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Class 3</td>
                                                <td>Batch-2004</td>
                                                <td>ADM NO-25</td>
                                                <td>Ravi</td>
                                                <td>Active</td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Class 2</td>
                                                <td>Batch-2004</td>
                                                <td>ADM NO-32</td>
                                                <td>Kumar</td>
                                                <td>Active</td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>Class 5</td>
                                                <td>Batch-2006</td>
                                                <td>ADM NO-28</td>
                                                <td>Raj kumar</td>
                                                <td>Active</td>
                                            </tr>
                                           
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->

<div class="modal fade" id="post-complaint" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Complaints Form </h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                            <div class="col-md-6">
                            <div class="form-group">
                                                <label>Complained By:</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>Abu</option>
                                                    <option>Deepan</option>
                                                    <option>Jai</option>
                                                    <option>Baskar</option>
                                                    <option>Mohan</option>
                                                    <option>Saravanan</option>
                                                    <option>Anand</option>
                                                    <option>Vinoth</option>
                                                </select>
                            </div>
                            <div class="form-group">
                                                <label>Complaint Type:</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>Fighting</option>
                                                    <option>Ragging</option>
                                                </select>
                            </div>
                            <div class="form-group">
                                                <label>Complaint Against:</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>Abu</option>
                                                    <option>Deepan</option>
                                                    <option>Jai</option>
                                                    <option>Baskar</option>
                                                    <option>Mohan</option>
                                                    <option>Saravanan</option>
                                                    <option>Anand</option>
                                                    <option>Vinoth</option>
                                                </select>
                            </div>
                            <div class="form-group ">
                                        <label>Complaint Date:</label>   
                                        <div class="input-group">
                                            <input type="text" class="form-control input-md" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                        </div>
                            </div>
                            <div class="form-group ">
                                    <label>Address :</label>
                                    <textarea class="form-control input-md" type="text" placeholder="Address"  ></textarea>
                            </div>
                            <div class="form-group">
                                                <label>Assigned To:</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>Tutor name 1</option>
                                                    <option>Tutor name 2</option>
                                                    <option>Tutor name 3</option>
                                                    <option>Tutor name 4</option>
                                                    <option>Tutor name 5</option>
                                                </select>
                            </div>
                            </div>
                            <div class="col-md-6">
                            <div class="form-group ">
                                        <label>Trail Date:</label>   
                                        <div class="input-group">
                                            <input type="text" class="form-control input-md" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                        </div>
                            </div>
                            <div class="form-group">
                                                <label>Jury:</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>Tutor name 1</option>
                                                    <option>Tutor name 2</option>
                                                    <option>Tutor name 3</option>
                                                    <option>Tutor name 4</option>
                                                    <option>Tutor name 5</option>
                                                </select>
                            </div>
                            <div class="form-group ">
                                    <label>Title :</label>
                                    <textarea class="form-control input-md" type="text" placeholder="Address"  ></textarea>
                            </div>
                            <div class="form-group ">
                                    <label>Remarks :</label>
                                    <textarea class="form-control input-md" type="text" placeholder="Address"  ></textarea>
                            </div>
                            <div class="form-group">
                                                <label>Status:</label>
                                                <select class="form-control input-md">
                                                    <option>Select</option>
                                                    <option>Active</option>
                                                    <option>Inactive</option>
                                                </select>
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
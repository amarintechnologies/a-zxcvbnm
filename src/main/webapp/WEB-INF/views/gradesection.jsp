        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                 <section class="content-header">
                    <h1> Grade Section </h1>
		   <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Courses</a></li>
                        <li><a href="#"><i class="fa"></i> Manage Courses</a></li>
                        <li class="active"> Grade Section</li>
                    </ol>
                </section>
                <section class="content">

                    <!-- Small boxes (Stat box) -->
                   <!-- /.row -->

                    <!-- Main row -->
                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header">
                                    <h3 class="box-title"> </h3>
                                </div>
                                <form role="form" class=" col-md-12">
                                    <div class="form-group col-md-3">
                                         <label>Grade Section</label>
                                            <select class="form-control input-md chosen-select">
                                                <option>Select</option>
                                                <option>Grade A</option>
                                                <option>Grade B</option>
						<option>Grade C</option>
                                                <option>Grade D</option>
						<option>Grade E</option>
                                                <option>Grade F</option>
                                            </select>
                                    </div>
                                    
                                    <div class="form-group col-md-3">
                                            <label>Status</label>
                                            <select class="form-control input-md">
                                                <option>Select</option>
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                    </div>
                                </form>
                            </div>
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header">
                                    <h3 class="box-title">Grade Section Details</h3>
                                    <a class="btn bg-olive margin" data-toggle="modal" data-target="#grade-section" style="float: right"><i class="fa fa-pencil"></i> Add Grade Section </a>
                                </div>
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Grade Section</th>
                                                <th>Class Name</th>
                                                <th>Status</th>
                                                <th>Edit</th>
                                                <th>Delete</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Grade A</td>
                                                <td>Class 5</td>
                                                <td>Active</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Grade A</td>
                                                <td>Class 2 </td>
                                                <td>Active</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Grade B</td>
                                                <td>Class 6 </td>
                                                <td>Active</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Grade B</td>
                                                <td>Class 8 </td>
                                                <td>Active</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>Grade C</td>
                                                <td>Class 5 </td>
                                                <td>Active</td>
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
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->
        

<div class="modal fade" id="grade-section" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Add New Grade Section</h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                            <div class="form-group ">
                                 <label>Grade Section:</label>
                                 <input class="form-control input-md" type="text" placeholder="Grade Section">
                            </div>
                            <div class="form-group">
                                <label>Class Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Class 1</option>
                                    <option>Class 2</option>
                                    <option>Class 3</option>
                                    <option>Class 4</option>
                                    <option>Class 5</option>
                                    <option>Class 6</option>
                                    <option>Class 7</option>
                                </select>
                            </div>
                            <div class="form-group ">
                                 <label>Number of Seats:</label>
                                 <input class="form-control input-md" type="text" placeholder="Number of Seats">
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
                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary pull-left"><i class="fa fa-save"></i> Save</button>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

       
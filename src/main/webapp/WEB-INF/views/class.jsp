        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                 <section class="content-header">
                    <h1> Class </h1>
		   <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Courses</a></li>
                        <li><a href="#"><i class="fa"></i> Manage Courses</a></li>
                        <li class="active"> Class</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">

                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header">
                                    <h3 class="box-title"> </h3>
                                </div>
                                <form role="form">
                                    <div class="form-group col-md-4">
                                         <label>Class Name</label>
                                            <select class="form-control input-md chosen-select">
                                                <option>Select</option>
                                                <option>Class 1</option>
                                                <option>Class 2</option>
						<option>Class 3</option>
                                                <option>Class 4</option>
						<option>Class 5</option>
                                                <option>Class 6</option>
                                            </select> 
                                    </div>
                                    <div class="form-group col-md-4">
                                         <label>Class Code</label>
                                            <select class="form-control input-md chosen-select">
                                                <option>Select</option>
                                                <option>CLS001</option>
                                                <option>CLS002</option>
						<option>CLS003</option>
                                                <option>CLS004</option>
						<option>CLS005</option>
                                                <option>CLS006</option>
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
                                </form>
                            </div>
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header">
                                    <h4 class="box-title">Class Allocation Details</h4>
                                    <a class="btn bg-olive margin" data-toggle="modal" data-target="#new-class" style="float: right"><i class="fa fa-pencil"></i> Add New Class </a>
                                </div>
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Class Name</th>
                                                <th>Class Code</th>
                                                <th>Status</th>
                                                <th>Edit</th>
                                                <th>Delete</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Class 1</td>
                                                <td>CSCODE/120-65</td>
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
                                                <td>Class 2</td>
                                                <td>CSCODE/120-63</td>
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
                                                <td>Class 3</td>
                                                <td>CSCODE/120-64</td>
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
                                                <td>Class 2</td>
                                                <td>CSCODE/120-62</td>
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
                                                <td>Class 5</td>
                                                <td>CSCODE/120-62</td>
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




        <!-- add new calendar event modal -->
        <div class="modal fade" id="new-class" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Add New Class</h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                            <div class="form-group ">
                                 <label>Class Name:</label>
                                 <input class="form-control input-md" type="text" placeholder="class name">
                            </div>
                            <div class="form-group ">
                                 <label>Section Name:</label>
                                 <input class="form-control input-md" type="text" placeholder="Section Name">
                            </div>
                            <div class="form-group ">
                                 <label>Class Code:</label>
                                 <input class="form-control input-md" type="text" placeholder="class code">
                            </div>
                            <div class="form-group" >
                                            <label>Grading Type</label> </br> 
                                                <input type="radio" name="r1" class="minimal" checked/>
                                                    Grading
                                                <input type="radio" name="r1" class="minimal"/>
                                                    Ranking
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

        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
               <section class="content-header">
                    <h1> Batches </h1>
		   <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Courses</a></li>
                        <li><a href="#"><i class="fa"></i> Manage Batches</a></li>
                        <li class="active"> Batches</li>
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
                                </div><!-- /.box-header -->
                                <form role="form" class=" col-md-12">
                                    <div class="form-group col-md-3">
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
                                    <div class="form-group col-md-3">
                                         <label>Batch</label>
                                         <select class="form-control input-md chosen-select">
                                                <option>Select</option>
                                                <option>Batch 1</option>
                                                <option>Batch 2</option>
						<option>Batch 3</option>
                                                <option>Batch 4</option>
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
                                    <h3 class="box-title">Batches List</h3>
                                    <!--<a class="btn bg-olive margin" data-toggle="modal" data-target="#batches" style="float: right"><i class="fa fa-pencil"></i> Add Batches </a>-->
                                    <a class="haslink" href="#addbatches"><button class="btn bg-olive margin"  style="float: right">Add New Batches</button></a>
                                </div>
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Class Name</th>
                                                <th>Batch</th>
                                                <th>Status</th>
                                                <th>Edit</th>
                                                <th>Delete</th>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Class 1</td>
                                                <td>Batch-2004</td>
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
                                                <td>Batch-2005</td>
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
                                                <td>Batch-2004</td>
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
                                                <td>Batch-2004</td>
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
                                                <td>Batch-2006</td>
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
                <script src="js/AdminLTE/custom.js" type="text/javascript"></script>  
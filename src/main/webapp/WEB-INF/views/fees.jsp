
                 <section class="content-header">
                    <h1> Fees </h1>
		   <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="feedashboard.html"><i class="fa"></i> Fees</a></li>
                        <li><a href="#"><i class="fa"></i> Manage Fees</a></li>
                        <li class="active"> Fees</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">

                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box">
                                
                                <div class="box-header">
                                    <h3 class="box-title">List of Fees Collection</h3>
                                    <a class="btn bg-olive margin pull-right" data-toggle="modal" data-target="#fees"><i class="fa fa-pencil"></i> Create Fees Collection </a>
                                </div><!-- /.box-header -->
                                
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>Start Date</th>
                                                <th>End Date</th>
                                                <th>Due Date</th>
                                                <th>Fee Category</th>
                                                <th>Batch</th>
                                                <th>Edit</th>
                                                <th>Delete</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>01-02-2015</td>
                                                <td>24-02-2015</td>
                                                <td>24-02-2015</td>
                                                <td>Hostel Fees</td>
                                                <td>Batch 002</td>
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#fees" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>10-02-2015</td>
                                                <td>04-03-2015</td>
                                                <td>06-03-2015</td>
                                                <td>Transport Fees</td>
                                                <td>Batch 003</td>
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#fees" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>30-01-2015</td>
                                                <td>20-03-2015</td>
                                                <td>20-03-2015</td>
                                                <td>tuition Fees</td>
                                                <td>Batch</td>
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#fees" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>25-01-2015</td>
                                                <td>10-02-2015</td>
                                                <td>15-02-2015</td>
                                                <td>Hostel Fees</td>
                                                <td>Batch 010</td>
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#fees" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>25-01-2015</td>
                                                <td>20-02-2015</td>
                                                <td>22-02-2015</td>
                                                <td>Exam Fees</td>
                                                <td>Batch</td>
                                                <td>
                                                    <a href="#" data-toggle="modal" data-target="#fees" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
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
        <div class="modal fade" id="fees" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Create Fees Category</h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Fee Category</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>tuition Fees</option>
                                    <option>Exam Fees</option>
                                    <option>Hostel Fees</option>
                                    <option>Transport Fees</option>
                                </select>
                            </div>
                            <div class="form-group ">
                                 <label>Name:</label>
                                 <input class="form-control input-md" type="text" placeholder="Name">
                            </div>
                            <div class="form-group ">
                                 <label>Start Date:</label>
                                 <input class="form-control input-md" type="text" placeholder="DD-MM-YYYY">
                            </div>
                            <div class="form-group ">
                                 <label>End Date:</label>
                                 <input class="form-control input-md" type="text" placeholder="DD-MM-YYYY">
                            </div>
                            <div class="form-group ">
                                 <label>Due Date:</label>
                                 <input class="form-control input-md" type="text" placeholder="DD-MM-YYYY">
                            </div>
                        </div>
                        <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary"><i class="fa fa-save"></i>Save</button>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


        
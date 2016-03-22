        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                <section class="content-header">
                    <h1> Roles </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="setup.html"><i class="fa"></i> Settings</a></li>
                        <li><a href="manageusers.html"><i class="fa"></i> Manage Users</a></li>
                        <li class="active"><i class="fa"></i>Manage Role</li>
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
                                    <h3 class="box-title"></h3>
                                    <label class="pull-right box-tools">Reset <i class="fa fa-retweet"></i></label>
                                    <label class="pull-right box-tools">Search <i class="fa fa-search"></i></label>
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                        <div class="form-group col-md-3">
                                            <label>Role Name</label>
                                             <select class="form-control input-sm chosen-select">
                                                <option>Select</option>
                                                <option>Superuser</option>
                                                <option>Admin</option>
                                            </select>
                                        </div>
                                        
                                        <div class="form-group col-md-3">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                        <a class="btn bg-olive margin" data-toggle="modal" data-target="#role" style="float: right"><i class="fa fa-pencil"></i> Add Role</a>
                                        </form>
                      
                            </div>
                        </div>
                    </div>
                </div>

                    <!-- Small boxes (Stat box) -->
                   <!-- /.row -->

                    <!-- Main row -->
                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Role List</h3>
                                    <button type="submit" class="btn btn-primary pull-right"><i class="fa fa-arrow-down"></i> Download</button>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Role Id</th>
                                                <th>Role</th>
                                                <th>Status</th>
                                                <th>Last Updated Date</th>
                                                <th>Last Updated By</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>3</td>
                                                <td>Admin1</td>
                                                <td>Active</td>
                                                <td>13-Jan-2015 08:50</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Admin2</td>
                                                <td>Inactive</td>
                                                <td>05-Jan-2015 07:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Super User</td>
                                                <td>Active</td>
                                                <td>01-Jan-2015 12:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           
                                           
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->

        <div class="modal fade" id="role" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Roles </h4>
                    </div>
                    <form action="#" method="post">
                        <div class="row">
                                        <div class="form-group col-md-1"></div>
                                        <div class="form-group col-md-5">
                                            <label>Role Name<span style="color:#FF0000">*</span></label>
                                            <input type="text" class="form-control input-sm">
                                        </div>
                                        
                                        <div class="form-group col-md-5">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
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

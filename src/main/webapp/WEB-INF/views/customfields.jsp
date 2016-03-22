        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Custom Fields
                        
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Settings</li>
                        <li><i class="fa"></i> System</li>
                        <li class="active"><i class="fa"></i>Custom Fields</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content col-md-12">
                    <div class="col-md-12">
    
                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                                    <h3 class="box-title"></h3>
                                    
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 col-xs-12">
                                        <div class="form-group col-md-3">
                                            <label>Screen Name</label>
                                            <select class="form-control input-sm chosen-select">
                                                <option></option>
                                                <option>Book</option>
                                                <option>Student</option>
                                                <option>Staff</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-3">
                                            <label>Column Name</label>
                                            <input type="text" class="form-control input-sm">
                                        </div>
                                        
                                        <div class="form-group col-md-3">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                        <a class="btn bg-olive margin" data-toggle="modal" data-target="#custom" style="float: right"><i class="fa fa-pencil"></i> Add Fields</a>
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
                            <div class="box box-warning">
                                <div class="box-header">
                                    <h3 class="box-title">Custom Field List</h3>
                                    <button type="submit" class="btn btn-primary pull-right"><i class="fa fa-arrow-down"></i> Download</button>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref. Id</th>
                                                <th>Screen Name</th>
                                                <th>Column Name</th>
                                                <th>Status</th>
                                                <th>Last Updated Date</th>
                                                <th>Last Updated By</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>3</td>
                                                <td>Book</td>
                                                <td>Book Publisher</td>
                                                <td>Active</td>
                                                <td>13-Jan-2015 08:50</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Student</td>
                                                <td>Student No#</td>
                                                <td>Inactive</td>
                                                <td>05-Jan-2015 07:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Staff</td>
                                                <td>Staff Name</td>
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
  

        <!-- add new calendar event modal -->
        
        <div class="modal fade" id="custom" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Custom Fields </h4>
                    </div>
                    <form action="#" method="post">
                        <div class="row">
                            <div class="col-md-1"></div>
                            <div class="col-md-10">
                                        <div class="form-group col-md-6">
                                            <label>Screen Name<span style="color:#FF0000">*</span></label>
                                            <select class="form-control input-sm">
                                                <option></option>
                                                <option>Book</option>
                                                <option>Student</option>
                                                <option>Staff</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Column Name<span style="color:#FF0000">*</span></label>
                                            <input type="text" class="form-control input-sm">
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Date Type<span style="color:#FF0000">*</span></label>
                                            <select class="form-control input-sm">
                                                <option></option>
                                                <option>Text</option>
                                                <option>Number</option>
                                                <option>Date</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Default Value<span style="color:#FF0000">*</span></label>
                                            <input type="text" class="form-control input-sm">
                                        </div>
                                        
                                        <div class="form-group col-md-6">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
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


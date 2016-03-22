        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                <section class="content-header">
                    <h1> Vehicle </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Transport</a></li>
                        <li><a href="#"><i class="fa"></i> Settings</a></li>
                        <li class="active"><i class="fa"></i>Vehicle Details</li>
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
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                        
                                        <div class="form-group col-md-3">
                                            <label>Route</label>
                                            <select class="form-control input-sm chosen-select">
                                                <option></option>
                                                <option>Route 1</option>
                                                <option>Route 2</option>
                                                <option>Route 3</option>
                                                <option>Route 4</option>
                                            </select>
                                        </div>
                                        
                                        <div class="form-group col-md-3">
                                            <label>Vehicle No</label>
                                             <select class="form-control input-sm chosen-select">
                                                <option></option>
                                                <option>V - 1</option>
                                                <option>V - 2</option>
                                                <option>V - 3</option>
                                                <option>V - 4</option>
                                            </select>
                                        </div>
                                        
                                        <div class="form-group col-md-3">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                        <a class="btn bg-olive margin" data-toggle="modal" data-target="#vehicle" style="float: right"><i class="fa fa-pencil"></i> Add Vehicle</a>
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
                                    <h3 class="box-title">Vehicle List</h3>
                                    <button type="submit" class="btn btn-primary pull-right"><i class="fa fa-arrow-down"></i> Download</button>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref Id</th>
                                                <th>Route</th>
                                                <th>Vehicle No</th>
                                                <th>Status</th>
                                                <th>Last Updated Date</th>
                                                <th>Last Updated By</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>21</td>
                                                <td>Route 1</td>
                                                <td>V-1</td>
                                                <td>Active</td>
                                                <td>13-Jan-2015 08:50</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>11</td>
                                                <td>Route 2</td>
                                                <td>V-3</td>
                                                <td>Inactive</td>
                                                <td>05-Feb-2015 07:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>13</td>
                                                <td>Route 3</td>
                                                <td>V-2</td>
                                                <td>Active</td>
                                                <td>01-Jan-2015 12:10</td>
                                                <td>superuser</td>
                                            </tr>
                                           
                                           
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->
        
        <div class="modal fade" id="vehicle" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Routes </h4>
                    </div>
                    <form action="#" method="post">
                         <div class="row">
                            <div class="col-md-2"></div>
                                        <div class="col-md-8">
                                        <div class="form-group col-md-12">
                                            <label>Route<span style="color:#FF0000">*</span></label>
                                            <select class="form-control input-sm">
                                                <option></option>
                                                <option>Route 1</option>
                                                <option>Route 2</option>
                                                <option>Route 3</option>
                                                <option>Route 4</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-12">
                                            <label>Vehicle No<span style="color:#FF0000">*</span></label>
                                            <input type="text" class="form-control input-sm">
                                        </div>
                                        
                                        <div class="form-group col-md-12">
                                            <label>No of Seats<span style="color:#FF0000">*</span></label>
                                            <input type="text" class="form-control input-sm">
                                        </div>
                                        <div class="form-group col-md-12">
                                            <label>Available Seats</label>
                                            <input type="text" class="form-control input-sm" disabled>
                                        </div>
                                         
                                        
                                        <div class="form-group col-md-12">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                        </div>
                         </div>
                        <div class="row">
                            <div class="col-md-2"></div>
                                        <div class="col-md-8">
                                        
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

        
        
        
        



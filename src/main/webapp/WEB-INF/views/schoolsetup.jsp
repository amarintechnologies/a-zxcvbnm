        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                <section class="content-header">
                    <h1>
                        School
                        
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Settings</li>
                        <li><i class="fa"></i> System</li>
                        <li class="active"><i class="fa"></i>School</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">

                    <!-- Small boxes (Stat box) -->
                   
                    <!-- Main row -->
                    <div class="row">
                        <!-- Left col -->
                        <div class="col-md-12 col-xs-12">
                            <div class="box box-primary">
                                    <div class="box-body">
                                            
                                        <div class="row">
                                            <div class="col-xs-5">
                                                <label for="srch_department_name">School Name:</label>
                                                <select class="form-control input-sm chosen-select">
                                                    <option>Search</option>
                                                    <option>School-1</option>
                                                    <option>School-2</option>
                                                    <option>School-3</option>
                                                    <option>School-4</option>
                                                </select>
                                            </div>
                                            
                                            <div class="col-xs-3">
                                                <label for="srch_country_status">Status:</label>
                                                <select id="srch_country_status" name="srch_country_status"  class="form-control">
                                                    <option value="Active">
                                                        Active
                                                    </option>
                                                    <option value="Inactive">
                                                        Inactive
                                                    </option>
                                                </select>
                                               
                                            </div>
                                            <button class="btn bg-olive margin button_align" data-toggle="modal" data-target="#add_department"><i class="fa fa-plus"></i> Add </button>
                                        </div>
                                    </div><!-- /.box-body -->
                             </div>
                        </div>
                        <div class="col-md-12 col-xs-12">
                            <div class="box box-warning">
                                <div class="box-header">
                                    <h3 class="box-title"> </h3>
                                    <button class="btn bg-primary margin pull-right" ><i class="fa fa-download"></i> Download </button>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>School Name</th>
                                                <th>Code</th>
                                                <th>Address</th>
                                                <th>City</th>
                                                <th>State</th>
                                                <th>Country</th>
                                                <th>Phone</th>
                                                
                                             </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>School</td>
                                                <td>Scl</td>
                                                <td>CBE</td>
                                                <td>Coimbatore</td>
                                                <td>Tamil Nadu</td>
                                                <td>India</td>
                                                <td>9947334455</td>
                                                
                                             </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>School</td>
                                                <td>Scl</td>
                                                <td>ERD</td>
                                                <td>Erode</td>
                                                <td>Tamil Nadu</td>
                                                <td>India</td>
                                                <td>9866811460</td>
                                               
                                            </tr>
                                           

                                        </tbody>
                                       
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->


<div class="modal fade" id="add_department" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Add School</h4>
                    </div>
                    <form action="#" method="post">
                       
                                        <div class="form-group col-md-12">
                                         <label> School Name</label>   
                                        <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                </div>
                                        </div>
                                            <label> Status </label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                    </div>
                        
                        <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary pull-left"><i class="fa fa-save"></i> Save</button>
                        </div>
                        
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

        
        
        
        


       

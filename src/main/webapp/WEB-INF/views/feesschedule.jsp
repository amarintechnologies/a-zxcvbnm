
                <section class="content-header">
                    <h1> Fees Schedule </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="feedashboard.html"><i class="fa"></i> Fees</a></li>
                        <li><i class="fa"></i> Fees Category </li>
                        <li><i class="fa"></i> Transport  </li>
                        <li class="active"> Fees Schedule</li>
                    </ol>
                </section>
                

                <!-- Main content -->
                <section class="content col-md-12">
                    <div class="col-md-12">
    
                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                                    <h3 class="box-title">Schedule Fee Date</h3>
                                    <label class="pull-right box-tools">Reset <i class="fa fa-retweet"></i></label>
                                    <label class="pull-right box-tools">Search <i class="fa fa-search"></i></label>
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 col-xs-12 ">
                               
                                        <div class="form-group col-md-3">
                                         <label>Start Date </label>   
                                        <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                                </div>
                                        </div>
                                        </div>
                                        <div class="form-group col-md-3">
                                            <label>End Date </label>
                                            <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            </div>
                                        </div>
                                        <div class="form-group col-md-3">
                                            <label>Due Date </label>
                                            <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            </div>
                                        </div>
                                        <div class="form-group col-md-3">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
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
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header">
                                    <h3 class="box-title">Fees Schedule List</h3>
                                    <a class="btn bg-olive margin" data-toggle="modal" data-target="#fee_schedule" style="float: right"><i class="fa fa-pencil"></i> Add Schedule</a>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Start Date</th>
                                                <th>End Date</th>
                                                <th>Due Date</th>
                                                <th>Status</th>
                                                <th>Last Updated By</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>13-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                                <td>23-Jan-2015</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>23-Jan-2015</td>
                                                <td>27-Jan-2015</td>
                                                <td>30-Jan-2015</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>13-Feb-2015</td>
                                                <td>17-Feb-2015</td>
                                                <td>23-Feb-2015</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>15-Jan-2015</td>
                                                <td>20-Jan-2015</td>
                                                <td>23-Jan-2015</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>13-Mar-2015</td>
                                                <td>17-Mar-2015</td>
                                                <td>23-Mar-2015</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->




        <div class="modal fade" id="fee_schedule" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Schedule Fee Date</h4>
                    </div>
                    <form action="#" method="post">
                       
                                        <div class="form-group col-md-6">
                                         <label>Start Date </label>   
                                        <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                                </div>
                                        </div>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>End Date </label>
                                            <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            </div>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Due Date </label>
                                            <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            </div>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label class="">
                                                <div class="icheckbox_minimal" aria-checked="false" aria-disabled="false" style="position: relative;">
                                                    <input type="checkbox" style="position: absolute; opacity: 0;">
                                                        <ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);"></ins>
                                                </div> Include Staff(?)
                                            </label>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Remarks</label>
                                            <textarea class="form-control input-sm" rows="2"></textarea>
                                            
                                        </div>
                                        <div class="form-group col-md-6">
                                           
                                            <label>Course</label>
                                            <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>class 1</option>
                                                <option>class 2</option>
                                                <option>class 3</option>
                                                <option>class 4</option>
                                                <option>class 5</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Batch Name</label>
                                            <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>Batch 001</option>
                                                <option>Batch 002</option>
                                                <option>Batch 003</option>
                                                <option>Batch 004</option>
                                                <option>Batch 005</option>
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

        
        
        
        



        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
            

                <section class="content-header">
                    <h1> Timetable</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Timetable</a></li>
                        <li><i class="fa"></i> Manage Timetable </li>
                        <li class="active"> Set Timetable</li>
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
                                    <h3 class="box-title">Timetable</h3>
                                 
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                    
                                        <div class="form-group col-md-3">
                                                <label>Class Name</label>
                                                <select class="form-control input-sm chosen-select">
                                                    <option>Select</option>
                                                    <option>class 1</option>
                                                    <option>class 2</option>
                                                    <option>class 3</option>
                                                    <option>class 4</option>
                                                    <option>class 5</option>
                                                </select>
                                        </div>
                                        <div class="form-group col-md-3">
                                                <label>Batch Name</label>
                                                <select class="form-control input-sm chosen-select">
                                                    <option>Select</option>
                                                    <option>Batch 001</option>
                                                    <option>Batch 002</option>
                                                    <option>Batch 003</option>
                                                    <option>Batch 004</option>
                                                    <option>Batch 005</option>
                                                </select>
                                        </div>
                                    
                                        <div class="form-group col-md-3">
                                         <label>Class Time Name</label> 
                                            <select class="form-control input-sm chosen-select">
                                                    <option>Select</option>
                                                    <option>Regular Time</option>
                                                    <option>Evening Time</option>
                                                    <option>Special Time</option>
                                                </select>
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
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Timetable List</h3>
                                    <a class="btn bg-olive margin" data-toggle="modal" data-target="#set_timetable" style="float: right"><i class="fa fa-pencil"></i> Add Timetable</a>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Class Name</th>
                                                <th>Batch Name</th>
                                                <th>Class Timing Name</th>
                                                <th>Status</th>
                                                <th>Last Updated Date</th>
                                                <th>Last Updated By</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Class 1</td>
                                                <td>Batch-003</td>
                                                <td>Regular Time</td>
                                                <td>Active</td>
                                                <td>13-Jan-2015 12:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Class 3</td>
                                                <td>Batch-003</td>
                                                <td>Evening Time</td>
                                                <td>Active</td>
                                                <td>23-Jan-2015 05:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Class 5</td>
                                                <td>Batch-003</td>
                                                <td>Regular Time</td>
                                                <td>Active</td>
                                                <td>13-Feb-2015 07:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Class 1</td>
                                                <td>Batch-003</td>
                                                <td>General Time</td>
                                                <td>Active</td>
                                                <td>15-Jan-2015 10:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>Class 4</td>
                                                <td>Batch-003</td>
                                                <td>Regular Time</td>
                                                <td>Active</td>
                                                <td>13-Mar-2015 01:22</td>
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
        
        
        <div class="modal fade" id="set_timetable" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Timetable </h4>
                    </div>
                    <form action="#" method="post">
                            <div class="col-md-12">
                                        <div class="col-md-6">
                                        <div class="form-group">
                                            <label>Class Name<span style="color:#FF0000">*</span></label>
                                            <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>class 1</option>
                                                <option>class 2</option>
                                                <option>class 3</option>
                                                <option>class 4</option>
                                                <option>class 5</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>Batch Name<span style="color:#FF0000">*</span></label>
                                            <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>Batch 001</option>
                                                <option>Batch 002</option>
                                                <option>Batch 003</option>
                                                <option>Batch 004</option>
                                                <option>Batch 005</option>
                                            </select>
                                        </div>
                                        
                                        
                                        
                                        <div class="form-group col">
                                         <label>Class Time Name<span style="color:#FF0000">*</span></label>   
                                         <input type="text" class="form-control input-sm">
                                        </div>
                                        </div>
                                        
                                        <div class="col-md-6">
                                            
                                        <div class="form-group">
                                         <label>Start Date </label>   
                                        <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                                </div>
                                        </div>
                                        </div>
                                        <div class="form-group">
                                            <label>End Date </label>
                                            <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            </div>
                                        </div>    
                                        
                                        <div class="form-group">
                                            <label>Remarks</label>
                                            <textarea class="form-control input-sm" rows="2"></textarea>
                                            
                                        </div>
                                        
                                        
                                        </div>
                            </div>
                            
                            <div class="col-md-12">
                                        <div class="col-md-6">
                                        <div class="form-group">
                                            <label>Subject Name</label>
                                            <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>Computer</option>
                                                <option>English</option>
                                                <option>Arabic</option>
                                                <option>Maths</option>
                                                <option>Geography</option>
                                                <option>History</option>
                                                <option>French</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>Staff Name</label>
                                            <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>Moideen</option>
                                                <option>Akbar</option>
                                                <option>Arun</option>
                                                <option>Lal</option>
                                                <option>Saravanan</option>
                                            </select>
                                        </div>
                                        </div>
                                        
                                    
                                        
                                        <div class="col-md-6">
                                        
                                        <div class="form-group">
                                            <label>Room Name</label>
                                            <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>R1</option>
                                                <option>R2</option>
                                                <option>R3</option>
                                                <option>R4</option>
                                                <option>R5</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label> </label>
                                        <label class="">
                                                
                                                    <input type="checkbox" style="position: absolute; opacity: 0;">
                                                 Holiday
                                            </label>
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

        
        
        
        



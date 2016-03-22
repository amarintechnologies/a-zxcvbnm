        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
        <script>
		   	 $(".haslink").click(function(){
					url=$(this).attr("href").substring(1);
				   //alert(url);
					load_page(url+".html",swap_wrap);
				   
					});
		</script>       
                <section class="content-header">
                    <h1>View Student Details</h1>
                    <ol class="breadcrumb">
                        <li><i class="fa fa-dashboard"></i> Home</li>
                        <li><i class="fa"></i> Hostel</li>
                        <li><i class="fa"></i> Manage Rooms</li>
                        <li class="active">View Student Details</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box">
                                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                                    <h3 class="box-title"></h3>
                                   
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                <div class="form-group col-md-3">
                                    <label>Student ID</label>
                                    <select class="form-control input-md chosen-select">
                                        <option>Select</option>
                                        <option> 1001</option>
                                        <option> 1002</option>
                                        <option> 1003</option>
                                        <option> 1004</option>
                                        <option> 1005</option>
                                    </select>
                                </div>
                                <div class="form-group col-md-3">
                                    <label>Batch Name</label>
                                    <select class="form-control input-md chosen-select">
                                        <option>Select</option>
                                        <option>Batch 001</option>
                                        <option>Batch 002</option>
                                        <option>Batch 003</option>
                                        <option>Batch 004</option>
                                        <option>Batch 005</option>
                                    </select>
                                </div>
                            </form>
                      
                            </div>
                        </div>
                    </div>
                </div>
                            </div>
                            <div class="box col-md-12 col-xs-12">
                                <div class="col-md-12">
                                    <a class="haslink" href="#allotrooms"><button class="btn bg-olive margin pull-right">Allot Room - Student</button></a>
                                </div>
                                
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Hostel Name</th>
                                                <th>Room Number</th>
                                                <th>Batch Name</th>
                                                <th>Student Name</th>
                                                <th>Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <tr>
                                                <td>5</td>
                                                <td>PG Hostel</td>
                                                <td>502</td>
                                                <td>Batch 005</td>
                                                <td>Saravanan</td>
                                                <td>Active</td>
                                           </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>PG Hostel</td>
                                                <td>608</td>
                                                <td>Batch 004</td>
                                                <td>Mohan</td>
                                                <td>Active</td>
                                           </tr>

                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->



    <div class="modal fade" id="roomlist" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content ">
                <div class="modal-header">
                    <h4 class="modal-title"> Add/Modify Room Details</h4>
                </div>
                <form action="#" method="post">
                        <div class="col-md-12">    
                            <div class="form-group col-md-6">
                                <label>Hostel Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>PG Hostel</option>
                                    <option>CS Hostel</option>
                                    <option>IT Hostel</option>
                                    <option>ECE Hostel</option>
                                </select>
                            </div>
                            <div class="form-group col-md-6">
                                <label>Room Number</label>
                                <input class="form-control input-md" type="text" placeholder="Room No">
                            </div>
                            <div class="form-group col-md-6">
                                <label>Batch Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Batch 001</option>
                                    <option>Batch 002</option>
                                    <option>Batch 003</option>
                                    <option>Batch 004</option>
                                    <option>Batch 005</option>
                                </select>
                            </div>
                            <div class="form-group col-md-6">
                                <label>Student Number</label>
                                <input class="form-control input-md" type="text" placeholder="Student Name">
                            </div>
                            <div class="form-group col-md-6">
                                <label>Free Beds</label>
                                <input class="form-control input-md" type="text" placeholder="Free Beds">
                            </div>
                            <div class="form-group col-md-6">
                                <!--<div>
                                <label>Date range:</label>
                                <div class="form-group input-group">
                                    <div class=" input-group-addon">
                                    <i class="form-group fa fa-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" id="reservation"/>
                                </div>
                                </div>-->
                                <label>Start Date</label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                    <i class="fa fa-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" placeholder="DD-MM-YYYY"/>
                                </div>
                            </div>
                            <div class="form-group col-md-6">
                                <label>End Date</label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                    <i class="fa fa-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" placeholder="DD-MM-YYYY"/>
                                </div>
                            </div>
                            <div class="form-group col-md-6">
                                <label>Status</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Active</option>
                                    <option>Inactive</option>
                                </select>
                            </div>
                            <div class="form-group col-md-6">
                                <label>Remarks</label>
                                <textarea class="form-control input-md" type="text" ></textarea>
                            </div>
                        </div>
                        <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary pull-left"><i class="fa fa-save"></i> Save</button>
                        </div>
                </form>
            
            </div>
        </div>
    </div>

<script src="js/AdminLTE/custom.js" type="text/javascript"></script>

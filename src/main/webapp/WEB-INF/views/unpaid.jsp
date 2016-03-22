        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                 <section class="content-header">
                    <h1> Unpaid Details </h1>
		   <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="feedashboard.html"><i class="fa"></i> Fees</a></li>
                        <li><a href="#"><i class="fa"></i> Manage Fees</a></li>
                        <li class="active"> Unpaid</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">

                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box col-md-12 col-xs-12">
                                
                                <div class="box-header">
                                    <h3 class="box-title">Fees Unpaid List </h3>
                                    
                                </div><!-- /.box-header -->
                                <form role="form" class="col-md-12 ">
                                    <div class="col-md-3 ">
                                        <label>Class</label>
                                        <select class="form-control input-md chosen-select">
                                            <option>Search</option>
                                            <option>Class 001</option>
                                            <option>Class 002</option>
                                            <option>Class 003</option>
                                            <option>Class 004</option>
                                            <option>Class 005</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-2">
                                        <label>Collection </label>
                                        <select class="form-control input-md chosen-select">
                                            <!--<option>Select</option>-->
                                            <option>Tuition Fees</option>
                                            <option>Exam Fees</option>
                                            <option>Hostel Fees</option>
                                            <option>Transport Fees</option>
                                        </select>
                                    </div>
                                </form>
                                
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->

        <!-- add new calendar event modal -->
        <div class="modal fade" id="fee" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Create Fees Category</h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                            <div class="form-group col-md-6">
                                 <label>Name:</label>
                                 <input class="form-control input-md" type="text" placeholder="Name">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Admission No:</label>
                                 <input class="form-control input-md" type="text" placeholder="Admission No">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Fees:</label>
                                 <input class="form-control input-md" type="text" placeholder="Fees">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Fees Paid:</label>
                                 <input class="form-control input-md" type="text" placeholder="Fees Paid">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Balance To Pay:</label>
                                 <input class="form-control input-md" type="text" placeholder="">
                            </div>
                            <div class="form-group col-md-6">
                            <label>Amount Paid:</label>
                            <input class="form-control input-md" type="text" placeholder="">
                        </div>
                        </div>
                       
                        <div class="modal-footer clearfix">
                            <button type="submit" class="btn btn-primary"><i class="fa fa-money"></i>Pay</button>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        <div class="modal fade" id="fees" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Create Fees Category</h4>
                    </div>
                    <form action="#" method="post">
                        <div class="modal-body">
                            <div class="form-group col-md-6">
                                 <label>Name:</label>
                                 <input class="form-control input-md" type="text" placeholder="Name">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Admission No:</label>
                                 <input class="form-control input-md" type="text" placeholder="Admission No">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Fees:</label>
                                 <input class="form-control input-md" type="text" placeholder="Fees">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Fees Paid:</label>
                                 <input class="form-control input-md" type="text" placeholder="Fees Paid">
                            </div>
                            <div class="form-group col-md-6">
                                 <label>Balance To Pay:</label>
                                 <input class="form-control input-md" type="text" placeholder="">
                            </div>
                            <div class="form-group col-md-6">
                            <label>Amount Paid:</label>
                            <input class="form-control input-md" type="text" placeholder="">
                        </div>
                        </div>
                       
                        <div class="modal-footer clearfix">
                            <button type="submit" class="btn btn-primary"><i class="fa fa-money"></i>Pay</button>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                <section class="content-header">
                    <h1> Hostel Fee Payment </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="feedashboard.html"><i class="fa"></i> Fees</a></li>
                        <li><i class="fa"></i> Fees Category </li>
                        <li><i class="fa"></i> Hostel  </li>
                        <li class="active"> Fees Payment</li>
                    </ol>
                </section>
                
                <section class="content">
                    <div class="box box-primary">
                        <div class="box-header">
                            <div class="box-header">
                                        <h3 class="box-title">Schedule Fee Date</h3>
                                        <label class="pull-right box-tools">Reset <i class="fa fa-retweet"></i></label>
                                        <label class="pull-right box-tools">Search <i class="fa fa-search"></i></label>
                                        <br>
                                        
                                <div class="box-body">
                                      
                                <form role="form" class="col-md-12 col-xs-12">
                                    <div class="col-md-4">
                                        <div class="form-group">
                                                <label>Student Name</label>
                                                <select class="form-control input-sm chosen-select">
                                                    <option></option>
                                                    <option>Abu</option>
                                                    <option>Abdul</option>
                                                    <option>Basheer</option>
                                                    <option>Gnts</option>
                                                    <option>Ischool</option>                              
                                                </select>
                                        </div>
                                        <div class="form-group">
                                                <label>Payment Amount</label>
                                                <input class="form-control input-sm" type="text" disabled>
                                        </div>
                                        <div class="form-group">
                                                <label>Due Date</label>
                                                <input class="form-control input-sm" type="text" disabled>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                                <label>Paid Date</label>
                                                <div class="input-group">
                                                    <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" value="29-Jan-2015" data-mask="">
                                                    <div class="input-group-addon">
                                                    <i class="fa fa-calendar"></i>
                                                    </div>
                                                </div>                            
                                        </div>
                                        <div class="form-group">
                                                <label>Paid Amount <span style="color:#FF0000">*</span></label>
                                                <input class="form-control input-sm" type="text">
                                        </div>
                                        <div class="form-group">
                                                <label>Payment Type</label>
                                                <select class="form-control input-sm">
                                                <option>Select</option>
                                                <option>CHEQUE</option>
                                                <option>DD</option>
                                                <option>CASH</option>
                                                </select>
                                        </div> 
                                        
                                    </div>
                                    
                                    <div class="col-md-4">
                                        <div class="form-group">
                                                <label>Remarks</label>
                                                <textarea class="form-control input-sm" rows="2"></textarea>
                                        </div>
                                        
                                        <div class="form-group">
                                                <label>Payment Remarks</label>
                                                <textarea class="form-control input-sm" rows="2"></textarea>
                                        </div>                     
                                    </div>
                                    <div class="col-md-12">
                                    <div class="form-group">
                                        <button type="reset" class="btn btn-danger pull-right"><i class="fa fa-times"></i> Cancel</button>
                                        <button type="submit" class="btn btn-primary pull-left"><i class="fa fa-save"></i> Save</button>
                                    </div>
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
                                    <h3 class="box-title">Fees Payment List</h3>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Student Name</th>
                                                <th>Paid Amount</th>
                                                <th>Payment Type</th>
                                                <th>Remarks</th>
                                                <th>Status</th>
                                                <th>Last Updated By</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>112</td>
                                                <td>Abu</td>
                                                <td>15000</td>
                                                <td>DD</td>
                                                <td>Extra 1000rs</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>113</td>
                                                <td>Bhasheer</td>
                                                <td>5000</td>
                                                <td>CASH</td>
                                                <td>Discount 1000rs</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>114</td>
                                                <td>Gnts</td>
                                                <td>18000</td>
                                                <td>CHEQUE</td>
                                                <td>Extra 500rs</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>115</td>
                                                <td>iSchool</td>
                                                <td>15000</td>
                                                <td>DD</td>
                                                <td> By DD</td>
                                                <td>Active</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>116</td>
                                                <td>John</td>
                                                <td>11000</td>
                                                <td>CHEQUE</td>
                                                <td>Extra 5000rs</td>
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

        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                <section class="content-header">
                    <h1>
                        Logger
                        
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Settings</li>
                        <li><i class="fa"></i> System</li>
                        <li class="active"><i class="fa"></i>Logger</li>
                        
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
                                        <div class="box-header">    
                                        </div>
                                    <div class="box-body">
                                        <div class="row">
                                        <form action="#" method="post">
                                            <div class="col-md-6 col-xs-6">
                                                <label for="srch_org_name">Log Ref.</label>
                                                <select class="form-control input-sm chosen-select">
                                                <option></option>
                                                <option>Log-ref1</option>
                                                <option>Log-ref2</option>
                                                <option>Log-ref3</option>
                                            </select>
                                            </div>
                                            <div class="col-md-6 col-xs-6">
                                                 <label for="srch_branch">Log Type</label>
                                                    <select class="form-control input-sm chosen-select">
                                                <option></option>
                                                <option>Log-type1</option>
                                                <option>Log-type2</option>
                                                <option>Log-type3</option>
                                            </select>
                                            </div>
                                            
                                            <div class="col-md-6 col-xs-6">
                                                <label for="srch_country_name">Error Code</label>
                                                <select class="form-control input-sm chosen-select">
                                                <option></option>
                                                <option>Err_code1</option>
                                                <option>Err_code2</option>
                                                <option>Err_code3</option>
                                            </select>
                                            </div>
                                            
                                                                                        
                                            <div class="col-md-6 col-xs-6">
                                                <label for="srch_country_name">Client Id</label>
                                                <select class="form-control input-sm chosen-select">
                                                <option></option>
                                                <option>Client_id1</option>
                                                <option>Client_id2</option>
                                                <option>Client_id3</option>
                                            </select>
                                            </div>
                                            
                                          
                                        <div class="col-md-12 col-xs-12">
                                            <div class='box-header'>
                                                <label for="srch_org_status"> News Description</label>
                                                <!-- tools box -->
                                            </div><!-- /.box-header -->
                                            <div class='box-body pad'>
                                                <form>
                                                    <textarea id="editor1" name="editor1" rows="10" cols="80">
                                                        
                                                    </textarea>
                                                </form>
                                            </div>
                                            
                                            <button class="btn btn-danger pull-right button_org_align"><i class="fa fa-close "></i> Close </button>
                                            <button class="btn bg-olive  pull-right button_org_align"><i class="fa fa-plus"></i> Add </button>
                                        </div>
                                           
                                            
                                        </form>
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
                                                <th>Ref.ID</th>
                                                <th>Log Ref.</th>
                                                <th>Type</th>
                                                <th>Description</th>
                                                <th>Client IP</th>
                                                <th>Error Code</th>
                                               
                                             </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>fn_get_user_time</td>
                                                <td>warning</td>
                                                <td>ORA-01403: no data found</td>
                                                <td>192.168.1.7</td>
                                                <td>500</td>
                                              
                                             </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>service timeout</td>
                                                <td>Error</td>
                                                <td>no response</td>
                                                <td>192.168.1.32</td>
                                                <td>400</td>
                                               
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>file not found</td>
                                                <td>Error</td>
                                                <td>404</td>
                                                <td>192.168.1.7</td>
                                                <td>404</td>
                                           
                                            </tr>
                                        
                                           

                                        </tbody>
                                       
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    
                         </div><!-- /.row (main row) -->

                </section><!-- /.content -->

        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                 <section class="content-header">
                    <h1>
                        Grade Sheet
                        <small></small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="reportdashboard.html"><i class="fa"></i> Report</a></li>
                        <li class="active"> Grade Sheet</li>
                    </ol>
                </section>
            <section class="content">
        
        <div class="col-md-12">
    
         <div class="box box-warning">
                                <div class="box-header">
                                    <h3 class="box-title"></h3>
                                    <label class="pull-right box-tools">Reset <i class="fa fa-retweet"></i></label>
                                    <label class="pull-right box-tools">Search <i class="fa fa-search"></i></label>
                                    <br>
                               <!-- /.box-header -->
                                <div class="box-body">
                                    
                                    <form role="form" class="col-md-12">
                                        <!-- select -->
                                        <div class=" col-md-4">
                                        <div class="form-group ">
                                           
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
                                        <div class="form-group ">
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
                                    </div>
                                        <!-- Select multiple-->
                                    <div class=" col-md-4">  
                                        <div class="form-group ">
                                         <label>Exam</label>   
                                        <select class="form-control input-sm chosen-select">
                                                <option>Select</option>
                                                <option>Internal</option>
                                                <option>Unit</option>
                                                <option>Quarterly</option>
                                                <option>Half-yearly</option>
                                                <option>Annual</option>
                                         </select>
                                    </div>
                                        
                                        <div class="form-group ">
                                            <label>Subject</label>
                                            <select class="form-control input-sm chosen-select">
                                                <option>Select</option>
                                                <option>Maths</option>
                                                <option>English</option>
                                                <option>Science</option>
                                                <option>Social</option>
                                            </select>
                                        </div>
                                    </div>
                                         
                                    <div class="col-md-4">
                                        <div class="form-group  ">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Draft</option>
                                                <option>Publish</option>                                                
                                                <option>Completed</option>
                                                <option>Result Announced</option>
                                            </select>
                                        </div>
                                        
                                         <div class="form-group">
                                            <button class="btn btn-info margin_top_7_per">PRINT</button>
                                        </div>
                                         
                                         </div>
                                       
                                        
                                    </form>
                                    </div>
                                </div><!-- /.box-body -->
                          
         </div>
        </div>
          <div class="row">
            <div class="col-md-12">
                         <div class="box box-primary">
                                  <div id="example2_wrapper" class="dataTables_wrapper form-inline" role="grid">
                                    
                                    <table id="example2" class="table table-bordered table-hover dataTable" aria-describedby="example2_info">
                                        <thead>
                                            <tr role="row">
                                                <th class="sorting_asc" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">Ref.Id</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">Batch Name</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">Exam Name</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">Start Date</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">End Date</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Status</th>
                                                
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Last Updated By</th>
                                            
                                            </tr>
                                        </thead>
                                        
                                        
                                    <tbody role="alert" aria-live="polite" aria-relevant="all"><tr class="odd">
                                                <td class=" sorting_1">126</td>
                                                <td class=" ">Batch 011</td>
                                                <td class=" ">Internal</td>
                                                <td class=" ">29-Dec-2014</td>
                                                <td class=" ">10-Jan-2015</td>
                                                <td class=" ">Result Announced</td>
                                                
                                                <td class=" ">superuser</td>
                                            </tr><tr class="even">
                                                <td class=" sorting_1">127</td>
                                                <td class=" ">Batch 003</td>
                                                <td class=" ">Unit</td>
                                                <td class=" ">02-Jan-2015</td>
                                                <td class=" ">10-Jan-2015</td>
                                                <td class=" ">Result Announced</td>
                                                
                                                <td class=" ">superuser</td>
                                            </tr><tr class="odd">
                                                <td class=" sorting_1">128</td>
                                                <td class=" ">Batch 001</td>
                                                <td class=" ">Quarterly</td>
                                                <td class=" ">18-Dec-2014</td>
                                                <td class=" ">30-Dec-2014</td>
                                                <td class=" ">Result Announced</td>
                                                
                                                <td class=" ">superuser</td>
                                            </tr><tr class="even">
                                                <td class=" sorting_1">129</td>
                                                <td class=" ">Batch 005</td>
                                                <td class=" ">Internal</td>
                                                <td class=" ">29-Dec-2014</td>
                                                <td class=" ">10-Jan-2015</td>
                                                <td class=" ">Result Announced</td>
                                                
                                                <td class=" ">superuser</td>
                                            </tr>
                                    </tbody>
                                    </table>
                                        
                                    </div>
                                </div><!-- /.box-body -->
                            
            
            
            
            
            </div>
            
            
            </div>
        
            
            
            
            
             </section>

        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                 <section class="content-header">
                    <h1>
                        Student Report
                        <small></small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="reportdashboard.html"><i class="fa"></i> Report</a></li>
                        <li class="active"> Student Report</li>
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
                                        <div class=" col-md-6">
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
                                    <div class=" col-md-6">  
                                        <div class="form-group ">
                                         <label>Admission Date</label>   
                                        <div class="input-group">
                                                <input type="text" class="form-control input-sm" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="">
                                                <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                                </div>
                                        </div>
                                    </div>

                                        <div class="form-group  ">
                                            <label>Status</label>
                                            <select class="form-control input-sm">
                                                <option>Enrolled</option>
                                                <option>Applied</option>                                                
                                                <option>Rejected</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                              
                                         </div>
                                    
                                        <div class="form-group col-md-12">
                                            <button class="btn btn-info">PRINT</button>
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
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">Class Name</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">Batch Name</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">Admission No.</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Student No.</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Student Name</th>
                                                <th class="sorting" role="columnheader" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">Status</th>
                                                
                                            
                                            </tr>
                                        </thead>
                                        
                                        
                                    <tbody role="alert" aria-live="polite" aria-relevant="all"><tr class="odd">
                                                <td class=" sorting_1">126</td>
                                                <td class=" ">Class 1</td>
                                                <td class=" ">Batch 001</td>
                                                <td class=" ">ADMNO-21</td>
                                                <td class=" ">STUD-30</td>
                                                <td class=" ">Abdul</td>
                                                <td class=" ">Active</td>
                                                
                                            </tr><tr class="even">
                                                <td class=" sorting_1">127</td>
                                                <td class=" ">Class 1</td>
                                                <td class=" ">Batch 003</td>
                                                <td class=" ">ADMNO-26</td>
                                                <td class=" ">STUD-31</td>
                                                <td class=" ">Anand</td>
                                                <td class=" ">Active</td>
                                                
                                            </tr><tr class="odd">
                                                <td class=" sorting_1">128</td>
                                                <td class=" ">Class 3</td>
                                                <td class=" ">Batch 001</td>
                                                <td class=" ">ADMNO-29</td>
                                                <td class=" ">STUD-34</td>
                                                <td class=" ">Balaji</td>
                                                <td class=" ">Active</td>
                                                
                                            </tr><tr class="even">
                                                <td class=" sorting_1">129</td>
                                                <td class=" ">Class 2</td>
                                                <td class=" ">Batch 002</td>
                                                <td class=" ">ADMNO-28</td>
                                                <td class=" ">STUD-32</td>
                                                <td class=" ">Fakkir</td>
                                                <td class=" ">Active</td>
                                                
                                            </tr><tr class="odd">
                                                <td class=" sorting_1">126</td>
                                                <td class=" ">Class 5</td>
                                                <td class=" ">Batch 004</td>
                                                <td class=" ">ADMNO-40</td>
                                                <td class=" ">STUD-33</td>
                                                <td class=" ">David</td>
                                                <td class=" ">Active</td>
                                                
                                            </tr><tr class="even">
                                                <td class=" sorting_1">130</td>
                                                <td class=" ">Class 3</td>
                                                <td class=" ">Batch 005</td>
                                                <td class=" ">ADMNO-35</td>
                                                <td class=" ">STUD-35</td>
                                                <td class=" ">Suresh</td>
                                                <td class=" ">Active</td>
                                                
                                            </tr>
                                    </tbody>
                                    </table>
                                        
                                    </div>
                                </div><!-- /.box-body -->
                            
            
            
            
            
            </div>
            
            
            </div>
        
            
            
            
            
             </section>
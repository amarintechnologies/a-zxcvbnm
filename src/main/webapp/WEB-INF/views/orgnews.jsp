        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
<section class="content-header">
                    <h1>
                        Org. News
                        
                    </h1>
                    <ol class="breadcrumb">
                         <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Settings</li>
                        <li><i class="fa"></i> System</li>
                        <li class="active"><i class="fa"></i>Org. News</li>
                    </ol>
                </section>

                <!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-md-12 col-xs-12">
            <div class="box box-primary">
                <div class="box-header">
                    
                </div>
                <div class="box-body">
                    <div class="row">
                        <div class="col-xs-4">
                            <label for="srch_country_name">News Title:</label>
                            <select class="form-control input-sm chosen-select">
                                 <option></option>
                                 <option>Article</option>
                                 <option>News</option>
                             </select>
                        </div>
                        <div class="col-xs-4">
                            <label for="srch_branch">Branch Name:</label>
                            <!--<input id="srch_country_code" name="srch_country_code" type="text" class="form-control" placeholder="Country Code">-->
                            <select id="srch_country" name="srch_country"  class="form-control chosen-select">
                                <option> All Branches </option>
                                <option> Vadamadhurai </option>
                                <option> Thudiyalur </option>
                                <option> Gandhipuram </option>
                                <option> G.P.Signal </option>
                            </select>
                        </div>
                                            <div class="col-xs-4">
                                                 <label for="srch_branch">Department Name:</label>
                                                <select id="srch_country" name="srch_country"  class="chosen-select form-control">
                                                    <option> All Department </option>
                                                    <option> Computer Science </option>
                                                    <option> Information Technology </option>
                                                    <option> Commerece </option>
                                                    <option> Hindi </option>
                                                </select>
                                            </div>
                                            <div class="col-xs-4">
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
                                            <a class="haslink" href="#add_orgnews"><button class="btn bg-olive margin pull-right button_align"><i class="fa fa-plus"></i> Add </button></a>
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
                                                <th>News</th>
                                                <th>Branch</th>
                                                <th>Department</th>
                                                <th>Valid from</th>
                                                <th>Valid Upto</th>
                                              
                                             </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Article</td>
                                                <td>Vadamadhurai</td>
                                                <td>Computer Science</td>
                                                <td>15-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                             
                                             </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Article</td>
                                                <td>Vadamadhurai</td>
                                                <td>Computer Science</td>
                                                <td>15-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                                
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Article</td>
                                                <td>Vadamadhurai</td>
                                                <td>Computer Science</td>
                                                <td>15-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                               
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Article</td>
                                                <td>Vadamadhurai</td>
                                                <td>Computer Science</td>
                                                <td>15-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                             
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                               <td>Article</td>
                                                <td>Vadamadhurai</td>
                                                <td>Computer Science</td>
                                                <td>15-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                               
                                            </tr>
                                           <tr>
                                                <td>6</td>
                                               <td>Article</td>
                                                <td>Vadamadhurai</td>
                                                <td>Computer Science</td>
                                                <td>15-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                              
                                            </tr>
                                           <tr>
                                                <td>7</td>
                                               <td>Article</td>
                                                <td>Vadamadhurai</td>
                                                <td>Computer Science</td>
                                                <td>15-Jan-2015</td>
                                                <td>17-Jan-2015</td>
                                         
                                            </tr>
                                           

                                        </tbody>
                                      
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->
                </section><!-- /.content -->
                
<script src="js/AdminLTE/custom.js" type="text/javascript"></script>
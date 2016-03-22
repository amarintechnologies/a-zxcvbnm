
                <section class="content-header">
                    <h1>View Student Details</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="librarydashboard.html"><i class="fa"></i> Library</a></li>
                        <li><a href=""><i class="fa"></i> Settings</a></li>
                        <li class="active">View Student Details</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box ">
                                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                                    <h3 class="box-title"></h3>
                                    <label class="pull-right box-tools">Reset <i class="fa fa-retweet"></i></label>
                                    <label class="pull-right box-tools">Search <i class="fa fa-search"></i></label>
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                <div class="form-group col-md-4">
                                    <label>Student Id</label>
                                    <input class="form-control input-md" type="text" placeholder="Student ID">
                                </div>
                                
                                <div class="form-group col-md-4">
                                    <label>Status</label>
                                    <select class="form-control input-md">
                                        <option>Select</option>
                                        <option>Issued</option>
                                        <option>Returned</option>
                                        <option>Over Due</option>
                                    </select>
                                </div>
                                
                            </form>
                      
                            </div>
                        </div>
                    </div>
                </div>
                            </div>
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header col-md-12 col-xs-12">
                                    <h4 class="box-title"></h4>
                                    <a href="#borrowbook" onclick="alert('Edit this Data?')" class="btn btn-success pull-right haslink">Add Student Details</a>
                                </div>
                                
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Student Name</th>
                                                <th>ISBN No</th>
                                                <th>Book Name</th>
                                                <th>Author</th>
                                                <th>Issue Date</th>
                                                <th>Due Date</th>
                                                <th>Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <tr>
                                                <td>5</td>
                                                <td>Saravanan</td>
                                                <td>250</td>
                                                <td>DBMS</td>
                                                <td>Dev</td>
                                                <td>12-02-2015</td>
                                                <td>24-02-2015</td>
                                                <td>Returned</td>
                                           </tr>
                                           <tr>
                                                <td>9</td>
                                                <td>Mohan</td>
                                                <td>256</td>
                                                <td>Web Technology</td>
                                                <td>N.P.GOPALAN</td>
                                                <td>10-02-2015</td>
                                                <td>20-02-2015</td>
                                                <td>Issued</td>
                                           </tr>

                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->

    <div class="modal fade" id="addcategory" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content ">
                <div class="modal-header">
                    <h4 class="modal-title"> Add Category</h4>
                </div>
                <form action="#" method="post">
                    <div class=" ">
                        <div class="col-md-12">
                           <div class="form-group col-md-6">
                              <label>Category Name</label>
                              <input class="form-control input-md" type="text" placeholder="Category Name">
                           </div>
                           <div class="form-group col-md-6">
                                <label>Status</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Active</option>
                                    <option>Inactive</option>
                                </select>
                           </div>
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
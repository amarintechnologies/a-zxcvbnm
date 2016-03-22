
                <section class="content-header">
                    <h1>View Authors</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Library</a></li>
                        <li><a href=""><i class="fa"></i> Settings</a></li>
                        <li class="active">View Authors</li>
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
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                
                                <div class="form-group col-md-4">                                
                                    <div class="input-group input-group-sm">
                                        <label>Author Name</label>
                                        <input type="text" class="form-control">
                                        <span class="input-group-btn ">
                                            <button class="btn btn-info btn-flat margin_top_30" type="button" onclick="alert('searching book...')">Search</button>
                                        </span>
                                    </div>
                                </div>
                            </form>
                      
                            </div>
                        </div>
                    </div>
                </div>
                            </div>
                            <div class="box col-md-12 col-xs-12">
                                <div class="box-header  ">
                                    <h4 class="box-title">Authors List</h4>
                                    <a href="#addbook" onclick="alert('Add this data?')" class="btn btn-success pull-right haslink margin_top_2">Add Books</a>
                                </div>
                                
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Author Name</th>
                                                <th>Book Name</th>
                                                <th>Edit</th>
                                                <th>Delete</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <tr>
                                                <td>5</td>
                                                <td>J.AKILANDESWARI</td>
                                                <td>Web Technology</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                           </tr>
                                           <tr>
                                                <td>9</td>
                                                <td>G.K.Gupta</td>
                                                <td>Database Management System</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
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
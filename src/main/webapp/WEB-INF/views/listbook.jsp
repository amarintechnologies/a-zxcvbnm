
                <section class="content-header">
                    <h1>List Book</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Library</a></li>
                        <li><a href=""><i class="fa"></i> Manage Book</a></li>
                        <li class="active">List Book</li>
                    </ol>
                </section>

                <!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-md-12 col-xs-12">
            <div class="box ">
                <div class="box box-primary">
                    <div class="box-header">
                            <h3 class="box-title"></h3>
                            <a class="add_to_widget" href="#listbook_widget" ><button class="btn btn-warning btn-sm margin pull-right">Add to Widget</button></a>
                            <div class="box-body">
                                <form role="form" class="col-md-12 col-xs-12">
                                    <div class="form-group col-md-2">
                                        <label>Book Title</label>
                                         <select class="form-control input-md chosen-select">
                                            <option>Select</option>
                                            <option>Concepts of C</option>
                                            <option>Learn PHP</option>
                                            <option>Production Engineering</option>
                                            <option>Environmental Science</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-2">
                                        <label>Book Category Name</label>
                                        <select class="form-control input-md chosen-select">
                                            <option>Select</option>
                                            <option>Networking</option>
                                            <option>PHP</option>
                                            <option>Web Technology</option>
                                            <option>Database Management</option>
                                            <option>Grid Computing</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-2">
                                        <label>Book Number</label>
                                          <select class="form-control input-md chosen-select">
                                            <option>Select</option>
                                            <option>BK001</option>
                                            <option>BK001</option>
                                            <option>BK001</option>
                                            <option>BK001</option>
                                            <option>BK001</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-2">
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
        </div>
    </div>
</section>
<section class="content">
    <div class="row">
        <div class="col-md-12 col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title"></h3>
                    <a class="haslink" href="#addbook"><button class="btn bg-olive margin"  style="float: right">Add Book</button></a>
                </div>
                <div class="box-body table-responsive">
                    <table id="example1" class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th>Ref.Id</th>
                                <th>Book Title</th>
                                <th>Book Category</th>
                                <th>Book Number</th>
                                <th>Status</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>Network Management</td>
                                <td>Networking</td>
                                <td>SCT-NW-053</td>
                                <td>Active</td>
                                <td>
                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                </td>
                                <td>
                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                </td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>DBMS</td>
                                <td>Database Management</td>
                                <td>SCT-DB-067</td>
                                <td>Active</td>
                                <td>
                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                </td>
                                <td>
                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                </td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>Date Mining</td>
                                <td>Database Management</td>
                                <td>SCT-DB-087</td>
                                <td>Active</td>
                                <td>
                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                </td>
                                <td>
                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                </td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>Web Service in PHP</td>
                                <td>PHP</td>
                                <td>SCT-WT-014</td>
                                <td>Active</td>
                                <td>
                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                </td>
                                <td>
                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                </td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>Web Technology</td>
                                <td>Web TEchnology</td>
                                <td>SCT-WT-004</td>
                                <td>Active</td>
                                <td>
                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-bitbucket fa fa-edit" title="Edit"></a>
                                </td>
                                <td>
                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>



<div class="modal fade" id="listbook" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="#" method="post">
                <div class="modal-body">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Add Book List </h4>
                    </div>
                    <div class="col-md-6">
                        <div> <h3> Books</h3> </div>
                        <div class="form-group ">
                            <label>Book No:</label>
                            <input class="form-control input-md" type="text" placeholder="Book No">
                        </div>
                        <div class="form-group ">
                            <label>Book Title:</label>
                            <input class="form-control input-md" type="text" placeholder="Book Title">
                        </div>
                        <div class="form-group ">
                            <label>Book Category Name</label>
                            <select class="form-control input-md">
                                <option>Select</option>
                                <option>Networking</option>
                                <option>PHP</option>
                                <option>Web Technology</option>
                                <option>Database Management</option>
                                <option>Grid Computing</option>
                            </select>
                        </div>
                        <div class="form-group ">
                            <label>ISBN No:</label>
                            <input class="form-control input-md" type="text" placeholder="ISBN No">
                        </div>
                        <div class="form-group ">
                            <label>Author:</label>
                            <input class="form-control input-md" type="text" placeholder="Author">
                        </div>
                        <div class="form-group ">
                            <label>Book Desc:</label>
                            <input class="form-control input-md" type="text" placeholder="Book Desc">
                        </div>
                        <div class="form-group input-group input-group-md">
                            <label>Book Desc:</label>
                            <input type="text" class="form-control" placeholder="Price">
                            <div class="input-group-btn">
                                <button type="button" class="btn btn-default dropdown-toggle margin_top_29" data-toggle="dropdown">currency<span class="fa fa-caret-down "></span></button>
                                <ul class="dropdown-menu">
                                    <li>Rupee</li>
                                    <li>Dollar</li>
                                    <li>Euro</li>
                                    <li>Yuan Renminbi</li>
                                    <li>Pound </li>
                                </ul>
                            </div><!-- /btn-group -->
                        </div>
                        <div class="form-group ">
                            <label>Status</label>
                            <select class="form-control input-md">
                                <option>Select</option>
                                <option>Active</option>
                                <option>Inactive</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div> <h3> Book Custom Field</h3> </div>
                        <div class="form-group ">
                            <label>Date of publish</label>
                            <input type="text" class="form-control input-md" placeholder="DD-MM-YYYY">
                        </div>
                        <div class="form-group ">
                            <label>Book Publisher</label>
                            <input type="text" class="form-control input-md" placeholder="Book Publisher">
                        </div>
                        <div class="form-group ">
                            <label>Publisher1</label>
                            <input type="text" class="form-control input-md" placeholder="Publisher1">
                        </div>
                        <div class="form-group ">
                            <label>Date of Birth</label>
                            <input type="text" class="form-control input-md" placeholder="Date of Birth">
                        </div>
                        <div class="form-group ">
                            <label>Book edition version</label>
                            <input type="text" class="form-control input-md" placeholder="Book edition version">
                        </div>
                        <div class="form-group ">
                            <label>Books Page color</label>
                            <input class="form-control input-md" type="text" placeholder="Books Page color">
                        </div>
                        <!--<div class="form-group ">
                            <label>Extra field</label>
                            <input class="form-control input-md" type="text" placeholder="Extra field">
                        </div>-->
                        <div class="form-group">
                            <label>Book papers size</label>
                            <input class="form-control input-md" type="text" placeholder="Book size">
                        </div>
                        <div class="form-group">
                            <label>Total no of pages</label>
                            <input class="form-control input-md" type="text" placeholder="Page Count">
                        </div>
                       
                        <!--<div class="form-group ">
                            <label>Column new</label>
                            <input class="form-control input-md" type="text" placeholder="Column new">
                        </div>-->
                    </div>
                    <div class="modal-footer clearfix">
                        <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                        <button type="submit" class="btn btn-primary"> <i class="fa fa-save"></i> Save</button>
                    </div>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<script src="js/AdminLTE/custom.js" type="text/javascript"></script>
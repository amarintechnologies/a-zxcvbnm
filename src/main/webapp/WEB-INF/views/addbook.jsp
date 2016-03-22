        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
    <section class="content-header">
        <h1>Add Book</h1>
        <ol class="breadcrumb">
            <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href=""><i class="fa"></i> Library</a></li>
            <li><a href=""><i class="fa"></i> Manage Book</a></li>
            <li class="active">Add Book</li>
        </ol>
    </section>
    <section class="content">
        <div class="row">
            <div class="col-md-12 col-xs-12">
                    <div class="box-body">
                        <form action="#" method="post" class="col-md-12 col-xs-12">
                    <div class="box col-md-12 col-xs-12">
                        <div class="col-md-12 col-xs-12">
                                <div> <h4> Books</h4> </div>
                                <div class="form-group col-md-4">
                                    <label>Book No:</label>
                                    <input class="form-control input-md" type="text" placeholder="Book No">
                                </div>
                                <div class="form-group col-md-4">
                                    <label>Book Title:</label>
                                    <input class="form-control input-md" type="text" placeholder="Book Title">
                                </div>
                                <div class="form-group col-md-4">
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
                        </div>
                        <div class="col-md-12 col-xs-12">
                                <div class="form-group col-md-4">
                                    <label>ISBN No:</label>
                                    <input class="form-control input-md" type="text" placeholder="ISBN No">
                                </div>
                                <div class="form-group col-md-4">
                                    <label>Author:</label>
                                    <input class="form-control input-md" type="text" placeholder="Author">
                                </div>
                                <div class="form-group col-md-4 ">
                                    <label>Book Desc:</label>
                                    <input class="form-control input-md" type="text" placeholder="Book Desc">
                                </div>
                        </div>
                        <div class="col-md-12 col-xs-12">
                                <div class="col-md-4">
                                    <div class="form-group input-group input-group-md ">
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
                                            </div>
                                    </div>
                                </div>
                                <div class="form-group col-md-4">
                                    <label>Status</label>
                                    <select class="form-control input-md">
                                        <option>Select</option>
                                        <option>Active</option>
                                        <option>Inactive</option>
                                    </select>
                                </div>
                     
                    </div>
                           <div class=" clearfix">
                                <button type="submit" class="btn btn-primary pull-right"> <i class="fa fa-save"></i> Save</button>
                                <button type="button" class="btn btn-danger pull-right align_btn" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            </div>
                           <div class=" clearfix" style="height:10px;">
                              </div>
                    </div>
                    <div class="box col-md-12 col-xs-12">
                        <div class="col-md-12 col-xs-12">
                            <div> <h4> Book Custom Field</h4> </div>
                            <div class="form-group col-md-4">
                                <label>Date of publish</label>
                                <input type="text" class="form-control input-md" placeholder="DD-MM-YYYY">
                            </div>
                            <div class="form-group col-md-4 ">
                                <label>Book Publisher</label>
                                <input type="text" class="form-control input-md" placeholder="Book Publisher">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Publisher</label>
                                <input type="text" class="form-control input-md" placeholder="Publisher1">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Date of Birth</label>
                                <input type="text" class="form-control input-md" placeholder="Date of Birth">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Book edition version</label>
                                <input type="text" class="form-control input-md" placeholder="Book edition version">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Books Page color</label>
                                <input class="form-control input-md" type="text" placeholder="Books Page color">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Extra field</label>
                                <input class="form-control input-md" type="text" placeholder="Extra field">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Book papers size</label>
                                <input class="form-control input-md" type="text" placeholder="Book size">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Total no of pages</label>
                                <input class="form-control input-md" type="text" placeholder="Page Count">
                            </div>
                            <div class="form-group col-md-4">
                                <label>Column new</label>
                                <input class="form-control input-md" type="text" placeholder="Column new">
                            </div>
                        </div>
                        <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary"> <i class="fa fa-save"></i> Save</button>
                        </div>
                    </div>
               
            </form>
                </div>
            </div>
        </div>
    </section>

        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
               <section class="content-header">
                    <h1>Grades</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Examination</a></li>
                        <li><a href=""><i class="fa"></i> Set Grade Level</a></li>
                        <li class="active"> Grade Name</li>
                    </ol>
                </section>
<section class="content">
    <div class="row">
        <div class="col-md-12 col-xs-12">
                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                            <h3 class="box-title"></h3>
                            <div class="box-body">
                                <form role="form" class="col-md-12 ">
                                    <div class="form-group col-md-3">
                                        <label>Grade Name</label>
                                        <select class="form-control input-md chosen-select">
                                            <option>Select</option>
                                            <option>Grade A</option>
                                            <option>Grade B</option>
                                            <option>Grade C</option>
                                            <option>Grade D</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-3">
                                        <label>Status</label>
                                        <select class="form-control input-md">
                                            <option>Active</option>
                                            <option>Inactive</option>
                                        </select>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            
          <div class="box">
            <div class="box-header">
                                    <h4 class="box-title">Grade List</h4>
                                    <a class="btn bg-olive margin" data-toggle="modal" data-target="#grade" style="float: right"><i class="fa fa-pencil"></i> Add Grade Details </a>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Grade Name</th>
                                                <th>Status</th>
                                                <th>Last Updated Date</th>
                                                <th>Updated By </th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Grade A</td>
                                                <td>Active</td>
                                                <td>10-Jan-2015 12:22</td>
                                                <td>superuser </td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Grade B</td>
                                                <td>Active</td>
                                                <td>10-Jan-2015 12:22</td>
                                                <td>superuser </td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Grade S</td>
                                                <td>Active</td>
                                                <td>10-Jan-2015 12:22</td>
                                                <td>superuser </td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Grade D</td>
                                                <td>Active</td>
                                                <td>10-Jan-2015 12:22</td>
                                                <td>superuser </td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                               <td>Grade A</td>
                                                <td>Active</td>
                                                <td>10-Jan-2015 12:22</td>
                                                <td>superuser </td>
                                            </tr>
                                           
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->



 <div class="modal fade" id="grade" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Add Grade Name </h4>
                </div>
                <form action="#" method="post">
                    <div class="modal-body">
                        <div class=" ">
                            <div class="form-group">
                                <label>Grade Name</label>
                                <input class="form-control input-md" type="text" placeholder="">  
                            </div>
                            <div class="form-group">
                                <label>Remarks</label>
                                <input class="form-control input-md" type="text" placeholder="">  
                            </div>
                            <div class="form-group">
                                <label>Status</label>
                                <select class="form-control input-md">
                                    <option>select</option>
                                    <option>Active</option>
                                    <option>Inactive</option>
                                </select>
                            </div>
                       
                            <div class="form-group">
                                <label>Grade Code</label>
                                <input class="form-control input-md" type="text" placeholder="">  
                            </div>
                            <div class="form-group">
                                <label>Min.Score</label>
                                <input class="form-control input-md" type="text" placeholder="">  
                            </div>
                            <div class="form-group">
                                <label>Max.Score</label>
                                <input class="form-control input-md" type="text" placeholder="">  
                            </div>
                            <div class="form-group">
                                <label>Remarks</label>
                                <input class="form-control input-md" type="text" placeholder="">  
                            </div>
                            
                        </div>
                        
                        
                        <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger"  data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary"><i class="fa fa-save"></i> Save</button>
                        </div>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


  
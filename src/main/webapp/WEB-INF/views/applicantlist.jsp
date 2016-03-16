<script>
   	 $(".haslink").click(function(){
	        url=$(this).attr("href").substring(1);
	       //alert(url);
	        load_page(url+".html",swap_wrap);
	       
	        });
	 //functions
	$(function() {
	    
	//add to widget click function start
	 $(".add_to_widget").click(function(){
	    wid=$(this).attr("href");
	       dashboardwidget.push(wid);
	       console.log(dashboardwidget);
	       });
	//add to widget click function end
	
	// searchable combobox start
	$('.chosen-select').chosen();
	// searchable combobox end
	

	
	});
</script>
                <section class="content-header">
                    <h1> Manage Applicant List </h1>
		 <ol class="breadcrumb">
                        <li><a href="/school/dashboard"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Student</li>
                        <li><i class="fa"></i> Manage Applicant</li>
                        <li class="active"> Applicant List</li>
                    </ol>
                </section>
              
                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <div class="col-md-12 col-xs-12">
                            <div class="box box-primary">
                                
                                <div class="box-header">
                                    <h3 class="box-title"> </h3>
                                      <!--<a class="btn bg-olive margin" data-toggle="modal" data-target="#add-student" style="float: right"><i class="fa fa-pencil"></i> Add Student </a>
                                      <a class="add_to_widget" href="#applicantlist_widget" ><button class="btn btn-warning btn-sm margin pull-right">Add to Widget</button></a>-->
                                
                                <div class="box-body">
                                <form role="form"  class="col-md-12">
                                        
                                        <div class="form-group col-md-3 ">
                                            <label>Applicant Number :</label>
                                            <select class="form-control input-md chosen-select">
						<option>Select</option>
                                                <option>APP 001</option>
                                                <option>APP 002</option>
                                                <option>APP 003</option>
						<option>APP 004</option>
                                                <option>APP 005</option>
                                                <option>APP 006</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-3 ">
                                            <label>Admission Date :</label>   
                                                <div class="input-group">
                                                    <input type="text" class="form-control input-md" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask="" placeholder="dd/mm/yyyy">
                                                    <div class="input-group-addon">
                                                    <i class="fa fa-calendar"></i>
                                                    </div>
                                                </div>
                                        </div>
                                        <div class="form-group col-md-2">
                                            <label>Status</label>
                                            <select class="form-control input-md">
                                                <option>Select</option>
                                                <option>Active</option>
                                                <option>Inactive</option>
                                            </select>
                                        </div>
                                    </form>
                                </div>
                                </div><!-- /.box-header -->
                                </div><!-- /.box -->
                        </div>
                    </div><!-- /.row (main row) -->
                
                
                            <div class="box col-md-12 col-xs-12 box-warning">
                                <div class="box-header">
                                    <h3 class="box-title">Applicant List</h3>
                                    <a class="haslink" href="#addstudent"><button class="btn bg-olive margin"  style="float: right">Add Applicant</button></a>
                                </div>
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped" >
                                        <thead>
                                            <tr>
                                                <th>S.No</th>
                                                <th>Applicant No</th>
                                                <th>Student Name</th>
                                                <th>Preferred Department</th>
                                                <th>Edit</th>
                                                <th>Delete</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>20365</td>
                                                <td>Kannan</td>
                                                <td>Information Technology</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                              
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>20315</td>
                                                <td>Raja ravi</td>
                                                <td>Computer Science</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                                
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>21023</td>
                                                <td>Ravi</td>
                                                <td>Fashion Technology</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                                
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>23504</td>
                                                <td>Kumar</td>
                                                <td>Information Science</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                                
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>21456</td>
                                                <td>Raj kumar</td>
                                                <td>Multimedia</td>
                                                <td>
                                                    <a href="#" onclick="alert('Edit successfully')" class="btn btn-twitter fa fa-pencil" title="Edit"></a>
                                                </td>
                                                <td>
                                                    <a href="#" onclick="alert('Remove successfully')" class="btn btn-google-plus fa fa-trash" title="Remove"></a>
                                                </td>
                                               
                                            </tr>
                                           
                                        </tbody>
                                       
                                    </table>
                                </div><!-- /.box-body -->
                            </div>
                 
                
                
                
                
                </section><!-- /.content -->
            
            
 

        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
<script>
   	 $(".haslink").click(function(){
	        url=$(this).attr("href").substring(1);
	       //alert(url);
	        load_page(url+".html",swap_wrap);
	       
	        });
</script>
                <section class="content-header">
                    <h1>Add Room Details</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Hostel</li>
                        <li><i class="fa"></i> Manage Rooms</li>
                        <li class="active">Add Room Details</li>
                    </ol>
                </section>

                <!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-md-12 col-xs-12">
            <div class="box">
                <div class="box-header col-md-12">
                    <h3>Room Entry From</h3>
                    <a class="haslink btn bg-olive margin pull-right" href="#searchroom">Search Rooms</a>
                    
                </div>
                <form action="#" method="post">
                    <div class="col-md-12">
                        <div class="form-group col-md-6">
                            <label>Floor No</label>
                            <select class="form-control input-md chosen-select">
                                <option>Select</option>
                                <option>Floor-1</option>
                                <option>Floor-2</option>
                                <option>Floor-3</option>
                            </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Room No</label>
                            <select class="form-control input-md chosen-select">
                                        <option>Select</option>
                                        <option>101</option>
                                        <option>102</option>
                                        <option>103</option>
                                        <option>201</option>
                                        <option>202</option>
                                        <option>203</option>
                                        <option>301</option>
                                        <option>302</option>
                                        <option>303</option>
                                    </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Room Type</label>
                            <select class="form-control input-md chosen-select">
                                <option>Select</option>
                                <option>Non-Deluxe</option>
                                <option>Deluxe</option>
                                <option>Normal</option>
                            </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Number of Beds</label>
                            <select class="form-control input-md chosen-select">
                                        <option>Select</option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                    </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Free Beds</label>
                            <select class="form-control input-md chosen-select">
                                        <option>Select</option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                    </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Rental</label>
                            <input class="form-control input-md" type="text" placeholder="Rental">
                        </div>
                        <div class="form-group col-md-6">
                            <label>Remarks</label>
                            <textarea class="form-control input-md" type="text" ></textarea>
                        </div>
                    </div>    
                    <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary pull-right"><i class="fa fa-save"></i> Save</button>
                    </div>
                       
                </form>
            </div>
        </div>
    </div>
</section><!-- /.content -->


<script src="js/AdminLTE/custom.js" type="text/javascript"></script>

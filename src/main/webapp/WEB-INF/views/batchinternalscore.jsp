        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                 <section class="content-header">
                    <h1>Batch Internal Score</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><i class="fa"></i> Examination</li>
                        <li><i class="fa"></i> Exam Management</li>
                        <li class="active"> Batch Internal Score</li>
                    </ol>
                </section>
                 <section class="content">
                    <div class="row">
                        <!-- Left col -->
                        
        <div class="col-md-12 col-xs-12">
            
                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                            <h3 class="box-title"></h3>
                                <!--<label class="pull-right box-tools">Reset <i class="fa fa-retweet"></i></label>
                                <label class="pull-right box-tools">Search <i class="fa fa-search"></i></label>-->
                            <div class="box-body">
                            <form role="form" class="col-md-12 ">
                                <div class="form-group col-md-4">
                                    <label>Class Name</label>
                                    <select class="form-control input-md chosen-select">
                                        <option value="zero">Select</option>
                                        <option value="one">Class 001</option>
                                        <option value="one">Class 002</option>
                                        <option value="one">Class 003</option>
                                        <option value="one">Class 004</option>
                                        <option value="one">Class 005</option>
                                    </select>
                                </div>
                                <div id="batch1" class="form-group col-md-4">
                                    <label>Batch Name</label>
                                    <select class="form-control input-md chosen-select">
                                        <option value="zero">Select</option>
                                        <option value="one">Batch-2011</option>
                                        <option value="one">Batch-2012</option>
                                        <option value="one">Batch-2013</option>
                                        <option value="one">Batch-2014</option>
                                        <option value="one">Batch-2015</option>
                                    </select>
                                </div>
                                
                            </form>
                            <a class="btn bg-olive margin" data-toggle="modal" data-target="#internal-score" style="float: right"><i class="fa fa-pencil"></i> Add Internal Details </a>
                            </div>
                        </div>
                    </div>
                </div>
            
                       <div class="box one">
                                <div class="box-header">
                                    <h4 class="box-title"> Internal Score List</h4><br/>
                                    <p class="pull-right"><strong>Note:</strong> Click on Internal score, Quiz score  to edit &nbsp;&nbsp;&nbsp; </p>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>S.No</th>
                                                <th>Student Name</th>
                                                <th>Internal Passing Marks</th>
                                                <th>Internal Score</th>
                                                <th>Quiz Passing Marks</th>
                                                <th>Quiz Score</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>John</td>
                                                <td>80</td>
                                                <td class="edit">60</td>
                                                <td>20</td>
                                                <td class="edit">15</td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Raja</td>
                                                <td>80</td>
                                                <td class="edit">55</td>
                                                <td>20</td>
                                                <td class="edit">19</td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Frank</td>
                                                <td>80</td>
                                                <td class="edit">70</td>
                                                <td>20</td>
                                                <td class="edit">15</td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Steve</td>
                                                <td>80</td>
                                                <td class="edit">75</td>
                                                <td>20</td>
                                                <td class="edit">18</td>
                                            </tr>
                                           
                                            
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->
                
                
<div class="modal fade" id="internal-score" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title"> Internal Score </h4>
                </div>
                <form action="#" method="post">
                    <div class="modal-body">
                        <div class="">
                            <div class="form-group">
                                <label>Class Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Class 001</option>
                                    <option>Class 002</option>
                                    <option>Class 003</option>
                                    <option>Class 004</option>
                                    <option>Class 005</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Batch Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Batch-2011</option>
                                    <option>Batch-2012</option>
                                    <option>Batch-2013</option>
                                    <option>Batch-2014</option>
                                    <option>Batch-2015</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Student Name</label>
                                <select class="form-control input-md">
                                    <option>Select</option>
                                    <option>Saravanan</option>
                                    <option>Mohan</option>
                                    <option>Vinoth</option>
                                    <option>Raja</option>
                                    <option>Jai</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Exam Type</label>
                                <input type="radio" name="a"/> Internal
                                <input type="radio" name="a"/> Quiz
                            </div>
                            <div class="form-group">
                                <div class="form-group col-md-6">
                                    <label>Internal</label>
                                    <input class="form-control input-md" value="80" type="text" disabled>
                                        
                                </div>
                                <div class="form-group col-md-6">
                                    <label>Score</label>
                                    <input class="form-control input-md" type="text" >  
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-group col-md-6">
                                    <label>Quiz</label>
                                    <input class="form-control input-md" value="20" type="text" disabled>
                                       
                                </div>
                                <div class="form-group col-md-6 ">
                                    <label>Score</label>
                                    <input class="form-control input-md" type="text">  
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
        
        
        
<script type="text/javascript">
     $(document).ready(function(){
        $("select").change(function(){
            $( "select option:selected").each(function(){
                if($(this).attr("value")=="one"){
                    $(".box").show();
                    $(".one").show();
                }
                if($(this).attr("value")=="zero"){
                    $(".box").show();
                    $(".one").hide();
                }

            });
        }).change();
    });
</script>
        
<script type="text/javascript">
$(function () {
        $("td.edit").click(function () {
                var OriginalContent = $(this).text();
                $(this).addClass("cellEditing");
                $(this).html("<input type='text' value='" + OriginalContent + "' />");
                $(this).children().first().focus();
                $(this).children().first().keypress(function (e) {
                        if (e.which == 13) {
                                var newContent = $(this).val();
                                $(this).parent().text(newContent);
                                $(this).parent().removeClass("cellEditing");
                                }
                                });
                $(this).children().first().blur(function(){
                        $(this).parent().text(OriginalContent);
                        $(this).parent().removeClass("cellEditing");
                        });
                });
        });
</script>

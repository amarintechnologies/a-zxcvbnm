        <script type="text/javascript">
           $('.chosen-select').chosen();
        </script>
                <section class="content-header">
                    <h1> Timetable</h1>
                    <ol class="breadcrumb">
                        <li><a href="home.html"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href=""><i class="fa"></i> Timetable</a></li>
                        <li><i class="fa"></i> Manage Timetable </li>
                        <li class="active"> Set Class Timing</li>
                    </ol>
                </section>
                <section class="col-md-12">
                          
                        
                    </section>

                <!-- Main content -->
                <section class="content col-md-12">
                    <div class="col-md-12">
    
                <div class="box box-primary">
                    <div class="box-header">
                        <div class="box-header">
                                    <h3 class="box-title">Class Timing</h3>
                                    <br>
                                    
                            <div class="box-body">
                                  
                            <form role="form" class="col-md-12 ">
                                    
                                        <div class="form-group col-md-3">
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
                                        <div class="form-group col-md-3">
                                                <label>Batch </label>
                                                <select class="form-control input-sm chosen-select">
                                                    <option>Select</option>
                                                    <option>Batch 001</option>
                                                    <option>Batch 002</option>
                                                    <option>Batch 003</option>
                                                    <option>Batch 004</option>
                                                    <option>Batch 005</option>
                                                </select>
                                        </div>
                                    
                                        <div class="form-group col-md-3">
                                         <label>Timing Name</label> 
                                                <select class="form-control input-sm chosen-select">
                                                    <option>Select</option>
                                                    <option>General Timing</option>
                                                    <option>Regular Timing</option>
                                                    <option>Special Timing</option>
                                                    <option>Evening Timing</option>
                                                </select>
                                        </div>
                                        
                                        <div class="form-group col-md-3">
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

                    <!-- Small boxes (Stat box) -->
                   <!-- /.row -->

                    <!-- Main row -->
                    <div class="row">
                        <!-- Left col -->
                        
                        <div class="col-md-12 col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Class Timing List</h3>
                                    <a class="btn bg-olive margin" data-toggle="modal" data-target="#set_classtiming" style="float: right"><i class="fa fa-pencil"></i> Add Timing</a>
                                </div><!-- /.box-header -->
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Ref.Id</th>
                                                <th>Class Name</th>
                                                <th>Batch </th>
                                                <th>Timing Name</th>
                                                <th>Status</th>
                                                <th>Last Updated Date</th>
                                                <th>Last Updated By</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Class 1</td>
                                                <td>Batch-003</td>
                                                <td>Regular Time</td>
                                                <td>Active</td>
                                                <td>13-Jan-2015 12:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>2</td>
                                                <td>Class 3</td>
                                                <td>Batch-003</td>
                                                <td>Evening Time</td>
                                                <td>Active</td>
                                                <td>23-Jan-2015 05:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>3</td>
                                                <td>Class 5</td>
                                                <td>Batch-003</td>
                                                <td>Regular Time</td>
                                                <td>Active</td>
                                                <td>13-Feb-2015 07:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>4</td>
                                                <td>Class 1</td>
                                                <td>Batch-003</td>
                                                <td>General Time</td>
                                                <td>Active</td>
                                                <td>15-Jan-2015 10:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           <tr>
                                                <td>5</td>
                                                <td>Class 4</td>
                                                <td>Batch-003</td>
                                                <td>Regular Time</td>
                                                <td>Active</td>
                                                <td>13-Mar-2015 01:22</td>
                                                <td>superuser</td>
                                            </tr>
                                           
                                        </tbody>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        
                        </div>
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->
            
        
        
        <div class="modal fade" id="set_classtiming" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"> Class Timing</h4>
                    </div>
                    <form action="#" method="post">
                            <div class="col-md-12">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Class Name</label>
                                        <select class="form-control input-sm">
                                            <option>Select</option>
                                            <option>class 1</option>
                                            <option>class 2</option>
                                            <option>class 3</option>
                                            <option>class 4</option>
                                            <option>class 5</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Batch</label>
                                        <select class="form-control input-sm">
                                            <option>Select</option>
                                            <option>Batch 001</option>
                                            <option>Batch 002</option>
                                            <option>Batch 003</option>
                                            <option>Batch 004</option>
                                            <option>Batch 005</option>
                                        </select>
                                    </div>
                                    <div class="form-group col">
                                        <label>Timing Name</label>
                                        <input type="text" class="form-control input-sm">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Remarks</label>
                                        <textarea class="form-control input-sm" rows="2"></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label>Status</label>
                                        <select class="form-control input-sm">
                                            <option>Active</option>
                                            <option>Inactive</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Reference Name</label>
                                        <input type="text" class="form-control input-sm">
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <label>Start Time</label>
                                        </div>
                                        <div class="col-md-3">
                                            <select class="form-control input-sm">
                                                <option>00</option>
                                                <option>01</option>
                                                <option>02</option>
                                                <option>03</option>
                                                <option>04</option>
                                                <option>05</option>
                                                <option>06</option>
                                                <option>07</option>
                                                <option>08</option>
                                                <option>09</option>
                                                <option>10</option>
                                                <option>11</option>
                                                <option>12</option>
                                                <option>13</option>
                                                <option>14</option>
                                                <option>15</option>
                                                <option>16</option>
                                                <option>17</option>
                                                <option>18</option>
                                                <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>
                                            </select>
                                        </div>
                                        <div class="col-md-3">
                                            <select class="form-control input-sm">
                                                <option>00</option>
                                                <option>01</option>
                                                <option>02</option>
                                                <option>03</option>
                                                <option>04</option>
                                                <option>05</option>
                                                <option>06</option>
                                                <option>07</option>
                                                <option>08</option>
                                                <option>09</option>
                                                <option>10</option>
                                                <option>11</option>
                                                <option>12</option>
                                                <option>13</option>
                                                <option>14</option>
                                                <option>15</option>
                                                <option>16</option>
                                                <option>17</option>
                                                <option>18</option>
                                                <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>
                                                <option>24</option>
                                                <option>25</option>
                                                <option>26</option>
                                                <option>27</option>
                                                <option>28</option>
                                                <option>29</option>
                                                <option>30</option>
                                                <option>31</option>
                                                <option>32</option>
                                                <option>33</option>
                                                <option>34</option>
                                                <option>35</option>
                                                <option>36</option>
                                                <option>37</option>
                                                <option>38</option>
                                                <option>39</option>
                                                <option>40</option>
                                                <option>41</option>
                                                <option>42</option>
                                                <option>43</option>
                                                <option>44</option>
                                                <option>45</option>
                                                <option>46</option>
                                                <option>47</option>
                                                <option>48</option>
                                                <option>49</option>
                                                <option>50</option>
                                                <option>51</option>
                                                <option>52</option>
                                                <option>53</option>
                                                <option>54</option>
                                                <option>55</option>
                                                <option>56</option>
                                                <option>57</option>
                                                <option>58</option>
                                                <option>59</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <label>End Time</label>
                                        </div>
                                        <div class="col-md-3">
                                            <select class="form-control input-sm">
                                                <option>0</option>
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                                <option>6</option>
                                                <option>7</option>
                                                <option>8</option>
                                                <option>9</option>
                                                <option>10</option>
                                                <option>11</option>
                                                <option>12</option>
                                                <option>13</option>
                                                <option>14</option>
                                                <option>15</option>
                                                <option>16</option>
                                                <option>17</option>
                                                <option>18</option>
                                                <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>
                                            </select>
                                        </div>
                                        <div class="col-md-3">
                                            <select class="form-control input-sm">
                                                <option>00</option>
                                                <option>01</option>
                                                <option>02</option>
                                                <option>03</option>
                                                <option>04</option>
                                                <option>05</option>
                                                <option>06</option>
                                                <option>07</option>
                                                <option>08</option>
                                                <option>09</option>
                                                <option>10</option>
                                                <option>11</option>
                                                <option>12</option>
                                                <option>13</option>
                                                <option>14</option>
                                                <option>15</option>
                                                <option>16</option>
                                                <option>17</option>
                                                <option>18</option>
                                                <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>
                                                <option>24</option>
                                                <option>25</option>
                                                <option>26</option>
                                                <option>27</option>
                                                <option>28</option>
                                                <option>29</option>
                                                <option>30</option>
                                                <option>31</option>
                                                <option>32</option>
                                                <option>33</option>
                                                <option>34</option>
                                                <option>35</option>
                                                <option>36</option>
                                                <option>37</option>
                                                <option>38</option>
                                                <option>39</option>
                                                <option>40</option>
                                                <option>41</option>
                                                <option>42</option>
                                                <option>43</option>
                                                <option>44</option>
                                                <option>45</option>
                                                <option>46</option>
                                                <option>47</option>
                                                <option>48</option>
                                                <option>49</option>
                                                <option>50</option>
                                                <option>51</option>
                                                <option>52</option>
                                                <option>53</option>
                                                <option>54</option>
                                                <option>55</option>
                                                <option>56</option>
                                                <option>57</option>
                                                <option>58</option>
                                                <option>59</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label> </label>
                                        <label class="">
                                            <input type="checkbox" style="position: absolute; opacity: 0;">
                                                Break Y/N
                                            </label>
                                        </div>
                                        <div class="form-group">
                                            <label>Remarks</label>
                                            <textarea class="form-control input-sm" rows="2"></textarea>
                                        </div>
                                        </div>
                            </div>
                                        
                                        
                                        
                        
                        <div class="modal-footer clearfix">
                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                            <button type="submit" class="btn btn-primary pull-left"><i class="fa fa-save"></i> Save</button>
                        </div>
                        
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

        
        
        
        



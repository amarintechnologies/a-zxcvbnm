<!DOCTYPE html>
<html class="bg-black">
    <head>
        <meta charset="UTF-8">
        <title>ischool | Log in</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <link href="/school/resources/assect/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="/school/resources/assect/font-awesome-4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="/school/resources/assect/css/AdminLTE.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="bg-black login-bg-img">

        <div class="form-box" id="login-box" style="margin: 10% auto;">
            <div class="header">Sign In</div>
            <form action="/school/dashboard.jsp" method="post">
                <div class="body bg-gray">
                    <div class="form-group">
                        <input type="text" name="userid" class="form-control" placeholder="User ID"/>
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" class="form-control" placeholder="Password"/>
                    </div>
                    <div class="form-group">
                        <input type="checkbox" name="remember_me"/> Remember me
                    </div>
                </div>
                <div class="footer">
                    <button type="submit" onclick=signmein(); class="btn bg-olive btn-block">Sign me in</button>

                    <p><a href="#">I forgot my password</a></p>

                    <a href="register.html" class="text-center">Register a new membership</a>
                </div>
            </form>

           
        </div>

        <script src="/school/resources/assect/drag_calendar/fullcalendar-2.3.0/lib/jquery.min.js"></script>
        <script src="/school/resources/assect/js/bootstrap.min.js" type="text/javascript"></script>
        
        
        <script type="text/javascript">
        
       function signmein(){
    	   
    	   alert("test");
    	   
    	   $(location).Attr('href','/school/dashbord' );
    	   
       }
        
        
        </script>
        

    </body>
</html>






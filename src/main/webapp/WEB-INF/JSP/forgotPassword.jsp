<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"  %>

<%
    		String emsg = (String)request.getAttribute("emsg");
%>

<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Forgot Password Page</title>
    <link href="/resources/bootstrap-5.2.2-dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link href="/resources/style.css" rel="stylesheet" type="text/css">
  </head>
  <body>
    <div class="container-fluid" style="margin:0%;padding:0%;">
    <div class="row" style="margin:0%;padding:0%;">
      <div class="col-lg-8" style="margin:0%;padding:0%;">
        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
          <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
          </div>
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="/resources/Assets/Grow-Trees-On-the-path-to-environment-sustainability-login.png" class="d-block w-100" style="max-height: 100vh;" alt="...">
              <div class="carousel-caption d-none d-md-block text-start">
                <h4 class="fs-3">Sed ut perspiciatis unde omnis iste natus voluptatem.</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
              </div>
            </div>
            <div class="carousel-item">
              <img src="/resources/Assets/Grow-Trees-On-the-path-to-environment-sustainability-login.png" class="d-block w-100" style="max-height: 100vh;" alt="...">
              <div class="carousel-caption d-none d-md-block text-start">
                <h4 class="fs-3">Sed ut perspiciatis unde omnis iste natus voluptatem.</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
              </div>
            </div>
            <div class="carousel-item">
              <img src="/resources/Assets/Grow-Trees-On-the-path-to-environment-sustainability-login.png" class="d-block w-100" style="max-height: 100vh;" alt="...">
              <div class="carousel-caption d-none d-md-block text-start">
                <h4 class="fs-3">Sed ut perspiciatis unde omnis iste natus voluptatem.</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
              </div>
            </div>
            <div class="carousel-item">
              <img src="/resources/Assets/Grow-Trees-On-the-path-to-environment-sustainability-login.png" class="d-block w-100" style="max-height: 100vh;" alt="...">
              <div class="carousel-caption d-none d-md-block text-start">
                <h4 class="fs-3">Sed ut perspiciatis unde omnis iste natus voluptatem.</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      
      <div class="col-lg-4 p-4" style="margin:0%;padding:0%;">
        <div style="height: 90%;" class="align-items-center justify-content-center d-flex">
          <form action="fpemail" class="row g-3" method="post">
              <div class="col-12">
              	<%
            		if(emsg != null){
            	%>
            		<div style="font-size:14px;color:red;" class="text-center"><%=emsg%></div>
            	<%
            		}
            	%>
                <h5 class="text-center ">Forgot Password</h5>
                <div class="text-center text-muted">Enter your email address you've using for your account below and we will send you a password reset link</div>
              </div>
              <div class="col-12">
                <label for="email" class="form-label mb-0">Email Address</label><br>
                <input type="email" name="email" required="" class="form-control" placeholder="Enter your email address...">
              </div>
              <div class="col-12 mt-2">
                  <input class="btn btn-outline-warning w-100 mt-4 submit-button" type="submit" value="Reset my Password">
              </div>
              <div class="col-12 mt-0">
                  <div class="mt-3 text-center"><a class="link-1" href="index">Login</a></div>
              </div>
          </form>
        </div>
        <div style="height: 10%;" class="align-items-center justify-content-center d-flex">
          <div class="text-center privacyPolicy"><a class="link-1" href="#">Privacy Policy</a></div>
        </div>
      </div>
    </div>
    </div>
  
    <script src="/resources/bootstrap-5.2.2-dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  </body>
</html>
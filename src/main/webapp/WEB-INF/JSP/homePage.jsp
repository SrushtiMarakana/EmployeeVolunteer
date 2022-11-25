<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"  %>

<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Home Page</title>
    <link href="/resources/bootstrap-5.2.2-dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css" rel="stylesheet">
    <link href="/resources/style.css" rel="stylesheet" type="text/css">
  </head>
  <body>
    <div class="container">
    <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
            <button class="navbar-toggler navbox1" type="button" data-bs-toggle="offcanvas" 
            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
            aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

              <div class="offcanvas offcanvas-start" tabindex="-1" data-bs-scroll="true"
              id="navbarSupportedContent" aria-labelledby="offcanvasExampleLabel">
                <div class="offcanvas-header">
                  <h5 class="offcanvas-title" id="offcanvasExampleLabel"></h5>
                  <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>

                <div class="offcanvas-body">
                  <div class="navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 link-padding1">
            
                    <li class="nav-item link-padding">
                      <a class="nav-link" href="#">Stories</a>
                    </li>

                    <li class="nav-item dropdown link-padding">
                        <a class="nav-link dropdown-toggle policy" href="#" role="button" data-bs-toggle="dropdown" id="navbarDropdownMenuLink" aria-expanded="true">
                        Policy
                    </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                  <li><a class="dropdown-item" href="#">Volunteering</a></li>
                  <li><a class="dropdown-item" href="#">Sponsored</a></li>
                </ul>
              </li>
            </ul>
          </div>
          </div>
          </div>
          <div>
          <!-- <a href="#" class="btn btn-outline-warning btn-sm rounded-pill newMissionButton" role="button">Submit New Mission</a>&nbsp;&nbsp;&nbsp;   -->
          <img src="/resources/Assets/volunteer4.png" class="rounded-circle" height="40px" width="40px" alt="...">&nbsp;
            <span data-bs-toggle="dropdown" class="dropdown-toggle" aria-expanded="false">
              Srushti Marakana
            </span>
            <ul class="dropdown-menu dropdown-menu-end">
              <li><a class="dropdown-item" href="#">Dashboard</a></li>
              <li><a class="dropdown-item" href="#">My Account</a></li>
              <li><a class="dropdown-item" href="#">Help Center</a></li>
              <li><a class="dropdown-item" href="#">Volunteering Timesheet</a></li>
              <li><a class="dropdown-item" href="#">Logout</a></li>
            </ul>
          </div>
        </div>
      </nav>
    </div>
    <hr>
    <div class="container">
        <nav class="navbar navbar2 navbar-expand-lg">
            <div class="container-fluid">
              <div>
                <img src="/resources/Assets/search.png" alt="..." height="18px" width="18px">
                <input type="search" class="form-control search mt-0" placeholder="Search Mission " aria-label="Search" />
              </div>
              <button class="navbar-toggler navbox1" type="button" data-bs-toggle="offcanvas" data-bs-target="#navbarsecond" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <i class="bi bi-sliders2-vertical"></i>
              </button>

              <div class="offcanvas offcanvas-start" tabindex="-1" data-bs-scroll="true"
              id="navbarsecond" aria-labelledby="offcanvasExampleLabel">
                <div class="offcanvas-header">
                  <h5 class="offcanvas-title" id="offcanvasExampleLabel"></h5>
                  <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>

                <div class="offcanvas-body">
                <div class="navbar-collapse" id="navbarsecond">
                <div class="vr"></div>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 navbarsecondcontent w-100" style="float: right;">
                  <li class="nav-item dropdown" style="width: 100%;">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Country
                    </a>
                    <ul class="dropdown-menu scrollable-menu">
                      <li><a class="dropdown-item" href="#">Afghanistan</a></li>
                      <li><a class="dropdown-item" href="#">Albania</a></li>
                      <li><a class="dropdown-item" href="#">Algeria</a></li>
                      <li><a class="dropdown-item" href="#">Barbados</a></li>
                      <li><a class="dropdown-item" href="#">Belarus</a></li>
                      <li><a class="dropdown-item" href="#">Belgium</a></li>
                      <li><a class="dropdown-item" href="#">Canada</a></li>
                      <li><a class="dropdown-item" href="#">India</a></li>
                      <li><a class="dropdown-item" href="#">Ireland</a></li>
                      <li><a class="dropdown-item" href="#">Italy</a></li>
                      <li><a class="dropdown-item" href="#">Switzerland</a></li>
                    </ul>
                  </li>
                </ul>
                <div class="vr"></div>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 navbarsecondcontent w-100" style="float: right;">
                  <li class="nav-item dropdown" style="width: 100%;">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      City
                    </a>
                    <ul class="dropdown-menu scrollable-menu">
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Tirana</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Durres</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Vlore</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Elbasan</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Shkoder</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Fier</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Toronto</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Barcelona</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; London</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Cape Town</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Paris</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; New York</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Sydney</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Berlin</label></a></li>
                    </ul>
                  </li>
                </ul>
                <div class="vr"></div>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 navbarsecondcontent w-100" style="float: right;">
                  <li class="nav-item dropdown" style="width: 100%;">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Theme
                    </a>
                    <ul class="dropdown-menu scrollable-menu">
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Education</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Children</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Health</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Animals</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Nutrition</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Environment</label></a></li>
                    </ul>
                  </li>
                </ul>
                <div class="vr"></div>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0 navbarsecondcontent w-100" style="float: right;">
                  <li class="nav-item dropdown" style="width: 100%;">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Skills
                    </a>
                    <ul class="dropdown-menu scrollable-menu">
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Anthropology</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Archeolgy</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Astronomy</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Computer Science</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; History</label></a></li>
                      <li><a class="dropdown-item" href="#"><label><input type="checkbox">&nbsp; Reserch</label></a></li>
                    </ul>
                  </li>
                </ul>
                <div class="vr"></div>
              </div>
            </div>
            </div>
            </div>
          </nav>
    </div>
    <hr style="height:2px; background:black;">
    <div class="container">
      <div class="closebutton">
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Tree Plantation &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Canada &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Toronto &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Montreal &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Environment &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Nutrition &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Anthropology &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Environmental Science &nbsp;<img src="/resources/Assets/cancel.png" alt="..."></a></span>
        <span><a href="#" class="btn btn-outline-secondary btn-sm rounded-pill closebutton1" role="button">Clear all </a></span>
      </div>
    </div>

    <div class="container exploreMission">
      <span>
        <span class="text-muted" style="font-size: 20px;">Explore</span>&nbsp;<span style="font-size: 22px;">72 Mission</span>
      </span>
      <span class="sortby" style="float: right;">
        <span class="dropdown-toggle sortbybutton" data-bs-toggle="dropdown" aria-expanded="false">
          Sort by
        </span>
        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdownMenuLink">
          <li><a class="dropdown-item" href="#">Newest</a></li>
          <li><a class="dropdown-item" href="#">Oldest</a></li>
          <li><a class="dropdown-item" href="#">Lowest available seats</a></li>
          <li><a class="dropdown-item" href="#">Highest available seats</a></li>
          <li><a class="dropdown-item" href="#">Sort by my favourite</a></li>
          <li><a class="dropdown-item" href="#">Sort by deadline</a></li>
        </ul>
        <img src="/resources/Assets/grid.png" style="background-color:#d9d9d9;" alt="...">&nbsp;&nbsp;
        <img src="/resources/Assets/list.png" alt="...">
      </span>
    </div>

    <div class="container">
      <div class="row">

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Grow-Trees-On-the-path-to-environment-sustainability.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Toronto</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Environment
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Grow Trees – On the path to environment sustainability</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">Tree Canada</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                  From 10/01/2019 until 25/02/2019
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/Seats-left.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">10</p>
                      <p class="cardcontainer13">Seats left</p>
                  </div>
              </div>
              </div>
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer14" src="/resources/Assets/deadline.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">09/01/2019</p>
                      <p class="cardcontainer13">deadline</p>
                  </div>
              </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Education-Supplies-for-Every--Pair-of-Shoes-Sold.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Melbourne</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Children
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Education Supplies for Every Pair of Shoes Sold</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">Australian Paradise</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                  From 10/01/2019 until 25/02/2019
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/Already-volunteered.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">250</p>
                      <p class="cardcontainer13">Already volunteered</p>
                  </div>
               </div>
              </div>

              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer14" src="/resources/Assets/deadline.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">09/01/2019</p>
                      <p class="cardcontainer13">deadline</p>
                  </div>
              </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Nourish-the-Children-in--African-country.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Barcelona</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Nutrition
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Nourish the Children in African country</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">The Hunger</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                Ongoing Opportunity
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/Seats-left.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">10</p>
                      <p class="cardcontainer13">Seats left</p>
                  </div>
              </div>
              </div>
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer14" src="/resources/Assets/deadline.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">09/01/2019</p>
                      <p class="cardcontainer13">deadline</p>
                  </div>
              </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/CSR-initiative-stands-for-Coffee--and-Farmer-Equity.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>London</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Environment
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Grow Trees – On the path to environment sustainability</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">CSE Network</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                Ongoing Opportunity
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/Already-volunteered.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">250</p>
                      <p class="cardcontainer13">Already volunteered</p>
                  </div>
               </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Animal-welfare-&-save-birds-campaign.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Cape Town</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Animals
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Animal welfare & save birds campaign</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">JR Foundation</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                  Plant 10,000 Trees
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/Seats-left.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">10</p>
                      <p class="cardcontainer13">Seats-left</p>
                  </div>
              </div>
              </div>
              <div class="col-6">
                <div class="cardcontainer15">
                  <img class="cardcontainer10" src="/resources/Assets/achieved.png" alt="Error">
                  <div class="cardcontainer11">
                    <div class="progress cardcontainer12" style="width:100px;height: 8px;">
                    <div class="progress-bar bg-warning" role="progressbar"
                      aria-label="Warning example" style="width: 75%"
                      aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">
                    </div>
                    </div>
                      <p class="cardcontainer13">8000 archieved</p>
                  </div>
              </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Plantation-and-Afforestation-programme.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Paris</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Health
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Plantation and Afforestation programme</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">Amaze Doctors</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                  Plant 10,000 Trees
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/achieved.png" alt="Error">
                  <div class="cardcontainer11">
                    <div class="progress cardcontainer12" style="width:170px;height: 8px;">
                    <div class="progress-bar bg-warning" role="progressbar"
                      aria-label="Warning example" style="width: 75%"
                      aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">
                    </div>
                    </div>
                      <p class="cardcontainer13">8000 archieved</p>
                  </div>
              </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Grow-Trees-On-the-path-to-environment-sustainability.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Toronto</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Environment
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Grow Trees – On the path to environment sustainability</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">Tree Canada</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                View details
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Education-Supplies-for-Every--Pair-of-Shoes-Sold.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Melbourne</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Children
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Education Supplies for Every Pair of Shoes Sold</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">Australian Paradise</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                  From 10/01/2019 until 25/02/2019
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/Already-volunteered.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">250</p>
                      <p class="cardcontainer13">Already volunteered</p>
                  </div>
               </div>
              </div>

              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer14" src="/resources/Assets/deadline.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">09/01/2019</p>
                      <p class="cardcontainer13">deadline</p>
                  </div>
              </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

        <div class="col-md-6 col-lg-4" style="padding: 12px 15px 12px 15px;">
          <div class="card h-100">
            <div class="cardcontainer1">
              <img src="/resources/Assets/Nourish-the-Children-in--African-country.png" class="card-img-top" alt="...">
              <button class="cardcontainer2">
                <img src="/resources/Assets/pin.png" alt="Error" style="width:11px;">
                <span>Barcelona</span>
              </button>
              <button class="cardcontainer3">
                <img src="/resources/Assets/heart.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer4">
                <img src="/resources/Assets/user.png" alt="Error" style="width:11px; padding-bottom: 6px;">
              </button>
              <button class="cardcontainer5 text-muted">
                Nutrition
              </button>
            </div>
            <div class="card-body" style="position: relative;">
              <h5 class="card-title">Nourish the Children in African country</h5>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore...</p>
              <div style="display:flex;align-items:baseline;">
                <p class="cardcontainer6">The Hunger</p>
                <div style="margin-left: auto;">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/selected-star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                    <img class="cardcontainer7" src="/resources/Assets/star.png" alt="Error">
                </div>
              </div>
            </div>
            <hr style="margin-top:10px;margin-bottom: 12px;">
            <div style="position:relative;bottom:13px;margin-bottom: 5px;">
              <button class="cardcontainer8">
                Ongoing Opportunity
              </button>
            </div>
            <div class="row" style="margin:10px;">
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer10" src="/resources/Assets/Seats-left.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">10</p>
                      <p class="cardcontainer13">Seats left</p>
                  </div>
              </div>
              </div>
              <div class="col-6">
                <div class="cardcontainer9">
                  <img class="cardcontainer14" src="/resources/Assets/deadline.png" alt="Error">
                  <div class="cardcontainer11">
                      <p class="cardcontainer12">09/01/2019</p>
                      <p class="cardcontainer13">deadline</p>
                  </div>
              </div>
              </div>
            </div>
            <hr>
            <div class="card-body" style="text-align:center;">
              <button type="submit" class="rounded-pill btn btn-outline-warning" style="width:auto;font-size: 16px; padding-left: 20px; padding-right: 20px;">
                Apply
                <img src="/resources/Assets/right-arrow.png" alt="Error" height="10px" width="10px">
              </button>
            </div>
          </div>
        </div>

      </div>

    </div>

    <div class="container">
      <nav>
        <ul class="pagination justify-content-center">
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
            </a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&lsaquo;</span>
            </a>
          </li>
          <li class="page-item"><a class="page-link" href="#">1</a></li>
          <li class="page-item"><a class="page-link" href="#">2</a></li>
          <li class="page-item"><a class="page-link" href="#">3</a></li>
          <li class="page-item"><a class="page-link" href="#">4</a></li>
          <li class="page-item"><a class="page-link" href="#">5</a></li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&rsaquo;</span>
            </a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav>
    </div>
    <hr>
    <div class="container">
      <div class="PrivacyPolicy">
        <a class="link-1" href="#">Privacy Policy</a>
      </div>
    </div>
    <script src="bootstrap-5.2.2-dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  </body>
</html>
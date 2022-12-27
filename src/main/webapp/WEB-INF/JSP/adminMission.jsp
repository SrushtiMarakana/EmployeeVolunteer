<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"  %>

<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Mission Listing</title>
    <link href="/resources/bootstrap-5.2.2-dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.datatables.net/1.13.1/css/dataTables.bootstrap5.min.css" rel="stylesheet">
    <link href="/resources/style.css" rel="stylesheet" type="text/css">
  </head>
  <body>
    <div class="container-fluid" style="margin: 0%;padding:0%;">
        <div class="row" style="padding:0%;margin:0%;">
          <div class="col-2 col-sm-3"  style="background-color:#f88634;min-height: 100vh;height:auto;padding: 0%;margin: 0%;">
            <div class="adminStyle1">
              <div class="adminStyle2">NAVIGATION</div>
              <div class="adminStyle3">
                <div style="padding-bottom: 5px;">
                  <a href="adminUser" class="adminStyle4"><i class="bi bi-person-fill"></i><span class="adminStyle5">User</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminCMS" class="adminStyle4"><i class="bi bi-file-earmark-text-fill"></i><span class="adminStyle5">CMS Page</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminMission" class="adminStyle6"><i class="bi bi-bullseye"></i><span class="adminStyle5">Mission</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminMissionTheme" class="adminStyle4"><i class="bi bi-columns-gap"></i><span class="adminStyle5">Mission Theme</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminMissionSkill" class="adminStyle4"><i class="bi bi-tools"></i><span class="adminStyle5">Mission Skills</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminMissionApplication.html" class="adminStyle4"><i class="bi bi-folder-fill"></i><span class="adminStyle5">Mission Application</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminStory.html" class="adminStyle4"><i class="bi bi-bookmark-star-fill"></i><span class="adminStyle5">Story</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminBannerManagement.html" class="adminStyle4"><i class="bi bi-clipboard2-fill"></i><span class="adminStyle5">Banner Management</span></a>
                </div>
                
              </div>
            </div>
          </div>
          <div class="col-10 col-sm-9" style="padding: 0%;">
            <div class="shadow-sm p-2 ps-4 pe-4 mb-sm-4 mb-1 bg-body">
              <div class="adminStyle8">
                <div class="adminStyle7">Tuesday, November 3, 2022, 10:06 AM</div>
                <div>
                  <img src="/resources/Assets/volunteer4.png" class="rounded-circle" height="40px" width="40px" alt="...">&nbsp;
                  <span data-bs-toggle="dropdown" class="dropdown-toggle" aria-expanded="false">
                     Srushti Marakana
                  </span>
                  <ul class="dropdown-menu dropdown-menu-end">
                    <li><a class="dropdown-item" href="#">My Account</a></li>
                    <li><a class="dropdown-item" href="#">Logout</a></li>
                  </ul>
                </div>
              </div>
            </div>
            
            <div class="adminStyle9">
              <div class="adminStyle10">
                Mission
              </div>
            </div>
            <hr class="adminStyle11" style="margin-top: 5px;margin-bottom:20px;">
            
            <div class="adminStyle11">
              <div class="text-end">
                <a href="adminAddMission" class="adminStyle12 rounded-pill btn btn-outline-warning" style="box-shadow: none;">
                  <span style="font-size: 20px;">+</span> Add
                </a>
              </div>
              <div class="table-responsive-lg">
                <table id="mytable" class="table adminStyle13">
                  <thead class="table-light">
                    <tr>
                      <th style="font-weight: 500;">Mission Title</th>
                      <th style="font-weight: 500;">Mission type</th>
                      <th style="font-weight: 500;">Start Date</th>
                      <th style="font-weight: 500;">End Date</th>
                      <th style="font-weight: 500;">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>Desktop publishing software</td>
                      <td>Time</td>
                      <td>05/02/2019</td>
                      <td>15/02/2019</td>
                      <td>
                        <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                      </td>
                    </tr>
                    <tr>
                        <td>Various versions have evolved over</td>
                        <td>Goal</td>
                        <td>10/02/2019</td>
                        <td>20/02/2020</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>A Latin professor at Hampden-Sydney</td>
                        <td>Time</td>
                        <td>04/06/2020</td>
                        <td>24/06/2020</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Suffered alteration in some form</td>
                        <td>Goal</td>
                        <td>01/08/2020</td>
                        <td>08/08/2020</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Et harum quidem rerum facilis est</td>
                        <td>Goal</td>
                        <td>02/06/2021</td>
                        <td>09/06/2021</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Maiores alias consequatur aut</td>
                        <td>Time</td>
                        <td>12/06/2021</td>
                        <td>19/06/2021</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Our power of choice is untrammelled</td>
                        <td>Goal</td>
                        <td>03/06/2021</td>
                        <td>05/06/2021</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Beguiled and demoralized by the charms</td>
                        <td>Time</td>
                        <td>30/07/2021</td>
                        <td>05/08/2021</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Untrammelled and when nothing prevents</td>
                        <td>Goal</td>
                        <td>05/08/2021</td>
                        <td>12/08/2021</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Oluptates repudiandae sint et molestiae</td>
                        <td>Goal</td>
                        <td>02/12/2021</td>
                        <td>12/12/2021</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>Desktop publishing software</td>
                        <td>Time</td>
                        <td>05/02/2019</td>
                        <td>15/02/2019</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                      </tr>
                      <tr>
                          <td>Various versions have evolved over</td>
                          <td>Goal</td>
                          <td>10/02/2019</td>
                          <td>20/02/2020</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>A Latin professor at Hampden-Sydney</td>
                          <td>Time</td>
                          <td>04/06/2020</td>
                          <td>24/06/2020</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Suffered alteration in some form</td>
                          <td>Goal</td>
                          <td>01/08/2020</td>
                          <td>08/08/2020</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Et harum quidem rerum facilis est</td>
                          <td>Goal</td>
                          <td>02/06/2021</td>
                          <td>09/06/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Maiores alias consequatur aut</td>
                          <td>Time</td>
                          <td>12/06/2021</td>
                          <td>19/06/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Our power of choice is untrammelled</td>
                          <td>Goal</td>
                          <td>03/06/2021</td>
                          <td>05/06/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Beguiled and demoralized by the charms</td>
                          <td>Time</td>
                          <td>30/07/2021</td>
                          <td>05/08/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Untrammelled and when nothing prevents</td>
                          <td>Goal</td>
                          <td>05/08/2021</td>
                          <td>12/08/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Oluptates repudiandae sint et molestiae</td>
                          <td>Goal</td>
                          <td>02/12/2021</td>
                          <td>12/12/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                        <td>Desktop publishing software</td>
                        <td>Time</td>
                        <td>05/02/2019</td>
                        <td>15/02/2019</td>
                        <td>
                          <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                        </td>
                      </tr>
                      <tr>
                          <td>Various versions have evolved over</td>
                          <td>Goal</td>
                          <td>10/02/2019</td>
                          <td>20/02/2020</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>A Latin professor at Hampden-Sydney</td>
                          <td>Time</td>
                          <td>04/06/2020</td>
                          <td>24/06/2020</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Suffered alteration in some form</td>
                          <td>Goal</td>
                          <td>01/08/2020</td>
                          <td>08/08/2020</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Untrammelled and when nothing prevents</td>
                          <td>Goal</td>
                          <td>05/08/2021</td>
                          <td>12/08/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                      <tr>
                          <td>Oluptates repudiandae sint et molestiae</td>
                          <td>Goal</td>
                          <td>02/12/2021</td>
                          <td>12/12/2021</td>
                          <td>
                            <a href="#"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete" data-bs-toggle="modal"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                          </td>
                      </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
    </div>

    <!--Confirm Delete-->
    <div class="modal modalConfirmDelete fade" id="ConfirmDelete" aria-hidden="true" aria-labelledby="ConfirmDeleteLabel" tabindex="-1">
        <div class="modal-dialog" style="margin-top: 150px;">
          <div class="modal-content" style="padding: 20px;">
            <div class="modal-header">
              <h6 class="modal-title fs-0 text-muted" id="ConfirmDeleteLabel" style="font-size: 18px;">Confirm Delete</h6>
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="#" method="">
            <div class="modal-body">
              <div class="row">
                <div class="col-12">
                  <div style="font-size: 18px;">Are you sure you want to delete this item?</div>
                </div>
                <div class="text-center" style="margin-top: 30px;">
                    <button type="submit" class="form-control shareStoryStyle2 rounded-pill btn btn-outline-dark" style="width: auto;box-shadow: none;">Cancel</button>
                    <button type="submit" class="form-control  shareStoryStyle2 rounded-pill btn btn-outline-warning" style="width: auto; box-shadow: none;">Delete</button>
                </div>
              </div>
            </div>
            </form>
          </div>
        </div>
      </div>
    
    <script src="/resources/bootstrap-5.2.2-dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.13.1/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.13.1/js/dataTables.bootstrap5.min.js"></script>
    <script>
      $(document).ready(function () {
        $('#mytable').DataTable();
      });
    </script>
  </body>
</html>
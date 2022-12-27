<%@ page import ="java.util.List"%>
<%@ page import="com.tatvasoft.volunteer.model.Mission_Theme"%>
<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"  %>

<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Mission Theme</title>
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
                  <a href="adminMission" class="adminStyle4"><i class="bi bi-bullseye"></i><span class="adminStyle5">Mission</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminMissionTheme" class="adminStyle6"><i class="bi bi-columns-gap"></i><span class="adminStyle5">Mission Theme</span></a>
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
                Mission Theme
              </div>
            </div>
            <hr class="adminStyle11" style="margin-top: 5px;margin-bottom:20px;">
            
            <div class="adminStyle11">
              <div class="text-end">
                <a href="adminAddMissionTheme" class="adminStyle12 rounded-pill btn btn-outline-warning" style="box-shadow: none;">
                  <span style="font-size: 20px;">+</span> Add
                </a>
              </div>
              <div class="table-responsive-lg">
                <table id="mytable" class="table adminStyle13">
                  <thead class="table-light">
                    <tr>
                      <th style="font-weight: 500;">Title</th>
                      <th style="font-weight: 500;">Status</th>
                      <th style="font-weight: 500;">Action</th>
                    </tr>
                  </thead>
                  <tbody>
<%
				@SuppressWarnings("unchecked")
    			List<Mission_Theme> missionTheme = (List<Mission_Theme>)request.getAttribute("missionTheme");
    			for(Mission_Theme mtheme : missionTheme){
    				String status = "Active"; 
    				if(mtheme.getStatus() != true){
    					status = "In-Active";
    				}
    				
%>
                    <tr>
                      <td><%=mtheme.getMission_theme_title()%></td>
                      <td style="color:#14c506;"><%=status%></td>
                      <td>
                        <a href="adminEditMissionTheme/<%=mtheme.getMission_theme_id()%>"><img src="/resources/Assets/edit.jpg" alt="..." height="17px" width="17px"></a>&nbsp;&nbsp;&nbsp;<a href="#ConfirmDelete_<%=mtheme.getMission_theme_id()%>" data-bs-toggle="modal" aria-controls="ConfirmDelete"><img src="/resources/Assets/bin.png" alt="..." height="17px"></a>
                      </td>
                    </tr>
<%
    			}
%>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
    </div>
<%
    			for(Mission_Theme mtheme : missionTheme){
%>
    <!--Confirm Delete-->
    <div class="modal modalConfirmDelete fade" id="ConfirmDelete_<%=mtheme.getMission_theme_id()%>" aria-hidden="true" aria-labelledby="ConfirmDeleteLabel" tabindex="-1">
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
                  <input type="hidden" name="MissionThemeId" value="<%=mtheme.getMission_theme_id()%>">
                  <div style="font-size: 18px;">Are you sure you want to delete this item?<%=mtheme.getMission_theme_id()%></div>
                </div>
                <div class="text-center" style="margin-top: 30px;">
                    <input data-bs-dismiss="modal" aria-label="Close" class="form-control shareStoryStyle2 rounded-pill btn btn-outline-dark"  type="reset" name="reset" style="width: auto;box-shadow: none;" value="Cancel">&nbsp;&nbsp;
                    <input class="form-control shareStoryStyle2 rounded-pill btn btn-outline-warning w-auto"  type="submit" name="submit" style="box-shadow: none;" value="Delete">
                </div>
              </div>
            </div>
            </form>
          </div>
        </div>
      </div>
<%
    			}
%>   
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
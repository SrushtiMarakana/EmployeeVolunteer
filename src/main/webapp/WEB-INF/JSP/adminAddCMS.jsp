<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"  %>

<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Add CMS Page</title>
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
                  <a href="adminCMS" class="adminStyle6"><i class="bi bi-file-earmark-text-fill"></i><span class="adminStyle5">CMS Page</span></a>
                </div>
                <div style="padding-bottom: 5px;">
                  <a href="adminMission" class="adminStyle4"><i class="bi bi-bullseye"></i><span class="adminStyle5">Mission</span></a>
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
                Add
              </div>
            </div>
            <hr class="adminStyle11" style="margin-top: 5px;margin-bottom:20px;">
            
            <div class="adminStyle11">
             <div>
                <form action="addCMS" class="row g-3" method="Post">
                    <div class="col-12">
                      <label for="title" class="form-label mb-0">Title</label>
                      <input type="text" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter CMS Page Title" name="title" required>
                    </div>
                    <div class="col-12">
                        <label for="Description" class="form-label">Description</label>
          
                        <textarea class="form-control admin-input" style="box-shadow: none;" name="Description" id="editor" placeholder="Enter CMS Page Description" rows="3"></textarea>
                        
                        <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/6/tinymce.min.js" referrerpolicy="origin"></script>
                        <script>
                          tinymce.init({
                            selector: "#editor",
                            menubar: false,
                            statusbar: false,
                            plugins:"autoresize anchor autolink charmap code codesample directionality fullpage help hr image imagetools insertdatetime link lists media nonbreaking pagebreak preview print searchreplace table template textpattern toc visualblocks visualchars",
                            toolbar:"bold italic strikethrough subscript superscript removeformat bullist numlist ",
                            skin: "bootstrap",
                            toolbar_drawer: "floating",
                            min_height: 200,
                            setup: (editor) => {
                              editor.on("focus", () => {
                                (editor.getContainer().style.boxShadow =""),
                                (editor.getContainer().style.borderColor = "var(--bs-link-color)");
                                (editor.getContainer().style.borderWidth = "1px");
                              });
                              editor.on("blur", () => {
                                (editor.getContainer().style.boxShadow = ""),
                                (editor.getContainer().style.borderColor = "#ced4da");
                                (editor.getContainer().style.borderWidth = "1px");
                              });
                            }
                          });
                        </script>
                      </div>
                    <div class="col-12">
                      <label for="slug" class="form-label mb-0">Slug</label>
                      <input type="text" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter slug" name="slug">
                    </div>
                    <div class="col-12">
                        <label for="status" class="form-label mb-0">Status</label>
                        <select class="form-select form-control admin-input" name="status" style="box-shadow: none;" aria-label="Default select example">
                          <option value="">Select status</option>
                          <option value="1">Active</option>
                          <option value="0">In Active</option>
                        </select>
                      </div>
                    <div class="col-12"  style="margin-top: 30px;">
                        <div class="text-end">
                        	<a href="adminCMS" class="shareStoryStyle2 rounded-pill btn btn-outline-dark" style="width: auto;box-shadow: none;">Cancel</a>&nbsp;&nbsp;
                            <input class="shareStoryStyle2 rounded-pill btn btn-outline-warning w-auto"  type="submit" name="submit" style="box-shadow: none;" value="Save">
                        </div>
                      </div>
                </form>
             </div>
            </div>
                
          </div>

        </div>
    </div>
    
    <script src="/resources/bootstrap-5.2.2-dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  </body>
</html>
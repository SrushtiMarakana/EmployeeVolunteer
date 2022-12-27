<%@ page import ="java.util.List"%>
<%@ page import="com.tatvasoft.volunteer.model.Country"%>
<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"  %>

<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Edit Mission</title>
    <link href="/resources/bootstrap-5.2.2-dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css" rel="stylesheet" type="text/css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="https://cdn.datatables.net/1.13.1/css/dataTables.bootstrap5.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.18/css/bootstrap-select.min.css" rel="stylesheet" type="text/css">
    <link href="/resources/style.css" rel="stylesheet" type="text/css">
    <script src="/resources/jquery-3.6.1.js" type="text/javascript" ></script>
    <script type="text/javascript" src="/resources/script.js"></script>
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
                Add
              </div>
            </div>
            <hr class="adminStyle11" style="margin-top: 5px;margin-bottom:20px;">
            
            <div class="adminStyle11">
             <div>
                <form action="" class="row g-3" method="">
                  <div class="col-12">
                    <label for="MissionTitle" class="form-label mb-0">Mission Title</label>
                    <input type="text" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter your Mission Title" name="MissionTitle" required>
                  </div>
                  <div class="col-12">
                    <label for="MissionShortDescription" class="form-label mb-0">Mission Short-Description</label>
                    <textarea class="form-control admin-input" style="box-shadow: none;" placeholder="Enter your Mission Short-Description..." name="MissionShortDescription" rows="2"></textarea>
                  </div>
                  <div class="col-12">
                    <label for="MissionDescription" class="form-label mb-0">Mission Description</label>
                    <textarea class="form-control admin-input" style="box-shadow: none;" placeholder="Enter your Mission Description..." name="MissionDescription" rows="3"></textarea>
                  </div>
                  <div class="col-lg-6">
                		<label for="Country" class="form-label mb-0">Country</label>
                		<select class="form-select form-control admin-input" name="Country" id="country" style="box-shadow: none;" aria-label="Default select example" required>
                  			<option value="">Select your country</option>
<%
				@SuppressWarnings("unchecked")
    			List<Country> country = (List<Country>)request.getAttribute("country");
    			for(Country c : country){
    				
%>
                  			<option value="<%=c.getCountry_id()%>"><%=c.getName()%></option>
<%
    			}
%>
                		</select>
              		</div>
              		<div class="col-lg-6">
                		<label for="City" class="form-label mb-0">City</label>
                		<select class="form-select form-control admin-input" name="City" id="city" style="box-shadow: none;" aria-label="Default select example" required>
                  			<option value="">Select your city</option>
                		</select>
              		</div>
                  <div class="col-12">
                    <label for="MissionOrganizationName" class="form-label mb-0">Mission Organization Name</label>
                    <input type="text" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter your Mission Organization Name" name="MissionOrganizationName">
                  </div>
                  <div class="col-12">
                    <label for="MissionOrganizationDetail" class="form-label mb-0">Mission Organization Detail</label>
                    <textarea class="form-control admin-input" style="box-shadow: none;" placeholder="Enter your Mission Organization Detail..." name="MissionOrganizationDetail" rows="3"></textarea>
                  </div>
                  <div class="col-12">
                    <label for="Image" class="form-label mb-0">Mission Image</label><br>
                    <input type="file" name="Image"  class="form-control admin-input" accept="image/jpeg,image/png, image/jpg" style="box-shadow: none;" required>
                    <span class="text-muted">(Only jpg/jpeg & png files are allowed)</span>
                  </div>
                  <div class="col-lg-6">
                    <label for="MissionStartDate" class="form-label mb-0">Mission Start Date</label>
                    <input type="date" class="form-control admin-input" style="box-shadow: none;" name="MissionStartDate">
                  </div>
                  <div class="col-lg-6">
                    <label for="MissionEndDate" class="form-label mb-0">Mission End Date</label>
                    <input type="date" class="form-control admin-input" style="box-shadow: none;" name="MissionEndDate">
                  </div>
                  <div class="col-12">
                        <label for="MissionType" class="form-label mb-0">Select Mission Type</label>
                        <select id="MissionType" class="form-select form-control admin-input" name="MissionType" style="box-shadow: none;" aria-label="Default select example" required>
                          <option value="">Select Mission Type</option>
                          <option value="Time">Time</option>
                          <option value="Goal">Goal</option>
                        </select>
                  </div>
                  <div class="row" id="timeMission" style="margin:0px;padding: 0%;margin-top: 10px;">
                    <div class="col-lg-6">
                      <label for="MissionRegistrationDeadline" class="form-label mb-0">Mission Registration Deadline</label>
                      <input type="date" class="form-control admin-input" style="box-shadow: none;" name="MissionRegistrationDeadline">
                    </div>
                    <div class="col-lg-6">
                      <label for="TotalSeats" class="form-label mb-0">Total Seats</label>
                      <input type="number" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter TotalSeats" name="TotalSeats">
                    </div>
                  </div>
                  <div class="row" id="goalMission" style="margin:0px;padding: 0%;margin-top: 10px;">
                    <div class="col-lg-6">
                      <label for="GoalObjectiveText" class="form-label mb-0">Goal Objective Text</label>
                      <input type="text" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter your Goal Objective Text" name="GoalObjectiveText">
                    </div>
                    <div class="col-lg-6">
                      <label for="GoalValue" class="form-label mb-0">Goal Value</label>
                      <input type="number" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter GoalValue" name="GoalValue">
                    </div>
                  </div>
                  <div class="col-12">
                    <label for="Theme" class="form-label mb-0">Mission Theme</label>
                    <select class="form-select form-control admin-input" name="Theme" style="box-shadow: none;" aria-label="Default select example" required>
                      <option value="">Select theme</option>
                      <option value="1">Theme 1</option>
                      <option value="0">Theme 2</option>
                    </select>
                  </div>
                    <div class="col-12">
                      <label for="Skills" class="form-label mb-1 ">Mission Skills</label>
                      <div class="multi_select_box">
                        <select class="multi_select w-100" name="Skills" multiple style="box-shadow: none;">
                          <option value="">1</option>
                          <option value="">2</option>
                          <option value="">3</option>
                          <option value="">4</option>
                          <option value="">5</option>
                          <option value="">6</option>
                          <option value="">7</option>
                          <option value="">8</option>
                          <option value="">9</option>
                        </select>
                      </div>
                    </div>
                    <div class="col-12">
                      <label for="Media" class="form-label mb-0">Mission Media(Images)</label><br>
                      <input type="file" name="Media"  class="form-control admin-input" accept="image/jpeg,image/png, image/jpg" style="box-shadow: none;" multiple>
                      <span class="text-muted">(Only jpg/jpeg & png files are allowed)</span>
                    </div>
                    <div class="col-12">
                      <label for="Document" class="form-label mb-0">Mission Documents</label><br>
                      <input type="file" name="Document"  class="form-control admin-input" accept="application/pdf, .doc, .docx" style="box-shadow: none;" multiple>
                      <span class="text-muted">(Only doc/docx & pdf files are allowed)</span>
                    </div>
                    <div class="col-12">
                      <label for="Availability" class="form-label mb-0">Mission Availability</label>
                      <select class="form-select form-control admin-input" name="Availability" style="box-shadow: none;" aria-label="Default select example">
                        <option value="">Select Availability</option>
                        <option value="DAILY">DAILY</option>
                        <option value="WEEKLY">WEEKLY</option>
                      </select>
                    </div>
                    <div class="col-12">
                      <label for="VideoURL" class="form-label mb-0">Video URL</label>
                      <input type="text" class="form-control admin-input" style="box-shadow: none;" placeholder="Enter your Video URL" name="VideoURL">
                    </div>
                    <div class="col-12"  style="margin-top: 30px;">
                        <div class="text-end">
                            <a href="adminMission" class="shareStoryStyle2 rounded-pill btn btn-outline-dark" style="width: auto;box-shadow: none;">Cancel</a>&nbsp;&nbsp;
                            <input class="shareStoryStyle2 rounded-pill btn btn-outline-warning w-auto"  type="submit" name="submit" style="box-shadow: none;" value="Update">
                        </div>
                      </div>
                </form>
             </div>
            </div>
          </div>
        </div>
      </div>

      
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.0/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.bundle.js"></script>
    <script src="script.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.18/js/bootstrap-select.min.js"></script>
    <script src="/resources/bootstrap-5.2.2-dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  </body>
</html>
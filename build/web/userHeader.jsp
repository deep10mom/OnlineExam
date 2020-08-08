
<div class="main_section_agile">
		<div class="w3_agile_banner_top">
			<div class="agile_phone_mail">
				
				<ul>
					<li><i class="fa fa-phone" aria-hidden="true"></i>+(000) 123 456 232</li>
					<li><i class="fa fa-envelope" aria-hidden="true"></i><a href="#">keshrideepa10@gmail.com</a></li>
				</ul>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="agileits_w3layouts_banner_nav">
			<nav class="navbar navbar-default">
				<div class="navbar-header navbar-left">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
                                    <h1><a class="navbar-brand" href="#"><i>U</i><span>ser Home</span></a></h1><br>
                                    
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
					<nav class="menu--iris">
						<ul class="nav navbar-nav menu__list">
                                                    
							<li class="menu__item menu__item--current"><a href="userhome.jsp" class="menu__link">Home</a></li>
                                                        <li class="menu__item"><a href="details.jsp" class="menu__link">Details</a></li>
							<li class="menu__item"><a href="avaliableCourses.jsp" class="menu__link">Avaliable Courses</a></li>
                                                        <li class="menu__item"><a href="startexam.jsp" class="menu__link">Start exam</a></li>
							<li class="menu__item"><a href="finalresult.jsp" class="menu__link">Result</a></li>
                                                        <li class="menu__item"><a href="front.jsp" class="menu__link">logout</a></li>
                                                        
							<li class="menu__item"><h2 style="color:brown;"><%= session.getAttribute("uname") %></h2></li>
							
						</ul>
						
					</nav>
				</div>
			</nav>
		</div>
</div>
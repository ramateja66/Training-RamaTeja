<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<title>Bike Store</title>
<!--
App Starter Template
http://www.templatemo.com/tm-492-app-starter
-->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/font-awesome.min.css">

<link rel="stylesheet" href="css/magnific-popup.css">

<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/owl.carousel.css">

<link href='https://fonts.googleapis.com/css?family=Unica+One' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,700' rel='stylesheet' type='text/css'>

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">

</head>
<body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">


<!-- PRE LOADER -->

<div class="preloader">
     <div class="sk-spinner sk-spinner-pulse"></div>
</div>



<!-- Navigation Section -->

<div class="navbar navbar-default navbar-fixed-top">
	<div class="container">

		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
			</button>
			<a href="#index.html" class="navbar-brand"><span>Bike</span>Store</a>
		</div>

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
			<li><a href="userbikesale.jsp" class="smoothScroll">Bikes For Sale</a></li>
				<li><a href="uoptions.jsp" class="smoothScroll">Back</a></li>
				
			</ul>
		</div>

	</div>
</div>


<!-- Home Section -->

<section id="home" class="main">
     <div class="overlay"></div>
	<div class="container">
		<div class="row">

               

              <div class="col-md-6 col-sm-7 col-xs-12">
			   
			   <div class="panel-heading">
									<h3 class="panel-title"><span class="fa fa-pencil-square-o"></span><font size="6">Sell Bike</h3>
									</font></div>
									
								<form action="insertsellbike.jsp" method="post">
								<table>
								<tr>
									<div>
									<th><label>Bike Name</label></th>
									<td><input type="text" name="bn" placeholder="enter bike name" required style="color: #080808;"></td>
									</div>
									</tr>
									<tr>
									<div>
									<th><label>Bike Model</label></th>
									<td><input type="text" name="bm" placeholder="enter bike model" required style="color: #080808;"></td>
									</div>
									</tr>
									<tr>
									<div>
									<th><label>Year of Purchasing</label></th>
									<td><input type="date" name="yp" placeholder="enter purchased date" required style="color: #080808;"></td>
									</div>
									</tr>
									<tr>
									<div>
									<th><label>Selling Price</label></th>
									<td><input type="text" name="sp" placeholder="enter selling price" required style="color: #080808;"></td>
									</div>
									</tr>
									<tr>
									<div>
									<th><label>Colour</label></th>
									<td><input type="text" name="col" placeholder="enter colur of bike" required style="color: #080808;"></td>
									</div>
									</tr>
									<tr>
									<div>
									<th><label>Trip</label></th>
									<td><input type="text" name="distra" placeholder="enter trip in KMs" required style="color: #080808;"></td>
									</div>
									</tr>

									
									<tr>
									<div>
									<td><input type="submit" value="submit" style="background-color: #9d9d9d;"></td>
									<td><input type="reset" value="reset" style="background-color: #9d9d9d;"></td>							
									</div></tr>
									</table>
									</form>
									

									</div>

		</div>
	</div>
</section>


<!-- About Section -->




<!-- Screenshot Section -->

<!-- Pricing Section -->



<!-- Newsletter Section -->




<!-- Footer Section -->

<footer>
	<div class="container">
		<div class="row">

               <div class="col-md-8 col-sm-6">
                    <div class="wow fadeInUp footer-copyright" data-wow-delay="0.4s">
                        
                        
                    </div>
               </div>

			
			
		</div>
	</div>
</footer>


<!-- Modal Contact -->

<div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
     <div class="modal-dialog">
      <div class="modal-content modal-popup">
          <div class="modal-header">
               <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
               <h2 class="modal-title">Contact Form</h2>
          </div>

               <form action="#" method="post">
                    <input name="name" type="text" class="form-control" id="name" placeholder="Your Name" required>
                 	<input name="email" type="email" class="form-control" id="email" placeholder="Email Address" required>
                 	<textarea name="message" rows="3" class="form-control" id="message" placeholder="Message" required></textarea>
                    <input name="submit" type="submit" class="form-control" id="submit" value="Send Message">
               </form>
          </div>
     </div>
</div>


<!-- Back top -->

<a href="#" class="go-top"><i class="fa fa-angle-up"></i></a>


<!-- SCRIPTS -->

<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/magnific-popup-options.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/custom.js"></script>

</body>
</html>
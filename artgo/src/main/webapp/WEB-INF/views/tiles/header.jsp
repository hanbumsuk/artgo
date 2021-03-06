<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<header class="header-area">
	<!-- Top Header Area -->
	<div class="top-header">
		<div class="container h-100">
			<div class="row h-100 align-items-center header-div-top">
				<!-- Breaking News Area -->
				<div class="col-12 col-sm-8">
					<div class="breaking-news-area"></div>
				</div>
				<!-- Top Social Area -->
				<div class="header-div-top">
					<div class="top-social-area header-div-top-flag" id="header-top">
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- header -->
	<!-- Logo Area -->
	<div class="logo-area text-center">
		<div class="container h-100">
			<div class="row h-100 align-items-center">
				<div class="col-12">
					<a href="/main.do" class="original-logo"><img
						src="/resources/artgo/img/logo.png" alt="" class="img-logo"></a>
				</div>
			</div>
		</div>
	</div>

	<!-- Nav Area -->
	<div class="original-nav-area" id="stickyNav">
		<div class="classy-nav-container breakpoint-off">
			<div class="container">
				<!-- Classy Menu -->
				<nav class="classy-navbar justify-content-between">

					<!-- Subscribe btn -->
					<div class="subscribe-btn">
					</div>

					<!-- Navbar Toggler -->
					<div class="classy-navbar-toggler">
						<span class="navbarToggler"><span></span><span></span><span></span></span>
					</div>

					<!-- Menu -->
					<div class="classy-menu" id="originalNav">
						<!-- close btn -->
						<div class="classycloseIcon">
							<div class="cross-wrap">
								<span class="top"></span><span class="bottom"></span>
							</div>
						</div>
            		<!-- Nav Start -->
			            <div class="classynav">
			              	<ul>
				                <li><a href="/main.do">홈</a></li>
				                <li><a href="/exhibit/list.do?pg=1&key=&word=">전시회</a></li>
								<li><a href="#" id="favorBtn">즐겨찾기</a></li>
								<li><a href="/member/main.do">마이 페이지</a></li>
							</ul>
						</div>
						<!-- Nav End -->
					</div>
				</nav>
			</div>
		</div>
	</div>
	<!-- The Modal -->

	<div class="subscribe-newsletter-area">
        <div class="modal fade" id="subsModal" tabindex="-1" role="dialog" aria-labelledby="subsModal" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <div class="modal-body">
                        <h5 class="title">Subscribe to my newsletter</h5>
                        <form action="#" class="newsletterForm" method="post">
                            <input type="email" name="email" id="subscribesForm2" placeholder="Your e-mail here">
                            <button type="submit" class="btn original-btn">Subscribe</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="favorite-modal">
    	
    </div>
</header>
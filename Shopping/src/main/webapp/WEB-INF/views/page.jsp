<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>


<s:url var="css" value="/resources/css/" />
<s:url var="js" value="/resources/js/" />
<s:url var="images" value="/resources/images/" />


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shopper's stop -> ${title}</title>
    
    <script>
       window.menu = '${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">

</head>

<body>

<div class="wrapper">
  <!-- navigation  -->

    <%@include file="./shared/navbar.jsp" %>



  <!-- Page Content -->
  
   <div class="content">
  
    <!-- Loading Home PAge -->
    
    <!-- when at home page -->
    <c:if test="${userClickHome == true}"  >
     <%@include file="./home.jsp" %>
    </c:if>
    
     <!-- when at about page -->
    <c:if test="${userClickAbout == true}"  >
     <%@include file="about.jsp" %>
    </c:if>
    
      <!-- when at contact page -->
    <c:if test="${userClickContact == true}"  >
     <%@include file="contact.jsp" %>
    </c:if>
    
       <!-- when at contact page -->
    <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}"  >
     <%@include file="listProducts.jsp" %>
    </c:if>
    
    </div>
    
    <!-- /.container -->
    
    <!-- Footer -->
         
    <!--<%@include file="./shared/footer.jsp" %>  -->     
    
    <!-- /.container -->

    <!-- JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.js"></script>
    
    <!-- self javascript -->
       <script src="${js}/myapp.js"></script>
   </div>
</body>

</html>

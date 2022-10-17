<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
            <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1 style="color:green">

Bill for Re-Charge on Mobile Number:${Bill.mobileNumber}
</h1>
<h2 style="color:red">
Transactrion Id:${Bill.transactionId}
<br/><br/>
  
Offer Id:${Bill.offerId}
 <br/><br/>
Valid for:${offer.days} Days
<br/><br/>
 Time Amount:${offer.talkTime}
<br/><br/>
Data Balance:${offer.data}
<br/><br/>
Amount payable:${offer.price}
<br/><br/>
  </h2>
  <a href="/welcome-page">Return</a>
  </div>

</body>
</html>
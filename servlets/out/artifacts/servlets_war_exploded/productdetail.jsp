<%--
  Created by IntelliJ IDEA.
  User: bitstudent
  Date: 2/13/2019
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="productlist.jsp">Product List</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="productdetail.jsp">Product Details<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="cart.jsp">Cart</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<div class="container body-content">
    <h1>Details for each product.</h1>
    <ul>
        <h2>Product 1</h2>
        <li>Item 1</li>
    </ul>
    <ul>
        <h2>Product 2</h2>
        <li>Item 2</li>
    </ul>
    <ul>
        <h2>Product 3</h2>
        <li>Item 3</li>
    </ul>
    <ul>
        <h2>Product 4</h2>
        <li>Item 4</li>
    </ul>
    <ul>
        <h2>Product 5</h2>
        <li>Item 5</li>
    </ul>
    <ul>
        <h2>Product 6</h2>
        <li>Item 6</li>
    </ul>

</div>
</body>
</html>
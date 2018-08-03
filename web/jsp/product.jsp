<%-- 
    Document   : product
    Created on : 3 août 2018, 09:24:05
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,300,700" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="/LaPepite/css/lapepite.css" rel="stylesheet">
        <link href="/LaPepite/css/topMenu.css" rel="stylesheet">
        <title>${bijoux.nom}</title>
    </head>
    <body>
        
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <%@ include file="menu/topMenu.jsp" %>
                </div>
                <div class="col-12">
                    <%@ include file="menu/jewelsMenu.jsp" %>
                </div>
            </div>
                
        </div>
            
        <div class="container">
            
            <div class="col-lg-9">

                <div class="card mt-4">
                    <img class="card-img-top img-fluid" src="http://placehold.it/900x400" alt="">
                    <div class="card-body">
                        <h3 class="card-title">${bijoux.nom}</h3>
                        <h4>${bijoux.prix} €</h4>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente dicta fugit fugiat hic aliquam itaque facere, soluta. Totam id dolores, sint aperiam sequi pariatur praesentium animi perspiciatis molestias iure, ducimus!</p>
                        <div class="row justify-content-between">
                            <span class="text-warning ml-3">★ ★ ★ ★ ☆</span>
                            <form id="product-form" action="/LaPepite/shop/product?id=${bijoux.id}" method="post" role="form" style="display: block;" class="mr-5">
                                <select name="numberOfProduct" size="1" class="mx-3">
                                    <option selected="true">1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                </select>
                                <input type="submit" class="btn btn-primary" value="Commander">
                            </form>
                        </div>
                        
                  
                    </div>
                </div>
          <!-- /.card -->

          <!-- Commentaires  -->
          
          <div class="card card-outline-secondary my-4">
            <div class="card-header">
              Product Reviews
            </div>
            <div class="card-body">
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              <hr>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              <hr>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              <hr>
              <a href="#" class="btn btn-success">Leave a Review</a>
            </div>
          </div>
          <!-- /.card -->

        </div>
            
        </div>
                    
    </body>
</html>

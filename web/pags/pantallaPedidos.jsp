<%-- 
    Document   : pantallaPedidos
    Created on : 03/10/2018, 09:40:47 PM
    Author     : Nayib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!--Bootstrap-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <!--CSS-->
        <link href="../css/principal.css" rel="stylesheet" type="text/css"/>
        <!--JS-->
        <script src="../js/pantallaPedidos.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pantalla Pedidos</title>
    </head>
    <body>
        <!--Barra de navegacion-->
        <nav class="navbar navbar navbar-expand-lg navbar-light" id="encabezadoypie" >
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.html">Inicio<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="pags/pantallaPedidos.jsp">Productos<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="Imagen_Producto.jsp">Asignar Imagen<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" >Información<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" >Contacto<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>

        <div>
            <img src="../img/índice.png" class="img-fluid" alt="Responsive image"/>
        </div>

        <!--Filters tools-->
        <form>
            Filtros de busqueda
            <div class="row">
                <div class="col-sm-3">
                    <label>Categorias:</label>
                    <select class="form-control" id="opCategoria">
                        <option value="Calcetines">Calcetines</option>
                        <option value="Seamless">Seamless</option>
                        <option value="Ropero">Ropero</option>
                    </select>
                </div>
                <div class="col-sm-3">
                    <input type="radio" id="opCodigo" value="codigo" onclick="activarTxt(1);">Buscar por codigo<br>
                    <input type="radio" id="opNombre" value="nombre" onclick="activarTxt(2);" >Buscar por nombre<br>
                    <input type="text" id="txtBusqueda">
                </div>
                <div class="col-sm-3">
                    <button type="button" class="btn btn-secondary" id="btnMostrar">Mostrar productos</button>
                </div>
            </div>    
        </form>

        <!--Album-->
        <div id="album"></div>

        <!-- MODAL PARA LA VISTA ESPECIFICA DE UN PRODUCTO -->
        <div class="modal fade" id="modalP" role="dialog">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="myModalTitle">Producto Especifico</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <form id="formP" novalidate>
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <!--<label for="id">ID: </label>
                                        <input type="number" class="form-control" id="id" placeholder="ID" required>
                                        <div class="invalid-feedback">
                                            Solo se permite valores numericos
                                        </div>-->
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <div><label id="descripcion"></label></div>
                                        <div><label for="id">Codigo: </label><label id="id"></label></div>
                                        <div><label for="categoria">Categoria: </label><label id="categoria"></label></div>
                                        <div><label for="material">Material: </label><label id="material"></label></div>
                                        <div><label for="talla">Talla: </label><label id="talla"></label></div>
                                        <div><label id="estado"></label></div>
                                        <div><label for="inventario">Inventario: </label><label id="inventario"></label></div>

                                        <div id="espacioInventario"></div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" id="btnAgregar" class="btn btn-secondary" data-dismiss="modal">Agregar Pedido</button>
                    </div>
                </div>
            </div>
        </div>
        
        <!--Pie de Pagina-->
        <!--<footer>
            <div align="center">
                <h6> Medias Casino </h6>
                <h6>Contactos:(506)8888-8888</h6>
                <h6>© CopyRight</h6>
            </div>
        </footer>-->
    </body>
</html>

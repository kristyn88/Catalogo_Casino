<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Vinculacion Imágenes</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!--Bootstrap-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <!--CSS-->
        <link href="css/principal.css" rel="stylesheet" type="text/css"/>
        <!--data table-->
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.css">
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.js"></script>
        <!--JS-->
        <meta charset="UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/source.js" type="text/javascript"></script>
        <link href="css/default.css" rel="stylesheet" type="text/css"/>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


        <style>
            .thumb {
                height: 300px;
                border: 1px solid #000;
                margin: 10px 5px 0 0;
            }
        </style>
    </head>
    <body onload="consultarProductos();">
        <header>
            <!--Barra de navegacion-->
            <nav class="navbar navbar-light" id="encabezadoypie" >
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" >Inicio<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="index.html" >Productos<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="Imagen_Producto.jsp">Asignar Imagen<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" >Informacion<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" >Contacto<span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>

        <div class="container">
            <img src="img/índice.png" class="img-fluid" alt="Responsive image"/>
        </div>
        
        <!--Productos-->
        <!--
        <div class="panel panel-primary" id="panelProducto">
            <div class="container">
                <center>
                    <div class="panel-heading"><h3>Productos</h3></div><br><br>
                </center>
                <div class="panel-body">
                    <form>
                        <div class="row">
                            <table align="center" class="table table-bordered" id="tablaProducto">
                                <thead>
                                    <tr>
                                        <th><b>Codigo</b></th>
                                        <th><b>Categoria</b></th>
                                        <th><b>Material</b></th>
                                        <th><b>Talla</b></th>
                                        <th><b>Descripcion</b></th>
                                        <th><b>Estado</b></th>
                                        <th><b>Inventario</b></th>
                                    </tr>
                                </thead>
                                <tbody></tbody>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        -->
        <div id="contents">
            <form id="form1" action="ServicioArchivo" method="POST" enctype="multipart/form-data">
                <table class="tablaFormulario">
                    <tr>
                        <td>Archivo:&nbsp;</td>
                        <td>
                            <input type="file" id="files" name="files[]" onchange="readURL();"  required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Código del Producto:&nbsp;</td>
                        <td>
                            <input type="text" id="observaciones" name="observaciones"
                                   size="30" placeholder="Digite aquí el código del producto"  required/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <button type="submit">Enviar</button>
                        </td>
                    </tr>
                </table>
            </form>
            <br />
            <output id="list"></output>
        </div>
        <div>
            <br />
            <p><strong>${mensaje2}</strong></p>
        </div>

        <!--Pie de Pagina-->
        <footer>
            <div align="center">
                <h6> Medias Casino </h6>
                <h6>Contactos:(506)8888-8888</h6>
                <h6>© CopyRight</h6>
            </div>
        </footer>

        <script>
            function archivo(evt) {
                var files = evt.target.files; // FileList object

                // Obtenemos la imagen del campo "file".
                for (var i = 0, f; f = files[i]; i++) {
                    //Solo admitimos imágenes.
                    if (!f.type.match('image.*')) {
                        continue;
                    }

                    var reader = new FileReader();

                    reader.onload = (function (theFile) {
                        return function (e) {
                            // Insertamos la imagen
                            document.getElementById("list").innerHTML = ['<img class="thumb" src="', e.target.result, '" title="', escape(theFile.name), '"/>'].join('');
                        };
                    })(f);

                    reader.readAsDataURL(f);
                }
            }

            document.getElementById('files').addEventListener('change', archivo, false);
        </script>

    </body>

</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Carga de archivos</title>
        <meta charset="UTF-8" />
        <link href="css/default.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="wrapper">
            <header></header>
            <div id="contents">
                <form id="form1" action="ServicioArchivo" method="POST" enctype="multipart/form-data">
                    <table class="tablaFormulario">
                        <tr>
                            <td>Archivo:&nbsp;</td>
                            <td>
                                <input type="file" id="archivo" name="archivo" />
                            </td>
                        </tr>
                        <tr>
                            <td>Código del Producto:&nbsp;</td>
                            <td>
                                <input type="text" id="observaciones" name="observaciones"
                                       size="30" placeholder="Digite aquí el código del producto" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit">Enviar</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <footer></footer>
        </div>
    </body>
</html>

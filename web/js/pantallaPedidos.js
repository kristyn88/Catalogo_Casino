$(function () {
    $("#btnMostrar").click(function () {
        enviar();
    });
});
$(document).ready(function () {
    $("#txtBusqueda").attr('readonly', true);
});
var op = "";
function activarTxt(num){
    if(num == 1){
        opcionBusqueda: document.getElementById('opNombre').checked = false;
        op = "codigo";
    }
    if(num == 2){
        opcionBusqueda: document.getElementById('opCodigo').checked = false;
        op = "nombre";
    }
    $("#txtBusqueda").attr('readonly', false);
}
function dibujarAlbum(dataJson) {
    var stringProductos = "";
    $("#album").html("");
    stringProductos = stringProductos + '<div class="album bg-light">';
    stringProductos = stringProductos + '<div class="container-fluid">';
    stringProductos = stringProductos + '<div class="row">';

    for (var i = 0; i < dataJson.length; i++) {
        stringProductos = stringProductos + '<div class="col-sm-3">';
        stringProductos = stringProductos +'<div class="card sm-3 shadow-sm">';
        stringProductos = stringProductos +'<img class="card-img-top" alt="Thumbnail [100%x225]" style="height: 225px; width: 100%;" src="../img/índice.png">';
        stringProductos = stringProductos +'<div class="card-body">';
        stringProductos = stringProductos +'<p class="card-text">' + dataJson[i].descripcion + '</p>';
        stringProductos = stringProductos +'<div class="d-flex justify-content-between align-items-center">';
        stringProductos = stringProductos +'<div class="btn-group">';
        stringProductos = stringProductos +'<button type="button" class="btn btn-sm btn-outline-secondary btn-block" onclick=consultarProductoByID(' + dataJson[i].codigo + ')>View</button>';
        stringProductos = stringProductos +'</div>';
        stringProductos = stringProductos +'</div>';
        stringProductos = stringProductos +'</div>';
        stringProductos = stringProductos +'</div>';
        stringProductos = stringProductos +'</div>';
    }
    stringProductos = stringProductos +'</div>';
    stringProductos = stringProductos +'</div>';
    stringProductos = stringProductos +'</div>';
    $("#album").append(stringProductos);
}

function consultarProductoByID(id) {
    $.ajax({
        url: "../PantallaPedidosServlet",
        data: {
            accion: "consultarProductoByID",
            id: id
        },
        error: function () { //si existe un error en la respuesta del ajax
            alert("Se presento un error, contactar al administador");
        },
        success: function (data) {
            $("#modalP").modal("show");

            //se carga la información en el formulario
            $("#descripcion").text(data.descripcion);
            $("#descripcion").attr('readonly', true);
            $("#id").text(data.codigo);
            $("#id").attr('readonly', true);
            $("#categoria").text(data.categoria);
            $("#categoria").attr('readonly', true);
            $("#material").text(data.material);
            $("#material").attr('readonly', true);
            $("#talla").text(data.talla);
            $("#talla").attr('readonly', true);
            $("#estado").text(data.estado);
            $("#estado").attr('readonly', true);
            $("#inventario").text(data.inventario);
            $("#inventario").attr('readonly', true);
            
            if(data.inventario!=0){
                document.getElementById("btnAgregar").disabled = false;
                $("#espacioInventario").html("");
                $("#espacioInventario").append($('<input type="number" class="form-control" id="cantidadInventario" min="1" max="'+data.inventario+'" maxlength="'+data.inventario+'" required>'));
            }else{
                document.getElementById("btnAgregar").disabled = true;
                $("#espacioInventario").html("");
                document.getElementById("cantidadInventario").disabled = true;
                
            }
        },
        type: 'POST',
        dataType: "json"
    });
}

function enviar() {
    //Se envia la información por ajax
    $.ajax({
        url: "../PantallaPedidosServlet",
        data: {
            accion: "consultarProductos", 
            categoria: document.getElementById('opCategoria').value,
            txtBusqueda: document.getElementById('txtBusqueda').value,
            opcionBusqueda: op
        },
        error: function () {
            alert("Se presento un error, contactar al administador");
        },
        success: function (data) {
            dibujarAlbum(data);
        },
        type: 'POST',
        dataType: 'JSON'
    });
}
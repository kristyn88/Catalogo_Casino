$(function () {
    mostrarTablas();
});

$(function () {
    consultarProductos();
    mostrarTablas();
});

function consultarProductos() {
//Se envia la información por ajax
    var table = $('#tablaProducto').DataTable({
        "processing": true,
        "paging": true,
        "ordering": true,
        "searching": true,
        "autoWidth": true,
        "destroy": true,
        "ajax": "ProductoListServlet",
        "columns": [
            {"data": "codigo"},
            {"data": "categoria"},
            {"data": "material"},
            {"data": "talla"},
            {"data": "descripcion"},
            {"data": "estado"},
            {"data": "inventario"}
        ]
    });
}

function mostrarTablas() {
    $("#panelProducto").show();
}
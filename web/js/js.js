$(function () {
    $("#opciones").click(function () {
        mostrarTablas();
    });
});
$(function () {
    consultarAgentes();
    consultarClientes();
    consultarProductos();
    mostrarTablas();
});
function consultarAgentes() {
//Se envia la información por ajax
    var table = $('#tablaAgente').DataTable({
        "processing": true,
        "paging": true,
        "ordering": true,
        "searching": true,
        "autoWidth": true,
        "destroy": true,
        "ajax": "AgenteListServlet",
        "columns": [
            {"data": "codigo"},
            {"data": "nombre"},
            {"data": "zona"},
            {"data": "estatus"},
            {"data": "telefono"}
        ]
    });
}
function consultarClientes() {
//Se envia la información por ajax
    var table = $('#tablaCliente').DataTable({
        "processing": true,
        "paging": true,
        "ordering": true,
        "searching": true,
        "autoWidth": true,
        "destroy": true,
        "ajax": "ClienteListServlet",
        "columns": [
            {"data": "cliente"},
            {"data": "vendedor"},
            {"data": "nombre"},
            {"data": "poblacion"},
            {"data": "codigo"},
            {"data": "nombre2"},
            {"data": "calle"},
            {"data": "poblacion2"},
            {"data": "region"},
            {"data": "telefono"}
        ]
    });
}
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
    if (opciones.value == "agente") {
        $("#panelAgente").show();
        $("#panelCliente").hide();
        $("#panelProducto").hide();
    }
    if (opciones.value == "cliente") {
        $("#panelAgente").hide();
        $("#panelCliente").show();
        $("#panelProducto").hide();
    }
    if (opciones.value == "producto") {
        $("#panelAgente").hide();
        $("#panelCliente").hide();
        $("#panelProducto").show();
    }
}

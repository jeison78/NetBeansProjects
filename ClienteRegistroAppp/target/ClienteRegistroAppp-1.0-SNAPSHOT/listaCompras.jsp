<%-- 
    Document   : listaCompras
    Created on : 14 nov 2024, 21:06:38
    Author     : dilvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h2>Lista de Compras de Vehiculos</h2>
        <table border="1" cellspacing="2">
            <tr>
                <th>Cliente</th>
                <th>Vehiculo</th>
                <th>Fecha de Compra</th>
            </tr>
            <%
                com.miapp.service.CompraService compraService = com.miapp.service.CompraService.getInstance();
                for (com.miapp.model.Compra compra : compraService.ListarCompras()){
            %>
            <tr>
                <td><%= compra.getCliente().getNombre() %></td>
                <td><%= compra.getVehiculo().getMarca() + " " + compra.getVehiculo().getModelo() %></td>
                <td><%= compra.getFechaCompra() %></td>
            </tr>
            <% } %>
        </table>
        <a href="registroCompra.jsp">Registrar nueva compra</a>
    </body>
</html>

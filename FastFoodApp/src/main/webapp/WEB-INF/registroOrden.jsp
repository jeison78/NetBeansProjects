<%-- 
    Document   : registroOrden
    Created on : 23 nov 2024, 2:04:54
    Author     : dilvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.fastfood.service.ClienteService"%>
<%@page import="com.fastfood.service.ProductoService" %>
<%@page import="com.fastfood.model.Cliente" %>
<%@page import="com.fastfood.model.Producto" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Orden</title>
    </head>
    <body>
        <h1>Registrar Orden de Comida</h1>
        <form name="clienteId">
            <select name="clienteId">
                <%
                    ClienteService clienteService = ClienteService.getInstance();
                    for (Cliente cliente : clienteService.listarCliente()) {
                %>
                <option value="<%= cliente.getId()%>"><%= cliente.getNombre()%></option>
                <% } %>
            </select>
            <br><br>

            Productos:<br>
            <%
                ProductoService productoService = ProductoService.getInstance();
                for (Producto producto : productoService.listarProductos()) {
            %>
            <input type="checkbox" name="productoId" value="<%= producto.getId() %>">
            <%= producto.getNombre() %> - $<%= producto.getPrecio() %><br>
            <% }%>
            <br>
            <input type="submit" value="Registrar Orden">
        </form>
    </body>
</html>

<%-- 
    Document   : registroCompra
    Created on : 14 nov 2024, 20:57:35
    Author     : dilvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h2>Registrar Compra de Vehiculo</h2>
        <form action="RegistrarCompra" method="POST">
            Cliente ID: <input type="text" name="clienteId"><br>
            Vehiculo ID:
            <select name="vehiculoId">
                <%
                    //Usa getInstance() en lugar de new para obtener la instancia sigleton de VehiculosService
                    com.miapp.service.VehiculoService vehiculoService = com.miapp.service.VehiculoService.getInstance();
                    for (com.miapp.model.Vehiculo vehiculo : vehiculoService.ListarVehiculos()) {
                %>
                <option value="<%= vehiculo.getId()%>"><%= vehiculo.getMarca() + " " + vehiculo.getModelo()%> - $<%= vehiculo.getPrecio()%>%></option>
                }
                <% } %>
            </select><br>
            <input type="submit" value="Registrar Compra">
        </form>
    </body>
</html>

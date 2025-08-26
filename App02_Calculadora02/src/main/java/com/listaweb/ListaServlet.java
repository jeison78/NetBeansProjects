package com.listaweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet para manejar listas de elementos.
 */
@WebServlet(name = "ListaServlet", urlPatterns = {"/ListaServlet"})
public class ListaServlet extends HttpServlet {

    /**
     * Maneja las solicitudes HTTP GET.
     *
     * @param request  la solicitud del cliente
     * @param response la respuesta al cliente
     * @throws ServletException si ocurre un error en el servlet
     * @throws IOException      si ocurre un error de E/S
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Crear una lista de elementos para enviar al frontend
        List<String> elementos = new ArrayList<>();
        elementos.add("Elemento A");
        elementos.add("Elemento B");
        elementos.add("Elemento C");
        elementos.add("Elemento D");
        elementos.add("Elemento E");

        // Guardar la lista como atributo en la solicitud
        request.setAttribute("elementos", elementos);

        // Reenviar la solicitud a un JSP (cambiar index.jsp si usas otro nombre)
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    /**
     * Maneja las solicitudes HTTP POST.
     *
     * @param request  la solicitud del cliente
     * @param response la respuesta al cliente
     * @throws ServletException si ocurre un error en el servlet
     * @throws IOException      si ocurre un error de E/S
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Devuelve una descripción corta del servlet.
     *
     * @return una cadena que describe brevemente el servlet
     */
    @Override
    public String getServletInfo() {
        return "Servlet que genera y reenvía una lista de elementos al frontend.";
    }
}

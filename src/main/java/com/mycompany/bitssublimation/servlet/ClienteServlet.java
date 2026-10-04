package com.mycompany.bitssublimation.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Consulta de Clientes</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Consulta de Clientes</h1>");
        out.println("<p>La consulta mediante el método GET funciona correctamente.</p>");
        out.println("<a href='/BitsSublimationWeb/cliente.html'>Volver al formulario</a>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Cliente registrado</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bits Sublimation</h1>");
        out.println("<h2>Datos del cliente</h2>");
        out.println("<p><strong>Nombre:</strong> " + nombre + "</p>");
        out.println("<p><strong>Correo:</strong> " + correo + "</p>");
        out.println("<p><strong>Teléfono:</strong> " + telefono + "</p>");
        out.println("<p>Los datos fueron recibidos correctamente mediante POST.</p>");
        out.println("<a href='/BitsSublimationWeb/cliente.html'>Registrar otro cliente</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
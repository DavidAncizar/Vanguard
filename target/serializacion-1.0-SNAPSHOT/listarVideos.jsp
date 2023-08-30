<%-- 
    Document   : listarVideos
    Created on : 30/08/2023, 5:15:15 p. m.
    Author     : Sistemas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.umariana.mundo.Video"%>
<%@page import="com.umariana.mundo.Video"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listar Videos</h1>
        
        <%
            //Obtener el arraylist de la solicitud
            ArrayList<Video> misVideos = (ArrayList<Video>)request.getAttribute("misVideos");
            //Mostrar los datos del Array 
            for ( Video v: misVideos)
            {
            out.println("idVideo: " + v.getIdVideo());
            out.println("Titulo: " + v.getTitulo());
            out.println("Autor: " + v.getAutor());
            out.println("Anio: " + v.getAnio());
            out.println("URL: " + v.getUrl());
            out.println("Letra: " + v.getLetra());
            
        }
            %>
    </body>
</html>

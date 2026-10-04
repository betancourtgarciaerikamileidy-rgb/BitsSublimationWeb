<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Cliente registrado</title>
</head>
<body>

    <h1>Bits Sublimation</h1>

    <h2>Datos del cliente</h2>

    <p>
        <strong>Nombre:</strong>
        ${nombre}
    </p>

    <p>
        <strong>Correo:</strong>
        ${correo}
    </p>

    <p>
        <strong>Teléfono:</strong>
        ${telefono}
    </p>

    <p>Los datos fueron recibidos correctamente mediante el método POST.</p>

    <br>

    <a href="cliente.html">Registrar otro cliente</a>

</body>
</html>
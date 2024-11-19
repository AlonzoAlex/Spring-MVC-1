<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/recursos/css/estilosAlumnos.css'>
</head>
<body>
Hola ${param.nombreAlumno}. Bienvenido al curso de Spring.

<p>
    Mensaje 1: Atencion esto es un p<br>
    ${mensaje}
</p>
<p><br>
    Mensaje 2: Atencion esto es un p br<br>
    ${mensaje}
</p>

<img alt="un tren" src="${pageContext.request.contextPath}/recursos/img/tren.jpg">

</body>
</html>
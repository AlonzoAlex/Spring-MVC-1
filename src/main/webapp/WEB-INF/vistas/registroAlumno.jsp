<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Registro</title>
</head> 
<body>
    <form:form action="procesarFormulario" modelAttribute="a1Name">
        Nombre: <form:input path="nombre"/>
        <form:errors path="nombre" style="color:red"/>
        <br><br>
        Apellido <form:input path="apellido"/>
        <br><br>
        Edad: <form:input path="edad"/>
        <form:errors path="edad" style="color:blue"/>
        <br><br>
        Email: <form:input path="email"/>
        <form:errors path="email" style="color:green"/>
        <br><br>
        Codigo postal: <form:input path="codigoPostal"/>
        <form:errors path="codigoPostal" style="color:rgb(179, 14, 194)"/>
        <br><br>
        Asignaturas Optativas: <br>
        <form:select path="optativa" multiple="true">
            <form:option value="Diseño" label="Diseño"/>
            <form:option value="Karate" label="Karate"/>
            <form:option value="Comercio" label="Comercio"/>
            <form:option value="Danza" label="Danza"/>
        </form:select>
        <br><br>
        Seleccione la ciudad de estudio:<br>
            Barcelona<form:radiobutton path="provincia" value="Barcelona"/><br>
            Madrid<form:radiobutton path="provincia" value="Madrid"/><br>
            Valencia<form:radiobutton path="provincia" value="Valencia"/><br>
            Bilbao<form:radiobutton path="provincia" value="Bilbao"/><br>
        <br><br>
        Seleccione los idiomas a estudiar:<br>
            Ingles<form:checkbox path="idiomas" value="Ingles"/><br>
            Frances<form:checkbox path="idiomas" value="Frances"/><br>
            Aleman<form:checkbox path="idiomas" value="Aleman"/><br>
            Chino<form:checkbox path="idiomas" value="Chino"/><br>
        <br><br>
        <input type="submit" value="Enviar">
    </form:form>
    
</body>
</html>
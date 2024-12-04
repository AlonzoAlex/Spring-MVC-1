<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Confirmacion de Registro</title>
</head>
<body>
    <br>El alumno ${a1Name.nombre} ${a1Name.apellido}, con ${a1Name.edad} años de edad, fue registrado correctamente.<br>
    Correo electronico de referencia: ${a1Name.email}<br>
    Las asignatura escogida es:<br>
    - ${a1Name.optativa}<br>
    <br>
    El estudiante ${a1Name.nombre} ${a1Name.apellido} estudiara en ${a1Name.provincia}.
    <br>
    Idiomas escogidos:<br>
    ${a1Name.idiomas}<br>
    Se ha registrado el codigo postal numero &{a1Nombre.codigoPostal}

</body>
</html>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - Proyecto ADN Mutante</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            color: #333;
        }
        h1, h2, h3 {
            color: #2c3e50;
        }
        ul {
            list-style-type: disc;
            margin-left: 20px;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
        .icon {
            width: 24px;
            vertical-align: middle;
            margin-right: 8px;
        }
    </style>
</head>
<body>

    <h1>Proyecto ADN Mutante 🧬</h1>

    <h2>Funcionamiento 📋</h2>
    <p>
        Se recibirá un arreglo de Strings, donde cada String representa una fila de una tabla de 6x6 con la secuencia de ADN. Cada carácter de los Strings debe ser una de las siguientes letras: <strong>A, T, C o G</strong>, que representan las bases nitrogenadas del ADN.
    </p>
    <p>
        Se determinará si una persona es mutante si se detecta más de una secuencia de cuatro letras iguales consecutivas en cualquier dirección: oblicua, horizontal o vertical. Las filas de la matriz a analizar serán ingresadas por teclado.
    </p>
    <p>Ejemplo de entrada: <code>'ATCGTA'</code> (lo cual representa una fila de la matriz).</p>
    <p>Una vez que la matriz se ha cargado correctamente, se ejecuta una función que verifica la presencia de secuencias mutantes y devuelve el resultado al usuario en función de este análisis.</p>
    
    <h3>Funcionalidades básicas:</h3>
    <ul>
        <li>Compatibilidad para validar matrices que no son cuadradas.</li>
        <li>Comprobación de matrices que contengan caracteres inválidos.</li>
        <li>Identificación de secuencias de ADN ya almacenadas en la base de datos.</li>
        <li>Gestión de matrices vacías.</li>
    </ul>

    <h2>Ejecución 🚀</h2>
    <p>
        El proyecto ha sido desplegado a <a href="https://render.com">Render</a> y puedes accederlo mediante el siguiente link: 
        <a href="https://examenparcial-magneto.onrender.com">Ver Proyecto en Render</a>
    </p>

    <h2>Endpoints 🌐</h2>
    <ul>
        <li><strong>POST /mutant</strong> - Recibe un JSON con la matriz de ADN a verificar.</li>
        <li><strong>GET /stats</strong> - Devuelve un JSON con la cantidad de mutantes y humanos verificados.</li>
    </ul>
    
    <h2>Ejemplos para hacer la prueba ⚗️</h2>
    <h3>Posible prueba unitaria mutante:</h3>
    <code>
        { "dna": [
            "TGAC",
            "AGCC",
            "TGAC",
            "GGTC"
        ] }
    </code>
    <h3>Posible prueba unitaria no mutante:</h3>
    <code>
        { "dna": [
            "AAAT",
            "AACC",
            "AAAC",
            "CGGG"
        ] }
    </code>

    <h2>Enlace para ejecutar 🖥️</h2>
    <p>
        Una vez que el proyecto esté corriendo y la consola muestra que la API está funcionando, puedes hacer pruebas en este enlace: 
        <a href="http://localhost:8080/swagger-ui/index.html">Swagger UI</a>
    </p>
    <p>
        También puedes usar Postman para hacer las pruebas. En el proyecto hay un archivo llamado <strong>MercadoLibre.postman_collection.json</strong>, que contiene el request de tipo POST que me permite verificar si es mutante o no. En el body ya hay un ejemplo que se verifica y da que es “mutant”. Y otro request de tipo GET que me da las estadísticas de verificaciones de los ADN.
    </p>

    <h2>Contribuciones 🤝</h2>
    <p>¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, por favor abre un issue o un pull request.</p>

</body>
</html>

  














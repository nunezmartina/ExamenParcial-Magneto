<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proyecto ADN Mutante</title>
    <style>
        /* Estilos para el README */
        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            line-height: 1.6;
            color: #24292e;
            background-color: #ffffff;
            padding: 20px;
        }
        h1, h2, h3 {
            color: #0366d6;
            margin-top: 24px;
        }
        ul {
            list-style-type: disc;
            margin-left: 20px;
        }
        code {
            font-family: 'SFMono-Regular', Consolas, 'Liberation Mono', Menlo, Courier, monospace;
            background-color: #f6f8fa;
            padding: 0.2em 0.4em;
            border-radius: 6px;
        }
        .icon {
            width: 20px;
            height: 20px;
            vertical-align: middle;
            margin-right: 8px;
        }
    </style>
</head>
<body>
    <h1><img class="icon" src="https://github.com/fluidicon.png" alt="GitHub Icon"> Proyecto ADN Mutante 🧬</h1>

    <h2><img class="icon" src="https://octicons.github.com/icon/checklist.svg" alt="Checklist Icon"> Funcionamiento</h2>
    <p>
        Se recibirá un arreglo de Strings, donde cada String representa una fila de una tabla de 6x6 con la secuencia de ADN. Cada carácter de los Strings debe ser una de las siguientes letras: <strong>A, T, C o G</strong>, que representan las bases nitrogenadas del ADN.
    </p>
    <p>
        Se determinará si una persona es mutante si se detecta más de una secuencia de cuatro letras iguales consecutivas en cualquier dirección: oblicua, horizontal o vertical. Las filas de la matriz a analizar serán ingresadas por teclado.
    </p>
    <p>Ejemplo de entrada: <code>'ATCGTA'</code> (lo cual representa una fila de la matriz).</p>
    <p>Una vez que la matriz se ha cargado correctamente, se ejecuta una función que verifica la presencia de secuencias mutantes y devuelve el resultado al usuario en función de este análisis.</p>

    <h3><img class="icon" src="https://octicons.github.com/icon/list-unordered.svg" alt="Unordered List Icon"> Funcionalidades básicas:</h3>
    <ul>
        <li>Compatibilidad para validar matrices que no son cuadradas.</li>
        <li>Comprobación de matrices que contengan caracteres inválidos.</li>
        <li>Identificación de secuencias de ADN ya almacenadas en la base de datos.</li>
        <li>Gestión de matrices vacías.</li>
    </ul>

    <h2><img class="icon" src="https://octicons.github.com/icon/rocket.svg" alt="Rocket Icon"> Ejecución</h2>
    <p>
        El proyecto ha sido desplegado a <a href="https://render.com">Render</a> y puedes accederlo mediante el siguiente link: 
        <a href="https://examenparcial-magneto.onrender.com">Ver Proyecto en Render</a>
    </p>

    <h2><img class="icon" src="https://octicons.github.com/icon/link-external.svg" alt="External Link Icon"> Endpoints</h2>
    <ul>
        <li><strong>POST /mutant</strong> - Recibe un JSON con la matriz de ADN a verificar.</li>
        <li><strong>GET /stats</strong> - Devuelve un JSON con la cantidad de mutantes y humanos verificados.</li>
    </ul>

    <h2><img class="icon" src="https://octicons.github.com/icon/beaker.svg" alt="Beaker Icon"> Ejemplos para hacer la prueba</h2>
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

    <h2><img class="icon" src="https://octicons.github.com/icon/computer.svg" alt="Computer Icon"> Enlace para ejecutar</h2>
    <p>
        Una vez que el proyecto esté corriendo y la consola muestra que la API está funcionando, puedes hacer pruebas en este enlace: 
        <a href="http://localhost:8080/swagger-ui/index.html">Swagger UI</a>
    </p>
    <p>
        También puedes usar Postman para hacer las pruebas. En el proyecto hay un archivo llamado <strong>MercadoLibre.postman_collection.json</strong>, que contiene el request de tipo POST que me permite verificar si es mutante o no. En el body ya hay un ejemplo que se verifica y da que es "mutant". Y otro request de tipo GET que me da las estadísticas de verificaciones de los ADN.
    </p>

    <h2><img class="icon" src="https://octicons.github.com/icon/heart.svg" alt="Heart Icon"> Contribuciones</h2>
    <p>¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, por favor abre un issue o un pull request.</p>
</body>
</html>

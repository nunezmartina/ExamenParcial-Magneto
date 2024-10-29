# Proyecto Mutante - Detección de ADN Mutante 🧬

Este proyecto permite identificar si un humano es mutante analizando una secuencia de ADN representada en una matriz de 6x6. La API determina si una secuencia es mutante cuando detecta más de una secuencia de cuatro letras iguales en cualquier dirección: horizontal, vertical u oblicua.

## 📋 Funcionamiento

- Se recibe un arreglo de Strings, donde cada String representa una fila de una tabla de 6x6 con la secuencia de ADN.
- Cada carácter en los Strings debe ser una de las siguientes letras: **A, T, C, G**, que representan las bases nitrogenadas del ADN.
- Se determina que una persona es mutante si se encuentra **más de una secuencia de cuatro letras iguales consecutivas** en cualquier dirección (oblicua, horizontal o vertical).

### Ejemplo de Entrada
```json
{ "dna": ["ATCGTA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"] } ```

- Una vez que la matriz se ha cargado correctamente, se ejecuta una función que verifica la presencia de secuencias mutantes y devuelve el resultado al usuario en función de este análisis.

### 🛠️ Funcionalidades

- ✅ **Validación de Matrices**
  - Compatible con matrices no cuadradas.
  - Comprobación de caracteres inválidos.
- 📊 **Gestión de ADN**
  - Identificación de secuencias ya almacenadas en la base de datos.
  - Gestión de matrices vacías.

## 🚀 Ejecución

El proyecto ha sido desplegado en Render y puedes accederlo mediante el siguiente enlace (añadir al final del link /mutant o /stats):

[**Visitar Proyecto**](https://examenparcial-magneto.onrender.com)

## 🔗 Endpoints

- **POST /mutant**
  - Recibe un JSON con la matriz de ADN a verificar.

- **GET /stats**
  - Devuelve un JSON con la cantidad de mutantes y humanos verificados.

### 📋 Ejemplos de Prueba

#### Posible prueba unitaria mutante:
```json
{
  "dna": [
    "TGAC",
    "AGCC",
    "TGAC",
    "GGTC"
  ]
}














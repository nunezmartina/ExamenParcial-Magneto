# Proyecto Mutante - Detección de ADN Mutante 🧬

Este proyecto permite identificar si un humano es mutante analizando una secuencia de ADN representada en una matriz de 6x6. La API determina si una secuencia es mutante cuando detecta más de una secuencia de cuatro letras iguales en cualquier dirección: horizontal, vertical u oblicua.

## 📋 Funcionamiento

- El ADN es recibido como un arreglo de Strings, donde cada String representa una fila de una tabla de 6x6.
- Las letras permitidas en cada fila son: **A, T, C, G**, que representan las bases nitrogenadas del ADN.
- Se determina que una persona es mutante si se encuentra más de una secuencia de cuatro letras consecutivas en cualquier dirección (oblicua, horizontal o vertical).

### Ejemplo de Entrada

```json
{ "dna": ["ATCGTA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"] } \```

# TrabajoConsulta
Este proyecto implementa el método de integración numérica Simpson 1/3, utilizando funciones de orden superior en Scala.
El objetivo es aproximar el valor de varias integrales definidas enviando diferentes funciones matemáticas como parámetros a una única función general llamada integracion.

# Objetivos

-Aplicar el uso de funciones de orden superior en Scala.

-Implementar una función general capaz de aproximar cualquier integral definida.

-Evaluar varias funciones matemáticas usando la fórmula de Simpson.

-Calcular el error absoluto entre el valor esperado y el obtenido.

# Método Simpson 1/3

El método Simpson 1/3 aproxima integrales definidas mediante la fórmula:
<img width="473" height="99" alt="Captura de pantalla 2025-11-26 010229" src="https://github.com/user-attachments/assets/c8890933-8540-4883-8f1c-9dcba86e4ba2" />

La función integracion implementa exactamente esta fórmula.

# Funcionamiento
Definimos la función integracion, que recibe:

una función matemática f

un límite inferior a

un límite superior b

integracion calcula el punto medio

Evalúa la función enviada en esos tres puntos.

Aplica la fórmula de Simpson y devuelve la aproximación.

Para cada integral, se define una función como:

val f1 = (x: Double) => -x*x + 8*x - 12


y se llama a:

integracion(f1, 3, 5)


Finalmente, se imprime el resultado en pantalla con println.

Feature: Sumar dos numeros enteros

    Scenario Outline: Verificar suma de dos numeros enteros
        Given Tengo los numeros "<numero1>" y "<numero2>"
        When realizo la suma
        Then El resultado es "<resultadoEsperado>"
        And Muestra resultado en Pantalla
    Examples:
        | numero1 | numero2 | resultadoEsperado |
        |2        |5        |0                  |
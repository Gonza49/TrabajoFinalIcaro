@validarLogin @PruebaE2E
  Feature: login

    Scenario Outline: Login exitoso con credenciales validas
      Given el usuario esta en el Home
      When el usuario Se dirige a My account
      And el usuario hace click en login
      And el usuario ingresa las siguente credenciales '<email>' y '<password>'
      And hace click en login
      Then deberia poder visualizar la palabra "<resultado>"

      Examples:
      |email|password| resultado |
      |prueba1233@example.com|123456789s| My Account |



@nuevoUsuario @PruebaE2E
  Feature: Nuevo Usuario

    Scenario Outline: Crear un usuario nuevo con campos validos
      Given el usuario está en la página de inicio de OpenCart
      When el usuario hace click en a My Account
      And el usuario selecciona Register
      And el usuario completa el formulario con los siguientes datos '<firstName>', '<lastName>', '<email>' , '<telephone>' ,'<password>' ,'<rePassowrd>'
      And el usuario selecciona Subscribe
      And el usuario acepta los términos y condiciones
      And el usuario hace clic en Continue
      Then Deberia visualizarse el siguente mensaje Congratulations! Your new account has been successfully created!

      Examples:
        | firstName | lastName | email  | telephone  | password | rePassowrd   |
        | Gonzalo   | Torres | prueba4545@example.com | 1234567890 |123456789s| 123456789s |
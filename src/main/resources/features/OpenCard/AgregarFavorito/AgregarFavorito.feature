@AgregarFavorito @PruebaE2E

Feature:Agregar a Favorito
  Scenario: Agregar un producto a favorito
    Given el usuario estás previamente logeado en su cuenta

    When el usuario hace click en Cameras en el menu superior
    Then Tendria que poder visualizar el producto Canon EOS 5D

    When el usuario hace click en el corazón que se encuentra abajo del producto

    When el usuario hace click en Wish List que se encuentra arriba de todo
    Then Tendria que visualizarse en la lista de favorito  Canon EOS 5D
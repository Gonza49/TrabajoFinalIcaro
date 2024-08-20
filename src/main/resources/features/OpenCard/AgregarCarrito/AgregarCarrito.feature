@agregarCarrito @PruebaE2E
  Feature:Agregar producto Carrito
    Scenario: Poder ingresar un producto al carrito
      Given que el usuario está previamente logeado
      When el usuario hace click en Tablets
      Then deberia poder visualizar productos
      And hace click en el botón que se encuentra abajo con el icono de carrito
      When el usuario hace click en ShoppingCard
      Then deberia visualizar el producto previamente añadido
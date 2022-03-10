Feature:
  Scenario: como cliente
            crear y actualizar un user (Todo.ly)

    Given Tengo Acceso a Todo.ly

    When Envio una peticion POST a https://todo.ly/api/user.json con
    """
    {
    "email" : 2doparcial@gmail.com,
    "FullName" : "cristian",
    "Password" : "123456789",
    }
    """

    Then verifico que la respuesta sea 200

    And reviso que la respuesta contenga el FullName igual a "cristian"


    When Envio una peticion PUT  a https://todo.ly/api/user/0.json autentificando con el usuario "2doparcial@gmail.com" y pwd "123456789" con el json
    """
    {
      "FullName" : "CristianUPDATE"
    }
    """
    Then verifico que la respuesta sea 200
    And reviso que la respuesta contenga el FullName igual a "CristianUPDATE"
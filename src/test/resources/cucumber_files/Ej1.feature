Feature:
  Scenario: como cliente
            crear y actualizar un user (Todo.ly)

    Given Tengo Acceso a Todo.ly

    When Envio una peticion POST a https://todo.ly/api/user.json con
    """
    {
    "email" : 2doparcial@gmail.com
    "FullName" : "cristian"
    "Password" : "123456789"
    }
    """

    Then verifico que la respuesta sea 200
    And reviso que la respuesta contenga el FullName igual a "Cristian"
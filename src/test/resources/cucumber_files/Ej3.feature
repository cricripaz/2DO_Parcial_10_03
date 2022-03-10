Feature:
  Scenario: como cliente
  quiero obtener  obtener el token y luego borrar el token (Todo.ly)


    When Envio un Get a https://todo.ly/api/authentication/token.json
    Then Verifico que el codigo de respuesta sea 200

    When Envio un Delete a https://todo.ly/api/authentication/token.json
    Then Verifico que el codigo de respuesta sea 200
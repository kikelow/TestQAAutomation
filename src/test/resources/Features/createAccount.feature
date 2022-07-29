#language: es

Característica: Crear cuenta en wikipedia

  Esquema del escenario: Creacion de cuenta en wikipedia exitosa
    Dado que quiero inscribirme en wikipedia a traves del browser <browser> por la url <url>
    Cuando haga click en la opcion crear cuenta
    Y ingrese mi usuario <user>
    Y ingrese mi password <password>
    Y confirmacion de password <confirmationPassword>
    Entonces ingresare mi correo <email>

    Ejemplos:

      | browser | url                                             | user             | password     | confirmationPassword | email             |
      | chrome  | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Miclave2022* | Miclave2022*         | correo@correo.com |
      | edge    | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Miclave2022* | Miclave2022*         | correo@correo.com |


  Esquema del escenario: Creacion de cuenta en wikipedia con usuario invalido
    Dado que quiero inscribirme en wikipedia a traves del browser <browser> por la url <url>
    Cuando haga click en la opcion crear cuenta
    Y ingrese el usuario invalido <user>
    Entonces se mostrara un mensaje de error <errorMessage>

    Ejemplos:
      | browser | url                                             | user               | errorMessage                                       |
      | chrome  | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022## | No se ha especificado un nombre de usuario válido. |
      | edge    | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022## | No se ha especificado un nombre de usuario válido. |

  Esquema del escenario: Creacion de cuenta en wikipedia con contraseña invalida

    Dado que quiero inscribirme en wikipedia a traves del browser <browser> por la url <url>
    Cuando haga click en la opcion crear cuenta
    Y ingrese mi usuario <user>
    Y ingrese mi contraseña invalida <password>
    Entonces se mostrara el mensaje de error <errorMessage>

    Ejemplos:
      | browser | url                                             | user             | password   | errorMessage                                                   |
      | chrome  | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Harinson20 | Tu contraseña no debe aparecer dentro de tu nombre de usuario. |
      | edge    | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Harinson20 | Tu contraseña no debe aparecer dentro de tu nombre de usuario. |
      | chrome  | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Miclave    | Las contraseñas deben tener al menos 8 caracteres.             |
      | edge    | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Miclave    | Las contraseñas deben tener al menos 8 caracteres.             |

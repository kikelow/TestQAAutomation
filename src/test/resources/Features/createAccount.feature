#language: es

Característica: Crear cuenta en wikipedia

  Esquema del escenario: Creacion de cuenta en wikipedia exitosa
    Dado que quiero inscribirme en wikipedia a traves del browser <browser> por la url <url>
    Cuando haga click en la opcion crear cuenta
    Y ingrese mi usuario <user>
    Y ingrese mi password <password>
    Y confirmacion de password <confirmationPassword>
    Entonces ingresare mi mi correo <email>

    Ejemplos:

      | browser | url                                             | user             | password     | confirmationPassword | email             |
      | chrome  | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Miclave2022* | Miclave2022*         | correo@correo.com |
      | edge    | https://es.wikipedia.org/wiki/Wikipedia:Portada | Harinson20202022 | Miclave2022* | Miclave2022*         | correo@correo.com |


  Esquema del escenario: Creacion de cuenta en wikipedia con usuario invalido

    Ejemplos:

  Esquema del escenario: Creacion de cuenta en wikipedia con contraseña invalida
    Ejemplos:


  Esquema del escenario: Creacion de cuenta con con contraseña menor a los caracteres permitidos

    Ejemplos:
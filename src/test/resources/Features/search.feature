#language: es

Característica: : Realizar busqueda

  Esquema del escenario: : Realizar busqueda doble en wikipedia

    Dado que necesito realizar una busqueda en wikipedia sobre el browser <browser> en la url <BaseUrl>
    Cuando digite en el buscador la palabra <criterioBusqueda>
    Y encuentre el titulo propuesto para la busqueda
    Y vuelva a la pagina principal
    Y hago click sobre la opcion ver historial
    Y selecciono dos revisiones
    Entonces le dare click al boton comparar revisiones

    Ejemplos:

      | BaseUrl                                         | browser | criterioBusqueda |
      | https://es.wikipedia.org/wiki/Wikipedia:Portada | chrome  | sistemas         |
#      | https://es.wikipedia.org/wiki/Wikipedia:Portada | edge    | sistemas         |
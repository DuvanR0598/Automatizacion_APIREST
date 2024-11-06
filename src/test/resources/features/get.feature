#author: Duvan, Juan
#language: es

Característica: Consumo con serenity-rest GET

  Yo como usuario
  Quiero realizar consumos a un servicio de apirest de tipo get
  Para comprobar la robustes de esta y validar si consulta los datos

  Antecedentes:
    Dado "usuario" obtiene la baseurl de la api

  @Successful
  Escenario: Obtener(get) los datos que arroje el consumo de la api
    Cuando configura la peticion a consumir
    Entonces valida estado de la peticion
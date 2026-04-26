JavaDrive_Aitor2

-- DESCRIPCIÓN DEL PROYECTO --
El proyecto JavaDrive consiste en el desarrollo de una aplicación de consola en Java
destinada a gestionar el alquiler de vehículos de una empresa. Su objetivo principal
es crear un sistema funcional que permita administrar clientes, vehículos y
reservas, aplicando conceptos fundamentales de programación orientada a objetos y
buenas prácticas de desarrollo.

La aplicación debe ser capaz de registrar clientes (con datos como DNI, nombre y
teléfono), gestionar una flota de vehículos (coches y furgonetas con características
específicas), y permitir la realización de reservas asociando clientes con vehículos
durante un periodo determinado. Además, el sistema controla la disponibilidad de los
vehículos, genera tickets o contratos de alquiler en archivos de texto y permite
exportar información en formato XML.

-- REQUISITOS --
 -- REQUISITOS FUNCIONALES
    El sistema debe permitir dar de alta clientes indicando, al menos, DNI, nombre y
    teléfono.

    • El sistema debe permitir dar de alta vehículos diferenciando entre coches y
    furgonetas.

    • El sistema debe almacenar para cada vehículo una matrícula única, marca, modelo
    y disponibilidad.

    • En el caso de los coches, se debe registrar el tipo de coche y el número de
    plazas.

    • En el caso de las furgonetas, se debe registrar si son de carga o de pasajeros
    y su capacidad.

    • El sistema debe permitir buscar clientes por DNI.

    • El sistema debe permitir buscar vehículos por matrícula.

    • El sistema debe permitir listar por pantalla los vehículos disponibles para
    alquilar.

    • El sistema debe permitir registrar una reserva asociando un cliente, un
    vehículo y un periodo de alquiler.

    • Al realizar una reserva, el vehículo debe pasar automáticamente a no
    disponible.

    • El sistema debe generar un ticket o contrato de reserva en un fichero de texto.

    • El sistema debe cargar los datos iniciales desde ficheros de texto al arrancar.

    • El sistema debe guardar el estado actualizado de clientes y vehículos antes de 
    salir.

    • El sistema debe ofrecer un menú por consola para que el usuario pueda operar 
    con la aplicación.

    • El sistema debe poder generar un informe corporativo en XML a partir de los 
    datos actuales de clientes y flota.

  -- REQUISITOS TÉCNICOS Y DE CALIDAD
    • La clase Vehiculo debe ser abstracta y servir de superclase para Coche y 
    Furgoneta.

    • Se debe aplicar herencia, encapsulación, sobreescritura de métodos y 
    polimorfismo.

    • El método obtenerDetalles() deberá resolverse de forma polimórfica según el 
    tipo de vehículo.

    • La aplicación deberá separar correctamente vista (app), lógica (logica) y 
    modelo (model).

    • La estructura del proyecto deberá mantenerse versionada en Git desde el inicio.

    • Cada equipo deberá trabajar con ramas y commits descriptivos.

    • El proyecto deberá incluir diagrama de clases UML.

    • El proyecto deberá incluir diseño relacional de base de datos y script SQL 
    básico.

    • El proyecto deberá incorporar pruebas unitarias sobre la lógica principal del 
    sistema.

    • El XML generado deberá poder enlazarse con una hoja XSLT desarrollada en
    Lenguajes de Marcas
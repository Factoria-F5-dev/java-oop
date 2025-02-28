# :euro: La Casa de Papel
El equipo de ladrones, dirigido por El Profesor, ha ingresado a la Fábrica Nacional de Moneda y Timbre con un objetivo claro: imprimir 2.400 millones de euros y escapar sin ser atrapados.
En este simulador, deberás modelar el sistema con clases e interfaces, aplicando los 4 principios de la Programación Orientada a Objetos (abstracción, encapsulación, herencia y polimorfismo). Cada personaje tiene un rol clave y debe interactuar de manera coherente dentro del atraco.

### Tu solución debe incluir
- Personajes con características comunes y específicas, organizados correctamente según sus roles en la historia, con la categoría de ladrón, policía y rehén.
- Una acción de actuar que son acciones diferentes para cada categoría de personaje (ladrón, policía y rehén), asegurando que cada uno cumpla su función dentro del atraco.
- Un sistema de estrategias de los ladrones y la policía, que permita modificar el plan del atraco sin alterar el comportamiento de los personajes.
- Protección de los datos de los personajes, asegurando que la información sensible no sea modificada directamente desde fuera del sistema.

### ¿Cómo lo harás?
1. Piensa qué atributos y métodos necesitan los personajes para desempeñar su papel en la historia, en base al apartado "Personajes" que se encuentra más abajo.
2. Diseña la jerarquía de clases: ¿Qué personajes comparten características? ¿Cuáles son sus diferencias?.
3. Todos los personajes pueden actuar según su categoría.
4. Decide cómo implementar las estrategias de los ladrones y de los policías: ¿Qué opciones tienen para ejecutar su cometido? Los rehenes no tendrán ninguna estrategia.

## Personajes
Estos son los personajes mínimos que crearás, puedes añadir más:
1. Alias: Profesor; Nombre: Sergio Marquina; rol: líder; especialidades: planificación, autor, robo, negociación; categoría: ladrón.
2. Alias: Berlín; Nombre: Andrés Marquina; rol: segundo al mando; especialidades: robo; categoría: ladrón.
3. Alias: Tokio; Nombre: Silene Oliveira; rol: ejecutor; especialidades: robo, asesinato; categoría: ladrón.
4. Alias: Nairobi; Nombre: Ágata Jiménez; rol: ejecutor; especialidades: falsificación - control de calidad - producción del dinero; categoría: ladrón.
5. Alias: Río; Nombre: Anibal Cortés; rol: hacker; especialidades: experto en computación; categoría: ladrón.
6. Alias: Denver; Nombre: Daniel Ramos; rol: ejecutor; especialidades: robo, trabajo duro; categoría: ladrón.
7. Alias: Helsinski; Nombre: Mirko Dragić; rol: ejecutor; especialidades: experto en armas, soldado de guerra, explosivista; categoría: ladrón.
8. Alias: Moscú; Nombre: Agustín Ramos; rol: ejecutor; especialidades: minería - apertura de cajas fuertes - trabajo duro, explosivista; categoría: ladrón.
9. Alias: Oslo; Nombre: Radko Dragić; rol: ejecutor; especialidades: experto en armas, soldado de guerra; categoría: ladrón.
10. Nombre: Mónica Gaztambide; Puesto de trabajo: secretaría; categoría: rehén.
11. Nombre: Arturo Román; Puesto de trabajo: director de la fábrica nacional de la moneda y timbre de España; categoría: rehén.
12. Nombre: Raquel Murillo; Puesto de trabajo: inspectora; categoría: policía.

## Ejercicio:
Cuando tengas todas las clases e interfaces definidas con sus métodos y atributos has de crear objetos e imprimir en la consola lo siguente:

1. The team of thiefs are: Professor, Berlin, Tokyo, Nairobi, Rio, Denver, Helsinki, Moscow, Oslo.
2. The specialties of the Professor are: robbery, planning, negotiation, author.
3. Arturo got Mónica pregnant, he is the director and she is his secretary.
4. Something happens in the following seasons with Raquel the inspector and the Professor.

Al evocar actuar:
1. Tokyo that is the executor is stealing the bank.
2. Mónica that is a secretary is down on the floor in the middle of the robbery.
3. Raquel the inspector is trying to negotiate the release of the hostages.

Al evocar ejecutar plan:
1. Enter the building, close the doors, take out the weapons, gather the hostages and start the plan to print money.
2. Try to contact the leader of the gang, find out how many hostages there are and negotiate their release.

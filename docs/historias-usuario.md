# Historias de usuario

Las historias se agrupan por actividad, siguiendo la técnica de *user story mapping* vista en prácticas.
Cada historia indica su prioridad (**Must**, **Should** o **Could**) y el bloque de trabajo al que pertenece
(**B1**: gastos, línea de comandos, importación y cuentas compartidas; **B2**: consulta, gráficas, filtros y alertas).

## Mapa de historias

| Gestionar gastos | Consultar gastos | Filtrar gastos | Alertas | Cuentas compartidas | Importar gastos |
|---|---|---|---|---|---|
| HU-01 Registrar gasto | HU-07 Ver tabla de gastos | HU-11 Filtrar por meses | HU-15 Crear alerta | HU-19 Crear cuenta equitativa | HU-23 Importar fichero |
| HU-02 Modificar gasto | HU-08 Gráfico de barras | HU-12 Filtrar por fechas | HU-16 Recibir notificación | HU-20 Crear cuenta por porcentajes | |
| HU-03 Borrar gasto | HU-09 Gráfico circular | HU-13 Filtrar por categorías | HU-17 Ver historial | HU-21 Registrar gasto compartido | |
| HU-04 Crear categoría | HU-10 Ver calendario | HU-14 Combinar filtros | HU-18 Borrar alerta | HU-22 Consultar saldos | |
| HU-05 Usar categorías predefinidas | | | | | |
| HU-06 Línea de comandos | | | | | |

---

## Actividad: Gestionar gastos

### HU-01: Registrar gasto (Must, B1)
- **Como** usuario,
- **quiero** registrar un gasto indicando su importe, fecha, categoría y una descripción,
- **para** llevar el control de en qué me gasto el dinero.

**Criterios de aceptación:**
1. **Datos correctos.** Dado que el usuario está en la ventana de nuevo gasto, cuando introduce un importe positivo,
   una fecha y una categoría y pulsa *Guardar*, entonces el gasto queda guardado y aparece en la lista de gastos.
2. **Datos incorrectos.** Dado que el usuario deja vacío el importe o la categoría, o pone un importe que no es
   positivo, cuando pulsa *Guardar*, entonces el sistema no guarda el gasto y muestra qué campo es incorrecto.

### HU-02: Modificar gasto (Must, B1)
- **Como** usuario,
- **quiero** modificar los datos de un gasto ya registrado,
- **para** corregir errores al introducirlo.

**Criterios de aceptación:**
1. **Modificación correcta.** Dado que el usuario ha seleccionado un gasto, cuando cambia sus datos y guarda,
   entonces el gasto queda actualizado en la lista, en las gráficas y en la base de datos.

### HU-03: Borrar gasto (Must, B1)
- **Como** usuario,
- **quiero** borrar un gasto,
- **para** quitar gastos que registré por error.

**Criterios de aceptación:**
1. **Borrado confirmado.** Dado que el usuario ha seleccionado un gasto, cuando pulsa *Borrar* y confirma,
   entonces el gasto desaparece de la lista y de la base de datos.
2. **Borrado cancelado.** Dado que el usuario pulsa *Borrar*, cuando cancela la confirmación,
   entonces el gasto no se borra.

### HU-04: Crear categoría (Must, B1)
- **Como** usuario,
- **quiero** crear nuevas categorías de gasto,
- **para** organizar mis gastos según mis necesidades.

**Criterios de aceptación:**
1. **Categoría nueva.** Dado que el usuario introduce un nombre que no existe, cuando crea la categoría,
   entonces queda disponible al registrar gastos.
2. **Nombre repetido.** Dado que ya existe una categoría con ese nombre (sin distinguir mayúsculas),
   cuando el usuario intenta crearla, entonces el sistema muestra un error y no la crea.

### HU-05: Usar categorías predefinidas (Must, B1)
- **Como** usuario,
- **quiero** que la aplicación traiga categorías ya creadas (alimentación, transporte, entretenimiento...),
- **para** poder registrar gastos desde el primer momento.

**Criterios de aceptación:**
1. **Primer arranque.** Dado que el usuario abre la aplicación por primera vez, cuando va a registrar un gasto,
   entonces puede elegir entre las categorías predefinidas.

### HU-06: Gestionar gastos desde la línea de comandos (Must, B1)
- **Como** usuario,
- **quiero** registrar, modificar y borrar gastos escribiendo comandos,
- **para** gestionar mis gastos sin abrir la interfaz gráfica.

**Criterios de aceptación:**
1. **Registrar.** Dado que el usuario está en la línea de comandos, cuando escribe el comando de alta con
   importe, fecha y categoría válidos, entonces el gasto se guarda y se muestra un mensaje de confirmación.
2. **Modificar y borrar.** Dado un gasto existente, cuando el usuario escribe el comando de modificar o borrar
   con su identificador, entonces el cambio se aplica y se ve también desde la interfaz gráfica.
3. **Comando incorrecto.** Dado que el usuario escribe un comando o un dato no válido, cuando lo ejecuta,
   entonces el sistema muestra un mensaje de error y la ayuda de uso.

## Actividad: Consultar gastos

### HU-07: Ver gastos en una tabla (Must, B2)
- **Como** usuario,
- **quiero** ver mis gastos en una tabla con su fecha, descripción, categoría e importe,
- **para** revisar de un vistazo lo que he gastado.

**Criterios de aceptación:**
1. **Listado.** Dado que hay gastos registrados, cuando el usuario abre la vista de tabla,
   entonces ve todos los gastos ordenados por fecha, del más reciente al más antiguo, y el total.
2. **Sin gastos.** Dado que no hay gastos, cuando abre la vista de tabla,
   entonces se muestra un mensaje indicando que todavía no hay gastos.

### HU-08: Ver gráfico de barras por categoría (Must, B2)
- **Como** usuario,
- **quiero** ver un gráfico de barras con el total gastado en cada categoría,
- **para** comparar en qué gasto más.

**Criterios de aceptación:**
1. **Gráfico.** Dado que hay gastos, cuando el usuario abre la vista de barras,
   entonces ve una barra por categoría con su total.

### HU-09: Ver gráfico circular por categoría (Must, B2)
- **Como** usuario,
- **quiero** ver un gráfico circular con el porcentaje de gasto de cada categoría,
- **para** entender cómo se reparte mi dinero.

**Criterios de aceptación:**
1. **Gráfico.** Dado que hay gastos, cuando el usuario abre la vista circular,
   entonces ve un sector por categoría con su porcentaje sobre el total.

### HU-10: Ver gastos en un calendario (Could, B2)
- **Como** usuario,
- **quiero** ver mis gastos colocados en un calendario,
- **para** ver qué días gasto más.

**Criterios de aceptación:**
1. **Calendario.** Dado que hay gastos, cuando el usuario abre la vista de calendario,
   entonces cada gasto aparece en su día con su descripción e importe.

## Actividad: Filtrar gastos

Los filtros se aplican a todas las vistas de consulta (tabla, gráficas y calendario).

### HU-11: Filtrar por meses (Must, B2)
- **Como** usuario,
- **quiero** filtrar los gastos eligiendo uno o varios meses,
- **para** ver solo lo que gasté en esos meses.

**Criterios de aceptación:**
1. **Varios meses.** Dado que el usuario selecciona julio y agosto, cuando aplica el filtro,
   entonces solo ve los gastos de esos meses.

### HU-12: Filtrar por intervalo de fechas (Must, B2)
- **Como** usuario,
- **quiero** filtrar los gastos entre una fecha de inicio y una de fin,
- **para** ver lo que gasté en un periodo concreto.

**Criterios de aceptación:**
1. **Intervalo válido.** Dado que el usuario indica dos fechas, cuando aplica el filtro,
   entonces ve los gastos entre ambas fechas, incluidas.
2. **Intervalo inválido.** Dado que la fecha de inicio es posterior a la de fin, cuando aplica el filtro,
   entonces el sistema muestra un error y no filtra.

### HU-13: Filtrar por categorías (Must, B2)
- **Como** usuario,
- **quiero** filtrar los gastos eligiendo una o varias categorías,
- **para** ver cuánto gasto en ellas.

**Criterios de aceptación:**
1. **Categorías.** Dado que el usuario selecciona varias categorías, cuando aplica el filtro,
   entonces solo ve los gastos de esas categorías.

### HU-14: Combinar filtros (Must, B2)
- **Como** usuario,
- **quiero** combinar filtros de meses, fechas y categorías,
- **para** hacer consultas como "gastos de transporte en julio y agosto".

**Criterios de aceptación:**
1. **Combinación.** Dado que el usuario activa varios filtros, cuando los aplica,
   entonces solo ve los gastos que cumplen todos a la vez.
2. **Quitar filtros.** Dado que hay filtros activos, cuando el usuario pulsa *Limpiar filtros*,
   entonces vuelve a ver todos los gastos.

## Actividad: Alertas

### HU-15: Crear alerta de gasto (Must, B2)
- **Como** usuario,
- **quiero** crear una alerta con un límite de gasto semanal o mensual, opcionalmente para una categoría,
- **para** que me avise si me paso de lo que quiero gastar.

**Criterios de aceptación:**
1. **Alerta general.** Dado que el usuario indica un límite de 500 € y periodo semanal, cuando guarda la alerta,
   entonces la alerta queda activa para todos los gastos.
2. **Alerta por categoría.** Dado que el usuario indica 100 €, periodo mensual y la categoría *Videojuegos*,
   cuando guarda la alerta, entonces solo cuentan los gastos de esa categoría.
3. **Límite inválido.** Dado que el límite no es positivo, cuando intenta guardar, entonces se muestra un error.

### HU-16: Recibir notificación al superar un límite (Must, B2)
- **Como** usuario,
- **quiero** recibir una notificación cuando un gasto me haga superar el límite de una alerta,
- **para** enterarme a tiempo y controlar el gasto.

**Criterios de aceptación:**
1. **Se supera el límite.** Dado una alerta mensual de 100 € con 90 € gastados este mes, cuando el usuario
   registra un gasto de 20 €, entonces se genera una notificación indicando la alerta y el total alcanzado.
2. **Sin repetir.** Dado que el límite ya se superó en el periodo actual, cuando el usuario registra otro gasto
   en ese mismo periodo, entonces no se genera una notificación nueva para esa alerta.

### HU-17: Consultar historial de notificaciones (Must, B2)
- **Como** usuario,
- **quiero** ver todas las notificaciones pasadas,
- **para** revisar cuándo me he pasado de mis límites.

**Criterios de aceptación:**
1. **Historial.** Dado que se han generado notificaciones, cuando el usuario abre el historial,
   entonces las ve todas ordenadas por fecha, con las no leídas destacadas.
2. **Marcar como leída.** Dado una notificación no leída, cuando el usuario la abre, entonces queda como leída.

### HU-18: Borrar alerta (Should, B2)
- **Como** usuario,
- **quiero** borrar una alerta que ya no necesito,
- **para** dejar de recibir sus avisos.

**Criterios de aceptación:**
1. **Borrado.** Dado una alerta existente, cuando el usuario la borra, entonces deja de generar notificaciones,
   pero las notificaciones que ya generó siguen en el historial.

## Actividad: Cuentas compartidas

### HU-19: Crear cuenta compartida equitativa (Must, B1)
- **Como** usuario,
- **quiero** crear una cuenta compartida con un nombre y una lista de personas,
- **para** repartir gastos a partes iguales con ellas.

**Criterios de aceptación:**
1. **Cuenta creada.** Dado que el usuario indica un nombre y al menos dos personas, cuando crea la cuenta,
   entonces la cuenta existe con todos los saldos a 0.
2. **Lista fija.** Dado una cuenta ya creada, cuando el usuario la consulta,
   entonces no tiene opción de añadir ni quitar personas.

### HU-20: Crear cuenta compartida por porcentajes (Must, B1)
- **Como** usuario,
- **quiero** crear una cuenta compartida indicando qué porcentaje del gasto asume cada persona,
- **para** repartir gastos de forma no equitativa.

**Criterios de aceptación:**
1. **Porcentajes correctos.** Dado que los porcentajes suman 100 %, cuando el usuario crea la cuenta,
   entonces la cuenta queda creada con esos porcentajes.
2. **Porcentajes incorrectos.** Dado que los porcentajes no suman 100 %, cuando intenta crearla,
   entonces el sistema muestra un error y no la crea.

### HU-21: Registrar gasto en una cuenta compartida (Must, B1)
- **Como** usuario,
- **quiero** registrar un gasto en una cuenta compartida indicando qué persona lo ha pagado,
- **para** que se actualice lo que debe cada uno.

**Criterios de aceptación:**
1. **Reparto equitativo.** Dado una cuenta equitativa de Raquel, Luis y María, cuando se registra un gasto de
   30 € pagado por Raquel, entonces el saldo de Raquel es +20 € y el de Luis y María −10 €.
2. **Reparto por porcentajes.** Dado una cuenta con Raquel 40 %, Luis 30 % y María 30 %, cuando se registra
   un gasto de 30 € pagado por Raquel, entonces el saldo de Raquel es +18 € y el de Luis y María −9 €.

### HU-22: Consultar saldos de una cuenta compartida (Must, B1)
- **Como** usuario,
- **quiero** ver el saldo de cada persona de una cuenta compartida,
- **para** saber quién debe dinero y a quién.

**Criterios de aceptación:**
1. **Saldos.** Dado una cuenta con gastos, cuando el usuario la abre, entonces ve el saldo de cada persona,
   y la suma de todos los saldos es 0.

## Actividad: Importar gastos

### HU-23: Importar gastos desde un fichero (Must, B1)
- **Como** usuario,
- **quiero** importar los gastos de un fichero exportado de mi banco,
- **para** no tener que introducirlos a mano.

**Criterios de aceptación:**
1. **Fichero válido.** Dado el fichero CSV de ejemplo del banco, cuando el usuario lo importa,
   entonces sus gastos se añaden a la aplicación y se muestra cuántos se han importado.
2. **Categoría desconocida.** Dado que el fichero trae una categoría que no existe, cuando se importa,
   entonces la categoría se crea automáticamente.
3. **Fichero incorrecto.** Dado un fichero con un formato no soportado o líneas mal formadas, cuando se importa,
   entonces se muestra un error indicando las líneas problemáticas y no se importa nada a medias.

---

## Requisitos no funcionales

- **RNF-1. Aplicación de escritorio.** La interfaz gráfica se implementa con JavaFX.
- **RNF-2. Persistencia.** Todos los datos se guardan con JDBC en una base de datos SQLite, accediendo a ella
  mediante el patrón Repositorio.
- **RNF-3. Gestión del proyecto.** Las dependencias se gestionan con Maven y el código con Git en GitHub.
- **RNF-4. Formatos de importación extensibles.** Se debe poder añadir un formato de fichero nuevo sin modificar
  el código que usa el importador (patrones Adaptador y Método Factoría).

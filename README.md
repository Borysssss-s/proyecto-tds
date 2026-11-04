# Gestión de Gastos — Proyecto TDS 2026/27

Aplicación de escritorio para registrar y controlar gastos personales: categorías, filtros, gráficas,
alertas de gasto, cuentas compartidas e importación de gastos desde ficheros externos.
Interfaz gráfica en JavaFX y persistencia con JDBC (SQLite).

## Integrantes

| Nombre | Correo | Subgrupo |
|---|---|---|
| Boryslav Tkachuk | boryslav.t@um.es | 2.3 |
| Diego Sergio Ballesta González | dsergio.ballesta@um.es | 3.4 |

## Cómo ejecutar

Solo hace falta un JDK 21 o superior. No hace falta instalar Maven: el proyecto incluye el Maven Wrapper.

Windows:

```
mvnw.cmd javafx:run
```

Linux / macOS:

```
./mvnw javafx:run
```

## Documentación

La documentación del proyecto está en la carpeta [`docs/`](docs/):

- [Historias de usuario](docs/historias-usuario.md)
- [Modelo del dominio](docs/modelo-dominio.md)

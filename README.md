# Patrón Chain of Responsibility (Cadena de Responsabilidad)

El **Chain of Responsibility** (Cadena de Responsabilidad) es un patrón de diseño **comportamental** que permite pasar solicitudes a lo largo de una cadena de manejadores. Al usar este patrón, varios objetos tienen la oportunidad de manejar una solicitud sin que el emisor necesite conocer cuál de ellos lo hará.

---

##  ¿Cuándo usar este patrón?

- Cuando múltiples objetos pueden manejar una solicitud y el manejador específico no se conoce de antemano.
- Cuando deseas desacoplar el emisor de la solicitud del receptor.
- Cuando los manejadores deben decidir en tiempo de ejecución si procesan o pasan la solicitud.

---

##  Estructura del patrón

```plaintext
Client → Handler1 → Handler2 → Handler3 → ...

En este caso particular se uso para dividir manejadores en una operación de devolución de dinero

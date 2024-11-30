# ¿Qué es HTTP?

El **Protocolo de Transferencia de Hipertexto (HTTP)** es el estándar que rige el intercambio de información en la **World Wide Web**. Diseñado inicialmente a principios de los años 90, HTTP es un protocolo de **capa de aplicación** que permite la comunicación entre dispositivos en red, fundamentalmente entre clientes (como navegadores web) y servidores. Su diseño se basa en un modelo cliente-servidor, en el cual el cliente realiza peticiones y el servidor responde con los datos o recursos solicitados, como páginas HTML, imágenes, videos, entre otros.

Aunque inicialmente fue creado para transferir documentos de hipertexto, su flexibilidad y capacidad de expansión han permitido que sea utilizado para una variedad de propósitos, como el envío de datos en formularios y la transmisión de contenidos multimedia. HTTP funciona principalmente sobre protocolos de transporte como **TCP** o **TLS** (en el caso de conexiones seguras mediante HTTPS), asegurando la fiabilidad de la comunicación.

---

## Arquitectura de HTTP

HTTP sigue una arquitectura **cliente-servidor**, donde el cliente es típicamente un navegador web o cualquier herramienta que actúe en nombre del usuario, y el servidor es el encargado de *"servir"* los recursos solicitados. Esta arquitectura puede incluir intermediarios llamados **proxies**, que realizan funciones adicionales como caching, balanceo de carga, filtrado, autenticación o registro de eventos.

Cada intercambio en HTTP consta de dos componentes principales:  
1. **Peticiones HTTP**: Mensajes enviados por el cliente solicitando datos o recursos.
2. **Respuestas HTTP**: Mensajes enviados por el servidor como respuesta a esas solicitudes.

---

## ¿Qué contiene una petición HTTP?

Una **petición HTTP** es un mensaje estructurado que el cliente envía al servidor para solicitar información o realizar alguna acción. Incluye los siguientes componentes:  

- **Versión de HTTP**: Indica la versión del protocolo utilizada (por ejemplo, HTTP/1.1 o HTTP/2).  
- **URL**: Es la dirección del recurso solicitado.  
- **Método HTTP**: Define la acción a realizar (por ejemplo, `GET`, `POST`, `PUT`, etc.).  
- **Encabezados HTTP**: Proveen información adicional como el tipo de navegador, el formato de datos aceptado, etc.  
- **Cuerpo de la petición** (opcional): Contiene datos que el cliente desea enviar al servidor, como los campos de un formulario.  

### Métodos HTTP  

Los métodos HTTP, también llamados **verbos HTTP**, definen el propósito de una solicitud. Algunos de los más comunes son:  
- **GET**: Solicita datos desde el servidor (generalmente no modifica nada).  
- **POST**: Envía datos al servidor, comúnmente para crear recursos o enviar información en formularios.  
- **PUT**: Actualiza o reemplaza recursos existentes en el servidor.  
- **DELETE**: Elimina recursos en el servidor.  
- **HEAD**: Solicita información sobre un recurso sin descargar el cuerpo de la respuesta.  
- **OPTIONS**: Pregunta qué métodos están soportados por el servidor.  

### Cabeceras de la petición  

Las **cabeceras HTTP** son pares clave-valor que transportan información importante, como:  
- El tipo de contenido aceptado (`Accept`).  
- Información sobre el cliente (`User-Agent`).  
- Configuración de la conexión (`Connection`).  

### Cuerpo de la petición  

En algunas peticiones, como las de tipo `POST`, el **cuerpo** contiene datos que el cliente envía al servidor. Por ejemplo, cuando un usuario llena un formulario en línea, esa información se incluye en el cuerpo de la petición.  

---

## ¿Qué contiene una respuesta HTTP?  

Cuando el servidor recibe una petición, responde con un mensaje HTTP que incluye los siguientes elementos:  

- **Código de estado HTTP**: Indica el resultado de la petición.  
- **Cabeceras de respuesta HTTP**: Contienen información adicional sobre los datos enviados.  
- **Cuerpo de la respuesta** (opcional): Contiene los datos solicitados, como el HTML de una página web.  

### Código de estado HTTP  

Los **códigos de estado** son números de tres dígitos que indican el resultado de la petición. Están agrupados en cinco categorías principales:  
1. **1xx Informativos**: Indican que la solicitud está siendo procesada.  
2. **2xx Éxito**: La solicitud se procesó correctamente (ejemplo: `200 OK`).  
3. **3xx Redirección**: Indican que se debe realizar otra acción para completar la solicitud (ejemplo: `301 Moved Permanently`).  
4. **4xx Errores del cliente**: Indican que hubo un problema con la solicitud (ejemplo: `404 Not Found`).  
5. **5xx Errores del servidor**: Indican que el servidor no pudo procesar la solicitud (ejemplo: `500 Internal Server Error`).  

### Cabeceras de respuesta  

Las cabeceras de respuesta contienen información como:  
- Tipo de contenido (`Content-Type`, por ejemplo, `text/html` o `application/json`).  
- Fecha de la respuesta (`Date`).  
- Información de caché (`Cache-Control`).  

### Cuerpo de la respuesta  

El cuerpo de una respuesta HTTP contiene los datos solicitados, como el HTML de una página, un archivo JSON, o incluso contenido multimedia como imágenes o videos.  

---

## Características clave de HTTP  

1. **Simplicidad**: Su diseño permite que sea fácil de implementar y entender.  
2. **Extensibilidad**: Las cabeceras permiten agregar nuevas funcionalidades sin afectar la compatibilidad.  
3. **Protocolo sin estado**: Cada interacción es independiente; no se conserva información entre solicitudes. Esto puede complementarse con tecnologías como las cookies para gestionar sesiones.  
4. **Conexiones persistentes**: En HTTP/1.1 y versiones superiores, una sola conexión TCP puede manejar múltiples solicitudes, mejorando la eficiencia.  

---

## Limitaciones de HTTP  

- **Falta de seguridad**: HTTP en su versión estándar no encripta los datos, por lo que puede ser interceptado. Esta limitación se resuelve utilizando HTTPS, que cifra las comunicaciones mediante TLS.  
- **Sin estado**: Aunque mejora el rendimiento, la falta de persistencia entre solicitudes puede ser un inconveniente para aplicaciones que necesitan recordar interacciones previas.  

---

## HTTP y ataques DDoS  

Al ser un protocolo **sin estado**, HTTP es vulnerable a ataques de denegación de servicio (DDoS). En estos ataques, un atacante envía un volumen masivo de solicitudes HTTP a un servidor, sobrecargándolo y dificultando su capacidad de responder a solicitudes legítimas.  

---

## Evolución del protocolo  

HTTP ha evolucionado significativamente desde su primera versión:  
- **HTTP/1.0**: Introdujo las cabeceras y la separación de mensajes.  
- **HTTP/1.1**: Incorporó conexiones persistentes y codificación por trozos.  
- **HTTP/2**: Mejoró la velocidad con técnicas como la multiplexación.  
- **HTTP/3**: Basado en QUIC, un protocolo más rápido que TCP, para reducir la latencia.  

---

## Artículos Recomendados
Aquí tienes algunos artículos recomendados por [roadmap.sh](https://roadmap.sh/backend) que te ayudarán a comprender qué es http y otros conceptos relacionados:

1. [¿Qué es HTTP?](https://www.cloudflare.com/es-la/learning/ddos/glossary/hypertext-transfer-protocol-http/)  
   Una guía sencilla ofrecida por Cloudflare que explica los conceptos básicos y la importancia del protocolo HTTP.

2. [Generalidades del protocolo HTTP](https://developer.mozilla.org/es/docs/Web/HTTP/Overview)  
   Recurso oficial de Mozilla que ofrece una visión integral sobre cómo funciona HTTP, desde los fundamentos hasta los encabezados.

3. [HTTP/3: Core Concepts (Parte 1)](https://www.smashingmagazine.com/2021/08/http3-core-concepts-part1/#top)  
   Un artículo detallado que desglosa los conceptos principales de HTTP/3, la última versión del protocolo, para desarrolladores interesados en optimizar el rendimiento web.

---

## Conclusión
HTTP es el corazón de la comunicación en la web, su flexibilidad y evolución lo han convertido en un estándar indispensable para el desarrollo de aplicaciones en línea. Su diseño modular y extensible ha permitido su uso en una variedad de aplicaciones más allá de la navegación web tradicional, convirtiéndolo en una pieza clave para el funcionamiento de Internet.
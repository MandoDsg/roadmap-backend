# DNS

El Sistema de Nombres de Dominio (DNS, por sus siglas en inglés) es una de las piezas fundamentales que permiten el funcionamiento de Internet tal como lo conocemos hoy en día. A continuación, exploraremos en detalle qué es, cómo funciona, y los componentes y procesos clave que hacen posible su operación.

---

## ¿Qué es el DNS?

El DNS es esencialmente la "agenda telefónica" de Internet. Mientras que las personas usamos nombres de dominio como `example.com` para acceder a sitios web, las computadoras y otros dispositivos conectados a Internet necesitan comunicarse utilizando direcciones IP. Estas direcciones son secuencias numéricas (por ejemplo, `192.168.1.1` en IPv4 o `2400:cb00:2048:1::c629:d7a2` en IPv6) que identifican de manera única a cada dispositivo en la red.

El DNS actúa como un traductor que convierte nombres de dominio legibles por humanos en direcciones IP comprensibles para las máquinas, lo que permite a los navegadores cargar los recursos de Internet correspondientes.

---

## ¿Cómo funciona el DNS?

El proceso de resolución de DNS se encarga de traducir un nombre de dominio (por ejemplo, `www.example.com`) en su dirección IP asociada. Esto es esencial porque los navegadores web necesitan conocer la dirección IP para acceder al contenido de un sitio web. La traducción de DNS ocurre "detrás de escena" y no requiere la interacción directa del usuario.

El funcionamiento del DNS puede resumirse en un conjunto de pasos, y varios componentes de hardware y software participan en el proceso. A continuación, se detallan los principales actores y su rol:

### Componentes clave del sistema DNS

1. **Recursor DNS**  
   Es el intermediario inicial que recibe la solicitud del cliente (generalmente un navegador web). Actúa como un "bibliotecario" que busca la información requerida haciendo consultas a otros servidores DNS hasta encontrar la dirección IP solicitada.

2. **Servidor de nombres raíz**  
   Es el primer punto de referencia en la consulta. Este servidor no contiene las direcciones IP directamente, pero indica al recursor dónde buscar más información. Es como un índice en una biblioteca que dirige al estante correcto.

3. **Servidor de nombres TLD (Top-Level Domain)**  
   Maneja información específica del dominio de nivel superior, como `.com`, `.org`, o `.net`. Por ejemplo, si el dominio solicitado es `example.com`, este servidor dirige la consulta hacia los servidores responsables del dominio `example.com`.

4. **Servidor de nombres autorizado**  
   Es el componente final del proceso. Contiene los registros de recursos DNS (por ejemplo, la dirección IP de un dominio) y responde al recursor con la información solicitada. Es la fuente de datos confiable para el dominio específico.

---

## Pasos en la resolución de DNS

El proceso completo de resolución de DNS, sin almacenamiento en caché, incluye los siguientes pasos:

1. **El usuario ingresa un dominio en el navegador.**  
   La solicitud viaja desde la computadora del usuario al recursor DNS.

2. **El recursor consulta un servidor raíz.**  
   El servidor raíz responde indicando cuál es el servidor TLD correspondiente al dominio solicitado.

3. **El recursor consulta el servidor TLD.**  
   El TLD proporciona la ubicación del servidor de nombres autorizado para el dominio.

4. **El recursor consulta el servidor autorizado.**  
   Este servidor responde con la dirección IP asociada al nombre de dominio solicitado.

5. **El recursor devuelve la dirección IP al navegador.**  
   Con esta información, el navegador puede comunicarse directamente con el servidor web para cargar el contenido.

6. **El navegador realiza una solicitud HTTP o HTTPS al servidor web.**  
   El servidor web responde con los recursos necesarios (páginas, imágenes, scripts, etc.) para mostrar el sitio al usuario.

---

## Tipos de consultas DNS

Para optimizar el proceso de resolución, existen tres tipos principales de consultas:

1. **Consulta recursiva**  
   El cliente solicita al servidor DNS que encuentre la respuesta completa, o devuelva un mensaje de error si no se encuentra.

2. **Consulta iterativa**  
   El servidor DNS responde con la mejor información que tiene (como una referencia a otro servidor), y el cliente sigue consultando a los servidores referenciados hasta encontrar la respuesta.

3. **Consulta no recursiva**  
   Ocurre cuando el servidor DNS ya tiene la información solicitada en su caché y puede responder directamente sin necesidad de realizar más consultas.

---

## Caché de DNS

El almacenamiento en caché es un mecanismo clave para mejorar el rendimiento del DNS. Los datos se almacenan temporalmente en diferentes ubicaciones para reducir la latencia y la carga en los servidores. El caché puede encontrarse en:

- **El navegador web.** Los navegadores modernos almacenan registros DNS para acelerar futuras solicitudes.
- **El sistema operativo.** La resolución de DNS a nivel local revisa primero su propio caché antes de enviar la consulta al recursor.
- **Servidores DNS intermedios.** Los servidores de proveedores como Google DNS o OpenDNS almacenan respuestas recientes para atender rápidamente consultas similares.

El tiempo que un registro permanece en caché depende del campo *TTL* (Tiempo de Vida) definido en el registro DNS.

---

## Consultas DNS y subdominios

Cuando la consulta es para un subdominio (por ejemplo, `blog.example.com`), puede haber pasos adicionales en el proceso. El servidor de nombres autorizado para el dominio principal (`example.com`) debe redirigir la solicitud al servidor que gestiona el subdominio (`blog`), aumentando la complejidad del proceso.

---

## Diferencias entre servidores recursivos y autorizados

- **Servidor recursivo:**  
  Es el que realiza múltiples consultas en nombre del cliente hasta obtener la información solicitada. Está al inicio del proceso.
  
- **Servidor autorizado:**  
  Es el que contiene y proporciona los registros de DNS definitivos para un dominio. Es la última parada en la cadena de resolución.

---

## Artículos recomendados

Aquí tienes algunos artículos recomendados por [roadmap.sh](https://roadmap.sh/backend) que te ayudarán a comprender qué es y cómo funciona el DNS y otros conceptos relacionados:

1. [¿Qué es el DNS?](https://www.cloudflare.com/es-la/learning/dns/what-is-dns/)  
  Este artículo ofrece una explicación clara y concisa sobre los conceptos básicos del DNS, sus componentes y la importancia de este sistema en Internet.

1. [How DNS Works](https://howdns.works/es/)  
  Una guía visual e interactiva en forma de cómic que explica de manera detallada y entretenida cómo funciona el sistema de DNS, desde la solicitud inicial hasta la resolución final.

---

## Conclusión

El DNS permite a los usuarios interactuar con Internet de forma intuitiva, utilizando nombres en lugar de direcciones IP complejas. Además, su diseño distribuido y eficiente asegura que el sistema pueda manejar miles de millones de solicitudes diarias en todo el mundo. Sin el DNS, navegar por la web sería significativamente más complicado y menos accesible para la mayoría de las personas.
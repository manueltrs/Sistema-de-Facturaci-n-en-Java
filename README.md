# Sistema-de-Facturacion-en-Java

Proyecto desarrollado en Java que permite registrar productos, calcular el subtotal de una compra, aplicar descuentos automáticos y mostrar un resumen final en consola.
Este proyecto aplica los conceptos básicos de Programación Orientada a Objetos (POO).

📌 Objetivo

# Desarrollar un sistema sencillo de facturación que:
* Permita ingresar el nombre del cliente
* Permita registrar varios productos
* Calcule el subtotal automáticamente
* Aplique descuentos según el total de la compra
* Muestre un resumen final organizado

🏗 Estructura del Proyecto
📁 SistemaFacturacion
 ├── Main.java
 ├── Factura.java
 └── Producto.java
 
🔹 Main.java
Clase principal que:
* Solicita los datos al usuario
* Crea la factura
* Agrega los productos
* Muestra el resumen final

🔹 Producto.java
Clase que representa un producto con:
* Nombre
* Precio

🔹 Factura.java
Clase encargada de:
* Guardar los productos
* Calcular el subtotal
* Aplicar descuentos
* Mostrar el resumen de compra

🧮 Reglas de Descuento
* 10% de descuento si el subtotal supera $100.000
* 15% de descuento si el subtotal supera $200.000
* No hay descuento si el subtotal es menor o igual a $100.000

# Ejemplo de Funcionamiento

El programa pedirá:
* Nombre del cliente
* Cantidad de productos
* Nombre y precio de cada producto
Luego mostrará en pantalla:
* Lista de productos
* Subtotal
* Descuento aplicado
* Total a pagar

👨‍💻 Autor
Jose Manuel
Proyecto académico – Programación en Java

# 🧠 Actividad Formativa Semana 7 – Llanquihue Tour

## 👤 Autor del proyecto
* **Nombre completo:** Braulio Meriño Valdivia
* **Carrera:** Desarrollo de Aplicaciones
* **Sede:** Campus Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Actividad Formativa de la Semana de la asignatura Desarrollo Orientado a Objetos I. En esta etapa, el sistema de la agencia Llanquihue Tour se ha expandido hacia una versión funcional capaz de gestionar y recorrer de forma dinámica y centralizada sus diversos tipos de servicios turísticos. 

La aplicación destaca por aplicar de forma práctica los siguientes pilares y conceptos avanzados de la programación orientada a objetos (POO):
 Colecciones Polimórficas - Sobrescritura de Métodos (@Override) - Polimorfismo Dinámico - Operador instanceof.

---

## 🧱 Estructura general del proyecto
El código fuente se encuentra organizado de manera modular bajo paquetes específicos, cumpliendo con los estándares de arquitectura limpia y separación de responsabilidades:

```text
📁 src/main/java/
├── model/       # Clases de dominio y negocio (ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural).
├── data/        # Capa de datos. Aloja 'GestorServicios.java' encargado de inicializar la colección polimórfica de prueba.
├── service/     # Lógica de servicios. Contiene 'ServicioTour.java' para el recorrido polimórfico y uso de instanceof.
└── ui/          # Capa de usuario. Aloja la clase principal 'Main.java' que ejecuta el despliegue por consola.

```
*Debes tener la versión 23 de Java o posterior.
 
⚙️ Instrucciones para clonar y ejecutar el proyecto

1) Crea una carpeta vacía con un nombre para identificar el proyecto

- Haz clic derecho dentro de la carpeta, pulsa el botón 'Abrir en terminal'.

2) Una vez que en la terminal escribe lo siguiente:
   git clone https://github.com/BraulioVevo/LlanquihueTour_S7.git

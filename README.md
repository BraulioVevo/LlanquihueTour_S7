# 🧠 Actividad Formativa Semana 7 – Llanquihue Tour App V2

## 👤 Autor del proyecto
* **Nombre completo:** Braulio Meriño Valdivia
* **Carrera:** Desarrollo de Aplicaciones
* **Sede:** Campus Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Actividad Formativa de la **Semana 7** de la asignatura *Desarrollo Orientado a Objetos I*. En esta etapa, el sistema de la agencia **Llanquihue Tour** se ha expandido hacia una versión funcional capaz de gestionar y recorrer de forma dinámica y centralizada sus diferentes servicios turísticos.

La aplicación destaca por aplicar de forma práctica los siguientes pilares y conceptos avanzados de la programación orientada a objetos (POO):
* **Colecciones Polimórficas:** Centralización de diversos servicios de la agencia dentro de una única estructura genérica (`ArrayList<ServicioTuristico>`).
* **Sobrescritura de Métodos (@Override):** Especialización del comportamiento del método `mostrarInformacion()` en cada una de las subclases para desplegar atributos específicos.
* **Polimorfismo Dinámico:** Recorrido automatizado de colecciones invocando comportamientos en tiempo de ejecución desde referencias de la superclase.
* **Operador instanceof:** Identificación y filtrado preciso del tipo de instancia en tiempo de ejecución para personalizar las cabeceras visuales del flujo.

---

## 🧱 Estructura general del proyecto
El código fuente se encuentra organizado de manera modular bajo paquetes específicos, cumpliendo con los estándares de arquitectura limpia y separación de responsabilidades:

```text
📁 src/main/java/
├── model/       # Clases de dominio y negocio (ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural).
├── data/        # Capa de datos. Aloja 'GestorServicios.java' encargado de inicializar la colección polimórfica de prueba.
├── service/     # Lógica de servicios. Contiene 'ServicioTour.java' para el recorrido polimórfico y uso de instanceof.
└── ui/          # Capa de usuario. Aloja la clase principal 'Main.java' que ejecuta el despliegue por consola.
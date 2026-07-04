package model;

/**
 * Clase ServicioTuristico es la base que representa un servicio generico de Llanquihue Tour
 * Al ser la base (superclase) sirve para modelar otros serivicios más especificos.
 */

public class ServicioTuristico {
    private String nombre;
    private double duracionHoras;
    private int cantidadUsuarios;

    /**
     * Constructor, para registrar un servicio turístico general
     * @param nombre El nombre de un Servicio turistico
     * @param duracionHoras Indica la duración estimada del tour
     * @param cantidadUsuarios Representa el numero Maximo/sugerido de participantes en cada tour
     */

    public ServicioTuristico(String nombre, double duracionHoras, int cantidadUsuarios) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.cantidadUsuarios = cantidadUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }

    /**
     * Muestra por consola la información detallada del servicio turistico
     */

    public void mostrarInformacion() {
        System.out.println("Nombre del Servicio: " + nombre +
                " | Duración: " + duracionHoras + " horas" +
                "\n | Cantidad Usuarios: " + cantidadUsuarios);
    }
}

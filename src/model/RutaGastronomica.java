package model;

/**
 * La clase representa una ruta gastronomica de Llanquihue Tour.
 * extends/herencia de {@link ServicioTuristico} agregando paradas de degustación.
 */

public class RutaGastronomica extends ServicioTuristico {

    private int cantidadDeParadas;

    /**
     * Constructor para crear una nueva ruta gastronómica
     * @param nombre Representa el nombre del tour gastronómico
     * @param duracionHoras Indica la duración aproximada del recorrido.
     * @param cantidadUsuarios La cantidad de participantes maximo
     * @param cantidadDeParadas Representa la cantidad de paradas gastronómicas por realizar en el recorrido.
     */
    public RutaGastronomica(String nombre, double duracionHoras, int cantidadUsuarios, int cantidadDeParadas) {
        super(nombre, duracionHoras, cantidadUsuarios);
        this.cantidadDeParadas = cantidadDeParadas;
    }

    public int getCantidadDeParadas() {
        return cantidadDeParadas;
    }

    public void setCantidadDeParadas(int cantidadDeParadas) {
        this.cantidadDeParadas = cantidadDeParadas;
    }

    /**
     * Imprime por consola los atributos heredados de la clase base, más
     * el atributo especifico de la clase RutaGastronomica.
     */

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Ruta Gastronomica ===" +
                "\nNombre: " + getNombre() + " | Duración de tour: " + getDuracionHoras() + " horas." +
                "\nCantidad de Usuarios: " + getCantidadUsuarios() + " | Cantidad de paradas: " + getCantidadDeParadas());
    }
}

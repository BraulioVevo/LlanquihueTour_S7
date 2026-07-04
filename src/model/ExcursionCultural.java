package model;

/**
 * La clase representa una excursión culturual guiada
 * extends/herencia de {@link ServicioTuristico} agrega el nombre de un lugar historico por visitar
 */
public class ExcursionCultural extends ServicioTuristico{

    private String lugarHistorico;

    /**
     * Constructor para instanciar una Excursión Cultural
     * @param nombre Representa el nombre de la excursión por realizar
     * @param duracionHoras Indica la duración del recorrido
     * @param cantidadUsuarios Indica el numero de cupos para los visitantes
     * @param lugarHistorico El nombre del sitio que será visitado
     */
    public ExcursionCultural(String nombre, double duracionHoras, int cantidadUsuarios, String lugarHistorico) {
        super(nombre, duracionHoras, cantidadUsuarios);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Imprime por consola los atributos heredados de la clase base, más
     * el atributo especifico de la clase ExcursionCultural.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("=== Excursion Cultural ===");
        System.out.println("Nombre: " + getNombre() +  "Duracion Horas: " + getDuracionHoras() + " Horas." +
                "\nCantidad de Usuarios: " + getCantidadUsuarios() + " | Lugar historico por visitar: " + lugarHistorico);
    }
}

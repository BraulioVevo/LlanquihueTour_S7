package model;

/**
 * Representa un paseo Lacustre por el lago Llanquihue
 * extends/herencia de {@link ServicioTuristico} especificando el tipo embarcación.
 */

public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;

    /**
     * Constructor para crear un nuevo paseo Lacustre.
     * @param nombre Indica el nombre del paseo.
     * @param duracionHoras Indica el tiempo aproximado que dura la navegación.
     * @param cantidadUsuarios Indica la cantidad de usuarios máximo permitidos a bordo.
     * @param tipoEmbarcacion Indica el tipo de transporte maritimo (ej: "Velero", "Lancha" etc.
     */
    public PaseoLacustre(String nombre, double duracionHoras, int cantidadUsuarios, String tipoEmbarcacion) {
        super(nombre, duracionHoras, cantidadUsuarios);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Imprime por consola los atributos heredados de la clase base, más
     * el atributo especifico de la clase PaseoLacustre.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("=== Paseo Lacustre ==="
                + "\nNombre: " + getNombre() + " | Duración Horas: " + getDuracionHoras() + " Horas."
                + "\nCantidad de Usuarios: " + getCantidadUsuarios() +" | Tipo de embarcación: " + tipoEmbarcacion);
    }
}

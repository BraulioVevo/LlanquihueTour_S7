package data;

import model.*;
import java.util.ArrayList;

/**
 * Clase encargada de manejar la logica representativa y creación de ejemplares de prueba
 * para los distintos servicios turisticos de Llanquihue Tour.
 */

public class GestorServicios {
    /**
     * Genera una colección polimórfica que contiene una muestra de diversos
     * servicios turisticos en la agencia Llanquihue Tour
     * @return servicios de la clase Base y herencias que se despliegan por consola.
     */
    public ArrayList <ServicioTuristico> generarTour() {

        ArrayList<ServicioTuristico> tour = new ArrayList<>();

        tour.add(new ServicioTuristico("Tour Basico", 1.1, 14));
        tour.add(new RutaGastronomica("Ruta del Kuchen", 1.3, 12, 4));
        tour.add(new PaseoLacustre("Paseo por el lago", 1.2, 10, "Velero"));
        tour.add(new ExcursionCultural("Paseo Patrimonial", 1.5, 7,"Museo Colono Aleman"));
        tour.add(new RutaGastronomica("Las delicias del Sur", 1.4, 9, 3));

        return tour;
    }
}



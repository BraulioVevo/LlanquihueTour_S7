package ui;

import model.*;
import data.GestorServicios;
import service.ServicioTour;

import java.util.ArrayList;

/**
 * Clase Main que sirve como punto de despliegue en consola de los servicios generados
 * mediante el {@link data.GestorServicios}
 */

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        ServicioTour  servicio = new ServicioTour();

        ArrayList<ServicioTuristico> tour = gestor.generarTour();

        servicio.mostrarServicios(tour);
    }
}
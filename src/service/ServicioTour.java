package service;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;

public class ServicioTour {

    public void mostrarServicios (ArrayList <ServicioTuristico> servicios){

        System.out.println("=== Listado de servicios turisticos ===");

        for (ServicioTuristico servicio : servicios) {
            System.out.println("--------------------------------------");

            if (servicio instanceof ExcursionCultural) {

                System.out.println("Tipo de tour: Tour cultural");
                System.out.println();

            } else if (servicio instanceof PaseoLacustre) {

                System.out.println("Tipo de tour: Lacustre");
                System.out.println();

            } else if (servicio instanceof RutaGastronomica) {


                System.out.println("Tipo de tour: Gastronomico");
                System.out.println();

            }else {
                System.out.println("Tipo de tour: tour Basico");
            }

            servicio.mostrarInformacion();
        }

    }

}

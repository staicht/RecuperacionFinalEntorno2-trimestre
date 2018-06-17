import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Protectora {

    /*Metodo que indique si un refugio tiene animales de la misma raza del animal
  	  que se adopta, La prueba mas adecuada para esta funcionalidad es una prueba
	   de pico con la finalidad de ver la capacidad de consultar los animales que hay en la protectora.
	  */
    public static void comprobarAnimales(String animalAdoptar, ArrayList<Refugio> listaRefugios) {

        for (int i = 0; i < listaRefugios.size(); i++) {

            ArrayList<String> listaRazas = listaRefugios.get(i).getListaRazas();

            for (int j = 0; j < listaRazas.size(); j++) {

                if (animalAdoptar.equalsIgnoreCase(listaRazas.get(j))) {
                    System.out.println(listaRazas.get(j));
                    System.out.println("El refugio " + listaRefugios.get(i).getNombreRefugio() + " tiene animales de la especie " + animalAdoptar);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Refugio> listaRefugios = new ArrayList<Refugio>();

        String fechaRefugio = GregorianCalendar.getInstance().toString();
        Refugio r1 = new Refugio(fechaRefugio, "Protectora.Refugio 1");

        Animal a1 = new Animal("perro", "pastor aleman", 2, GregorianCalendar.getInstance().toString(), GregorianCalendar.getInstance().toString(), "Perro 1");

        a1.setDueño("Dueño 1");

        r1.ingresarAnimal(a1);

        Refugio r2 = new Refugio(GregorianCalendar.getInstance().toString(), "Protectora.Refugio 2");

        r2.ingresarAnimal(new Animal("gato", "siames", 2, GregorianCalendar.getInstance().toString(), GregorianCalendar.getInstance().toString(), "Gato 1"));

        listaRefugios.add(r1);
        listaRefugios.add(r2);

        comprobarAnimales("perro", listaRefugios);

        System.out.println(listaRefugios.get(0).animalesEntre3y7() == null);

        System.out.println(listaRefugios.get(0).buscarAnimalPropietario("Dueño 1") == null);

        System.out.println(listaRefugios.get(0).calcularAños(a1));

        System.out.println(listaRefugios.get(0).compararAnimales(a1, a1));

        System.out.println(listaRefugios.get(0).comprobarRazaPropiertario(0, "beagle", "Dueño 1"));

        System.out.println(listaRefugios.get(0).esDiverso());

        listaRefugios.get(0).mostrarAnimalesFechaRefugio(fechaRefugio);

    }

}
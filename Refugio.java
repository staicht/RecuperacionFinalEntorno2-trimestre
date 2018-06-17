import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Refugio {

    private ArrayList<Animal> listaAnimales;
    private ArrayList<String> listaEspecies;
    private String fechaRefugio;
    private String nombreRefugio;

    public Refugio(String fechaRefugio, String nombre) {

        this.listaAnimales = new ArrayList<Animal>();
        this.listaEspecies = new ArrayList<String>();
        this.fechaRefugio = fechaRefugio;
        this.nombreRefugio = nombre;

    }

    public String getNombreRefugio() {
        return nombreRefugio;
    }

    public ArrayList<String> getListaRazas() {
        return listaEspecies;
    }

    /*Metodo que adopta un animal del refugio. Las pruebas mas adecuadas
	  son las pruebas unitarias , pruebas de caja blanca, ya que una de sus
	  ventajas es que es especialmente eficaz en fragmentos de codigo.Te permite 
	  ver errores de escritura de codigo de forma que, en ciertos fragmentos puede ser 
	  util.En este caso se usara para ver si el bucle for actua de la forma que nosotros queremos.*/
    public void adoptarAnimal(String dueño, int numAnimal) {

        if (!this.listaAnimales.isEmpty()) {

            for (int i = 0; i < this.listaAnimales.size(); i++) {

                if (numAnimal == i) {

                    this.listaAnimales.get(i).setDueño(dueño);

                }
            }

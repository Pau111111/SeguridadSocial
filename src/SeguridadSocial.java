import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {

        personasList = new ArrayList<>();

    }

// Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social

    public void altaPersona(Persona persona) {

        personasList.add(persona);

       /* boolean repetida=false;
        for ( Persona personaActual: personasList
             ) {
            if(personaActual.getDni().equals(persona.getDni()));

        }*/

       boolean repetida=false;

        Persona personaActual:personasList;

        while(persona){


        }
    }

    public void bajaPersona(String dni) {
       // personasList.removeIf(persona -> persona.getDni().equals(dni));
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        //personasList.get(persona -> persona.getDni().equals(dni));
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

    }

    public List<Persona> obtenerTodas(){

    }

    @Override

    public String toString() {

        return "SeguridadSocial{" +

                "personasList=" + personasList +

               '}';

    }

}
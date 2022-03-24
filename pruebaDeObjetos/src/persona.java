public class Persona {
    int edad;
    String nombre;
    String colorDePiel;

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.edad = 18;
        persona1.nombre = "Pablo";
        persona1.colorDePiel = "negro";
        System.out.println(persona1.nombre + " tiene " + persona1.edad + " anios y es un " + persona1.colorDePiel);
    }
}

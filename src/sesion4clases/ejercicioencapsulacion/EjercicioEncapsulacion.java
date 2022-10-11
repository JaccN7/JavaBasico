package sesion4clases.ejercicioencapsulacion;

public class EjercicioEncapsulacion {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("Tomás");
        persona.setTelefono("+56900000000");

        System.out.println(persona);
    }
}

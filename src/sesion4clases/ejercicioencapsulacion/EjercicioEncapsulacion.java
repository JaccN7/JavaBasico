package sesion4clases.ejercicioencapsulacion;

public class EjercicioEncapsulacion {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("Tomás");
        persona.setTelefono("+56900000000");

        System.out.println(persona);

        Cliente cliente = new Cliente();
        cliente.setEdad(30);
        cliente.setNombre("Nathalia");
        cliente.setTelefono("+56900000001");
        cliente.setCredito(true);

        System.out.println(cliente);
    }
}

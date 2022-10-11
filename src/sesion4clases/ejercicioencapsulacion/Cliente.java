package sesion4clases.ejercicioencapsulacion;

public class Cliente extends Persona{
    private boolean credito;

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return super.toString() + " \nY su estado de aprobacion para un credito es: " + this.credito;
    }
}

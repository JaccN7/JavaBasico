package sesion6refactoring.consolidateduplicate.bad;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;

        if(isEligibleExtraSalary()){
            result = 500;
            sendMessage(); //Método que se repite en la condición
        }else{
            result= 0;
            sendMessage(); // Método que se repite en la condición
        }
        return result;
    }

    private void sendMessage(){
        //Send email
        //Connect smtp
        System.out.println("Sending message");
    }

    public boolean isEligibleExtraSalary(){
        //AGRUPAR CONDICIONES UTILIZANDO AND ( && ) Y OR ( || )
        boolean estudios = seniority < 1 || education <1;
        boolean antiguedad = !certification || incidents > 10;

        return estudios || antiguedad;
    }
}

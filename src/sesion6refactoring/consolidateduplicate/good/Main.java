package sesion6refactoring.consolidateduplicate.good;

/**
 *
 * Método de refactorización CONSOLIDATE DUPLICATE
 *
 */
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
        }else{
            result= 0;
        }
        sendMessage();
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

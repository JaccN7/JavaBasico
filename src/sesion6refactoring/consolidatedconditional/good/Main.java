package sesion6refactoring.consolidatedconditional.good;

/**
 *
 * Método de refactorización CONSOLIDATE CONDITIONAL
 *
 */

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;

        if(!isEligibleExtraSalary()){
            return result;
        }

        //Calculate extra salary
        // ...

        return result;
    }

    public boolean isEligibleExtraSalary(){
        //AGRUPAR CONDICIONES UTILIZANDO AND ( && ) Y OR ( || )
        boolean estudios = seniority < 1 || education <1;
        boolean antiguedad = !certification || incidents > 10;

        return estudios || antiguedad;
    }
}
package sesion6refactoring.extractmethod.good;

/**
 *
 * Método de refactorización EXTRACT METHOD
 *
 */
public class Main {

    void printlHTML(){
        printHead();
        printBody();
        printFooter();
    }

    private void printFooter() {
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");
    }

    private void printBody(){}

    private void printHead(){}

}

package sesion6refactoring.extractmethod.bad;

public class Main {

    void printlHTML(){
        printHead();
        printBody();
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");
    }

    private void printBody(){}

    private void printHead(){}
}

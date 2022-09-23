package sesion3estructurascontrol.repeticion;

public class While {
    public static void main(String[] args){

        int cont = 0;

        while(cont < 10){
            cont++;
            if (cont == 5){
                break;
                //continue;
            }
            System.out.println("Prueba while" + cont);
        }
    }
}

import java.util.Scanner;

public class ConversionMoneda {
    public static void main(String[] args) {
        while(true){
            System.out.println("Conversor de monedas");
            System.out.println("(1) pesos mexicanos a dolares \n"
                    +"(2) euros a dolares \n"
                    +"(3) dolar a real brasileño \n"
                    +"(4) dolares a pesos mexicanos \n"
                    +"(5) pesos mexicanos a euros \n"
                    +"(6) euros a pesos mexicanos \n"
                    +"(7) salir del programa");
            System.out.println("Ingrese una opcion");
            Scanner scan= new Scanner(System.in);

            String opcion = scan.nextLine();
            switch (opcion){

                case "1":
                    conversion(0.052, "dollars");
                    break;
                case "2":
                    conversion(1.08, "dollars");
                    break;
                case "3":
                    conversion(19.30, "real brasileño");
                    break;
                case "4":
                    conversion(19.30, "pesos mexicano");
                    break;
                case "5":
                    conversion(0.047, "euros");
                    break;
                case "6":
                    conversion(21.08, "pesos mexicanos");
                    break;
                case "7":
                    System.out.println("Programa terminado");
                    break;

            }

        }
    }
    private static void conversion  (double valorDolar, String pais) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s", pais);
        System.out.println("");
        double cantidad = scan.nextDouble();
        double dolares = cantidad / valorDolar;
        dolares =(double) Math.round(dolares * 100d) / 100;
        System.out.println("Tienes $" + dolares);
    }
}

import java.util.Scanner;
public class voltaje {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int cant,voltaje,max=0,min=0,suma=0;
        boolean b=true;
        boolean b2=true;
        double prom;
        System.out.println("Ingrese la cantidad de voltajes a evaluar");
        cant=a.nextInt();
        for(int i=1;i<=cant;i++){
            System.out.println("ingrese el voltage en la posicion: "+i);
            voltaje=a.nextInt();
            suma=suma+voltaje;
            if (b==true) {
                max=voltaje;
                b=false;
            } else {
                if (voltaje>max) {
                   max=voltaje;
                }
            }
            if (b2==true) {
                min=voltaje;
                b2=false;
            } else {
                if (voltaje<min) {
                    min=voltaje;
                }
            }
        }
        prom=suma/cant;
        System.out.println("suma de los voltajes: "+suma);
        System.out.println("Voltaje maximo: "+max);
        System.out.println("Voltaje minimo: "+min);
        System.out.println("promedio de los voltajes: "+prom);
    }
}

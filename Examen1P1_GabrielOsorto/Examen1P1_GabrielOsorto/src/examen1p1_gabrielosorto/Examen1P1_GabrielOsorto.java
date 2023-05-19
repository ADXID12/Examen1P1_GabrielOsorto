/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_gabrielosorto;
import java.util.Scanner;
/**
 *
 * @author Jahir Corrales
 */
public class Examen1P1_GabrielOsorto {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int resp=1;
        while (resp<4){
            System.out.println("Bienvenido a su programa examinante :(");
            System.out.println("1. Sumador Binario.");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion:");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1-> {//inicio del case 1
                    System.out.println("--------Sumador Binario--------");
                    
                    break;
                }//fin del case 2
                case 2->{//inicio del case 2
                    System.out.println("--------Estrella de David--------");
                        System.out.println("Ingrese un tamaño:");
                        int figtam= sc.nextInt();
                            while ((figtam<=9)||(figtam%2==0))
                            {
                                     System.out.println("numero no valido, ingrese otro digito que cumpla las caracteristicas requeridas >:)");
                                     figtam=sc.nextInt();
                            }
                            for (int i = 0; i <=figtam; i++) {
                                for (int j = 0; j <= i; j++) {
                                    if (j<=figtam/2-1){
                                        System.out.print("*");
                                    } 
                                    
                                    
                                }
                                System.out.println("");
                    }
                   break;
                }//fin del case 2
                case 3->{//inicio del case 3
                    System.out.println("Gracias por Usarme :)");
                   break; 
                }//fin del case 3
                default->{
                    System.out.println("opcion invalida");
                   break;
                }//fin del default
            }//fin del switch
                System.out.println( );
        }//fin del while
     }//fin del void
}//fin de la claswe
        

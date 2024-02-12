package ejercicios.metodos.y.string_carlosflores;

import java.util.Scanner;

public class EjerciciosMetodosYString_CarlosFlores {

    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        boolean var = true;
        
        do{
            System.out.println("---MENU");
            System.out.println("1)Replace\n2)Factorial\n3)Mensajes\n4)Promedios\n5)Aprobado_o_reprobado\n6)contains\n7)Salir");
            System.out.print("Ingrese una opcion: ");
            int op = leer.nextInt();
            switch(op){
                case 1:{//Replace
                    
                    
                    break;
                }// fin cases 1
                
                case 2:{//Factorial
                    System.out.println("\n---Factorial");
                    System.out.print("Ingrese un numero: ");
                    int n = leer.nextInt();
                    System.out.print("Factorial: ");
                    int f = Factorial(n);
                    System.out.print(f+"\n\n");
                    break;
                }// fin cases 2
                
                case 3:{//Mensajes
                    System.out.println("\n---Mensajes");
                    System.out.print("Ingrese una cadena: ");
                    leer.nextLine();
                    String cad = leer.nextLine();
                    Mensajes(cad);
                    System.out.println("\n");
                    break;
                }// fin cases 3
                
                case 4:{//Promedios
                    System.out.println("\n---Promedios");
                    Promedios();
                    System.out.println("\n");
                    break;
                }// fin cases 4
                
                case 5:{//Aprobado_o_reprobado
                    
                    
                    break;
                }// fin cases 5
                
                case 6:{//contains
                    
                    
                    break;
                }// fin cases 6
                
                case 7:{//Salir
                    System.out.println("Salio del programa, nos vemos.");
                    var = false;
                    break;
                }// fin cases 7
                
                default:{
                    System.out.println("Opcion no valida, intente de nuevo.");
                    break;
                }
                
            }

        }while(var);
    }
    
    public static void Replace (){
        
    }
    
    public static int Factorial (int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void Mensajes (String cad){
        for (int i = 0; i < cad.length(); i++) {
            System.out.print(cad.charAt(i));
            System.out.print(" ");
        }
    }
    
    public static void Promedios (){
        int prom = 0;
        for (int i = 1; i < 5; i++) {
            int not = -1;
            while(not < 0 || not > 100){
                System.out.println("Ingrese nota "+i+": ");
                not = leer.nextInt();
                if(not < 0 || not > 100){
                    System.out.println("La nota tiene que ser entre 0 y 100, intente otra vez");
                }
            }
            prom += not;
        }
        prom = prom / 4;
        System.out.print("El promedio de calificaciones es: "+prom);
    }
    
    public static void Aprobado_o_reprobado (){
        
    }
    
    public static void contains (){
        
    }
    
}

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
                    System.out.println("\n---Contains");
                    boolean check = true;
                    String select = "";
                    String change = "";
                    System.out.print("Ingrese una cadena: ");
                    leer.nextLine();
                    String cad = leer.nextLine();
                    cad = cad.toLowerCase();
                    while(select.length() != 1 || check){
                        check = true;
                        System.out.print("Ingrese el caracter a remplazar: ");
                        select = leer.next();
                        if(select.length() != 1){
                            System.out.println("Debe ingresar solo 1 caracter, intente de nuevo");
                        }
                        for (int i = 0; i < cad.length(); i++) {
                            if(cad.charAt(i) == select.charAt(0)){
                                check = false;
                            }
                        }
                        if(check){
                            System.out.println("El caracter no se encuentra en la cadena, intente de nuevo.");
                        }
                    }
                    char sel = select.charAt(0);
                    while(change.length() != 1){
                        check = true;
                        System.out.print("Ingrese el caracter nuevo: ");
                        change = leer.next();
                        if(select.length() != 1){
                            System.out.println("Debe ingresar solo 1 caracter, intente de nuevo");
                        }
                    }
                    char cha = change.charAt(0);
                    String replace = Replace(cad,sel,cha);
                    System.out.println(replace+"\n");
                    break;
                }// fin cases 1
                
                case 2:{//Factorial
                    System.out.println("\n---Factorial");
                    int n = 0;
                    while(n < 2 || n > 16){
                        System.out.print("Ingrese un numero: ");
                        n = leer.nextInt();
                        if(n == 1){
                            System.out.println("El factorial de 1 es 1, ingrese otro valor.");
                        }else if(n > 16){
                            System.out.println("No se pueden ingresar valores mayores a 16 ya que \nnetbeans no es capaz de imprimir el valor.(valor maximo int = 2147483647)");
                        }else if(n < 1){
                            System.out.println("Opcion no valida, tiene que ser un numero entre 2 y 16");
                        }
                    }
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
                    System.out.println("\n---Aprobado_o_reprobado");
                    int N = -1;
                    while(N < 0 || N > 100){
                        System.out.print("Ingrese la nota del estudiante:");
                        N = leer.nextInt();
                    }
                    boolean alumn = Aprobado_o_reprobado(N);
                    if(alumn){
                        System.out.println("El alumno aprobo.\n");
                    }else{
                        System.out.println("El alumno reprobo.\n");
                    }
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
    
    public static String Replace (String cad, char sel, char cha){
        String replaced = cad.replace(sel, cha);
        return replaced;
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
    
    public static boolean Aprobado_o_reprobado (int N){
        boolean alumn = false;
        if(N>= 60){
            alumn = true;
        }
        return alumn;
    }
    
    public static void contains (){
        
    }
    
}

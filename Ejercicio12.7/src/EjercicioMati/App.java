package EjercicioMati;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        TablaDispersa Tabladis = new TablaDispersa();

        Scanner Entrada = new Scanner(System.in);

        int ent , codigo , año , dia , mes , edad, contador = 0  ;

        String nombre;

        TipoSocio Socio;
        
        
        
        do{

            System.out.println("Elija:");
            System.out.println("");
            System.out.println("Ingrese 1 para insertar un socio");
            System.out.println("Ingrese 2 para buscar un socio");
            System.out.println("Ingrese 3 para eliminar un socio");
            
            ent = Entrada.nextInt();
            Entrada.nextLine();

            while(ent < 0 || 3 < ent){

                //para borrar pantalla
                System.out.print("\033[H\033[2J");
                System.out.flush();
    
                System.out.println("ERROR.");
                    
                System.out.println("Elija:");
                System.out.println("");
                System.out.println("Ingrese 1 para insertar un socio");
                System.out.println("Ingrese 2 para buscar un socio");
                System.out.println("Ingrese 3 para eliminar un socio");
                
                ent = Entrada.nextInt();
                Entrada.nextLine(); 
                
            }

            //para borrar pantalla
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            switch(ent){
                case 1:
                    
                    System.out.println("Ingrese el nombre del socio:");
                    nombre = Entrada.nextLine();

                    System.out.println("Ingrese el codigo:");
                    codigo = Entrada.nextInt();
                    Entrada.nextLine();

                    System.out.println("Ingrese la edad:");
                    edad = Entrada.nextInt();
                    Entrada.nextLine();

                    System.out.println("Ingrese el dia:");
                    dia = Entrada.nextInt();
                    Entrada.nextLine();
                    System.out.println("Ingrese el mes:");
                    mes = Entrada.nextInt();
                    Entrada.nextLine();
                    System.out.println("Ingrese el año:");
                    año = Entrada.nextInt();
                    Entrada.nextLine();
                    
                    
                    Socio = new TipoSocio(nombre, codigo, edad, dia, mes, año);
                    
                    Tabladis.insertar(Socio);

                    contador=contador+1;

                    //para borrar pantalla
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                    break;
                    
                case 2:
                    if(0 < contador){

                    System.out.println("Ingrese el codigo del socio a buscar");
                    codigo = Entrada.nextInt();
                    Entrada.nextLine();

                    Tabladis.buscar(codigo).getSocio().mostrar();

                    
                    
                    break;
                    }else{

                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        
                        System.out.println("Error.");
                        System.out.println("No se han insertado socios actualmente");
                        System.out.println("");
                        break;
                    }
                    
                case 3:
                    if(0 < contador){
                    System.out.println("Ingrese el codigo del socio a eliminar:");
                    codigo = Entrada.nextInt();
                    Entrada.nextLine();
                    Tabladis.eliminar(codigo);
                        
                    contador=contador-1;

                    break;  
                    }else{
                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Error.");
                        System.out.println("No se han insertado socios actualmente");
                        System.out.println("");
                        break;
                    }    
            }
        }while(ent != 0);
    }
}

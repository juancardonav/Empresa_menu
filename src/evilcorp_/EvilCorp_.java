/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilcorp_;
import empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author 505
 */
public class EvilCorp_ {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

        
        Scanner entrada = new Scanner (System.in);
        int opcion;
        int contador=0;
        Empleado[] empleados = new Empleado[10];
        
        do {
            System.out.println("-------------Bienvenidos -------------");
            System.out.println("-- -- -- --- -- --- -   --  -- --   -   --  - -  ---- --  - -");
            System.out.println("1.  Agregar Empleado");
            System.out.println("2.  Buscar Empleado");
            System.out.println("3.  Mostrar Empleados");
            System.out.println("4.  Calcular Salario");
            System.out.println("5.  Salir");
            System.out.print("- Digite una opción: ");
           opcion=entrada.nextInt();
           
            switch(opcion){
               case 1:
                   System.out.println("Registro de empleado: ");
                   System.out.println(" ");
                   
                   empleados[contador]=new Empleado();
                     empleados[contador].setId(contador);
                   
                   System.out.println("Digite el nombre: : ");
                   empleados[contador].setNombre(entrada.next());
                   
                    System.out.println("Digite el cargo: : ");
                   empleados[contador].setCargo(entrada.next());
                   
                    System.out.println("Digite las horas semanales : ");
                   empleados[contador].setHorasSemanales(entrada.nextDouble());

                    empleados[contador].setSalario(0);
                    
                    
                    contador = contador+1;
                    
                       break;
                       
               case 2:
                   System.out.println("Busca un empleado");
                       break;
                       
               case 3:
                   System.out.println(" ");
                   System.out.println("Estos son los empleados");
                   System.out.println(" ");
                   
                   for (int i=0; i < contador; i++){
                       
                       System.out.print("id:  "+ empleados[i]. getId()+" ,"); ;
                       
                       System.out.print(" Nombre: "+empleados[i].getNombre()+" ,"); ;

                       System.out.print(" Cargo:  "+empleados[i].getCargo()+" ,"); 
                       System.out.print(" Horas Semanales:  "+empleados[i].getHorasSemanales()+" ,"); 
                       System.out.print(" Salario:  "+empleados[i].getSalario()+" ."); 
                        System.out.println(" ");
                       
                   }
                   
                   
                       break;
                       
               case 4:
                   System.out.println("Vamos a calcular un salario");
                       break;
                       
               case 5:
                   System.exit(0);
                       break;
           }
        
        } while(opcion != 5);
            
        }
        
}

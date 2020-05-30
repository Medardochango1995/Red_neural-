/*
 Implemente un algoritmo  que le permita :
1). Desplegar en nombre del proyecto de su paper.
2). ¿Que es una red neural?
3). Cuales son los elementos que forman una red neural.
4). Como utilizaron la red neural en el proyecto que usted ha selecionado.
5). Como utilizaria usted la red neural como mejoramiento al proyecto propuesto.
6). En que consistio el entrenamiento utilizando la red neural e indique el algoritmo utilizado 
 */
package redneural1;

/**-
 *
 * @author Medardo Rene Chango Caguana
 */
import java.util.Scanner;
public class RedNeural1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner objeto=new Scanner(System.in);  // TODO code application logic here
      System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
      System.out.println(".......................................");
      System.out.println("--Ingrese el nombre del proyecto de su paper:");
      String nombredelproyecto=objeto.nextLine();
      System.out.println("-¿Que es una red neural?");
      String redneural=objeto.nextLine();
      System.out.println("-¿Cuáles son los elementos que forman una red neural?");
      String elementosredneural=objeto.nextLine();
      System.out.println("-¿Como utilizaron la red neural en el proyecto que usted ha seleccionado ?");
      String utilizaronred=objeto.nextLine();
      System.out.println("-Como utilizaría usted la red neural como mejoramiento al proyecto propuesto");
      String mejoramientoproyecto=objeto.nextLine();
      System.out.println("-En que consitio el entrenamiento utilizado la red neural, e indique el algoritmo que utilizo");
      String algoritmo=objeto.nextLine();
    }
    
}

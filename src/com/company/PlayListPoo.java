package com.company;

import javax.swing.*;

public class PlayListPoo {
    //se crean atributos de la clase

    int numeroCanciones;
    int opciones;

// se crean metodos de la clase

    //metodo para guardar el numero de canciones que tiene la lista
     public void NumeroCanciones(){
        numeroCanciones=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de canciones que deseas agregar"));

    }
    //metodo para guardar y mostrar las canciones que tiene la lista
    public void guardarCanciones() {
       String[] canciones = new String[numeroCanciones];
         for (int i=0;i<numeroCanciones;i++){
             canciones[i]=JOptionPane.showInputDialog(("Digite la cancion "+(i+1)));
        }
        for (int i=0;i<numeroCanciones;i++){
            JOptionPane.showMessageDialog(null, "la cancion "+(i+1)+" es: "+canciones[i]);

        }

    }

    /*public void mostrarArregloDeCanciones(String[] canciones) {

        for (int i=0;i<numeroCanciones;i++){
            JOptionPane.showMessageDialog(null, "las canciones son: \n"+canciones[i]);
        }

        }
*/
    //metodo para crear el cuadro de dialogo de opciones para que el usuario decida que opcion tomar
    public void casos(){
        //se usa el ciclo while para que el cuadro de opciones se ejecute siempre que el usuario no requiera salir
         while (opciones!=5) {
             opciones = Integer.parseInt(JOptionPane.showInputDialog("Digite una de las siguientes opciones" +
                     " \n1. para indicar cuantas canciones lleva tu playlist " +
                     " \n2. para agregar las canciones a tu playlist " +
                     " \n4. para Editar canciones de tu playlist " +
                     " \n5. Salir "));
             switch (opciones) {
                 case 1:
                     // se llama el metodo segun la opcion en este caso el metodo de agregar el numero de canciones
                     NumeroCanciones();
                     break;

                 case 2:
                    // se usa un if para que la lista siempre tenga un numero de canciones mayor a cero
                     if (numeroCanciones == 0) {
                         NumeroCanciones();
                         guardarCanciones();
                     } else
                         guardarCanciones();
                     break;
                 case 3:
                    /* if (numeroCanciones == 0) {
                         JOptionPane.showMessageDialog(null, "por favor ingrese canciones");
                         NumeroCanciones();
                         guardarCanciones();

                     } else
                         JOptionPane.showMessageDialog(null,"aqui mostre las canciones");
                     PlayListPoo ob = new PlayListPoo();
                     String[] canciones = ob.guardarCanciones();
                     mostrarArregloDeCanciones(canciones);
                     break;
                     */

                 case 4:

                     if (numeroCanciones == 0) {
                         NumeroCanciones();
                         guardarCanciones();
                     } else
                         guardarCanciones();
                     JOptionPane.showMessageDialog(null, "la lista ha sido editada");
                     break;

                 case 5:
                     JOptionPane.showMessageDialog(null, "Gracias por usar nuestra lista");
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "la opcion no existe");
             }
         }
}
}

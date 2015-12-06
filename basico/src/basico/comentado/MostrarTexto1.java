/*
Ejemplo 1: Mostrar un texto en pantalla
---------------------------------------
Este ejemplo genera un ejecutable que
muestra en pantalla un texto pre-definido 

Sobre los Comentarios:
----------------------
Los comentarios son porciones de texto para
explicar algo en medio del código y se marcan
para que el compilador los ignore al procesar
el texto.
Hay dos tipos:
-> Simple: Para comentarios de una sola línea.
    Simplemente se añaden // al comienzo de la
    línea.
-> Multilinea: Comentarios que abarcan varias
    líneas (como este). Se abren con /* y se
    cierran con * / (sin espacio entre '*' y '/')
*/

package basico.comentado;
/*
La palabra clave 'package' indica la carpeta
donde se encuentra el archivo en el proyecto.
El nombre de 'package' es, por lo general,
el nombre del proyecto o del programa que se
desarrolla.*/

public class MostrarTexto1 {
/*
'public' es la visibilidad de la clase
'class' nos indica que aquí comienza la definición
 de la clase en sí.*/
    
    public static void main(String[] args) {
    /*
    'public' es la VISIBILIDAD del método
    'static' es el ATRIBUTO del método
    'void' es la CLASE del método*/
        
        System.out.println("Esto es un ejemplo");
        /*
        'println()' es un método de la clase 'out'
        del paquete 'System'.
        Es uno de los métodos más usados para
        mostrar un texto en pantalla*/
    }
    
}

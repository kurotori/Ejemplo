/*
Ejemplo 2: Mostrar un texto en pantalla
a partir de un atributo pre-definido.
---------------------------------------
Este ejemplo genera un ejecutable que
muestra en pantalla el contenido de un 
atributo local (definido en la misma 
clase).
*/

package basico.comentado;

public class MostrarTexto2 {
    
    public static void main(String[] args) {
        
        String texto1="Un texto cualquiera";
        /*
        'String' es el TIPO del atributo
        'texto1' es el NOMBRE del atributo
        El texto entre comillas después del
        símbolo '=' es el CONTENIDO del atributo */
        
        System.out.println(texto1);
        /*
        Para acceder al contenido del atributo 'texto1'
        simplemente se usa su nombre en el método println()
        y este mostrará en pantalla el contenido del
        atributo.
        */
    }

}

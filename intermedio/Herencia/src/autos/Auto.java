package autos;

public class Auto {
    String marca;
    String modelo;
    int potencia;
    int año;
    int velocidadMax;
    
    boolean encendido = false;
    int velocidad = 0;
    
    
    public void Contacto(){
        if(encendido == true){
            encendido = false;
            System.out.println(encendido);
        }
        else{
            encendido = true;
            System.out.println(encendido);
        }
    }
    
    public void Acelerar() throws InterruptedException{
        if(encendido == true){    
            while(velocidad < this.velocidadMax){
                velocidad = velocidad +10;
                Thread.sleep(1000);
                System.out.println(this.toString()+ ": La velocidad es: "+velocidad+" km/h");
                if(velocidad == this.velocidadMax){
                    System.out.println("La velocidad es: "+velocidad+" km/h");
                    System.out.println("¡No se puede acelerar más!");
                }
            }
        }
        else if(encendido == false){
            System.out.println("Enciende el auto primero");
        }
    }
}



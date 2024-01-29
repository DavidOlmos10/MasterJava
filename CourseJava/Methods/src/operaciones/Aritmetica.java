
package operaciones;


public class Aritmetica {
    //Definimmos 2 atributos a la clase

    int a;
    int b;

    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    // Se va a crear un metodo el cual regrese el resultado de la suma
    
    public int sumarConRetorno(){
   //     int resultado = a + b;
   //     resultado resltado;
        return a + b;
    }
}

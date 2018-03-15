package tarea1.poo;

/*
Autor: Mauricio Pacheco 00170517
*/

class Datos {
    String Nombre, Apellido, FDN, Carnet, Edad, Peso, Estatura;
    
    public Datos(String N, String A, String FDN, String C, String E, String P, String Est){
        this.Nombre = N;
        this.Apellido = A;
        this.Edad = E;
        this.Carnet = C;
        this.FDN = FDN;
        this.Peso = P;
        this.Estatura = Est;
    }
    public void Mostrar(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
        System.out.println("Carnet: " + Carnet);
        System.out.println("Fecha de nacimiento: " + FDN);
        System.out.println("Peso: " + Peso);
        System.out.println("Estatura: " + Estatura);
    }
}

public class Tarea1POO {

    public static void main(String[] args) {
        Datos D = new Datos("Mauricio", "Pacheco", "7/4/1999", "00170517", "18", "1.78 m", "158 lb");
        D.Mostrar();
    }
}

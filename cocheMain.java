package domain;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class cocheMain {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        Coche coche = new Coche();
        coche.setMarca("seat");
        coche.setMatricula("XRO-123");
        coche.setModelo("Ibiza");
        coche.setPotencia("120cf");
        coche.setVelocidadMaxima(200);

     Coche.Chasis chasis = new Coche.Chasis();
     chasis.material = "metal";
     chasis.peso = 300;

     Coche.rueda rueda = new Coche.rueda();
     rueda.setMarca("seat");
     rueda.setModelo("seco , lluvia y nieve ");
     rueda.setMedida(17);
     rueda.setTipo("aleacion");

     System.out.println("Caracteristicas del coche : ");
     System.out.println("____________________________");
     System.out.println("Marca : " + coche.getMarca());
     System.out.println("Matricula : " + coche.getMatricula());
     System.out.println("Modelo : " + coche.getModelo());
     System.out.println("potencia : " + coche.getPotencia());
     System.out.println("Velocidad maxima : " + coche.getVelocidadMaxima());
        System.out.println("**************************");
     System.out.println("Ruedas  ");
     System.out.println("_____________________________");
     System.out.println("Marca : " + rueda.getMarca());
     System.out.println("tipo : " + rueda.getTipo());
     System.out.println("Rodado : " + rueda.getMedida());
     System.out.println("modelo : " + rueda.getModelo());







    }
}

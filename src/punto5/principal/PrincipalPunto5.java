package punto5.principal;

import punto5.dominio.Circulo;

/**
 *
 * @author Hector Cruz
 */
public class PrincipalPunto5 {

    public static void main(String[] args) {
        Circulo unCirculo = new Circulo();
        unCirculo.setRadio(5);
        Circulo segundoCirculo = new Circulo();
        segundoCirculo.setRadio(3);
        Circulo tercerCirculo = new Circulo();
        tercerCirculo.setRadio(2);

        Circulo[] arreglo = new Circulo[3];

        arreglo[0] = unCirculo;
        arreglo[1] = segundoCirculo;
        arreglo[2] = tercerCirculo;
        
        for (int i =0;i < arreglo.length;i++) {
            if (arreglo[i] != null){
            Circulo c = arreglo[i];
            System.out.println("El radio es: "+c.getRadio());
            System.out.println("Superficie del circulo: "+c.obtenerSuperficie());
            }else{
            System.out.println("No existe un circulo en la posicion: "+i);    
            }
        }
    }
    
}

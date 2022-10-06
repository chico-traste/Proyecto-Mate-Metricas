/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Metricas1;

import javax.swing.JOptionPane;

public class UsaOperacionesConPuntos2D {

    public static void main(String[]args){
        Punto2D a = new Punto2D(2,1);
        Punto2D b = new Punto2D(5,0);
        Punto2D c = new Punto2D(8,2);
        Punto2D d = new Punto2D(6,5);
        Punto2D e = new Punto2D(2,4);
        
        OperacionesConPuntos2D.metricaEuclidiana(a,b);
        double norma = OperacionesConPuntos2D.normaEuclideana(a);
        double dAB = OperacionesConPuntos2D.metricaEuclidiana(a,b);
        double dTaxAB = OperacionesConPuntos2D.metricaTaxista(a, b);
        double prodAB = OperacionesConPuntos2D.dotProduct(a, b);
        double areaPAB = OperacionesConPuntos2D.areaPalalelogramo(a, b, c, d,e);
        
        
  System.out.println("La norma de " + a + " es : " + norma);
        
  System.out.println("La distancia del punto " + a +
                            " al punto  "+ b + "  es: " + dAB);
        
  System.out.println("La distancia del Taxista del punto " + a + " al punto "
		+ b + "es: " +dTaxAB);

  System.out.println("El producto de los puntos " + a + " y " + b + " es " + prodAB);

  System.out.println("El área de la figura formada es: " + areaPAB);
  
  JOptionPane.showMessageDialog(null, "La norma de " + a + " es : " + norma);
  
  
  JOptionPane.showMessageDialog(null, "La distancia del punto " + a +
                            " al punto  "+ b + "  es: " + dAB);
  
  JOptionPane.showMessageDialog(null, "La distancia del Taxista del punto " + a + " al punto "
			+ b + "es: " +dTaxAB);
  
  JOptionPane.showMessageDialog(null, "El producto de los puntos " + a + " y " + b + " es " + prodAB);
  
  JOptionPane.showMessageDialog(null, "El área de la figura formada es: " + areaPAB);
  
    }
   
}

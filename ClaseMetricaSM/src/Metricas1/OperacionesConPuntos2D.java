/**
 *  Programa que permitirá realizar
 *  operaciones con puntos en la forma P = (x,y)
 *
 *  NOTA: DEBEN IMPLEMENTAR LOS MÉTODOS
 *
 *  Curso: Matemáticas para ciencias Aplicadas
 *
 *  Temas:  Función distancia, producto punto y
 *          su aplicación para obtener el área
 *
 *  @author Roberto Méndez Méndez
 *  @version  22-Septiembre-22
 */


package Metricas1;

public class OperacionesConPuntos2D {


    public static double normaEuclideana(Punto2D p) { 
    	double norma = metricaEuclidiana(new Punto2D(),p);
    	    	return norma;
    	    	
    }
    	

    public static double metricaEuclidiana(Punto2D a, Punto2D b) { 
    	double distanciaAB=
    			Math.sqrt(Math.pow(a.getX() -b.getX(),2) 
    		+ Math.pow(a.getY() -b.getY(),2));
    	
    	return distanciaAB;}


    public static double metricaTaxista(Punto2D a, Punto2D b) { 
    	double distanciaTaxAB=
    			Math.abs(a.getX() -b.getX()) + Math.abs((a.getY() -b.getY()));
    	
    	return distanciaTaxAB; }
               		

    
    public static double dotProduct(Punto2D a, Punto2D b) { 
    	
    	double productAB =
    			((a.getX()* b.getX()) + (a.getY()* b.getY()));
    	
    	return productAB; 
    	
    }


    public static double areaPalalelogramo(Punto2D a, Punto2D b, Punto2D c, Punto2D d, Punto2D e) { 
    	
    	double areaPAB =
    			Math.abs(((((a.getX() *b.getY())) - (a.getY() *b.getX())) + ((b.getX() 
    					*c.getY()) - (b.getY()* c.getX()))
    					
    + ((c.getX() *d.getY()) - (c.getY() *d.getX()))
    
    + (((d.getX() *e.getY())) - (d.getY() *e.getX())) + 
    
    ((e.getX() *a.getY())) - (e.getY() *a.getX())))/2;
    					
    			
    	return areaPAB; 
    	}      
}

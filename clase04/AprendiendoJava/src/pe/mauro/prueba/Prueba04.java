
package pe.mauro.prueba;


public class Prueba04 {
    
   static String[] lista = new String[5];
   //Por ser String una clase se dice q es un arreglo de apuntadors q inicialmente 
   //apunta a null
    public static void main(String[] args) {
        for(String cad : lista) {
            System.out.println(cad);
        }
        
         lista[2] = "Gustavo";
        lista[3]= "Claudia";
        
        System.out.println("--------------");
        
        for (String cad : lista) {
            System.out.println(cad);
        }
    }
   
   
    
    
       
            
}

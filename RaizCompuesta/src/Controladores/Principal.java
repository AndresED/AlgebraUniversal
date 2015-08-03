package Controladores;
import Vistas.VentanaRaiz;
public class Principal {
    public static void main(String[] args) {
       VentanaRaiz obj = new VentanaRaiz();
       obj.setLocationRelativeTo(null);
       obj.setResizable(false);
       obj.setVisible(true);  
    }
    
}

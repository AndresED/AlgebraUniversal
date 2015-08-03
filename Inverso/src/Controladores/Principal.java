package Controladores;

import Modelos.Inverso;
import Vistas.VentanaInverso;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
       VentanaInverso obj = new VentanaInverso();
       obj.setLocationRelativeTo(null);
       obj.setResizable(false);
       obj.setVisible(true);  
    }
}

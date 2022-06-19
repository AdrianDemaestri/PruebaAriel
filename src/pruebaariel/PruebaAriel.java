/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaariel;

import com.formdev.flatlaf.FlatIntelliJLaf;
import vista.Principal;
import controlador.ControladorPrincipal;
import javax.swing.SwingUtilities;
import libreriaprueba.LibreriaPrueba;

/**
 *
 * @author Surface Pro
 */
public class PruebaAriel {

    private static ControladorPrincipal controlador;
    private static Principal vista;
    
    public static void main(String[] args) {
        
        FlatIntelliJLaf.setup();
        
        
        
        controlador = new ControladorPrincipal();
        
        vista = new Principal(controlador);
        
        controlador.initVista(vista);
        
        vista.setVisible(true);
         
//        SwingUtilities.invokeLater(() -> {
//            vista.setVisible(true);
//        });
        
    }

    
    
}

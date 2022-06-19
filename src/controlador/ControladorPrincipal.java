/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.Principal;



/**
 *
 * @author Adrian Demaestri
 */
public class ControladorPrincipal implements ActionListener{
    private Principal ventanaPrincipal;
    
    public ControladorPrincipal(){}

    public void initVista(Principal ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ventanaPrincipal.saludar))
            JOptionPane.showMessageDialog(ventanaPrincipal, "hola " + ventanaPrincipal.texto.getText());
        else if (e.getSource().equals(ventanaPrincipal.despedir))
            JOptionPane.showMessageDialog(ventanaPrincipal, "chau " + ventanaPrincipal.texto.getText());
    }
        
}
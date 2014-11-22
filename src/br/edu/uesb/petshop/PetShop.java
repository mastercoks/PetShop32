/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop;
import petshop.GUI.BarraDeMenu;
import petshop.GUI.TelaCliente;
import petshop.GUI.TelaLogin;
import petshop.GUI.TelaPrincipal;

/**
 *
 * @author Matheus
 */
public class PetShop extends javax.swing.JPanel{

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        
        BarraDeMenu tela = new BarraDeMenu();
        TelaLogin telaL = new TelaLogin();
        tela.setVisible(true);
        
        tela.setPanel(telaL.pLogin);
//        tela.setContentPane(telaL.pLogin);
        
//        teste.setContentPane(teste.pMenuPrincipal);
        

    }
}

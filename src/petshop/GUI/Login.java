/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop.GUI;

import petshop.GUI.ConexaoPostgreSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import br.edu.uesb.petshop.Funcionario;

/**
 *
 * @author matheus
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLogin = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lbLogin = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lbSenhaIncorreta = new javax.swing.JLabel();
        lbLoginIncorreto = new javax.swing.JLabel();
        nada = new javax.swing.JLabel();
        pMenuPrincipal = new javax.swing.JPanel();
        bClientes = new javax.swing.JButton();
        bServicos = new javax.swing.JButton();
        bAnimais = new javax.swing.JButton();
        bFuncionario = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        txtAdmin = new javax.swing.JLabel();
        pClientes = new javax.swing.JPanel();
        bNClientes3 = new javax.swing.JButton();
        bBClientes3 = new javax.swing.JButton();
        bVoltar3 = new javax.swing.JButton();
        txtAdmin1 = new javax.swing.JLabel();
        bmBarraMenu = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        miAnimal = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        mClientes = new javax.swing.JMenu();
        miBuscarCliente = new javax.swing.JMenuItem();
        mAnimais = new javax.swing.JMenu();
        miBuscarAnimal = new javax.swing.JMenuItem();
        mAtendimento = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        miNovoAtendimento = new javax.swing.JMenuItem();
        miContultar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pLogin.setPreferredSize(new java.awt.Dimension(700, 350));

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("PET SHOP");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        lbLogin.setText("Login:");

        lbSenha.setText("Senha:");

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lbSenhaIncorreta.setForeground(new java.awt.Color(255, 0, 0));
        lbSenhaIncorreta.setText("Senha incorreta");
        lbSenhaIncorreta.setVisible(false);

        lbLoginIncorreto.setForeground(new java.awt.Color(255, 0, 0));
        lbLoginIncorreto.setText("Login incorreto");
        lbLoginIncorreto.setVisible(false);

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nada, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pLoginLayout.createSequentialGroup()
                                .addComponent(lbSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pLoginLayout.createSequentialGroup()
                                    .addComponent(bSair)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bEntrar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pLoginLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbTitulo))
                                    .addGroup(pLoginLayout.createSequentialGroup()
                                        .addComponent(lbLogin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLoginIncorreto)
                            .addComponent(lbSenhaIncorreta))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(nada, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLoginIncorreto)
                    .addComponent(lbLogin))
                .addGap(20, 20, 20)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenhaIncorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEntrar)
                    .addComponent(bSair))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pMenuPrincipal.setVisible(false);

        bClientes.setText("<html><body>CLIENTES</body></html>");
        bClientes.setToolTipText("");
        bClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientesActionPerformed(evt);
            }
        });

        bServicos.setText("<html><body>SERVIÇOS</body></html>");
        bServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bServicosActionPerformed(evt);
            }
        });

        bAnimais.setText("<html><body>ANIMAIS</body></html>");
        bAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnimaisActionPerformed(evt);
            }
        });

        bFuncionario.setText("<html><body>FUNCIONÁRIOS</body></html>");
        bFuncionario.setEnabled(false);
        bFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFuncionarioActionPerformed(evt);
            }
        });

        bLogout.setText("<html><body>LOGOUT</body></html>");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        txtAdmin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtAdmin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtAdmin.setText("ADMIN");

        javax.swing.GroupLayout pMenuPrincipalLayout = new javax.swing.GroupLayout(pMenuPrincipal);
        pMenuPrincipal.setLayout(pMenuPrincipalLayout);
        pMenuPrincipalLayout.setHorizontalGroup(
            pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAdmin)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(552, Short.MAX_VALUE)
                .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pMenuPrincipalLayout.setVerticalGroup(
            pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pClientes.setVisible(false);
        pClientes.setPreferredSize(new java.awt.Dimension(700, 350));

        bNClientes3.setText("<html><body>NOVO CLIENTE</body></html>");
        bNClientes3.setToolTipText("");
        bNClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNClientes3ActionPerformed(evt);
            }
        });

        bBClientes3.setText("BUSCAR CLIENTE");
        bBClientes3.setToolTipText("");
        bBClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBClientes3ActionPerformed(evt);
            }
        });

        bVoltar3.setText("<html><body>VOLTAR</body></html>");
        bVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltar3ActionPerformed(evt);
            }
        });

        txtAdmin1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtAdmin1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtAdmin1.setText("CLIENTES");

        javax.swing.GroupLayout pClientesLayout = new javax.swing.GroupLayout(pClientes);
        pClientes.setLayout(pClientesLayout);
        pClientesLayout.setHorizontalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pClientesLayout.createSequentialGroup()
                        .addComponent(bNClientes3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(bBClientes3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAdmin1)
                    .addComponent(bVoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pClientesLayout.setVerticalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClientesLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(txtAdmin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNClientes3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBClientes3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(bVoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mCadastro.setText("Cadastro");
        mCadastro.setEnabled(false);

        miAnimal.setText("Animal");
        miAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnimalActionPerformed(evt);
            }
        });
        mCadastro.add(miAnimal);

        miCliente.setText("Cliente");
        mCadastro.add(miCliente);

        bmBarraMenu.add(mCadastro);

        mClientes.setText("Clientes");
        mClientes.setEnabled(false);

        miBuscarCliente.setText("Buscar");
        mClientes.add(miBuscarCliente);

        bmBarraMenu.add(mClientes);

        mAnimais.setText("Animais");
        mAnimais.setEnabled(false);

        miBuscarAnimal.setText("Buscar");
        mAnimais.add(miBuscarAnimal);

        bmBarraMenu.add(mAnimais);

        mAtendimento.setText("Atendimento");
        mAtendimento.setEnabled(false);

        jMenuItem5.setText("Orçamento");
        mAtendimento.add(jMenuItem5);

        miNovoAtendimento.setText("Novo Atendimento");
        mAtendimento.add(miNovoAtendimento);

        miContultar.setText("Consultar");
        miContultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miContultarActionPerformed(evt);
            }
        });
        mAtendimento.add(miContultar);

        bmBarraMenu.add(mAtendimento);

        setJMenuBar(bmBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(pClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAnimalActionPerformed

    private void miContultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miContultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miContultarActionPerformed

    private void bClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientesActionPerformed
        pMenuPrincipal.setVisible(false);
        pClientes.setVisible(true);
    }//GEN-LAST:event_bClientesActionPerformed

    private void bServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bServicosActionPerformed

    private void bAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnimaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAnimaisActionPerformed

    private void bNClientes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNClientes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNClientes3ActionPerformed

    private void bBClientes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBClientes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBClientes3ActionPerformed

    private void bVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltar3ActionPerformed
        pClientes.setVisible(false);
        pMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_bVoltar3ActionPerformed

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        pMenuPrincipal.setVisible(false);
        pLogin.setVisible(true);
        txtLogin.setText("");
        txtSenha.setText("");
        mAnimais.setEnabled(false);
        mClientes.setEnabled(false);
        mAtendimento.setEnabled(false);
        mCadastro.setEnabled(false);
    }//GEN-LAST:event_bLogoutActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        bEntrarActionPerformed(evt);
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        this.fechar();
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        Statement query = ConexaoPostgreSQL.openConnectionPostgreSQL();
        int cont = 0;

        try {

            ResultSet rs = query.executeQuery("SELECT id, login, senha, nivel FROM \"Admin\""
                + "WHERE login = '" + txtLogin.getText() + "' ");

            while (rs.next()) {
                cont ++;
                rs = query.executeQuery("SELECT id, login, senha, nivel FROM \"Admin\""
                    + "WHERE senha = '" + txtSenha.getText() + "' ");

                while (rs.next()) {
                    if (rs.getString("login").equals(txtLogin.getText())) {
                        lbLoginIncorreto.setVisible(false);
                        cont ++;
                        pLogin.setVisible(false);
                        pMenuPrincipal.setVisible(true);
                        mAnimais.setEnabled(true);
                        mClientes.setEnabled(true);
                        mAtendimento.setEnabled(true);
                        mCadastro.setEnabled(true);
                        lbSenhaIncorreta.setVisible(false);
                    }
                }
            }

            if (cont == 0) {
                lbLoginIncorreto.setVisible(true);
            } else if (cont == 1) {
                lbLoginIncorreto.setVisible(false);
                lbSenhaIncorreta.setVisible(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            lbLoginIncorreto.setVisible(true);
        }
    }//GEN-LAST:event_bEntrarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
    txtSenha.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void bFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicialFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnimais;
    private javax.swing.JButton bBClientes3;
    private javax.swing.JButton bClientes;
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bFuncionario;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bNClientes3;
    private javax.swing.JButton bSair;
    private javax.swing.JButton bServicos;
    private javax.swing.JButton bVoltar3;
    private javax.swing.JMenuBar bmBarraMenu;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLoginIncorreto;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSenhaIncorreta;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu mAnimais;
    private javax.swing.JMenu mAtendimento;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenuItem miAnimal;
    private javax.swing.JMenuItem miBuscarAnimal;
    private javax.swing.JMenuItem miBuscarCliente;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miContultar;
    private javax.swing.JMenuItem miNovoAtendimento;
    private javax.swing.JLabel nada;
    private javax.swing.JPanel pClientes;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel pMenuPrincipal;
    private javax.swing.JLabel txtAdmin;
    private javax.swing.JLabel txtAdmin1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void fechar() {
        if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja sair do programa?", "ATENÇÃO ", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
         
        }
    }

}

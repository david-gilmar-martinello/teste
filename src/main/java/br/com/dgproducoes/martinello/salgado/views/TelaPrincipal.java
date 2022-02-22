/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.views;

import br.com.dgproducoes.martinello.salgado.dao.ConectionFirebase;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.Timer;

/**
 *
 * @author david
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private ConectionFirebase conectionFirebase = new ConectionFirebase();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conectionFirebase.conctarBanco();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/caverinha.jpg"));
        Image image = icon.getImage();
        jdpTelaPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        jlPainelHora = new javax.swing.JLabel();
        jlPainelInformativo = new javax.swing.JLabel();
        jmbMeuPrincipal = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiAddFuncionario = new javax.swing.JMenuItem();
        jmContaReceber = new javax.swing.JMenu();
        jmiConsultaPagamento = new javax.swing.JMenuItem();
        jmiBaixaSalgado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSM - Sistema de Salgado Martinello");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlPainelHora.setForeground(new java.awt.Color(255, 255, 255));
        jlPainelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlPainelInformativo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPainelInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 578, Short.MAX_VALUE)
                .addComponent(jlPainelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPainelHora, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jlPainelInformativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jdpTelaPrincipal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpTelaPrincipalLayout = new javax.swing.GroupLayout(jdpTelaPrincipal);
        jdpTelaPrincipal.setLayout(jdpTelaPrincipalLayout);
        jdpTelaPrincipalLayout.setHorizontalGroup(
            jdpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdpTelaPrincipalLayout.setVerticalGroup(
            jdpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpTelaPrincipalLayout.createSequentialGroup()
                .addGap(0, 598, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmCadastro.setText("Cadastro");

        jmiAddFuncionario.setText("Adicionar Funcionario");
        jmiAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddFuncionarioActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiAddFuncionario);

        jmbMeuPrincipal.add(jmCadastro);

        jmContaReceber.setText("Contas Receber");

        jmiConsultaPagamento.setText("Consulta Pagamentos");
        jmiConsultaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaPagamentoActionPerformed(evt);
            }
        });
        jmContaReceber.add(jmiConsultaPagamento);

        jmiBaixaSalgado.setText("Baixa Salgado");
        jmiBaixaSalgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBaixaSalgadoActionPerformed(evt);
            }
        });
        jmContaReceber.add(jmiBaixaSalgado);

        jmbMeuPrincipal.add(jmContaReceber);

        setJMenuBar(jmbMeuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        Timer timer = new Timer(1000, new hora());
        timer.start();

        jlPainelInformativo.setText("Copyright © MartLabs");


    }//GEN-LAST:event_formWindowOpened

    private void jmiAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddFuncionarioActionPerformed
        TelaCadastroCliente cadastroCliente = new TelaCadastroCliente();
        jdpTelaPrincipal.add(cadastroCliente);
        cadastroCliente.show();
    }//GEN-LAST:event_jmiAddFuncionarioActionPerformed

    private void jmiConsultaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaPagamentoActionPerformed
        TelaConsultaPagamentos telaConsultaPagamentos = new TelaConsultaPagamentos();
        jdpTelaPrincipal.add(telaConsultaPagamentos);
        telaConsultaPagamentos.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_jmiConsultaPagamentoActionPerformed

    private void jmiBaixaSalgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBaixaSalgadoActionPerformed
        TelaBaixaSalgado telaBaixaSalgado = new TelaBaixaSalgado();
        jdpTelaPrincipal.add(telaBaixaSalgado);
        telaBaixaSalgado.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_jmiBaixaSalgadoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdpTelaPrincipal;
    private javax.swing.JLabel jlPainelHora;
    private javax.swing.JLabel jlPainelInformativo;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmContaReceber;
    private javax.swing.JMenuBar jmbMeuPrincipal;
    private javax.swing.JMenuItem jmiAddFuncionario;
    private javax.swing.JMenuItem jmiBaixaSalgado;
    private javax.swing.JMenuItem jmiConsultaPagamento;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Calendar now = Calendar.getInstance();
            jlPainelHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }

    }

}

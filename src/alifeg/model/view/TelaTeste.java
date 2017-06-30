package alifeg.model.view;

import alifeg.model.domain.Situacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Peterson
 */
public class TelaTeste extends javax.swing.JFrame implements ActionListener {

    private ListaSituacao ls;

    /**
     * Creates new form TelaTeste
     */
    public TelaTeste() {
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

        btProcurarSituacao = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        btnResponsavel = new javax.swing.JButton();
        btnTarefa = new javax.swing.JButton();
        btnPlanoAcao = new javax.swing.JButton();
        btnAcao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        btProcurarSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btProcurarSituacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pesquisar.png"))); // NOI18N
        btProcurarSituacao.setText("Procurar Situações");
        btProcurarSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarSituacaoActionPerformed(evt);
            }
        });

        btnResponsavel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnResponsavel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/selecionar.png"))); // NOI18N
        btnResponsavel.setText(" Tela Responsavel");
        btnResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponsavelActionPerformed(evt);
            }
        });

        btnTarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/selecionar.png"))); // NOI18N
        btnTarefa.setText("Tela De Tarefa");
        btnTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarefaActionPerformed(evt);
            }
        });

        btnPlanoAcao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPlanoAcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/selecionar.png"))); // NOI18N
        btnPlanoAcao.setText("Tela Plano De Ação");
        btnPlanoAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoAcaoActionPerformed(evt);
            }
        });

        btnAcao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/selecionar.png"))); // NOI18N
        btnAcao.setText("Tela De Ação");
        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btProcurarSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPlanoAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAcao)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btProcurarSituacao)
                    .addComponent(btnResponsavel)
                    .addComponent(btnAcao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTarefa)
                    .addComponent(btnPlanoAcao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProcurarSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarSituacaoActionPerformed
        this.ls = new ListaSituacao();
        this.ls.setListener(this);
        this.ls.setVisible(true);

    }//GEN-LAST:event_btProcurarSituacaoActionPerformed

    private void btnResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponsavelActionPerformed
        ResponsavelView rv = new ResponsavelView();
        rv.setVisible(true);
        //rv.setSelecionar(true);
        rv.setPesquisar(true);
    }//GEN-LAST:event_btnResponsavelActionPerformed

    private void btnTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarefaActionPerformed
        TarefaView rv = new TarefaView();
        rv.setVisible(true);
    }//GEN-LAST:event_btnTarefaActionPerformed

    private void btnPlanoAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoAcaoActionPerformed
        PlanoDeAcaoView plv = new PlanoDeAcaoView();
        plv.setVisible(true);
    }//GEN-LAST:event_btnPlanoAcaoActionPerformed

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
        AcaoView av = new AcaoView();
        av.setVisible(true);
    }//GEN-LAST:event_btnAcaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btProcurarSituacao;
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnPlanoAcao;
    private javax.swing.JButton btnResponsavel;
    private javax.swing.JButton btnTarefa;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e); 
        if (e.getActionCommand().equals("Selecionar")) {
            this.ls.selecionar();
            Object selecao = this.ls.getSelecao();
            if (selecao instanceof Situacao) {
                Situacao sit = (Situacao) selecao;
                txtResultado.setText(sit.getDescricao());
            } else if (selecao instanceof ArrayList) {
                ArrayList<Situacao> sits = (ArrayList<Situacao>) selecao;
                Iterator<Situacao> iterator = sits.iterator();
                while (iterator.hasNext()) {
                    Situacao next = iterator.next();
                    txtResultado.setText(txtResultado.getText() + ", " + next.getDescricao());
                }
            }
            this.ls.dispose();
        } else if (e.getActionCommand().equalsIgnoreCase("cancelar")) {
            // açoes do cancelar
        }

    }
}
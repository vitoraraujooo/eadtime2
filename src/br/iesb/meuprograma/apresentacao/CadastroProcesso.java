/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

/**
 *
 * @author bruno
 */
public class CadastroProcesso extends javax.swing.JPanel {

    /**
     * Creates new form CadastroProcesso
     */
    public CadastroProcesso() {
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

        cbAsunto = new javax.swing.JComboBox<>();
        txtDescricaoProcesso = new javax.swing.JTextField();
        txtNumeracaoProcesso = new javax.swing.JTextField();
        txtDataProcesso = new javax.swing.JTextField();
        btnAdicionarArquivo = new javax.swing.JButton();
        selArquivoProcesso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        cbAsunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione um Assunto", "Assunto 1", "Assunto 2", "Assunto 3" }));
        cbAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsuntoActionPerformed(evt);
            }
        });

        txtNumeracaoProcesso.setEditable(false);
        txtNumeracaoProcesso.setText("9999999");

        txtDataProcesso.setText("17/03/2018");
        txtDataProcesso.setEnabled(false);

        btnAdicionarArquivo.setText("Adicionar");

        selArquivoProcesso.setText("Selecione o arquivo");
        selArquivoProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selArquivoProcessoActionPerformed(evt);
            }
        });

        tblProcesso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Nome do arquivo", "Ação"
            }
        ));
        jScrollPane1.setViewportView(tblProcesso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cbAsunto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescricaoProcesso)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumeracaoProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(txtDataProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selArquivoProcesso)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarArquivo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeracaoProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricaoProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarArquivo)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selArquivoProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAsuntoActionPerformed

    private void selArquivoProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selArquivoProcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selArquivoProcessoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarArquivo;
    private javax.swing.JComboBox<String> cbAsunto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField selArquivoProcesso;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTextField txtDataProcesso;
    private javax.swing.JTextField txtDescricaoProcesso;
    private javax.swing.JTextField txtNumeracaoProcesso;
    // End of variables declaration//GEN-END:variables
}

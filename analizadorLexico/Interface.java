/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorLexico;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iago Nogueira <iagonogueira227@gmail.com>
 */
public class Interface extends javax.swing.JFrame {
    
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_expr = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        selec2 = new javax.swing.JPanel();
        btnAnalizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        selec1 = new javax.swing.JPanel();
        painelBar = new javax.swing.JPanel();
        barraDeProgresso = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_result = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Expressão:");

        text_expr.setBackground(new java.awt.Color(51, 51, 51));
        text_expr.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        text_expr.setForeground(new java.awt.Color(0, 255, 51));
        text_expr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        btnLimpar.setBackground(new java.awt.Color(51, 0, 51));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimparMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Limpar Campos");

        selec2.setBackground(new java.awt.Color(255, 255, 255));
        selec2.setEnabled(false);
        selec2.setOpaque(false);

        javax.swing.GroupLayout selec2Layout = new javax.swing.GroupLayout(selec2);
        selec2.setLayout(selec2Layout);
        selec2Layout.setHorizontalGroup(
            selec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        selec2Layout.setVerticalGroup(
            selec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnLimparLayout = new javax.swing.GroupLayout(btnLimpar);
        btnLimpar.setLayout(btnLimparLayout);
        btnLimparLayout.setHorizontalGroup(
            btnLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimparLayout.createSequentialGroup()
                .addComponent(selec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnLimparLayout.setVerticalGroup(
            btnLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimparLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addComponent(selec2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnAnalizar.setBackground(new java.awt.Color(102, 0, 102));
        btnAnalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAnalizarMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Analizar");

        selec1.setBackground(new java.awt.Color(255, 255, 255));
        selec1.setPreferredSize(new java.awt.Dimension(3, 37));

        javax.swing.GroupLayout selec1Layout = new javax.swing.GroupLayout(selec1);
        selec1.setLayout(selec1Layout);
        selec1Layout.setHorizontalGroup(
            selec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        selec1Layout.setVerticalGroup(
            selec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnAnalizarLayout = new javax.swing.GroupLayout(btnAnalizar);
        btnAnalizar.setLayout(btnAnalizarLayout);
        btnAnalizarLayout.setHorizontalGroup(
            btnAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAnalizarLayout.createSequentialGroup()
                .addComponent(selec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        btnAnalizarLayout.setVerticalGroup(
            btnAnalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAnalizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(selec1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAnalizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelBar.setBackground(new java.awt.Color(204, 204, 204));
        painelBar.setOpaque(false);

        barraDeProgresso.setBackground(new java.awt.Color(51, 0, 51));
        barraDeProgresso.setOpaque(false);

        javax.swing.GroupLayout painelBarLayout = new javax.swing.GroupLayout(painelBar);
        painelBar.setLayout(painelBarLayout);
        painelBarLayout.setHorizontalGroup(
            painelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(barraDeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        painelBarLayout.setVerticalGroup(
            painelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(barraDeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(text_expr, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_expr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 300));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Resutado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 29, 80, -1));

        text_result.setEditable(false);
        text_result.setBackground(new java.awt.Color(204, 204, 204));
        text_result.setColumns(20);
        text_result.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        text_result.setForeground(new java.awt.Color(51, 51, 51));
        text_result.setRows(5);
        text_result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jScrollPane1.setViewportView(text_result);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 320, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 360, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalizarMousePressed
        // TODO add your handling code here:
        this.btnAnalizar.setBackground(Color.decode( "#660066" )); //aceso
        this.selec1.setOpaque( true );
        
        this.btnLimpar.setBackground( Color.decode( "#330033" ) ); //apagado
        this.selec2.setOpaque( false );
        
        String expr = this.text_expr.getText();
        if ( !expr.isEmpty() ) {
            
            mostrarProgresso( true );
            
            new Thread( new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep( 2000 );
                        mostrarResultados();

                    } catch ( Exception error ) {
                        error.printStackTrace();
                        mostrarProgresso( false );
                    }
                }
            }).start();
        }
    }//GEN-LAST:event_btnAnalizarMousePressed

    private void btnLimparMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMousePressed
        // TODO add your handling code here:
        this.btnLimpar.setBackground( Color.decode( "#660066" ) ); //aceso
        this.selec2.setOpaque( true );
        
        this.btnAnalizar.setBackground(Color.decode( "#330033" )); //apagado
        this.selec1.setOpaque( false );
        
        this.text_expr.setText( "" );
        this.text_result.setText( "" );
    }//GEN-LAST:event_btnLimparMousePressed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
    private void mostrarResultados() throws IOException {
        
        ArrayList<String> list = new ArrayList<>();
        
        File ficheiro = new File( "ficheiro.txt" );
        PrintWriter aEscrever;
        
        try {
            aEscrever = new PrintWriter( ficheiro );
            aEscrever.print( this.text_expr.getText() );
            aEscrever.close();
        } catch ( Exception error ) {
            error.printStackTrace();
        }
        
        Reader aLerFicheiro = new BufferedReader( new FileReader( "ficheiro.txt" ) );
        AnalizadorLexico lex = new AnalizadorLexico( aLerFicheiro );
        String resultado = "";
        
        while ( true ) {
            Token token = lex.yylex();
            if ( token == null ) {
                imprimeLista( list );
                return;
            }
            switch ( token ) {
                case ERRO:
                    resultado = "Simbolo não reconhecido" + "\n";
                    list.add( resultado );
                    break;
                case INTEIRO:
                    resultado = "TOKEN: " + lex.lexame + " =>" + " Número " + token + "\n";
                    list.add( resultado );
                    break;
                case ABPARENTESE:
                    resultado = "TOKEN: " + ")" + " =>" + " Abre Parênteses" + "\n";
                    list.add( resultado );
                    break;
                case FCPARENTESE:
                    resultado = "TOKEN: " + ")" + " =>" + " Fecha Parênteses" + "\n";
                    list.add( resultado );
                    break;    
                case IGUAL:
                    resultado = "TOKEN: " + "=" + " =>" + " Operador de Igualdade" + "\n";
                    list.add( resultado );
                    break;
                case MAIS:
                    resultado = "TOKEN: " + "+" + " =>" + " Operador de Soma" + "\n";
                    list.add( resultado );
                    break;
                case MENOS:
                    resultado = "TOKEN: " + "-" + " =>" + " Operador de Subtração" + "\n";
                    list.add( resultado );
                    break;
                case VEZES:
                    resultado = "TOKEN: " + "*" + " =>" + " Operador de Multiplicação" + "\n";
                    list.add( resultado );
                    break;
                case DIVISAO:
                    resultado = "TOKEN: " + "/" + " =>" + " Operador de Divisão" + "\n";
                    list.add( resultado );
                    break;
                case NATURAL:
                    resultado = "TOKEN: " + lex.lexame + " =>" + " Número " + token + "\n";
                    list.add( resultado );
                    break;
            }
        }   
    }
    
    private void imprimeLista( ArrayList<String> mList ) {
        
        for ( String str : mList )
            this.text_result.append(str);
        
        mostrarProgresso( false );
    }
    
    
    private void mostrarProgresso( boolean mostrar ) {
        this.barraDeProgresso.setOpaque(mostrar);
        this.barraDeProgresso.setIndeterminate( mostrar );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraDeProgresso;
    private javax.swing.JPanel btnAnalizar;
    private javax.swing.JPanel btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBar;
    private javax.swing.JPanel selec1;
    private javax.swing.JPanel selec2;
    private javax.swing.JTextField text_expr;
    private javax.swing.JTextArea text_result;
    // End of variables declaration//GEN-END:variables
}

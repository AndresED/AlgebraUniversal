/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Criba;
import Modelos.MetodoOrdenacion;
import Modelos.NumeroPrimo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author AndresED
 */
public class Ventana extends javax.swing.JFrame {
    public int []array4=new int[100];
    public int []array5=new int[100];
    public int []array6=new int[100];
    public int []array7=new int[100];
    public int []array8=new int[100];
    public int p4=0,p5=0,p6=0,p7=0,p8=0;
    public int validar=1;
    public Ventana() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeron = new javax.swing.JTextField();
        btnverificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaprimos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        respuesta = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        capas = new javax.swing.JLayeredPane();
        panel_lineas = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcion_generar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRIBA DE ERATOSTENES");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("INGRESE N:");

        btnverificar.setText("VERIFICAR");
        btnverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverificarActionPerformed(evt);
            }
        });

        listaprimos.setColumns(20);
        listaprimos.setRows(5);
        jScrollPane1.setViewportView(listaprimos);

        jLabel2.setText("LA LISTA DE NUMEROS PRIMOS DESDE 2 HASTA N ES:");

        respuesta.setText("EL NUMERO N ES ......!!!!");

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(numeron, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(respuesta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnverificar)
                    .addComponent(btnlimpiar))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(respuesta)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        capas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panel_lineas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_lineasLayout = new javax.swing.GroupLayout(panel_lineas);
        panel_lineas.setLayout(panel_lineasLayout);
        panel_lineasLayout.setHorizontalGroup(
            panel_lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        panel_lineasLayout.setVerticalGroup(
            panel_lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        capas.setLayer(panel_lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Archivos");

        jMenuItem1.setText("Cerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");

        opcion_generar.setText("Generar");
        opcion_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_generarActionPerformed(evt);
            }
        });
        jMenu2.add(opcion_generar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(capas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverificarActionPerformed
        ArrayList<Integer> numerosde2aN = new ArrayList<>();
        Criba obj =  new  Criba(Integer.parseInt(numeron.getText()));
        numerosde2aN=obj.CribaE();
        for(int j=0;j<numerosde2aN.size();j++)
        {
            listaprimos.append(numerosde2aN.get(j).toString()+"\n");
        }
        NumeroPrimo obj1 = new NumeroPrimo(Integer.parseInt(numeron.getText()));
        obj1.setNumerosde2aN(numerosde2aN);
        if(obj1.VerificarPrimo())
        {
            respuesta.setText("EL NUMERO "+numeron.getText()+" ES PRIMO");
        }
        else
        {
            respuesta.setText("EL NUMERO "+numeron.getText()+" NO ES PRIMO");
        }
    }//GEN-LAST:event_btnverificarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        numeron.setText("");
        listaprimos.setText("");
        respuesta.setText("EL NUMERO N ES ......!!!!");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void opcion_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_generarActionPerformed
        
        for(int i=0;i<5;i++)//SON 5 NUMEROS DE CIFRAS DIFERENTES
        {
            for(int j=0;j<100;j++)//SE REPITE 100 VECES EL ALGORITMO PARA CADA TIPO DE DATOS
            {
                if(i==0)//DATOS DE 2 o 4 CIFRAS
                {
                    int numeroAleatorio = (int)(Math.random()*(99-10+1)+10); 
                    //int numeroAleatorio = (int)(Math.random()*(9999-1000+1)+1000); 
                    Criba obj= new Criba(numeroAleatorio);
                    array4[j]=obj.CribaNO();
                }
                if(i==1)//DATOS DE 3 o 5 CIFRAS
                {
                    int numeroAleatorio = (int)(Math.random()*(999-100+1)+100); 
                    //int numeroAleatorio = (int)(Math.random()*(99999-10000+1)+10000); 
                    Criba obj= new Criba(numeroAleatorio);
                    array5[j]=obj.CribaNO();
                }
                if(i==2)//DATOS DE 4 o 6 CIFRAS
                {
                    int numeroAleatorio = (int)(Math.random()*(9999-1000+1)+1000); 
                    //int numeroAleatorio = (int)(Math.random()*(999999-100000+1)+100000); 
                    Criba obj= new Criba(numeroAleatorio);
                    array6[j]=obj.CribaNO();
                }
                if(i==3)//DATOS DE 5 o 7 CIFRAS
                {
                    int numeroAleatorio = (int)(Math.random()*(99999-10000+1)+10000); 
                    //int numeroAleatorio = (int)(Math.random()*(9999999-1000000+1)+1000000); 
                    Criba obj= new Criba(numeroAleatorio);
                    array7[j]=obj.CribaNO();
                }
                /*if(i==4)//DATOS DE 6 o 8 CIFRAS
                {
                    int numeroAleatorio = (int)(Math.random()*(999999-100000+1)+100000); 
                    //int numeroAleatorio = (int)(Math.random()*(99999999-10000000+1)+10000000); 
                    Criba obj= new Criba(numeroAleatorio);
                    array8[j]=obj.CribaNO();
                }*/
            }    
        }
        for(int d=0;d<100;d++)
        {
            p4=array4[d]+p4;
            p5=array5[d]+p5;
            p6=array6[d]+p6;
            p7=array7[d]+p7;
            //p8=array8[d]+p8;
        }
        p4=p4/100;
        p5=p5/100;
        p6=p6/100;
        p7=p7/100;
        //p8=p8/100;
        /////////////////////GRAFICANDO////////////////////////////////////////
        panel_lineas.setVisible(true);
        capas.setLayer(panel_lineas,0,0);
        ChartPanel panel;
        JFreeChart chart=null;
        XYSplineRenderer renderer = new XYSplineRenderer();
        XYSeriesCollection dataset= new XYSeriesCollection();
        ValueAxis x = new NumberAxis();
        ValueAxis y = new NumberAxis();
        XYSeries serie1= new XYSeries("CURVA");
        XYPlot plot;
        panel_lineas.removeAll();
        try
            {
                serie1.add(4,p4);
                serie1.add(5,p5);
                serie1.add(6,p6);
                serie1.add(7,p7);
                //serie1.add(8,p8);
            }catch(Exception ex)
            {
                validar=0;
            }     
            if(validar==1)
            {
                dataset.addSeries(serie1);
                x.setLabel("NUMERO DE CIFRAS");
                y.setLabel("NUMERO DE OPERACIONES");
                plot= new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("CRIBA DE ERATOSTENES");
                panel= new ChartPanel(chart);
                panel.setBounds(0, 4, 533, 244);
                panel_lineas.add(panel);
                panel_lineas.repaint();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No EXisten datos que graficar");
            }
    }//GEN-LAST:event_opcion_generarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnverificar;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listaprimos;
    private javax.swing.JTextField numeron;
    private javax.swing.JMenuItem opcion_generar;
    private javax.swing.JPanel panel_lineas;
    private javax.swing.JLabel respuesta;
    // End of variables declaration//GEN-END:variables
}

package Vistas;
import Modelos.AlgoritmoOrdenacion;
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
public class Tabla extends javax.swing.JFrame {
    public DefaultTableModel modelo;
    public int complejidad[][][]= new int[5][5][3];//NUMERO ALGORITMO - NUMERO DATO - TIPO COMPLEJIDAD
    AlgoritmoOrdenacion obj= new AlgoritmoOrdenacion();
        public int k;
        
        //PERMITIRAN ALMACENAR LOS ARRAYS GENERADOS ALEATORIAMENTE
        public int array_100_B[]=new int[100];
        public int array_1000_B[]=new int[1000];
        public int array_10000_B[]=new int[10000];
        public int array_100000_B[]=new int[100000];
        public int array_1000000_B[]=new int[1000000];
       
        public int array_100_I[]=new int[100];
        public int array_1000_I[]=new int[1000];
        public int array_10000_I[]=new int[10000];
        public int array_100000_I[]=new int[100000];
        public int array_1000000_I[]=new int[1000000];
            
        public int array_100_Q[]=new int[100];
        public int array_1000_Q[]=new int[1000];
        public int array_10000_Q[]=new int[10000];
        public int array_100000_Q[]=new int[100000];
        public int array_1000000_Q[]=new int[1000000];
            
        public int array_100_M[]=new int[100];
        public int array_1000_M[]=new int[1000];
        public int array_10000_M[]=new int[10000];
        public int array_100000_M[]=new int[100000];
        public int array_1000000_M[]=new int[1000000];
            
        public int array_100_H[]=new int[100];
        public int array_1000_H[]=new int[1000];
        public int array_10000_H[]=new int[10000];
        public int array_100000_H[]=new int[100000];
        public int array_1000000_H[]=new int[1000000];
        
        //PERMITIRAN ALMACENAR EL NUMERO DE INTERCAMBIOS EN CADA REPETICION CAD AUNO CORRESPONDIENTE AL NUMERO DE DATOS GENERADO
        public int intercambios_B1[]= new int[100];
        public int intercambios_B2[]= new int[100];
        public int intercambios_B3[]= new int[100];
        public int intercambios_B4[]= new int[100];
        public int intercambios_B5[]= new int[100];
        
        public int intercambios_I1[]= new int[100];
        public int intercambios_I2[]= new int[100];
        public int intercambios_I3[]= new int[100];
        public int intercambios_I4[]= new int[100];
        public int intercambios_I5[]= new int[100];
        
        public int intercambios_M1[]= new int[100];
        public int intercambios_M2[]= new int[100];
        public int intercambios_M3[]= new int[100];
        public int intercambios_M4[]= new int[100];
        public int intercambios_M5[]= new int[100];
        
        public int intercambios_Q1[]= new int[100];
        public int intercambios_Q2[]= new int[100];
        public int intercambios_Q3[]= new int[100];
        public int intercambios_Q4[]= new int[100];
        public int intercambios_Q5[]= new int[100];
        
        public int intercambios_H1[]= new int[100];
        public int intercambios_H2[]= new int[100];
        public int intercambios_H3[]= new int[100];
        public int intercambios_H4[]= new int[100];
        public int intercambios_H5[]= new int[100];
        public int NumeroAleatorio;
        //PERMITIRAN SALVAR LACOMPLEJIDAD OSEALOS VALORES DE LA TABLA
        public int aux_complejidad[]=new int[3];
        //VALIDAR ENVIO DE DATOS A LA GRAFICA
        public int validar=1;
    public Tabla() {
        initComponents();
        modelo= (DefaultTableModel)tabla_complejidad.getModel();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_complejidad = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbx_graficos = new javax.swing.JComboBox();
        capas = new javax.swing.JLayeredPane();
        panel_lineas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMPLEJIDAD METODOS DE ORDENACION");

        tabla_complejidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Peor", "Promedio", "Mejor", "Peor", "Promedio", "Mejor", "Peor", "Promedio", "Mejor"
            }
        ));
        tabla_complejidad.setRowHeight(23);
        jScrollPane1.setViewportView(tabla_complejidad);

        jLabel1.setText("100 DATOS");

        jLabel2.setText("1000 DATOS");

        jLabel3.setText("10000 DATOS");

        jLabel6.setText("BURBUJA");

        jLabel7.setText("INSERCION");

        jLabel8.setText("MERGESORT");

        jLabel9.setText("QUICKSORT");

        jLabel10.setText("HEAPSORT");

        cbx_graficos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Burbuja", "Insercion", "MergeSort", "QuickSort", "HeapSort" }));
        cbx_graficos.setSelectedIndex(-1);
        cbx_graficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_graficosActionPerformed(evt);
            }
        });

        capas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Grafica"));

        panel_lineas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_lineasLayout = new javax.swing.GroupLayout(panel_lineas);
        panel_lineas.setLayout(panel_lineasLayout);
        panel_lineasLayout.setHorizontalGroup(
            panel_lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_lineasLayout.setVerticalGroup(
            panel_lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
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
                .addComponent(panel_lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        capas.setLayer(panel_lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setText("ELIJA EL ALGORITMO A GRAFICAR: ");

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

        jMenuItem2.setText("Generar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel10))
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(capas)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_graficos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_graficos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(21, 21, 21)
                .addComponent(capas))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here: 
        
        for(int i=0;i<5;i++)//SON 5 ALGORITMOS
        {
            for(int j=0;j<100;j++)//SE REPITE 100 VECES CADA ALGORITMO
            {
                //GENERANDO NUMEROS ALEATORIOS  
                for(k=0;k<1000000;k++)
                {
                    if(k<100)
                    {
                        if(i==0)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100_B[k]=NumeroAleatorio;
                        }
                        if(i==1)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100_I[k]=NumeroAleatorio;
                        }
                        if(i==2)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100_M[k]=NumeroAleatorio;
                        }
                        if(i==3)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100_Q[k]=NumeroAleatorio;
                        }
                        if(i==4)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100_H[k]=NumeroAleatorio;
                        }
                    }
                    if(k<1000)
                    {
                        if(i==0)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000_B[k]=NumeroAleatorio;
                        }
                        if(i==1)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000_I[k]=NumeroAleatorio;
                        }
                        if(i==2)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000_M[k]=NumeroAleatorio;
                        }
                        if(i==3)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000_Q[k]=NumeroAleatorio;
                        }
                        if(i==4)
                        {
                            int NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000_H[k]=NumeroAleatorio;
                        }
                    }
                    if(k<10000)
                    {
                        if(i==0)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_10000_B[k]=NumeroAleatorio;
                        }
                        if(i==1)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_10000_I[k]=NumeroAleatorio;
                        }
                        if(i==2)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_10000_M[k]=NumeroAleatorio;
                        }
                        if(i==3)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_10000_Q[k]=NumeroAleatorio;
                        }
                        if(i==4)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_10000_H[k]=NumeroAleatorio;
                        }
                    }
                    if (k<100000) 
                    {
                        if(i==0)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100000_B[k]=NumeroAleatorio;
                        }
                        if(i==1)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100000_I[k]=NumeroAleatorio;
                        }
                        if(i==2)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100000_M[k]=NumeroAleatorio;
                        }
                        if(i==3)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100000_Q[k]=NumeroAleatorio;
                        }
                        if(i==4)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_100000_H[k]=NumeroAleatorio;
                        }
                    }
                    if (k<1000000) 
                    {
                        if(i==0)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000000_B[k]=NumeroAleatorio;
                        }
                        if(i==1)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000000_I[k]=NumeroAleatorio;
                        }
                        if(i==2)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000000_M[k]=NumeroAleatorio;
                        }
                        if(i==3)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000000_Q[k]=NumeroAleatorio;
                        }
                        if(i==4)
                        {
                            NumeroAleatorio=(int)(Math.random()*(1000000-1+1)+1);
                            array_1000000_H[k]=NumeroAleatorio;
                        }
                    }
                }   
                
                ////--------------------------------ENVIANDO A METODOS DE ORDENACION
                //BURBUJA
                if(i==0)
                {
                    intercambios_B1[j]=obj.burbuja(array_100_B);
                    intercambios_B2[j]=obj.burbuja(array_1000_B);
                    intercambios_B3[j]=obj.burbuja(array_10000_B);
                    //intercambios_B4[j]=obj.burbuja(array_100000_B);
                    //intercambios_B5[j]=obj.burbuja(array_1000000_B);
                }
                if(i==1)
                {
                    //INSERCION
                    intercambios_I1[j]=obj.Insercion(array_100_I);
                    intercambios_I2[j]=obj.Insercion(array_1000_I);
                    intercambios_I3[j]=obj.Insercion(array_10000_I);
                    //intercambios_I4[j]=obj.Insercion(array_100000_I);
                    //intercambios_I5[j]=obj.Insercion(array_1000000_I);
                }
                if(i==2)
                {
                    //MERGESORT
                    intercambios_M1[j]=obj.MergeSort(array_100_M,0,array_100_M.length-1);
                    intercambios_M2[j]=obj.MergeSort(array_1000_M,0,array_1000_M.length-1);
                    intercambios_M3[j]=obj.MergeSort(array_10000_M,0,array_10000_M.length-1);
                    //intercambios_M4[j]=obj.MergeSort(array_100000_M,0,array_100000_M.length-1);
                    //intercambios_M5[j]=obj.MergeSort(array_1000000_M,0,array_1000000_M.length-1);
                }
                if(i==3)
                {
                    //QUICKSORT
                    intercambios_Q1[j]=obj.ordenacionRapida(array_100_Q);
                    intercambios_Q2[j]=obj.ordenacionRapida(array_1000_Q);
                    intercambios_Q3[j]=obj.ordenacionRapida(array_10000_Q);
                    //intercambios_Q4[j]=obj.ordenacionRapida(array_100000_Q);
                    //intercambios_Q5[j]=obj.ordenacionRapida(array_1000000_Q);
                }
                if(i==4)
                {
                    //HEAPSORT 
                    intercambios_H1[j]=obj.ordenacionMonticulos(array_100_H);
                    intercambios_H2[j]=obj.ordenacionMonticulos(array_1000_H);
                    intercambios_H3[j]=obj.ordenacionMonticulos(array_10000_H);
                    //intercambios_H4[j]=obj.ordenacionMonticulos(array_100000_H);
                    //intercambios_H5[j]=obj.ordenacionMonticulos(array_1000000_H);
                }
                
                
            }
        }
        for(int h=0;h<100;h++)
        {
            System.out.println(array_1000_B[h]);
        }
        //SACANDO DATOS QUE IRAN A LA TABLA
        //BURBUJA
        /////////NUMERO ALGORITMO - NUMERO DATO - TIPO COMPLEJIDAD
        //100 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_B1);
        complejidad[0][0][0]=aux_complejidad[0];//PEOR
        complejidad[0][0][1]=aux_complejidad[1];//PROMEDIO
        complejidad[0][0][2]=aux_complejidad[2];//MEJOR
        //1000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_B2);
        complejidad[0][1][0]=aux_complejidad[0];//PEOR
        complejidad[0][1][1]=aux_complejidad[1];//PROMEDIO
        complejidad[0][1][2]=aux_complejidad[2];//MEJOR
        //10000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_B3);
        complejidad[0][2][0]=aux_complejidad[0];//PEOR
        complejidad[0][2][1]=aux_complejidad[1];//PROMEDIO
        complejidad[0][2][2]=aux_complejidad[2];//MEJOR
        //100000 DATOS
        /*aux_complejidad=obj.ordenacionMonticulos1(intercambios_B4);
        complejidad[0][3][0]=aux_complejidad[0];//PEOR
        complejidad[0][3][1]=aux_complejidad[1];//PROMEDIO
        complejidad[0][3][2]=aux_complejidad[2];//MEJOR*/
        //1000000 DATOS
        /*aux_complejidad=obj.ordenacionMonticulos1(intercambios_B5);
        complejidad[0][4][0]=aux_complejidad[0];//PEOR
        complejidad[0][4][1]=aux_complejidad[1];//PROMEDIO
        complejidad[0][4][2]=aux_complejidad[2];//MEJOR*/
        
       
        //INSERCION
        /////////NUMERO ALGORITMO - NUMERO DATO - TIPO COMPLEJIDAD
        //10O DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_I1);
        complejidad[1][0][0]=aux_complejidad[0];//PEOR
        complejidad[1][0][1]=aux_complejidad[1];//PROMEDIO
        complejidad[1][0][2]=aux_complejidad[2];//MEJOR
        //1000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_I2);
        complejidad[1][1][0]=aux_complejidad[0];//PEOR
        complejidad[1][1][1]=aux_complejidad[1];//PROMEDIO
        complejidad[1][1][2]=aux_complejidad[2];//MEJOR
        //10000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_I3);
        complejidad[1][2][0]=aux_complejidad[0];//PEOR
        complejidad[1][2][1]=aux_complejidad[1];//PROMEDIO
        complejidad[1][2][2]=aux_complejidad[2];//MEJOR
        //100000 DATOS
        /*aux_complejidad=obj.ordenacionMonticulos1(intercambios_I4);
        complejidad[1][3][0]=aux_complejidad[0];//PEOR
        complejidad[1][3][1]=aux_complejidad[1];//PROMEDIO
        complejidad[1][3][2]=aux_complejidad[2];//MEJOR*/
        //1000000 DATOS
        /*aux_complejidad=obj.ordenacionMonticulos1(intercambios_I5);
        complejidad[1][4][0]=aux_complejidad[0];//PEOR
        complejidad[1][4][1]=aux_complejidad[1];//PROMEDIO
        complejidad[1][4][2]=aux_complejidad[2];//MEJOR
        */
     
        
        //MERGESORT
        /////////NUMERO ALGORITMO - NUMERO DATO - TIPO COMPLEJIDAD
        //10O DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_M1);
        complejidad[2][0][0]=aux_complejidad[0];//PEOR
        complejidad[2][0][1]=aux_complejidad[1];//PROMEDIO
        complejidad[2][0][2]=aux_complejidad[2];//MEJOR
        //1000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_M2);
        complejidad[2][1][0]=aux_complejidad[0];//PEOR
        complejidad[2][1][1]=aux_complejidad[1];//PROMEDIO
        complejidad[2][1][2]=aux_complejidad[2];//MEJOR
        //10000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_M3);
        complejidad[2][2][0]=aux_complejidad[0];//PEOR
        complejidad[2][2][1]=aux_complejidad[1];//PROMEDIO
        complejidad[2][2][2]=aux_complejidad[2];//MEJOR
        //100000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_M4);
        complejidad[2][3][0]=aux_complejidad[0];//PEOR
        complejidad[2][3][1]=aux_complejidad[1];//PROMEDIO
        complejidad[2][3][2]=aux_complejidad[2];//MEJOR*/
        //1000000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_M5);
        complejidad[2][4][0]=aux_complejidad[0];//PEOR
        complejidad[2][4][1]=aux_complejidad[1];//PROMEDIO
        complejidad[2][4][2]=aux_complejidad[2];//MEJOR*/
        
        
        //QUICKSORT
        /////////NUMERO ALGORITMO - NUMERO DATO - TIPO COMPLEJIDAD
        //10O DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_Q1);
        complejidad[3][0][0]=aux_complejidad[0];//PEOR
        complejidad[3][0][1]=aux_complejidad[1];//PROMEDIO
        complejidad[3][0][2]=aux_complejidad[2];//MEJOR
        //1000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_Q2);
        complejidad[3][1][0]=aux_complejidad[0];//PEOR
        complejidad[3][1][1]=aux_complejidad[1];//PROMEDIO
        complejidad[3][1][2]=aux_complejidad[2];//MEJOR
        //10000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_Q3);
        complejidad[3][2][0]=aux_complejidad[0];//PEOR
        complejidad[3][2][1]=aux_complejidad[1];//PROMEDIO
        complejidad[3][2][2]=aux_complejidad[2];//MEJOR
        //100000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_Q4);
        complejidad[3][3][0]=aux_complejidad[0];//PEOR
        complejidad[3][3][1]=aux_complejidad[1];//PROMEDIO
        complejidad[3][3][2]=aux_complejidad[2];//MEJOR*/
        //1000000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_Q5);
        complejidad[3][4][0]=aux_complejidad[0];//PEOR
        complejidad[3][4][1]=aux_complejidad[1];//PROMEDIO
        complejidad[3][4][2]=aux_complejidad[2];//MEJOR
        
        //HEAPSORT
        /////////NUMERO ALGORITMO - NUMERO DATO - TIPO COMPLEJIDAD
        //10O DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_H1);
        complejidad[4][0][0]=aux_complejidad[0];//PEOR
        complejidad[4][0][1]=aux_complejidad[1];//PROMEDIO
        complejidad[4][0][2]=aux_complejidad[2];//MEJOR
        //1000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_H2);
        complejidad[4][1][0]=aux_complejidad[0];//PEOR
        complejidad[4][1][1]=aux_complejidad[1];//PROMEDIO
        complejidad[4][1][2]=aux_complejidad[2];//MEJOR
        //10000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_H3);
        complejidad[4][2][0]=aux_complejidad[0];//PEOR
        complejidad[4][2][1]=aux_complejidad[1];//PROMEDIO
        complejidad[4][2][2]=aux_complejidad[2];//MEJOR
        //100000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_H4);
        complejidad[4][3][0]=aux_complejidad[0];//PEOR
        complejidad[4][3][1]=aux_complejidad[1];//PROMEDIO
        complejidad[4][3][2]=aux_complejidad[2];//MEJOR*/
        //1000000 DATOS
        aux_complejidad=obj.ordenacionMonticulos1(intercambios_H5);
        complejidad[4][4][0]=aux_complejidad[0];//PEOR
        complejidad[4][4][1]=aux_complejidad[1];//PROMEDIO
        complejidad[4][4][2]=aux_complejidad[2];//MEJOR
        
        /////////NUMERO ALGORITMO - NUMERO DATO - TIPO COMPLEJIDAD
        //LLENANDO TABLA
        modelo.removeRow(modelo.getRowCount()-1);
        modelo.removeRow(modelo.getRowCount()-1);
        modelo.removeRow(modelo.getRowCount()-1);
        modelo.removeRow(modelo.getRowCount()-1);
        modelo.removeRow(modelo.getRowCount()-1);
        //BURBUJA
        modelo.addRow(new Object[]{
            String.valueOf(complejidad[0][0][0]),String.valueOf(complejidad[0][0][1]),String.valueOf(complejidad[0][0][2]),
            String.valueOf(complejidad[0][1][0]),String.valueOf(complejidad[0][1][1]),String.valueOf(complejidad[0][1][2]),
            String.valueOf(complejidad[0][2][0]),String.valueOf(complejidad[0][2][1]),String.valueOf(complejidad[0][2][2]),
            String.valueOf(complejidad[0][3][0]),String.valueOf(complejidad[0][3][1]),String.valueOf(complejidad[0][3][2]),
            String.valueOf(complejidad[0][4][0]),String.valueOf(complejidad[0][4][1]),String.valueOf(complejidad[0][4][2])
        });
        //INSERSION
        modelo.addRow(new Object[]{
            String.valueOf(complejidad[1][0][0]),String.valueOf(complejidad[1][0][1]),String.valueOf(complejidad[1][0][2]),
            String.valueOf(complejidad[1][1][0]),String.valueOf(complejidad[1][1][1]),String.valueOf(complejidad[1][1][2]),
            String.valueOf(complejidad[1][2][0]),String.valueOf(complejidad[1][2][1]),String.valueOf(complejidad[1][2][2]),
            String.valueOf(complejidad[1][3][0]),String.valueOf(complejidad[1][3][1]),String.valueOf(complejidad[1][3][2]),
            String.valueOf(complejidad[1][4][0]),String.valueOf(complejidad[1][4][1]),String.valueOf(complejidad[1][4][2])
        });   
        //MERGESORT
        modelo.addRow(new Object[]{
            String.valueOf(complejidad[2][0][0]),String.valueOf(complejidad[2][0][1]),String.valueOf(complejidad[2][0][2]),
            String.valueOf(complejidad[2][1][0]),String.valueOf(complejidad[2][1][1]),String.valueOf(complejidad[2][1][2]),
            String.valueOf(complejidad[2][2][0]),String.valueOf(complejidad[2][2][1]),String.valueOf(complejidad[2][2][2]),
            String.valueOf(complejidad[2][3][0]),String.valueOf(complejidad[2][3][1]),String.valueOf(complejidad[2][3][2]),
            String.valueOf(complejidad[2][4][0]),String.valueOf(complejidad[2][4][1]),String.valueOf(complejidad[2][4][2])
        });    
        //QUICKSORT
        modelo.addRow(new Object[]{
            String.valueOf(complejidad[3][0][0]),String.valueOf(complejidad[3][0][1]),String.valueOf(complejidad[3][0][2]),
            String.valueOf(complejidad[3][1][0]),String.valueOf(complejidad[3][1][1]),String.valueOf(complejidad[3][1][2]),
            String.valueOf(complejidad[3][2][0]),String.valueOf(complejidad[3][2][1]),String.valueOf(complejidad[3][2][2]),
            String.valueOf(complejidad[3][3][0]),String.valueOf(complejidad[3][3][1]),String.valueOf(complejidad[3][3][2]),
            String.valueOf(complejidad[3][4][0]),String.valueOf(complejidad[3][4][1]),String.valueOf(complejidad[3][4][2])
        });    
        //HEAPSORT
        modelo.addRow(new Object[]{
            String.valueOf(complejidad[4][0][0]),String.valueOf(complejidad[4][0][1]),String.valueOf(complejidad[4][0][2]),
            String.valueOf(complejidad[4][1][0]),String.valueOf(complejidad[4][1][1]),String.valueOf(complejidad[4][1][2]),
            String.valueOf(complejidad[4][2][0]),String.valueOf(complejidad[4][2][1]),String.valueOf(complejidad[4][2][2]),
            String.valueOf(complejidad[4][3][0]),String.valueOf(complejidad[4][3][1]),String.valueOf(complejidad[4][3][2]),
            String.valueOf(complejidad[4][4][0]),String.valueOf(complejidad[4][4][1]),String.valueOf(complejidad[4][4][2])
        });
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cbx_graficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_graficosActionPerformed
        // TODO add your handling code here:
        panel_lineas.setVisible(true);
        capas.setLayer(panel_lineas,0,0);
        ChartPanel panel;
        JFreeChart chart=null;
        if(cbx_graficos.getSelectedIndex()==0)//BURBUJA
        {
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset= new XYSeriesCollection();
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            XYSeries serie1= new XYSeries("100 Datos");
            XYSeries serie2= new XYSeries("1000 Datos");
            XYSeries serie3= new XYSeries("10000 Datos");
            //XYSeries serie4= new XYSeries("100000 Datos");
            //XYSeries serie5= new XYSeries("1000000 Datos");
            XYPlot plot;
            panel_lineas.removeAll();
            try
            {
                    //100 DATOS
                    serie1.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][0])));
                    serie1.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][0])));
                    serie1.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][0])));
                    //1000 DATOS
                    serie2.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][1])));
                    serie2.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][1])));
                    serie2.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][1])));
                    //10000 DATO
                    serie3.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][2])));
                    serie3.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][2])));
                    serie3.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][2])));
                    
                    /*serie4.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][3])));
                    serie4.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][3])));
                    serie4.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][3])));
                    
                    serie5.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][4])));
                    serie5.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][4])));
                    serie5.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][4])));*/
                
                    
                    //complejidad[0][0][0]
                    //complejidad[0][1][0]
                    //complejidad[0][2][0]
                    //complejidad[][3][0]
            }catch(Exception ex)
            {
                validar=0;
            }     
            if(validar==1)
            {
                dataset.addSeries(serie1);
                dataset.addSeries(serie2);
                dataset.addSeries(serie3);
                //dataset.addSeries(serie4);
                //dataset.addSeries(serie5);
                x.setLabel("NUMERO DE DATOS");
                y.setLabel("NUMERO DE OPERACIONES");
                plot= new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("METODO DE ORDENACION BURBUJA");
                panel= new ChartPanel(chart);
                panel.setBounds(5, 10, 1336, 394);
                panel_lineas.add(panel);
                panel_lineas.repaint();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No EXisten datos que graficar");
            }
        }
        if(cbx_graficos.getSelectedIndex()==1)//INSERCION
        {
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset= new XYSeriesCollection();
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            XYSeries serie1= new XYSeries("100 Datos");
            XYSeries serie2= new XYSeries("1000 Datos");
            XYSeries serie3= new XYSeries("10000 Datos");
            //XYSeries serie4= new XYSeries("100000 Datos");
            //XYSeries serie5= new XYSeries("1000000 Datos");
            XYPlot plot;
            panel_lineas.removeAll();
            try
            {
                //100 DATOS
                    serie1.add(100.0,Float.parseFloat(String.valueOf(complejidad[1][0][0])));
                    serie1.add(1000.0,Float.parseFloat(String.valueOf(complejidad[1][1][0])));
                    serie1.add(10000.0,Float.parseFloat(String.valueOf(complejidad[1][2][0])));
                    //1000 DATOS
                    serie2.add(100.0,Float.parseFloat(String.valueOf(complejidad[1][0][1])));
                    serie2.add(1000.0,Float.parseFloat(String.valueOf(complejidad[1][1][1])));
                    serie2.add(10000.0,Float.parseFloat(String.valueOf(complejidad[1][2][1])));
                    //10000 DATO
                    serie3.add(100.0,Float.parseFloat(String.valueOf(complejidad[1][0][2])));
                    serie3.add(1000.0,Float.parseFloat(String.valueOf(complejidad[1][1][2])));
                    serie3.add(10000.0,Float.parseFloat(String.valueOf(complejidad[1][2][2])));
                    
                    /*serie4.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][3])));
                    serie4.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][3])));
                    serie4.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][3])));
                    
                    serie5.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][4])));
                    serie5.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][4])));
                    serie5.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][4])));*/
            }catch(Exception ex)
            {
                validar=0;
            }     
            if(validar==1)
            {
                dataset.addSeries(serie1);
                dataset.addSeries(serie2);
                dataset.addSeries(serie3);
                //dataset.addSeries(serie4);
                //dataset.addSeries(serie5);
                x.setLabel("NUMERO DE DATOS");
                y.setLabel("NUMERO DE OPERACIONES");
                plot= new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("METODO DE ORDENACION INSERCION");
                panel= new ChartPanel(chart);
                panel.setBounds(0, 0, 1336, 394);
                panel_lineas.add(panel);
                panel_lineas.repaint();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No EXisten datos que graficar");
            }
        }
        if(cbx_graficos.getSelectedIndex()==2)//MERGESORT
        {
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset= new XYSeriesCollection();
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            XYSeries serie1= new XYSeries("100 Datos");
            XYSeries serie2= new XYSeries("1000 Datos");
            XYSeries serie3= new XYSeries("10000 Datos");
            XYSeries serie4= new XYSeries("100000 Datos");
            XYSeries serie5= new XYSeries("1000000 Datos");
            XYPlot plot;
            panel_lineas.removeAll();
            try
            {
                //100 DATOS
                    serie1.add(100.0,Float.parseFloat(String.valueOf(complejidad[2][0][0])));
                    serie1.add(1000.0,Float.parseFloat(String.valueOf(complejidad[2][1][0])));
                    serie1.add(10000.0,Float.parseFloat(String.valueOf(complejidad[2][2][0])));
                    //1000 DATOS
                    serie2.add(100.0,Float.parseFloat(String.valueOf(complejidad[2][0][1])));
                    serie2.add(1000.0,Float.parseFloat(String.valueOf(complejidad[2][1][1])));
                    serie2.add(10000.0,Float.parseFloat(String.valueOf(complejidad[2][2][1])));
                    //10000 DATO
                    serie3.add(100.0,Float.parseFloat(String.valueOf(complejidad[2][0][2])));
                    serie3.add(1000.0,Float.parseFloat(String.valueOf(complejidad[2][1][2])));
                    serie3.add(10000.0,Float.parseFloat(String.valueOf(complejidad[2][2][2])));
                    
                    /*serie4.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][3])));
                    serie4.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][3])));
                    serie4.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][3])));
                    
                    serie5.add(100.0,Float.parseFloat(String.valueOf(complejidad[0][0][4])));
                    serie5.add(1000.0,Float.parseFloat(String.valueOf(complejidad[0][1][4])));
                    serie5.add(10000.0,Float.parseFloat(String.valueOf(complejidad[0][2][4])));*/
            }catch(Exception ex)
            {
                validar=0;
            }     
            if(validar==1)
            {
                dataset.addSeries(serie1);
                dataset.addSeries(serie2);
                dataset.addSeries(serie3);
                dataset.addSeries(serie4);
                dataset.addSeries(serie5);
                x.setLabel("NUMERO DE DATOS");
                y.setLabel("NUMERO DE OPERACIONES");
                plot= new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("METODO DE ORDENACION MERGESORT");
                panel= new ChartPanel(chart);
                panel.setBounds(5, 10, 1336, 394);
                panel_lineas.add(panel);
                panel_lineas.repaint();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No EXisten datos que graficar");
            }
        }
        if(cbx_graficos.getSelectedIndex()==3)//QUICKSORT
        {
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset= new XYSeriesCollection();
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            XYSeries serie1= new XYSeries("100 Datos");
            XYSeries serie2= new XYSeries("1000 Datos");
            XYSeries serie3= new XYSeries("10000 Datos");
            XYSeries serie4= new XYSeries("100000 Datos");
            XYSeries serie5= new XYSeries("1000000 Datos");
            XYPlot plot;
            panel_lineas.removeAll();
            try
            {
                //100 DATOS
                    serie1.add(100.0,Float.parseFloat(String.valueOf(complejidad[3][0][0])));
                    serie1.add(1000.0,Float.parseFloat(String.valueOf(complejidad[3][1][0])));
                    serie1.add(10000.0,Float.parseFloat(String.valueOf(complejidad[3][2][0])));
                    //1000 DATOS
                    serie2.add(100.0,Float.parseFloat(String.valueOf(complejidad[3][0][1])));
                    serie2.add(1000.0,Float.parseFloat(String.valueOf(complejidad[3][1][1])));
                    serie2.add(10000.0,Float.parseFloat(String.valueOf(complejidad[3][2][1])));
                    //10000 DATO
                    serie3.add(100.0,Float.parseFloat(String.valueOf(complejidad[3][0][2])));
                    serie3.add(1000.0,Float.parseFloat(String.valueOf(complejidad[3][1][2])));
                    serie3.add(10000.0,Float.parseFloat(String.valueOf(complejidad[3][2][2])));
                    
                    /*serie4.add(100.0,Float.parseFloat(String.valueOf(complejidad[4][0][3])));
                    serie4.add(1000.0,Float.parseFloat(String.valueOf(complejidad[4][1][3])));
                    serie4.add(10000.0,Float.parseFloat(String.valueOf(complejidad[4][2][3])));
                    
                    serie5.add(100.0,Float.parseFloat(String.valueOf(complejidad[4][0][4])));
                    serie5.add(1000.0,Float.parseFloat(String.valueOf(complejidad[4][1][4])));
                    serie5.add(10000.0,Float.parseFloat(String.valueOf(complejidad[4][2][4])));*/
            }catch(Exception ex)
            {
                validar=0;
            }     
            if(validar==1)
            {
                dataset.addSeries(serie1);
                dataset.addSeries(serie2);
                dataset.addSeries(serie3);
                dataset.addSeries(serie4);
                dataset.addSeries(serie5);
                x.setLabel("NUMERO DE DATOS");
                y.setLabel("NUMERO DE OPERACIONES");
                plot= new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("METODO DE ORDENACION QUICKSORT");
                panel= new ChartPanel(chart);
                panel.setBounds(5, 10, 1336, 394);
                panel_lineas.add(panel);
                panel_lineas.repaint();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No EXisten datos que graficar");
            }
        }
        if(cbx_graficos.getSelectedIndex()==4)//HEAPSORT
        {
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset= new XYSeriesCollection();
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            XYSeries serie1= new XYSeries("100 Datos");
            XYSeries serie2= new XYSeries("1000 Datos");
            XYSeries serie3= new XYSeries("10000 Datos");
            XYSeries serie4= new XYSeries("100000 Datos");
            XYSeries serie5= new XYSeries("1000000 Datos");
            XYPlot plot;
            panel_lineas.removeAll();
            try
            {
                //100 DATOS
                    serie1.add(100.0,Float.parseFloat(String.valueOf(complejidad[4][0][0])));
                    serie1.add(1000.0,Float.parseFloat(String.valueOf(complejidad[4][0][1])));
                    serie1.add(10000.0,Float.parseFloat(String.valueOf(complejidad[4][0][2])));
                    //1000 DATOS
                    serie2.add(100.0,Float.parseFloat(String.valueOf(complejidad[4][1][0])));
                    serie2.add(1000.0,Float.parseFloat(String.valueOf(complejidad[4][1][1])));
                    serie2.add(1000.0,Float.parseFloat(String.valueOf(complejidad[4][1][2])));
                    //10000 DATOS
                    serie3.add(100.0,Float.parseFloat(String.valueOf(complejidad[4][2][0])));
                    serie3.add(1000.0,Float.parseFloat(String.valueOf(complejidad[4][2][1])));
                    serie3.add(10000.0,Float.parseFloat(String.valueOf(complejidad[4][2][2])));
                    //serie4.add(100000,Float.parseFloat(String.valueOf(complejidad[0][3][0])));
                    //serie5.add(1000000,Float.parseFloat(String.valueOf(complejidad[0][4][0])));
            }catch(Exception ex)
            {
                validar=0;
            }     
            if(validar==1)
            {
                dataset.addSeries(serie1);
                dataset.addSeries(serie2);
                dataset.addSeries(serie3);
                dataset.addSeries(serie4);
                dataset.addSeries(serie5);
                x.setLabel("NUMERO DE DATOS");
                y.setLabel("NUMERO DE OPERACIONES");
                plot= new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("METODO DE ORDENACION HEAPSORT");
                panel= new ChartPanel(chart);
                panel.setBounds(5, 10, 1336, 394);
                panel_lineas.add(panel);
                panel_lineas.repaint();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No EXisten datos que graficar");
            }
        }
    }//GEN-LAST:event_cbx_graficosActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane capas;
    private javax.swing.JComboBox cbx_graficos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panel_lineas;
    private javax.swing.JTable tabla_complejidad;
    // End of variables declaration//GEN-END:variables
}

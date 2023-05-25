/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ConexionMySQL;
import Controlador.ControladorPreguntas;
import Modelo.PreguntasVideojuegos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class VentanaVideojuego extends javax.swing.JFrame {

    /**
     * Creates new form VentanaJuego
     */
    ConexionMySQL conexion;
    ControladorPreguntas controlar;
    TreeMap<String, String> preguntasVideojuegos = new TreeMap();
    int puntos = 0;

    public VentanaVideojuego() {
        initComponents();
    }

    public VentanaVideojuego(String tabla) {
        initComponents();
        int dificultad = JOptionPane.showConfirmDialog(null, "¿Quieres jugar en modo dificil?", "Mensaje de comprobación", JOptionPane.YES_NO_OPTION);
        while (dificultad == 1) {
            JOptionPane.showMessageDialog(null, "A llorar al parque, juégalo en dificil");
            dificultad = JOptionPane.showConfirmDialog(null, "¿Quieres jugar en modo dificil?", "Mensaje de comprobación", JOptionPane.YES_NO_OPTION);
        }
        JOptionPane.showMessageDialog(null, "Estas son las normas:\n1.Todas las preguntas pueden tener 0, 1 o más respuestas válidas. "
                + "\n2. El programa nunca te dirá si quedan más respuestas posibles, ahí reside la dificultad."
                + " \n3. Cada opción correcta suma 5 puntos, mientras que cada error restará 3 "
                + "\n4. Si no te la quieres jugar a seguir perdiendo puntos, puedes pasar a la siguiente pregunta, pero recuerda, puedes quedarte sin preguntas "
                + "\n5. Si sacas menos de 20 puntos eres un puto pringao");

        int resp = JOptionPane.showConfirmDialog(null, "¿Estás listo para empezar? Tendrás 40 segundos para responder todas las preguntas posibles", "Mensaje de comprobación", JOptionPane.YES_NO_OPTION);

        while (resp == 1) {
            JOptionPane.showMessageDialog(null, "Eres tonto o que, entonces a qué has venido");
            resp = JOptionPane.showConfirmDialog(null, "¿Estás listo para empezar? tendrás 40 segundos para responder todas las preguntas posibles", "Mensaje de comprobación", JOptionPane.YES_NO_OPTION);
        }

        try {
            this.conexion = new ConexionMySQL("root", "", "respuestas");
            this.conexion.conectar();
            this.controlar = new ControladorPreguntas(this.conexion);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("mierda");

        }
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        llenarPreguntasVideojuegos(preguntasVideojuegos);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int ti = 40;
            boolean finish = false;

            @Override
            public void run() {
                if (ti != 0) {

                    jLabel2.setText(String.valueOf(ti));
                    ti--;
                    if (preguntasVideojuegos.isEmpty()) {
                        ti = 0;
                    }

                } else if (!finish) {
                    finish = true;
                    jLabel2.setText(String.valueOf(ti));
                    JOptionPane.showMessageDialog(null, "Tu puntuación ha sido de : " + jLabel3.getText());
                    if (puntos > 40) {
                        JOptionPane.showMessageDialog(null, "Enhorabuena, has conseguido un logro");
                    }
                    if (puntos > 80) {
                        JOptionPane.showMessageDialog(null, "Enhorabuena, has conseguido un logro");
                    }
                    if (puntos > 100) {
                        JOptionPane.showMessageDialog(null, "Enhorabuena, has conseguido un logro");
                    }
                    int resp = JOptionPane.showConfirmDialog(null, "¿Quieres volver al menú principal?", "Mensaje de comprobación", JOptionPane.YES_NO_OPTION);
                    if (resp == 1) {
                        dispose();
                    } else {
                        Eleccion ventana = new Eleccion();
                        ventana.setVisible(true);
                        dispose();
                    }
                }
            }

        };

        timer.schedule(task, 10, 1000);
        jLabel1.setText(preguntasVideojuegos.firstKey());
        jLabel3.setText(String.valueOf(puntos));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        EnviarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(199, 237, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel2.setText("Contador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 37, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        B1.setBackground(new java.awt.Color(0, 204, 204));
        B1.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B1.setText("Super Mario World");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 204, 204));
        B6.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B6.setText("Dark Souls II");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B11.setBackground(new java.awt.Color(0, 204, 204));
        B11.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B11.setText("Super Mario Galaxy 2");
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B12.setBackground(new java.awt.Color(0, 204, 204));
        B12.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B12.setText("Doom Eternal");
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 204, 204));
        B2.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B2.setText("Valorant");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(0, 204, 204));
        B7.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B7.setText("Kingdom Hearts II");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B13.setBackground(new java.awt.Color(0, 204, 204));
        B13.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B13.setText("League of Legends");
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 204, 204));
        B3.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B3.setText("Hollow Night");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(0, 204, 204));
        B8.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B8.setText("Candy Crush Saga");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B14.setBackground(new java.awt.Color(0, 204, 204));
        B14.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B14.setText("Final Fantasy VII");
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(0, 204, 204));
        B4.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B4.setText("Sekiro");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(0, 204, 204));
        B9.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B9.setText("Uncharted 3");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B15.setBackground(new java.awt.Color(0, 204, 204));
        B15.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B15.setText("Final Fantasy X");
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 204, 204));
        B5.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B5.setText("Assassins Creed II");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B10.setBackground(new java.awt.Color(0, 204, 204));
        B10.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        B10.setText("The Last of Us ");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        EnviarBoton.setText("Cambiar Pagina");
        EnviarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(EnviarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)
                                .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnviarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 8, 90, 8);
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Pregunta");
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("PUNTUACIÓN");
        jPanel1.add(jLabel3, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(3).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(3).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(3).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B1);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B1);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }


    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(12).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(12).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(12).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B2);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B2);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B2ActionPerformed

    private void EnviarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarBotonActionPerformed
        habilitarBoton();
        if (preguntasVideojuegos.size() <= 1) {
            if (!preguntasVideojuegos.isEmpty()) {
                jLabel1.setText(preguntasVideojuegos.firstKey());
                preguntasVideojuegos.remove(preguntasVideojuegos.firstKey());
            } else {
                JOptionPane.showMessageDialog(null, "Has perdio");
            }
        } else {
            preguntasVideojuegos.remove(preguntasVideojuegos.firstKey());
            jLabel1.setText(preguntasVideojuegos.firstKey());
        }
    }//GEN-LAST:event_EnviarBotonActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(0).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(0).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(0).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B3);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B3);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(2).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(2).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(2).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B4);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B4);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(7).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(7).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(7).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B5);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B5);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(4).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(4).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(4).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B6);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B6);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(5).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(5).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(5).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B7);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B7);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(6).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(6).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(6).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B8);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B8);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(8).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(8).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(8).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B9);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B9);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(9).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(9).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(9).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B10);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B10);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(10).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(10).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(10).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B11);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B11);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(11).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(11).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(11).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B12);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B12);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B12ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(1).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(1).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(1).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B13);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B13);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B13ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(13).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(13).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(13).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B14);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B14);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B14ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        try {
            ArrayList<PreguntasVideojuegos> listaRespuestas = this.controlar.ObtenerTodosDatosVideojuegos();
            String respuesta = preguntasVideojuegos.get(preguntasVideojuegos.firstKey());
            if (listaRespuestas.get(14).getCategoria().equalsIgnoreCase(respuesta)
                    || listaRespuestas.get(14).getConsola().equalsIgnoreCase(respuesta)
                    || String.valueOf(listaRespuestas.get(14).getAño_nacimiento()).equalsIgnoreCase(respuesta)) {
                deshabilitarBoton(B15);
                puntos = puntos + 5;
                jLabel3.setText(String.valueOf(puntos));
            } else {
                deshabilitarBoton(B15);
                puntos = puntos - 3;
                jLabel3.setText(String.valueOf(puntos));

            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("caca");

        }
    }//GEN-LAST:event_B15ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVideojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVideojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVideojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVideojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVideojuego().setVisible(true);
            }
        });
    }

    public void llenarPreguntasVideojuegos(TreeMap preguntas) {
        preguntas.put("a. ¿Qué juego es Indie?", "Indie");
        preguntas.put("b. ¿Qué juego es de 2009?", "2009");
        preguntas.put("c. ¿Qué juego es protagonizado por un ladrón?", "Aventura");
        preguntas.put("d. ¿Qué juego es PS3?", "PS3");
        preguntas.put("e. ¿Qué juego es de Movil?", "Movil");
        preguntas.put("f. ¿En qué juego sale el Kiko?", "Enningunopicha");
        preguntas.put("g. ¿Qué juego es de Switch?", "Switch");
        preguntas.put("h. ¿Qué juego es de la Super Nintendo?", "Super Nintendo");
        preguntas.put("i. ¿A qué juego pertenece al conocido villano Sephiroth?", "1997");
        preguntas.put("j. ¿Qué juego es de 1997?", "1997");
        preguntas.put("k. ¿Qué juego es de JRPG?", "JRPG");
        preguntas.put("l. ¿Qué juego es protagonizado por un fontanero gordo y bigotuo?", "Plataforma");
        preguntas.put("m. ¿Qué juego es de la Wii?", "Wii");
        preguntas.put("n ¿Qué juego va de matar demonios con música de pastillero a toda polla?", "FPS");
        preguntas.put("o. ¿Qué juego táctico de RiotGames está protagonizado por agentes?", "Shooter");
        preguntas.put("p. ¿Qué juego es de 2001?", "2001");

    }

    public void cambiarPreguntas(TreeMap preguntas) {
        jLabel1.setText((String) preguntas.firstKey());
        preguntas.remove(preguntas.firstKey());
    }

    public void deshabilitarBoton(JButton boton) {
        boton.setEnabled(false);
    }

    public void habilitarBoton() {
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(true);
        B7.setEnabled(true);
        B8.setEnabled(true);
        B9.setEnabled(true);
        B10.setEnabled(true);
        B11.setEnabled(true);
        B12.setEnabled(true);
        B13.setEnabled(true);
        B14.setEnabled(true);
        B15.setEnabled(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton EnviarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

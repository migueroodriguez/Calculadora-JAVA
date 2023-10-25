package calculadora;

import javax.swing.*;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.KeyAdapter;
import java.util.StringTokenizer;
import java.awt.event.KeyEvent;

/**
 * Calculadora
 *
 * @version 1.0.0
 * @autor Zarfala
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    public VentanaCalculadora() {
        initComponents();
        setTitle("Calculadora");

        TextoCalc.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    calcularResultado();
                }
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        BotonDivision = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        BotonDecimal = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoCalc = new javax.swing.JTextArea();
        BotonLimpiar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });

        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });

        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        BotonDivision.setText("/");
        BotonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivisionActionPerformed(evt);
            }
        });

        Boton0.setText("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });

        BotonDecimal.setText(".");
        BotonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDecimalActionPerformed(evt);
            }
        });

        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });

        BotonMultiplicar.setText("*");
        BotonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicarActionPerformed(evt);
            }
        });

        TextoCalc.setColumns(20);
        TextoCalc.setRows(5);
        jScrollPane2.setViewportView(TextoCalc);

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        agregarTexto("1");
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        agregarTexto("2");
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        agregarTexto("3");
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        agregarTexto("4");
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        agregarTexto("5");
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        agregarTexto("6");
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        agregarTexto("7");
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        agregarTexto("8");
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        agregarTexto("9");
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
        agregarTexto("0");
    }//GEN-LAST:event_Boton0ActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        agregarTexto("+");
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        agregarTexto("-");
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void BotonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivisionActionPerformed
        agregarTexto("/");
    }//GEN-LAST:event_BotonDivisionActionPerformed

    private void BotonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDecimalActionPerformed
        agregarTexto(".");
    }//GEN-LAST:event_BotonDecimalActionPerformed

    private void BotonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicarActionPerformed
        agregarTexto("*");
    }//GEN-LAST:event_BotonMultiplicarActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        calcularResultado();
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        limpiarPantalla();
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void agregarTexto(String texto) {
        TextoCalc.append(texto);
    }

    private void calcularResultado() {
        String calcular = TextoCalc.getText();
        double resultado = 0;

        try {
            StringTokenizer tokenizer = new StringTokenizer(calcular, "+-*/", true);
            char operadorActual = ' ';
            boolean operadorEsperado = false;

            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken().trim();
                if (token.isEmpty()) {
                    continue;
                }

                if ("+-*/".contains(token)) {
                    if (operadorEsperado) {
                        operadorActual = token.charAt(0);
                        operadorEsperado = false;
                    } else {
                        throw new IllegalArgumentException("Operador inesperado: " + token);
                    }
                } else {
                    double numero = Double.parseDouble(token);
                    if (operadorEsperado) {
                        throw new IllegalArgumentException("Falta operador antes de: " + token);
                    }

                    switch (operadorActual) {
                        case '+':
                            resultado += numero;
                            break;
                        case '-':
                            resultado -= numero;
                            break;
                        case '*':
                            resultado *= numero;
                            break;
                        case '/':
                            if (numero != 0) {
                                resultado /= numero;
                            } else {
                                JOptionPane.showMessageDialog(this, "No se puede dividir por 0, inténtelo de nuevo");
                                limpiarPantalla();
                                return;
                            }
                            break;
                        default:
                            resultado = numero;
                    }
                    operadorEsperado = true;
                }
            }

            TextoCalc.setText(Double.toString(resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida");
            limpiarPantalla();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            limpiarPantalla();
        }
    }

    private void limpiarPantalla() {
        TextoCalc.setText("");
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        SwingUtilities.invokeLater(() -> {
            VentanaCalculadora frame = new VentanaCalculadora();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonDecimal;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JTextArea TextoCalc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

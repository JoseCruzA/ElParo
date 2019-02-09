/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACME.view;
import ACME.*;
import java.awt.*;

/**
 *
 * @author Jose Cruz
 */
public class CuevasView extends javax.swing.JPanel {
    Isla cuevas;
    Menu menu = new Menu();
    
    public CuevasView() {
        initComponents();
        this.cuevas = new Isla();
    }
    
    public void Recibirdato(float cant){
        this.cuevas.EntraCueva(cant);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(this.cuevas != null){
            this.cuevas.pintar(this.cuevas.getEntrada(), g);
            repaint();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
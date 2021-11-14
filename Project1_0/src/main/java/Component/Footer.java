/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author admin
 */
public class Footer extends javax.swing.JPanel {


    public Footer() {
        initComponents();
//        setOpaque(false);
        new Thread() {
            public void run() {
                while (true) {
                    Calendar c = new GregorianCalendar();
                    

                    int hour = c.get(Calendar.HOUR);
                    int minute = c.get(Calendar.MINUTE);
                    int second = c.get(Calendar.SECOND);
                    int PM_AM = c.get(Calendar.AM_PM);
                    LocalDate  date = LocalDate.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                   
                    String Day_night;
                    if (PM_AM == 1) {
                        Day_night = "PM";
                    } else {
                        Day_night = "AM";
                    }
                    String Date_Time = "" + hour + ":" + minute + ":" + second + "" + "  " + Day_night;
                    String Date_ =""+ date.format(myFormatObj);
                    
                    LlbTime.setText(Date_Time);
                    LblDate.setText(Date_);

                }
            }
        }.start();
       
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LlbTime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblDate = new javax.swing.JLabel();

        LlbTime.setText("N/A");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        LblDate.setText("N/A");
        LblDate.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(817, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LlbTime, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(LblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(LlbTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

//     protected void paintComponent(Graphics grphcs) {
//        Graphics2D g2 = (Graphics2D) grphcs;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        GradientPaint gra = new GradientPaint(0, 0, Color.GRAY, getWidth(), 0,Color.WHITE);
//        g2.setPaint(gra);
//        g2.fillRect(0, 0, getWidth(), getHeight());
//        super.paintComponent(grphcs);
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDate;
    private javax.swing.JLabel LlbTime;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

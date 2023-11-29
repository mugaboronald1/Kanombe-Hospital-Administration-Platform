
package view;

public class Splash extends javax.swing.JFrame {

   
    public Splash() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mistake = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Myprogres = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Mistake.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KANOMBE HOSPITAL SYSTEM");

        Myprogres.setBackground(new java.awt.Color(255, 51, 51));
        Myprogres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyprogresMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Downloads\\icons8-hospital-48.png")); // NOI18N

        Percentage.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Percentage.setForeground(new java.awt.Color(255, 255, 255));
        Percentage.setText("%");
        Percentage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PercentageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MistakeLayout = new javax.swing.GroupLayout(Mistake);
        Mistake.setLayout(MistakeLayout);
        MistakeLayout.setHorizontalGroup(
            MistakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Myprogres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MistakeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MistakeLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(MistakeLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MistakeLayout.setVerticalGroup(
            MistakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MistakeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Percentage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(Myprogres, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mistake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mistake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MyprogresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyprogresMouseClicked
  
    }//GEN-LAST:event_MyprogresMouseClicked

    private void PercentageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PercentageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PercentageMouseClicked

    
    public static void main(String args[]) {
      Splash Mysplash = new Splash();
    Mysplash.setVisible(true);
    try {
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(100);
            Mysplash.Myprogres.setValue(i);
            Mysplash.Percentage.setText(i+"%");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    new login().setVisible(true);
    Mysplash.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mistake;
    private javax.swing.JProgressBar Myprogres;
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

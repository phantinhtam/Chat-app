


package videoClient;

import Utils.Utils;
import com.github.sarxos.webcam.Webcam; 
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;
import voiceClient.MicThread;
import voiceClient.SoundPacket;



public class ClientVideoChatForm extends javax.swing.JFrame {
    static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    
    static boolean state = true;
    private MicTester micTester;   
    //this class is used to test the microphone. it manages the volume meter
    private class MicTester extends Thread{
        private TargetDataLine mic = null;
        public MicTester() {
            
        }
        @Override
        public void run() {
                
                try {
                    AudioFormat af = SoundPacket.defaultFormat;
                    DataLine.Info info = new DataLine.Info(TargetDataLine.class, null);
                    mic = (TargetDataLine) (AudioSystem.getLine(info));
                    mic.open(af);
                    mic.start();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, 
                            "Micrô không được phát hiện\n Vui lòng kiểm tra Micrô", 
                            "Lỗi",JOptionPane.ERROR_MESSAGE);
                }
                for (;;) {
                    Utils.sleep(10);
                    if(mic.available() > 0){
                        byte[] buff = new byte[SoundPacket.defaultDataLenght];
                        mic.read(buff,0,buff.length);
                        long tot=0;
                        for(int i=0; i<buff.length; i++) 
                            tot += MicThread.amplification*Math.abs(buff[i]);
                        tot *= 2.5;
                        tot /= buff.length;
                        micLev.setValue((int)tot);
                    }
                }
            }
        private void close(){
            if(mic!=null) mic.close();
            stop();
        }
    }
    /**
     * Creates new form ClientVideoChatForm
     */
    public ClientVideoChatForm() {
        initComponents();
        setTitle("Cuộc gọi video của khách hàng");
        micTester = new ClientVideoChatForm.MicTester();
        micTester.start();
        this.showUserWebCamStartingTime();
    }
    
    private void showUserWebCamStartingTime(){
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());

        WebcamPanel panel = new WebcamPanel(webcam);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);
        panel.setMirrored(true);
        this.add(panel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        friendWebCam = new javax.swing.JPanel();
        userWebCam = new javax.swing.JPanel();
        micLev = new javax.swing.JProgressBar();
        micVol = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerFirstByte = new javax.swing.JSpinner();
        jSpinnerSecondByte = new javax.swing.JSpinner();
        jSpinnerThirdByte = new javax.swing.JSpinner();
        jSpinnerFourthByte = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerPortNumber = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        millisecond = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-webcam-100.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-connect-24.png"))); // NOI18N
        jButton1.setText("Connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        friendWebCam.setBackground(new java.awt.Color(255, 255, 255));
        friendWebCam.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout friendWebCamLayout = new javax.swing.GroupLayout(friendWebCam);
        friendWebCam.setLayout(friendWebCamLayout);
        friendWebCamLayout.setHorizontalGroup(
            friendWebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        friendWebCamLayout.setVerticalGroup(
            friendWebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        userWebCam.setBackground(new java.awt.Color(255, 255, 255));
        userWebCam.setPreferredSize(new java.awt.Dimension(160, 120));

        javax.swing.GroupLayout userWebCamLayout = new javax.swing.GroupLayout(userWebCam);
        userWebCam.setLayout(userWebCamLayout);
        userWebCamLayout.setHorizontalGroup(
            userWebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        userWebCamLayout.setVerticalGroup(
            userWebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        micVol.setMaximum(300);
        micVol.setMinimum(50);
        micVol.setValue(100);
        micVol.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                micVolStateChanged(evt);
            }
        });

        jLabel6.setText("Mic Input Volume:");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel8.setText("IP Address");

        jSpinnerFirstByte.setModel(new javax.swing.SpinnerNumberModel(127, 0, 255, 1));

        jSpinnerSecondByte.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));

        jSpinnerThirdByte.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));

        jSpinnerFourthByte.setModel(new javax.swing.SpinnerNumberModel(1, 0, 255, 1));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel5.setText("Port Number");

        jSpinnerPortNumber.setModel(new javax.swing.SpinnerNumberModel(4007, 1, 65536, 1));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel9.setText("Time");

        hour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hour.setText("00");

        minute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minute.setText("00");

        second.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        second.setText("00");

        millisecond.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        millisecond.setText("00");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText(":");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-end-call-24.png"))); // NOI18N
        jButton3.setText("End call");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jSpinnerFirstByte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jSpinnerSecondByte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jSpinnerThirdByte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jSpinnerFourthByte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(6, 6, 6)
                                                .addComponent(jSpinnerPortNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(hour)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minute)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(second)
                                                .addGap(18, 18, 18)
                                                .addComponent(millisecond))))
                                    .addComponent(micLev, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(micVol, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userWebCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(friendWebCam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerFirstByte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerSecondByte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerThirdByte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerFourthByte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel5))
                                    .addComponent(jSpinnerPortNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(hour)
                                    .addComponent(minute)
                                    .addComponent(second)
                                    .addComponent(millisecond)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(micLev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(micVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(userWebCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(friendWebCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void micVolStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_micVolStateChanged
        MicThread.amplification=((double)(micVol.getValue()))/100.0;
    }//GEN-LAST:event_micVolStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        micTester.close();
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ClientVideoChatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientVideoChatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientVideoChatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientVideoChatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClientVideoChatForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel friendWebCam;
    private javax.swing.JLabel hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinnerFirstByte;
    private javax.swing.JSpinner jSpinnerFourthByte;
    private javax.swing.JSpinner jSpinnerPortNumber;
    private javax.swing.JSpinner jSpinnerSecondByte;
    private javax.swing.JSpinner jSpinnerThirdByte;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JProgressBar micLev;
    private javax.swing.JSlider micVol;
    private javax.swing.JLabel millisecond;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel second;
    private javax.swing.JPanel userWebCam;
    // End of variables declaration//GEN-END:variables
}

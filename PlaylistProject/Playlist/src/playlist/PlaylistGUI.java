/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package playlist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author deand
 */
public class PlaylistGUI extends javax.swing.JFrame {

    private ArrayList<LikedSongs> likedSongs; // ArrayList of LikedSong objects
    private ArrayList<LikedSongs> genA;
    private ArrayList<LikedSongs> genB;

    /**
     * Creates new form PlaylistGUI
     */
    public PlaylistGUI() {
        likedSongs = new ArrayList<>();
        genA = new ArrayList<>();
        genB = new ArrayList<>();
        initComponents();
    }

    public boolean isEmpty() {
        return likedSongs.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    public Object pop() {
        if (!(likedSongs.isEmpty())) {
            return likedSongs.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts an item onto the top of the stack
     */
    public void push(Object newItem) {
        likedSongs.add(0, (LikedSongs) newItem);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        moveBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        favTf = new javax.swing.JTextField();
        favLbl = new javax.swing.JLabel();
        genALbl = new javax.swing.JLabel();
        genBLbl = new javax.swing.JLabel();
        likedTf3 = new javax.swing.JTextField();
        likedTf4 = new javax.swing.JTextField();
        songNameTf = new javax.swing.JTextField();
        genTf = new javax.swing.JTextField();
        songNameLbl = new javax.swing.JLabel();
        genLbl = new javax.swing.JLabel();
        addFavBtn = new javax.swing.JButton();
        fromFavBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");

        searchBtn.setText("Search");

        moveBtn.setText("Move");

        exitBtn.setText("Exit");

        favLbl.setText("Favourites");

        genALbl.setText("Genre A");

        genBLbl.setText("Genre B");

        songNameLbl.setText("Song Name:");

        genLbl.setText("Genre:");

        addFavBtn.setText("Add to favourites");
        addFavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFavBtnActionPerformed(evt);
            }
        });

        fromFavBtn.setText("Add last from favourites");
        fromFavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromFavBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(favLbl)
                        .addGap(120, 120, 120)
                        .addComponent(genALbl)
                        .addGap(133, 133, 133)
                        .addComponent(genBLbl))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(songNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(songNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genTf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addFavBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(18, 18, 18)
                .addComponent(moveBtn)
                .addGap(18, 18, 18)
                .addComponent(exitBtn)
                .addGap(33, 33, 33))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(favTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(likedTf3)
                        .addGap(18, 18, 18)
                        .addComponent(likedTf4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fromFavBtn)
                        .addGap(83, 83, 83))))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songNameLbl)
                    .addComponent(genLbl)
                    .addComponent(genTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFavBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favLbl)
                    .addComponent(genALbl)
                    .addComponent(genBLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favTf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(likedTf3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(likedTf4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(fromFavBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn)
                    .addComponent(searchBtn)
                    .addComponent(moveBtn)
                    .addComponent(exitBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here: 
        String songName = songNameTf.getText();
        String genre = genTf.getText();
        String choice = "";
        PlaylistGUI p = new PlaylistGUI();
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void addFavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFavBtnActionPerformed
        // TODO add your handling code here:
        String songName = songNameTf.getText();
        String genre = genTf.getText();

        // Create a new LikedSong object and add it to the likedSongs ArrayList
        LikedSongs likedSong = new LikedSongs(songName, genre);
        likedSongs.add(likedSong);

        // Optionally, you can clear the text fields after adding the song
        songNameTf.setText("");
        genTf.setText("");

        System.out.println("New song has been added to favourites:\n" + "Title - " + songName + "\nGenre - " + genre);
    }//GEN-LAST:event_addFavBtnActionPerformed

    private void fromFavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromFavBtnActionPerformed
        // TODO add your handling code here:
        if (!likedSongs.isEmpty()) {
            // Get the last added song from the likedSongs list
            LikedSongs lastSongAdded = (LikedSongs) pop();

            String choice = "";

            choice = JOptionPane.showInputDialog(null, "1. Genre A\n2. Genre B");

            if (choice.equals("1") || choice.equalsIgnoreCase("a")) {
                genA.add(lastSongAdded);
                System.out.println(lastSongAdded + "has been added to Genre A from your favourites");
            } else if (choice.equals("2") || choice.equalsIgnoreCase("b")) {
                genB.add(lastSongAdded);
                System.out.println(lastSongAdded + "has been added to Genre B from your favourites");
            } else {
                System.out.println("You haven't chosen a valid option");
            }
        }
    }//GEN-LAST:event_fromFavBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addFavBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel favLbl;
    private javax.swing.JTextField favTf;
    private javax.swing.JButton fromFavBtn;
    private javax.swing.JLabel genALbl;
    private javax.swing.JLabel genBLbl;
    private javax.swing.JLabel genLbl;
    private javax.swing.JTextField genTf;
    private javax.swing.JTextField likedTf3;
    private javax.swing.JTextField likedTf4;
    private javax.swing.JButton moveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel songNameLbl;
    private javax.swing.JTextField songNameTf;
    // End of variables declaration//GEN-END:variables
}

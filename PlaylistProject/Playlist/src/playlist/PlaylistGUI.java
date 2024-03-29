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
public class PlaylistGUI extends javax.swing.JFrame implements StackInterface {

    private ArrayList<LikedSongs> likedSongs; // ArrayList of LikedSong objects
    private ArrayList<LikedSongs> genA;
    private ArrayList<LikedSongs> genB;
    private int favCount;
    private int genACount;
    private int genBCount;

    /**
     * Creates new form PlaylistGUI
     */
    public PlaylistGUI() {
        likedSongs = new ArrayList<>();
        genA = new ArrayList<>();
        genB = new ArrayList<>();
        favCount = 0;
        genACount = 0;
        genBCount = 0;
        initComponents();
    }

    @Override
    public boolean isEmpty() {
        return likedSongs.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    @Override
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
    @Override
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
        favLbl = new javax.swing.JLabel();
        genALbl = new javax.swing.JLabel();
        genBLbl = new javax.swing.JLabel();
        songNameTf = new javax.swing.JTextField();
        genTf = new javax.swing.JTextField();
        songNameLbl = new javax.swing.JLabel();
        genLbl = new javax.swing.JLabel();
        addFavBtn = new javax.swing.JButton();
        fromFavBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        favTa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        genATa = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        genBTa = new javax.swing.JTextArea();
        countBtn = new javax.swing.JButton();
        removeFavBtn = new javax.swing.JButton();
        repeatBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bodyPanel.setBackground(new java.awt.Color(0, 0, 0));

        addBtn.setText("Add A Song To A Playlist");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete A Song From A Playlist");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search Your Playlists For A Song");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        moveBtn.setText("Move Song To Next Playlist");
        moveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Close App");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        favLbl.setForeground(new java.awt.Color(255, 255, 255));
        favLbl.setText("Favourites");

        genALbl.setForeground(new java.awt.Color(255, 255, 255));
        genALbl.setText("Genre A (Hip-Hop)");

        genBLbl.setForeground(new java.awt.Color(255, 255, 255));
        genBLbl.setText("Genre B (Rap)");

        songNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        songNameLbl.setText("Song Name:");

        genLbl.setForeground(new java.awt.Color(255, 255, 255));
        genLbl.setText("Genre:");

        addFavBtn.setText("Add To Favourites");
        addFavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFavBtnActionPerformed(evt);
            }
        });

        fromFavBtn.setText("Add Last From Favourites");
        fromFavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromFavBtnActionPerformed(evt);
            }
        });

        favTa.setColumns(20);
        favTa.setRows(5);
        jScrollPane1.setViewportView(favTa);

        genATa.setColumns(20);
        genATa.setRows(5);
        jScrollPane2.setViewportView(genATa);

        genBTa.setColumns(20);
        genBTa.setRows(5);
        jScrollPane3.setViewportView(genBTa);

        countBtn.setText("Display Song Count");
        countBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countBtnActionPerformed(evt);
            }
        });

        removeFavBtn.setText("Remove From Favourites");
        removeFavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFavBtnActionPerformed(evt);
            }
        });

        repeatBtn.setText("Repeat Playlist");
        repeatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(favLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(genALbl)
                .addGap(148, 148, 148)
                .addComponent(genBLbl)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(songNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(songNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genTf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addFavBtn)
                                .addGap(18, 18, 18)
                                .addComponent(removeFavBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bodyPanelLayout.createSequentialGroup()
                                        .addComponent(moveBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(countBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(fromFavBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(exitBtn)
                                        .addGap(27, 27, 27))
                                    .addGroup(bodyPanelLayout.createSequentialGroup()
                                        .addComponent(addBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(searchBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(repeatBtn)))))))
                .addGap(38, 38, 38))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFavBtn)
                    .addComponent(genTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genLbl)
                    .addComponent(songNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songNameLbl)
                    .addComponent(removeFavBtn))
                .addGap(16, 16, 16)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favLbl)
                    .addComponent(genALbl)
                    .addComponent(genBLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn)
                    .addComponent(searchBtn)
                    .addComponent(repeatBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveBtn)
                    .addComponent(countBtn)
                    .addComponent(fromFavBtn)
                    .addComponent(exitBtn))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here: 
        String songName = songNameTf.getText();
        String genre = genTf.getText();

        // Check if song name and genre are provided
        if (songName.isBlank() || genre.isBlank()) {
            System.out.println("You need to enter both a song name and a genre.");
            return;
        }

        // Create a new LikedSong object with the provided details
        LikedSongs newSongAdded = new LikedSongs(songName, genre);

        // Check if the song already exists in the specified playlist
        boolean songExistsInPlaylist = false;
        if (genre.equalsIgnoreCase("hip-hop") || genre.equalsIgnoreCase("hip hop")) {
            for (LikedSongs song : genA) {
                if (song.getTitle().equalsIgnoreCase(songName)) {
                    songExistsInPlaylist = true;
                    break;
                }
            }
            if (!songExistsInPlaylist) {
                genA.add(newSongAdded);
                genACount++;
            } else {
                System.out.println("The song already exists in Genre A (Hip-Hop) playlist.");
            }
        } else if (genre.equalsIgnoreCase("rap")) {
            for (LikedSongs song : genB) {
                if (song.getTitle().equalsIgnoreCase(songName)) {
                    songExistsInPlaylist = true;
                    break;
                }
            }
            if (!songExistsInPlaylist) {
                genB.add(newSongAdded);
                genBCount++;
            } else {
                System.out.println("The song already exists in Genre B (Rap) playlist.");
            }
        } else {
            System.out.println("You may have misspelled the genre name. Please check your spelling.");
        }

        // Clear the text area before appending
        genATa.setText("");
        genBTa.setText("");

        // Append the contents of the ArrayList to the text area
        for (LikedSongs song : genA) {
            genATa.append(song.toString() + "\n");
        }
        for (LikedSongs song : genB) {
            genBTa.append(song.toString() + "\n");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void addFavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFavBtnActionPerformed
        // TODO add your handling code here:
        String songName = songNameTf.getText();
        String genre = genTf.getText();

        // Check if song name and genre are provided
        if (songName.isBlank() || genre.isBlank()) {
            System.out.println("You need to enter both a song name and a genre.");
            return;
        }

        // Check if the song already exists in the favorites playlist
        boolean songExistsInFavorites = false;
        for (LikedSongs song : likedSongs) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                songExistsInFavorites = true;
                break;
            }
        }

        if (songExistsInFavorites) {
            System.out.println("The song already exists in the Favorites playlist.");
        } else {
            // Create a new LikedSong object
            LikedSongs likedSong = new LikedSongs(songName, genre);

            // Add the LikedSong object to the stack
            push(likedSong);
            favCount++;

            // Update the GUI to display the newly added song
            favTa.append(likedSong.toString() + "\n");

            System.out.println("New song has been added to favourites:\n" + "Title - " + songName + "\nGenre - " + genre);
        }
    }//GEN-LAST:event_addFavBtnActionPerformed

    private void fromFavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromFavBtnActionPerformed
        // TODO add your handling code here:
        if (!likedSongs.isEmpty()) {
            // Get the last added song from the likedSongs list
            LikedSongs lastSongAdded = (LikedSongs) pop();

            String choice = JOptionPane.showInputDialog(null, "1. Genre A\n2. Genre B");

            if (choice.equals("1") || choice.equalsIgnoreCase("a")) {
                genA.add(lastSongAdded);
                genACount++;
                likedSongs.remove(lastSongAdded);
                favCount--;
                System.out.println(lastSongAdded + " has been added to Genre A from your favourites");
            } else if (choice.equals("2") || choice.equalsIgnoreCase("b")) {
                genB.add(lastSongAdded);
                genBCount++;
                likedSongs.remove(lastSongAdded);
                favCount--;
                System.out.println(lastSongAdded + " has been added to Genre B from your favourites");
            } else {
                System.out.println("You haven't chosen a valid option");
            }
        }

        // Clear the text area before appending
        favTa.setText("");
        genATa.setText("");
        genBTa.setText("");

        // Append the contents of the ArrayList to the text area
        for (LikedSongs song : likedSongs) {
            favTa.append(song.toString() + "\n");
        }
        for (LikedSongs song : genA) {
            genATa.append(song.toString() + "\n");
        }
        for (LikedSongs song : genB) {
            genBTa.append(song.toString() + "\n");
        }
    }//GEN-LAST:event_fromFavBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String songName = songNameTf.getText();

        // Check if the song exists in genA or genB and remove it
        boolean foundInGenA = false;
        boolean foundInGenB = false;

        for (LikedSongs song : genA) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                genA.remove(song);
                genACount--;
                foundInGenA = true;
                break;
            }
        }

        for (LikedSongs song : genB) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                genB.remove(song);
                genBCount--;
                foundInGenB = true;
                break;
            }
        }

        if (!foundInGenA && !foundInGenB) {
            System.out.println("The song you want to delete does not exist in either genre.");
        }

        // Clear the text area before appending
        genATa.setText("");
        genBTa.setText("");

        // Append the contents of the ArrayList to the text area
        for (LikedSongs song : genA) {
            genATa.append(song.toString() + "\n");
        }
        for (LikedSongs song : genB) {
            genBTa.append(song.toString() + "\n");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String songName = songNameTf.getText();

        boolean foundInGenA = false;
        boolean foundInGenB = false;
        boolean foundInFav = false;

        // Check if the song is present in likedSongs (Favourites) playlist
        for (LikedSongs song : likedSongs) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                foundInFav = true;
                System.out.println("That song is located in your favourites");
                break; // Exit loop once found
            }
        }

        // Check if the song is present in genA (Genre A - Hip-Hop) playlist
        for (LikedSongs song : genA) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                foundInGenA = true;
                System.out.println("That song is located in your Genre A (Hip-Hop) playlist");
                break; // Exit loop once found
            }
        }

        // Check if the song is present in genB (Genre B - Rap) playlist
        for (LikedSongs song : genB) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                foundInGenB = true;
                System.out.println("That song is located in your Genre B (Rap) playlist");
                break; // Exit loop once found
            }
        }

        // Check if the song is not found in any playlist
        if (!foundInFav && !foundInGenA && !foundInGenB) {
            System.out.println("The song is not found in any playlist.");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void moveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBtnActionPerformed
        // TODO add your handling code here:
        String songName = songNameTf.getText();

        boolean foundInGenA = false;
        boolean foundInGenB = false;
        boolean foundInFav = false;

        for (LikedSongs song : likedSongs) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                likedSongs.remove(song);
                favCount--;
                genA.add(song);
                genACount++;
                foundInFav = true;
                favTa.setText("");
                favTa.append(song.toString() + "\n");
                System.out.println("Song has been moved to the next Playlist - Genre A (Hip-Hop)");
                return;
            }
        }
        for (LikedSongs song : genA) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                genA.remove(song);
                genACount--;
                genB.add(song);
                genBCount++;
                foundInGenA = true;
                genATa.setText("");
                genATa.append(song.toString() + "\n");
                System.out.println("Song has been moved to the next Playlist - Genre B (Rap)");
                return;
            }
        }

        for (LikedSongs song : genB) {
            if (song.getTitle().equalsIgnoreCase(songName)) {
                genB.remove(song);
                genBCount--;
                likedSongs.add(song);
                favCount++;
                foundInGenB = true;
                genBTa.setText("");
                genBTa.append(song.toString() + "\n");
                System.out.println("Song has been moved to the next Playlist - Favourites");
                return;
            }
        }
    }//GEN-LAST:event_moveBtnActionPerformed

    private void countBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("Favourites: " + favCount + "\nGenre A (Hip-Hop): " + genACount + "\nGenre B (Rap): " + genBCount);
    }//GEN-LAST:event_countBtnActionPerformed

    private void removeFavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFavBtnActionPerformed
        // TODO add your handling code here:
        String songName = songNameTf.getText();
        boolean foundInFav = false;

        if (songName.isBlank()) {
            System.out.println("You need to enter a a song name you wish to remove.");
        } else if (!songName.equals(likedSongs)) {
            System.out.println("You need to enter a song that is in the Favourites playlist");
        } else {
            for (LikedSongs song : likedSongs) {
                if (song.getTitle().equalsIgnoreCase(songName)) {
                    likedSongs.remove(song);
                    favCount--;
                    foundInFav = true;
                    break;
                }
            }
            favTa.setText("");

            // Append the contents of the ArrayList to the text area
            for (LikedSongs song : likedSongs) {
                favTa.append(song.toString() + "\n");
            }
        }
    }//GEN-LAST:event_removeFavBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void repeatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatBtnActionPerformed
        // TODO add your handling code here:
        String repeatPlaylist = "";
        Repeat repeat = new Repeat();
        repeatPlaylist = JOptionPane.showInputDialog(null, "What playlist would you like to set on repeat?\n1. Favourites \n2. Genre A (Hip-Hop) \n3. Genre B (Rap)");

        // Clear the queue before enqueuing the playlist songs
        while (!repeat.isEmpty()) {
            repeat.dequeue();
        }

        // Display the list of songs before repeating
        System.out.println("Playlist Songs:");
        if (repeatPlaylist.equals("1") && !likedSongs.isEmpty()) {
            // Display songs from Favourites playlist
            for (LikedSongs song : likedSongs) {
                System.out.println(song.getTitle());
                repeat.enqueue(song);
            }
        } else if (repeatPlaylist.equals("2") && !genA.isEmpty()) {
            // Display songs from Genre A (Hip-Hop) playlist
            for (LikedSongs song : genA) {
                System.out.println(song.getTitle());
                repeat.enqueue(song);
            }
        } else if (repeatPlaylist.equals("3") && !genB.isEmpty()) {
            // Display songs from Genre B (Rap) playlist
            for (LikedSongs song : genB) {
                System.out.println(song.getTitle());
                repeat.enqueue(song);
            }
        } else {
            // Invalid playlist selection
            System.out.println("You have not selected a valid playlist. The playlist is empty or does not exist.");
        }

        // Dequeue and play songs from the repeat queue
        while (!repeat.isEmpty()) {
            LikedSongs song = (LikedSongs) repeat.dequeue();
            // Play the song (you need to implement this part)
            System.out.println("Set to repeat: " + song.getTitle());
        }
    }//GEN-LAST:event_repeatBtnActionPerformed

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
            @Override
            public void run() {
                new PlaylistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addFavBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton countBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel favLbl;
    private javax.swing.JTextArea favTa;
    private javax.swing.JButton fromFavBtn;
    private javax.swing.JLabel genALbl;
    private javax.swing.JTextArea genATa;
    private javax.swing.JLabel genBLbl;
    private javax.swing.JTextArea genBTa;
    private javax.swing.JLabel genLbl;
    private javax.swing.JTextField genTf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton moveBtn;
    private javax.swing.JButton removeFavBtn;
    private javax.swing.JButton repeatBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel songNameLbl;
    private javax.swing.JTextField songNameTf;
    // End of variables declaration//GEN-END:variables
}

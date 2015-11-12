package com.esprit.gui;

import com.sun.jna.NativeLibrary;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import uk.co.caprica.vlcj.component.EmbeddedMediaListPlayerComponent;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;

import uk.co.caprica.vlcj.discovery.NativeDiscovery;

public class VideoPlayer {
    private final JFrame frame;
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;

    
    public static void main(final String args[]) {
        new NativeDiscovery().discover();
        NativeLibrary.addSearchPath("libvlc", "C:\\Program Files\\VideoLAN\\VLC");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VideoPlayer(args);
            }
        });
    }
            
    public VideoPlayer(String args[]) {
        frame = new JFrame(args[0]);
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setContentPane(mediaPlayerComponent);
        frame.setVisible(true);
        mediaPlayerComponent.getMediaPlayer().playMedia(args[0]);
    }
}
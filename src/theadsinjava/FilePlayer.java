/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theadsinjava;

/**
 *
 * @author nirut
 */
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Classs that will play music files at given paths
 * 
 * @author Jesus Molina
 *
 */
public class FilePlayer {

	/**
	 * Plays an audio clip located at the given path
	 * 
	 * @param filePath
	 *            the path to the audio clip that should be played
	 */
	public void play(String filePath) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

		} catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
			System.out.println("Error with playing sound.");
		}

	}
}

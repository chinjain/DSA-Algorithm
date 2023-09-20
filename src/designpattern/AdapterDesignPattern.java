package designpattern;

import java.util.Arrays;
import java.util.List;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "music1.mp3");
		audioPlayer.play("wav", "music2.wav");
		audioPlayer.play("mp4", "music3.mp4");
		audioPlayer.play("avi", "music4.avi");

	}
}

interface MediaPlayer {
	public void play(String format, String file);
}

interface AdvancePlayer {
	public void playMP4(String file);

	public void playWav(String file);
}

class Mp4Player implements AdvancePlayer {

	@Override
	public void playMP4(String file) {
		System.out.println("MP4 file :" + file + " playing");

	}

	@Override
	public void playWav(String file) {
		// TODO Auto-generated method stub
		// do nothing

	}

}

class WAVPlayer implements AdvancePlayer {

	@Override
	public void playMP4(String file) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playWav(String file) {
		System.out.println("WAV File" + file + "Playing….");

	}

}

class MediaAdapter implements MediaPlayer {

	AdvancePlayer advancePlayer;

	public MediaAdapter(String format) {

		if (format.equalsIgnoreCase("mp4")) {
			advancePlayer = new Mp4Player();
		} else if (format.equalsIgnoreCase("wav")) {
			advancePlayer = new WAVPlayer();
		}

	}

	@Override
	public void play(String format, String file) {

		if (format.equalsIgnoreCase("mp4")) {
			advancePlayer.playMP4(file);
		} else if (format.equalsIgnoreCase("wav")) {
			advancePlayer.playWav(file);
		}

	}

}

class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String format, String file) {
		if (format.equalsIgnoreCase("mp3")) {
			System.out.println("MP3 file " + file + " Playing...");
		} else if (format.equalsIgnoreCase("wav") || format.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(format);
			mediaAdapter.play(format, file);
		} else {
			System.err.println("Format not supported");
		}

	}

}
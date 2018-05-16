package adapter;

public class AdapterTest {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.paly("mp3", "fuck.mp3");
		
		audioPlayer.paly("mp4", "孤胆英雄.mp4");
		
		audioPlayer.paly("img", "love.img");
	}
}

package adapter;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;
	
	@Override
	public void paly(String audioType, String fileName) {
		// 播放mp3音乐文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("play mp3.fileNanme:"+fileName);
		}
		// mediaAdapter提供了播放其他文件的支持
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.paly(audioType, fileName);
		} else {
			System.out.println("不支持该格式的文件");
		}
	}

}

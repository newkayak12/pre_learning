package javaprelearn.exam15._1;
interface UnMute {
	void volumeUnmute();
}


interface Mute {
	void volumeMute();
}

interface VolumeSystem  {
	void volumeUp();
	void volumeDown();
	
}


public class Interface  implements VolumeSystem, UnMute, Mute {

	public void volumeUp() {
			System.out.println("UpVolume");
	}
	
	public void volumeDown() {
			System.out.println("DownVolume");
	}
	
	public void volumeUnmute() {
			System.out.println("Mute");
	}
	public void volumeMute() {
			System.out.println("UnMute");
	}
	
	
	
	public static void main(String[] args) {
		
		Interface audio = new Interface();
		audio.volumeUp();
		audio.volumeDown();
		audio.volumeMute();
		audio.volumeUnmute();
	}

}

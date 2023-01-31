package java0116;


public class C_Audio implements C_RemoteControl {
	
	private int volume;
	
	@Override
	public void c_turnOn() {
		System.out.println("Audio를 켭니다.");	
	}
	
	@Override
	public void c_turnOff() {
		System.out.println("TV를 끕니다.");	
	}

	@Override
	public void setVolume(int volume) {
		if (volume > C_RemoteControl.MAX_VOLUME) {
			this.volume = C_RemoteControl.MAX_VOLUME;
		} else if (volume < C_RemoteControl.MIN_VOLUME) {
			this.volume = C_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

}

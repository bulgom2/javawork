package java1213.exercise1213;

class Marine {
	int x=0, y=0;				// Marine의 위치좌표 (x, y)
	int hp = 60;				// 현재 체력
	static int weapon = 6;		// 공격력
	static int armor = 0;		// 방어력
	
	static void weaponUp() {
		weapon++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}	
}

public class Object6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// 스타 마린 업글과 같은 개념으로 접근
// 지상 유닛 공방 업글을 하게 되면 모든 마린의 공방이 올라가게 됨
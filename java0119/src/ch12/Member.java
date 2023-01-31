package ch12;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target = (Member)obj;	// 강제 사용법
//		if(obj instanceof Member target) {	// 원래 사용법
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;	
	}

}

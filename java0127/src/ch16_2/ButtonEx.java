package ch16_2;

public class ButtonEx {
	public static void main(String[] args) {
		// Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		// Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		// 매개값으로 람다식 대입
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		// Ok 버튼 클릭하기
		btnOk.click();
		
		// Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
// 기존
//		class CancelListener implements Button.ClickListener {
//			@Override
//			public void onClick() {
//				System.out.println("Cancel 버튼을 클릭했습니다.");
//			}
//		}
		
//		btnCancel.setClickListener(new CancelListener());
		
		
// 람다		
		// Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		// 매개값으로 람다식 대입
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		
		// Cancel 버튼 클릭하기
		btnCancel.click();
	}
}

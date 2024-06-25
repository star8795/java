package anonymous_object;

public class ButtonExample {

	public static void main(String[] args) {
		
		// 화면에 사용자와 상호작용이 가능한 버튼을 배치 한다.
		// <button>로그인</button>
		// <input type="button" value="회원가입"/>
		
		Button loginBtn = new Button("로그인");
		
		LoginOnClickListener listener = new LoginOnClickListener();
		loginBtn.setOnClickListener(listener);
		loginBtn.onTouch();
		
		Button joinBtn = new Button("회원가입");
		OnClickListener joinListener = new JoinOnClickListener();
		joinBtn.setOnClickListener(joinListener);
		joinBtn.onTouch();
		
		Button sendMessage = new Button("SEND");
		OnClickListener messageListener = new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("SEND MESSAGE!!!!!");
			}
		};
		sendMessage.setOnClickListener(messageListener);
		System.out.println(sendMessage);
		sendMessage.onTouch();
		
		Button delete = new Button("삭제");
		delete.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("회원 정보 삭제!!!");
			}
		});
		delete.onTouch();
		
		/*
			interface OnClickListener{
				void onClick();
			}
		 */
		// 람다 표현식......
		Button mainBtn = new Button("Main");
		OnClickListener mainListener = ()->{
			System.out.println("Main으로 이동");
		};
		mainBtn.setOnClickListener(mainListener);
		
	}

}
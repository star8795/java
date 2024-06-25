package anonymous_object;

@FunctionalInterface
interface OnClickListener{
	void onClick();
	// void onTouch();
}

// 등록된 기능에 따라 서로 다른 동작을 하는 버튼 클래스
public class Button {
	
	private String title;
	private OnClickListener listener;
	
	public Button(String title) {
		this.title = title;
	}

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 버튼이 클릭 되었을 때 수행할 기능
	public void onTouch() {
		this.listener.onClick();
	}
	
	@Override
	public String toString() {
		return "Button [title=" + title + "]";
	}
	
}

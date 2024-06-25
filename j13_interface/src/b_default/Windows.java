package b_default;

public class Windows {

	public void  userPrint(Printable printable) {
		printable.print();
		printable.threeDPrint();
	}
	
	public static void main(String[] args) {
		
		Windows windows= new Windows();
		
		LGPrinter lg = new LGPrinter();
		windows.userPrint(lg);
		
		HPPrinter hp = new HPPrinter();
		windows.userPrint(hp);
	}

}
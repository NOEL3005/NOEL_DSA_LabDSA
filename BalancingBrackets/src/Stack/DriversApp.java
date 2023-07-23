package Stack;

public class DriversApp {
public static void main(String[] args) {
	String input="([[{}]])";
	MyStack ms=new MyStack();
	Boolean result=ms.checkBracket(input);
	if(result==true)
		System.out.println("The entered String has Balanced Brackets");
	else
		System.out.println("The entered Strings do not contain Balanced Brackets");
	
}
}
package inventory;

public class Dialogue {
	
	public static void typewriterEffect(String d) {
		char[] dialogue = d.toCharArray();
		for (char c:dialogue)
			try {
				System.out.print(c);
				Thread.sleep(50);
			} catch (Exception e){
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		typewriterEffect("Hello, my name is Wilson Montifiker III!!! Hopefully my wonderful message prints out in real time!");
	}
}

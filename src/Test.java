
public class Test {

	public static void main(String[] args) {
		
		String text ="geek";
		int hashValue= hash(text);
		System.out.println(hashValue);

	}
	public static int hash(String text) {
		int hash =0;
		int sl=text.length();
		
		if(sl>=0 && null!= text) {
			
			for(int i=0; i<sl; i++) {
			hash+=text.charAt(i);
			}
		}
		
		return hash;
	}

}

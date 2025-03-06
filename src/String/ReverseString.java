package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "this is hello world";
		
		String[] splitarray= name.split(" ");
		
		StringBuffer sb= new StringBuffer();
		
		for(int i=0; i<splitarray.length;i++) {
			
			String sub= splitarray[i];
			StringBuffer subres= new StringBuffer();
			
			for(int j= sub.length()-1;j>=0;j--) {
				subres=subres.append(sub.charAt(j));
				
				System.out.println(subres);
			}
			sb.append(subres + " ");
			
		}
		System.out.println(sb);

	}

}

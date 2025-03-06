package String;

public class ReverseSameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="this is my hello world Java";
		String[] splitString= name.split(" ");
		StringBuffer sub = new StringBuffer();
		
		for(int i=0; i<splitString.length;i++) {
			
			String resName= splitString[i];
			
			StringBuffer res= new StringBuffer();
			
			for(int j=resName.length()-1; j>=0; j--) {
				
				res=res.append(resName.charAt(j));
				
			}
			sub.append(res + " ");
			
		}
		System.out.println(sub);
		
		System.out.println("narasimha changes");
		System.out.println("narasimha changes");
		System.out.println("narasimha changes");
		System.out.println("narasimha changes");

	}

}

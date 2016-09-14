
public class Assignment1 {

	public static void main(String[] args) {
		int[] rollNos = {2,5,6,8,9};
		System.out.println("length " +rollNos.length);
		for (int i= 0; i < rollNos.length; i++) {
			System.out.println("data " +rollNos[i]);
		}
		
		for (int i = rollNos.length-1; i>=0; i--) { 
			System.out.println("Reverse array "+rollNos[i] + " ");  } 
		}
			
}

package in.nit.workshop;

public class Array {
	
	public static void main(String args[]) {
		
		//declare array
		
		String name[] = {"Bharath","Sunil","Sunitha","Vidhya"};
		
		int[] numbers = {1,3,4,6};
		
		char []ch = {'A','B','C'};
		
		System.out.println("names:"+name.length);
		
		System.out.println("names:"+numbers.length);
		
		System.out.println("ch:"+ch.length);
		
		//display array elements
		
		System.out.println("displaying array elements");
		
		System.out.println(name[0]);
		
		System.out.println(name[1]);
				
		//declare array
		
		String shopNames[] = {"coffeeshop","teashop","bakery"};
		
		for (int index = 0; index < shopNames.length; index++){
			
			System.out.println(shopNames[index]);
			
		}
		System.out.println("reverse array elements");
		
		for(int index = shopNames.length-1; index>=0;index--) {
		
			System.out.println(shopNames[index]);
			
		}
		
		
		
		
		
		
		
		
		
	}

}

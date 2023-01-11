package stringMethodsDTO;

public class IceCreamTester {
	public static void main(String args[]) {
		String str="Maha";
		System.out.println(str.toString());
		
		IceCream ic=new IceCream();
		ic.setId(1);
		ic.setName("MangoCandy");
		System.out.println(ic);
		
		IceCream ic1=new IceCream();
		ic1.setId(2);
		ic1.setName("Straberry");
		System.out.println(ic1);
		
        System.out.println(ic==ic1);
        System.out.println(ic==ic1);
        System.out.println(ic.equals(ic1));
        System.out.println(ic.hashCode());
        System.out.println(ic1.hashCode());
		
		
	}


}

package stringMethodsDTO;

public class VechicleTester {
	public static void main(String args[]) {
		String str="Maha";
		System.out.println(str.toString());
		
		Vechicle vcl=new Vechicle();
		vcl.setId(1);
		vcl.setName("Metro");
		System.out.println(vcl);
		
		Vechicle vcl1=new Vechicle();
		vcl1.setId(2);
		vcl1.setName("Bus");
		System.out.println(vcl1);
		
        System.out.println(vcl==vcl1);
        System.out.println(vcl==vcl1);
        System.out.println(vcl.equals(vcl1));
        System.out.println(vcl.hashCode());
        System.out.println(vcl1.hashCode());
		
		
	}

}

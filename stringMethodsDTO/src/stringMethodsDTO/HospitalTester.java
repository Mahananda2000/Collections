package stringMethodsDTO;

public class HospitalTester {
	public static void main(String args[]) {
		String str="Maha";
		System.out.println(str.toString());
		
		Hospital hl=new Hospital();
		hl.setId(1);
		hl.setName("Hosuru Hospital");
		System.out.println(hl);
		
		Hospital hl1=new Hospital();
		hl1.setId(2);
        hl1.setName("Kumareshwara Hospital");
		System.out.println(hl1);
		
        System.out.println(hl==hl1);
        System.out.println(hl==hl1);
        System.out.println(hl.equals(hl1));
        System.out.println(hl.hashCode());
        System.out.println(hl1.hashCode());
		
		
	}

}




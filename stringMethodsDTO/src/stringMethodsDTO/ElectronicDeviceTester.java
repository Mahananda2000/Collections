package stringMethodsDTO;

public class ElectronicDeviceTester {
	
	public static void main(String args[]) {
		
		ElectronicDevice ed=new ElectronicDevice();
		ed.setName("laptop");
		ed.setId(10);
		System.out.println(ed);
		
		ElectronicDevice ed1=new ElectronicDevice();
		ed1.setName("watch");
		ed1.setId(20);
		System.out.println(ed1);
		
		System.out.println(ed==ed);
		System.out.println(ed==ed1);
		System.out.println(ed.equals(ed1));
		System.out.println(ed.hashCode());
		System.out.println(ed1.hashCode());

		
		
		
		
	}

}

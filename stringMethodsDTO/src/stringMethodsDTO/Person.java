package stringMethodsDTO;


	import lombok.Getter;
	import lombok.Setter;

	@Setter
	@Getter
	public class Person {
		
		public Person(){
			System.out.println(this.getClass().getSimpleName()+"object is created");
		}
		
		private int id;
		private String name;
		
		@Override
		public int hashCode() {
			return this.id;
		}
		
		@Override
		public boolean equals(Object obj) {
			Person pr=(Person) obj;
			if(this.getName().equals(pr.getName())) {
				return true;
				
			}
			return false;
			
		}
		@Override
		public String toString() {
			return "Person - {Id="+this.getId()+",Name="+this.getName()+"}";
		}
		


}

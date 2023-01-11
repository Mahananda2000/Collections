package stringMethodsDTO;


	import lombok.Getter;
	import lombok.Setter;

	@Setter
	@Getter
	public class Tablet {
		
		public Tablet(){
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
			Tablet tb=(Tablet) obj;
			if(this.getName().equals(tb.getName())) {
				return true;
				
			}
			return false;
			
		}
		@Override
		public String toString() {
			return "Tablet - {Id="+this.getId()+",Name="+this.getName()+"}";
		}
		


}

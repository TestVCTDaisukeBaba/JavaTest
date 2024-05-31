public class Staff2{
	
		private int no;
		private String name;
		private int age;
		
		public Staff2() {	
		}
		
		public Staff2(int no, String name, int age) {
			this.no = no;
			this.name = name;
			this.age = age;
		}
		
		public void setNo(int no) {
			this.no = no;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getNo() {
			return no;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setData(int no, String name, int age) {
			this.no = no;
			this.name = name;
			this.age = age;
		}
		
		public void printData() {
			System.out.println("番号" + no + ",氏名" + name + ",年齢" + age);
		}
		
		public String toString() {
			return "番号" + no + ",氏名" + name + ",年齢" + age;
		}
}
public class Office2{
	public static void main(String[] args) {
		Staff2 taro = new Staff2();
		taro.setData(10, "東京太郎", 30);
		
		Staff2 jiro = new Staff2(20, "東京次郎", 40);
		
		Staff2 saburo = new Staff2();
		saburo.setNo(30);
		saburo.setName("東京三郎");
		saburo.setAge(20);
		
		taro.printData();
		
		System.out.println("番号" + jiro.getNo() + ",氏名" + jiro.getName() + ",年齢" + jiro.getAge());
		
		System.out.println(saburo);
	}
}
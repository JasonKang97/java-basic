package pack2;

public class Ex3Singer {
	private String name="무명 가수";
	private String titleSong="애국가";

	public Ex3Singer(String name, String titleSong) {		//생성자
		this.name=name;
		this.titleSong=titleSong;
	}
	public void sing() {
		//String name="아이유";	//지역변수
		//System.out.println(name + "의 노래 제목은 " + titleSong);
		System.out.println(this.name + "의 노래 제목은 " + titleSong);
	}
	
	public void setTitleSong(String titleSong) {
		this.titleSong=titleSong;
	}
	
	public static void main(String[] args) {
		Ex3Singer bts = new Ex3Singer("BTS", "다이너마이트");
		bts.sing();
		bts.setTitleSong("BTS");
		bts.sing();
		bts.setTitleSong("BTS 화이팅");
		bts.sing();

		System.out.println();
		Ex3Singer blackpink = new Ex3Singer("블랙핑크","how you like that");
		blackpink.sing();
	}

}

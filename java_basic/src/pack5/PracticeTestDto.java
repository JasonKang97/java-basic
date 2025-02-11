package pack5;

import lombok.Getter;
import lombok.Setter;

@Getter

public class PracticeTestDto {
	private int number, pay, year;
	private String name;
	public PracticeTestDto(int number, String name, int pay, int year) {
		this.number=number;
		this.name=name;
		this.pay=pay;
		this.year=year;
	}
	
}

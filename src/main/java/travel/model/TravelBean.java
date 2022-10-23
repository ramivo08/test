package travel.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class TravelBean {
	
	private int num;
	
	@NotBlank(message="이름 누락입니다.")
	private String name;
	
	@NotEmpty(message="나이 누락입니다.")
	@Range(min=10, max=100, message="10~100살 사이 입력하세요")
	private String age;
	
	@NotNull(message="관심지역 선택하세요")
	private String area;
	
	@NotEmpty(message="여행타입 1개이상 체크하세요")
	private String style;
	
	
	@NotBlank(message="가격 선택하세요")
	private String price;  //select :option @NotEmpty, @NotBlank 유효성됨/  @NotNull 유효성 안됨
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}

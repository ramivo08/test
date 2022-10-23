package travel.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class TravelBean {
	
	private int num;
	
	@NotBlank(message="�̸� �����Դϴ�.")
	private String name;
	
	@NotEmpty(message="���� �����Դϴ�.")
	@Range(min=10, max=100, message="10~100�� ���� �Է��ϼ���")
	private String age;
	
	@NotNull(message="�������� �����ϼ���")
	private String area;
	
	@NotEmpty(message="����Ÿ�� 1���̻� üũ�ϼ���")
	private String style;
	
	
	@NotBlank(message="���� �����ϼ���")
	private String price;  //select :option @NotEmpty, @NotBlank ��ȿ����/  @NotNull ��ȿ�� �ȵ�
	
	
	
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

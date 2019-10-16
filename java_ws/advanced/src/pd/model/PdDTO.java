package pd.model;

import java.sql.Timestamp;

//DTO(Data Transfer Object)-데이터 전달 단위
//객체를 표현한 단위
//테이블의 컬럼들이 필드가 됨
public class PdDTO {
	//private 멤버변수 - 필수
	private int no;
	private String pdName;
	private int price;
	private Timestamp regdate;
	
	//생성자 - 선택
	public PdDTO() {
		super();
	}

	public PdDTO(int no, String pdName, int price, Timestamp regdate) {
		super();
		this.no = no;
		this.pdName = pdName;
		this.price = price;
		this.regdate = regdate;
	}

	//public getter/setter - 필수
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getPdName() {
		return pdName;
	}

	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	//toString - 선택
	@Override
	public String toString() {
		return "PdDTO [no=" + no + ", pdName=" + pdName + ", price=" + price + ", regdate=" + regdate + "]";
	}
	
	
	
}

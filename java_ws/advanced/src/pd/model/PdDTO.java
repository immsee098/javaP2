package pd.model;

import java.sql.Timestamp;

//DTO(Data Transfer Object)-������ ���� ����
//��ü�� ǥ���� ����
//���̺��� �÷����� �ʵ尡 ��
public class PdDTO {
	//private ������� - �ʼ�
	private int no;
	private String pdName;
	private int price;
	private Timestamp regdate;
	
	//������ - ����
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

	//public getter/setter - �ʼ�
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

	//toString - ����
	@Override
	public String toString() {
		return "PdDTO [no=" + no + ", pdName=" + pdName + ", price=" + price + ", regdate=" + regdate + "]";
	}
	
	
	
}

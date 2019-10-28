package com.jdbc.pd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.DBUtil;
import com.pd.model.PdDAO;
import com.pd.model.PdDTO;

public class PdManager2 {
	private Scanner sc = new Scanner(System.in);
	private PdDAO pdDao;

	public PdManager2(){
		pdDao=new PdDAO();
	}

	public void showMenu() {
		System.out.println("-----------------Main Menu-------------------------------");
		System.out.println("1.��� 2.��ü��ȸ 3.��ȣ�� ��ȸ 4.���� 5.���� 6.���� 7.��ǰ������ ��ȸ");
		System.out.println("---------------------------------------------------------");		
	}

	//1. �Է��� ��� DAO�� �޼��带 ����ϴ� ���
	public void register() throws SQLException {
		//���
		//1. ����ڷ� ���� �Է� �ޱ�
		System.out.println("��ǰ��, ������ �Է��ϼ���");
		String pdName=sc.nextLine();
		int price=Integer.parseInt(sc.nextLine());

		//2. db�۾� - insert
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(price);
		int cnt=pdDao.insertPd(dto);

		//3. ��� ó��
		String result=(cnt>0)?"��ǰ ��ϵǾ����ϴ�.":"��ǰ��� ����!";
		System.out.println(result);
	}

	//2. ��ȸ(��� ���ڵ尡 1���� select)�� ��� DAO�� �޼��带 ����ϴ� ���
	public void showByNo() throws NumberFormatException, SQLException {
		//��ȣ�� ��ȸ
		//1. ����ڷκ��� �Է¹ޱ�
		System.out.println("��ȣ�� �Է��ϼ���");
		String no=sc.nextLine();
		if(no==null || no.isEmpty()) {
			System.out.println("��ȣ�� �ݵ�� �Է��ؾ� ��!!!!!");
			return;
		}

		//2. db�۾� - select
		PdDTO dto=pdDao.selectByNo(Integer.parseInt(no));

		//3. ��� ó��
		System.out.println("\n��ȣ:"+ dto.getNo());
		System.out.println("��ǰ��:"+ dto.getPdName());
		System.out.println("����:"+ dto.getPrice());
		System.out.println("�����:"+ dto.getRegdate()+"\n");

	}

	//3. ��ȸ(��� ���ڵ尡 �������� select)�� ��� DAO�� �޼��带 ����ϴ� ���	
	public void showAll() throws SQLException {
		//��ü ��ȸ
		//1.		
		//2.db
		ArrayList<PdDTO> list=pdDao.selectAll();

		//3. ���
		System.out.println("\n��ȣ\t��ǰ��\t����\t�����");
		for(int i=0;i<list.size();i++) {
			PdDTO dto=list.get(i);

			System.out.println(dto.getNo()+"\t"+dto.getPdName()
			+ "\t"+ dto.getPrice()+"\t"+ dto.getRegdate());
		}//for
	}



	public void edit() throws SQLException {
		//1. ����ڷκ��� �Է¹ޱ�
		System.out.println("������ ��ȣ, ��ǰ��, ������ �Է��ϼ���");
		String no=sc.nextLine();
		String pdName=sc.nextLine();
		String price=sc.nextLine();

		//2. db�۾�-crud=> update
		PdDTO dto = new PdDTO(); 
		dto.setNo(Integer.parseInt(no));
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));

		int cnt=pdDao.updatePd(dto);

		//3. ��� ó��
		if(cnt>0) {
			System.out.println("��ǰ ���� ����");
		}else {
			System.out.println("��ǰ ���� ����");
		}

	}

	public void remove() throws NumberFormatException, SQLException {
		//1. ����ڷκ��� �Է¹ޱ�
		System.out.println("������ ��ȣ�� �Է��ϼ���");
		String no=sc.nextLine();

		//2. db�۾�-delete
		int cnt=pdDao.deletePd(Integer.parseInt(no));

		//3. ��� ó��
		if(cnt>0) {
			System.out.println("��ǰ ���� ����");
		}else {
			System.out.println("��ǰ ���� ����");
		}
	}

	public void showByPdName() throws SQLException {
		//1. ����ڷκ��� �Է¹ޱ�
		System.out.println("��ȸ�� ��ǰ���� �Է��ϼ���");
		String pdName=sc.nextLine();
		
		//2.db
		ArrayList<PdDTO> list=pdDao.selectByPdName(pdName);

		//3. ���
		System.out.println("\n��ȣ\t��ǰ��\t����\t�����");
		for(int i=0;i<list.size();i++) {
			PdDTO dto=list.get(i);

			System.out.println(dto.getNo()+"\t"+dto.getPdName()
			+ "\t"+ dto.getPrice()+"\t"+ dto.getRegdate());
		}//for

	}


}

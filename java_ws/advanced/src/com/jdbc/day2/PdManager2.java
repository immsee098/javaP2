package com.jdbc.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import db.DBUtil;
import pd.model.PdDAO;
import pd.model.PdDTO;

public class PdManager2 {
	private Scanner sc = new Scanner(System.in);
	private PdDAO pdDao;
	
	public PdManager2(){
		pdDao=new PdDAO();
	}
	
	public void showMenu() {
		System.out.println("-----------------Main Menu-----------------");
		System.out.println("1.등록 2.전체조회 3.번호로 조회 4.수정 5.삭제 6.종료 7.이름으로조회");
		System.out.println("--------------------------------------------");		
	}

	
	//1. 입력(insert)의 경우 DAO메서드를 사용하는 방법
	public void register() throws SQLException {
		//등록
		//1. 사용자로 부터 입력 받기
		System.out.println("상품명, 가격을 입력하세요");
		String pdName=sc.nextLine();
		int price=Integer.parseInt(sc.nextLine());
		
		//2. db작업 - insert
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(price);
		int cnt=pdDao.insertPd(dto);
		
		//3. 결과 처리
		String result=(cnt>0)?"상품 등록되었습니다.":"상품등록 실패!";
		System.out.println(result);
	}
	
	
	//2. 조회의(결과 레코드1일때 select) 경우 DAO메서드를 사용하는 방법
		public void showByNo() throws NumberFormatException, SQLException {
			//번호로 조회
			//1. 사용자로부터 입력받기
			System.out.println("번호를 입력하세요");
			String no=sc.nextLine();
			if(no==null || no.isEmpty()) {
				System.out.println("번호는 반드시 입력해야 함!!!!!");
				return;
			}
			
			//2. db작업 - select
			PdDTO dto=pdDao.selectByNo(Integer.parseInt(no));
			
			//3. 결과 처리
			System.out.println("\n번호:"+ dto.getNo());
			System.out.println("상품명:"+ dto.getPdName());
			System.out.println("가격:"+ dto.getPrice());
			System.out.println("등록일:"+ dto.getRegdate()+"\n");
		}
		
		
	//3. 조회의(결과 레코드 여러개일때 select) 경우 DAO메서드를 사용하는 방법
	public void showAll() throws SQLException {
		//전체 조회
		//1.		
		//2.db
		ArrayList<PdDTO> list=pdDao.selectAll();
		
		//3. 결과
		System.out.println("\n번호\t상품명\t가격\t등록일");
		for(int i=0;i<list.size();i++) {
			PdDTO dto=list.get(i);
			
			System.out.println(dto.getNo()+"\t"+dto.getPdName()
					+ "\t"+ dto.getPrice()+"\t"+ dto.getRegdate());
		}//for
	}


	public void edit() throws SQLException {
		//1.사용자로부터 입력
		System.out.println("수정할 번호, 상품명, 가격을 입력");
		String no = sc.nextLine();
		String pdName = sc.nextLine();
		String price = sc.nextLine();
		
		//2.db작업-crud-update
		PdDTO dto = new PdDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		
		int cnt=pdDao.updatePd(dto);
		
		//3.결과처리
		if(cnt>0) {
			System.out.println("상품 수정 성공");
		} else {
			System.out.println("상품 수정 실패");
		}
		
	}

	public void remove() throws SQLException {
		//1.
		System.out.println("수정할 번호");
		String no = sc.nextLine();
		
		//2.
		PdDTO dto = new PdDTO();
		dto.setNo(Integer.parseInt(no));
		
		int cnt = pdDao.deletePd(dto);
		
		if(cnt>0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("살제 실패");
		}
	}

	public void showByPdName() throws SQLException {
		//1. 사용자로부터 입력받기
		System.out.println("조회할 상품명을 입력하세요");
		String pdName=sc.nextLine();
		
		//2.db
		ArrayList<PdDTO> list=pdDao.selectByPdName(pdName);

		//3. 결과
		System.out.println("\n번호\t상품명\t가격\t등록일");
		for(int i=0;i<list.size();i++) {
			PdDTO dto=list.get(i);

			System.out.println(dto.getNo()+"\t"+dto.getPdName()
			+ "\t"+ dto.getPrice()+"\t"+ dto.getRegdate());
		}//for

	}
	
}

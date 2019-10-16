package com.jdbc.day2;


import java.sql.SQLException;
import java.util.Scanner;

public class ConsolePd {

	public static void main(String[] args) {
		PdManager manager = new PdManager();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			manager.showMenu();
			try {
				int type=Integer.parseInt(sc.nextLine());
				
				switch(type) {
					case 1:
						manager.register();						
						break;
					case 2:
						manager.showAll();
						break;
					case 3:
						manager.showByNo();
						break;
					case 4:
						manager.edit();
						break;
					case 5:
						manager.remove();
						break;
					case 6:
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					default:
						System.out.println("잘못 입력!");
				}			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}//while
		
	}

}

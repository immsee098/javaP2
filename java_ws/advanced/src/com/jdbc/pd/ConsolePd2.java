package com.jdbc.pd;

import java.sql.SQLException;
import java.util.Scanner;

public class ConsolePd2 {

	public static void main(String[] args) {
		PdManager2 manager = new PdManager2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[DAO �̿�]");
		
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
						System.out.println("���α׷��� �����մϴ�.");
						System.exit(0);
					case 7:
						manager.showByPdName();
						break;
					default:
						System.out.println("�߸� �Է�!");
				}			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}//while
		
	}

}

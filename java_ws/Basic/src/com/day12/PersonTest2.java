package com.day12;

public class PersonTest2 {

		public static void main(String[] args) 	{
			char[] abcCode =
				{ '`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};	
	 			            
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

			String src = "abc123";
			String result = "";
			
			// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
			for(int i=0; i < src.length();i++) {
				char ch = src.charAt(i);
				
				if(ch>=97 && ch<=122) {
					int ch2 = ch-97;
					result += abcCode[ch2];
					
				} else if(ch>=48 && ch<=57) {
					int ch2 = ch-48;
					result += numCode[ch2];
				}
				
				//(1) 
				



			}

			System.out.println("src:"+src);
			System.out.println("result:"+result);
		}
	}


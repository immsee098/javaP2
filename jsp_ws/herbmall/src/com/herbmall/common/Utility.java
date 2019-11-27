package com.herbmall.common;

import java.util.Date;

public class Utility {
	//파일 업로드 경로
	public static final String UPLOAD_PATH="pds_upload";
	//테스트 경로
	public static final String TEST_PATH
	="D:\\lecture\\workspace_list\\jsp_ws\\herbmall\\WebContent\\pds_upload";
	
	public static String displayRe(int step) {
		String str="";
		
		if(step>0){ 
			for(int k=0;k<step;k++){
				str+="&nbsp";
			}//for 
			
			str+="<img src='../images/re.gif' alt='re이미지'>";
		}//if 	
		
		return str;
	}
	
	public static String cutString(String title, int len) {
		String result=title;
		
		if(title.length()>len) {
			result=title.substring(0,len) +"...";
		}
		
		return result;
	}
	
	public static String displayNew(Date regdate) {
		String result="";
		
		Date today=new Date();
		
		long gap=(today.getTime()-regdate.getTime())/1000;
		gap=gap/(60*60);
		
		if(gap<24) {
			result="<img src='../images/new.gif' alt='new 이미지'>";
		}
		
		return result;
	}
	
	
	public static String displayFile(String fileName) {
		String result="";
		
		if(fileName!=null && !fileName.isEmpty()) {
			result="<img src='../images/file.gif' alt='file이미지' />";
		}
			
		return result;
	}
	
	public static String getFileInfo(String oFileName,
			long fSize) {
		String fileInfo="";
		
		if(oFileName!=null && !oFileName.isEmpty()){
			float fileSize=fSize/1000.f;
			fileSize=Math.round(fileSize*10)/10f;
			
			fileInfo+=displayFile(oFileName);
			fileInfo+=" "+ oFileName+" ("+fileSize+"KB)";			
		}
		
		return fileInfo;
	}
	
	
}









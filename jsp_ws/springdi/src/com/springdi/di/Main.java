package com.springdi.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		//1. 기존방식 - 직접 객체 생성
		ArticleService articleService=new ArticleServiceImpl();
		
		ArticleVO articleVo=new ArticleVO();
		articleVo.setNo(1);
		articleVo.setTitle("[1] 직접 객체 생성하는 경우");
		articleService.write(articleVo);
		
		//2. 생성자에서 주입받는 경우
		//작성한 설정 파일로부터 BeanFactory 를 생성하고, BeanFactory로부터 
		//필요한 빈 객체를 가져와서 사용 
		Resource resource
			=new ClassPathResource("applicationContext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		ArticleService articleService2 
			= (ArticleService) beanFactory.getBean("articleService");
		
		ArticleVO articleVo2=new ArticleVO();
		articleVo2.setNo(2);
		articleVo2.setTitle("[2] 생성자에서 주입받는 경우");
		articleService2.write(articleVo2);
		
		//3. setter에서 주입받는 경우
		ApplicationContext context
			=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ArticleService articleService3
			=(ArticleService) context.getBean("articleService3");
		
		ArticleVO articleVo3=new ArticleVO();
		articleVo3.setNo(3);
		articleVo3.setTitle("[3] setter에서 주입받는 경우");
		articleService3.write(articleVo3);
		
		
		
	}

}

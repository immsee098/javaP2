package com.springdi.di;

public class ArticleServiceImpl3 implements ArticleService{
	private ArticleDAO articleDao;
	
	//DI - setter에 의한 종속객체 주입
	public void setArticleDao(ArticleDAO articleDao) {
		this.articleDao=articleDao;
	}
	
	@Override
	public void write(ArticleVO articleVo) {
		System.out.println("ArticleServiceImpl3의 write() 메서드!!!");
		
		articleDao.insert(articleVo);
	}

}

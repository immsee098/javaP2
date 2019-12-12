package com.springdi.di;

public class ArticleServiceImpl implements ArticleService{
	private ArticleDAO articleDao;
	
	public ArticleServiceImpl() {
		articleDao=new OracleArticleDAO();
	}
	
	@Override
	public void write(ArticleVO articleVo) {
		System.out.println("ArticleServiceImpl의 write()메서드 호출!!");
		
		articleDao.insert(articleVo);
	}

}

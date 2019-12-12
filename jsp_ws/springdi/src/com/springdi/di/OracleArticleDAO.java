package com.springdi.di;

public class OracleArticleDAO implements ArticleDAO{

	@Override
	public void insert(ArticleVO articleVo) {
		System.out.println("[Oracle DB에 " + articleVo + " 정보 insert!");
	}

}

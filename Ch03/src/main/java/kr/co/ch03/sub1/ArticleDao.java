package kr.co.ch03.sub1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleDao {
	
	@Autowired
	private DaoAdvice daoAdvice;
	
	public void insertArticle() {
		daoAdvice.beforeAdvice1();
		System.out.println("ÇÙ½É°ü½É -- insertArticle");
		daoAdvice.afterAdvice1();
	}
	
	public void selectArticle() {
		System.out.println("ÇÙ½É°ü½É -- selectArticle");
	}
	
	public void updateArticle() {
		System.out.println("ÇÙ½É°ü½É -- updateArticle");
	}
	
	public void deleteArticle() {
		System.out.println("ÇÙ½É°ü½É -- deleteArticle");
	}
}

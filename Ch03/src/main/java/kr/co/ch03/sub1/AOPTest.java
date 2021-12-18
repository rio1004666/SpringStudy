package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/10/12
 * �̸� : ��ö��
 * ���� : ������ AOP �ǽ��ϱ�
 * 
 * ������ AOP(Aspect Oriented Programming)
 *  - AOP�� �������� ���α׷������� OOP�� ���������� �и��ϱ� ����� �ΰ���� ������ ���ȭ�ϴ� ���
 *  - �ٽɰ��ɰ� ��ü�� ����Ǵ� ��������� �и��ؼ� ���α׷����ϴ� ���
 *  
 * ��������Ʈ(JoinPoint)
 *  - �����ϴ� ��� �ٽɰ��� �޼���(����Ʈ��)
 *  
 * ����Ʈ��(Pointcut)
 *  - ��������Ʈ ��� ����Ǵ� �ٽɰ��� �޼���
 * 
 * �����̽�(Advice)
 *  - Ⱦ�ܰ��ɿ� �ش��ϴ� ������ �ΰ���� �޼���
 *  
 * ������Ʈ(Aspect)
 *  - ����Ʈ�ư� �����̽��� ���յ� �������
 *  
 * ����(Weaving)
 *  - ����Ʈ���� ����ɶ� �����̽��� ����Ʈ�ƿ� ���յǴ� ���� 
 */
public class AOPTest {
	public static void main(String[] args) {
		
		// ������ �����̳� ��ü ����
		
		ApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
		
		// dao ��ü ��������
		
		ArticleDao dao = (ArticleDao) ctx.getBean("articleDao");
		
		dao.insertArticle();
		dao.selectArticle();
		dao.updateArticle();
		dao.deleteArticle();
	}
}

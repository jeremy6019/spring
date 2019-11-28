import org.springframework.context.support.GenericXmlApplicationContext;

import dao.ItemDAO;

public class Main {

	public static void main(String[] args) {
		//스프링 설정 파일 호출하기 
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
						"classpath:applicationContext.xml");
		//빈 가져오기 
		ItemDAO dao = context.getBean(ItemDAO.class);
        
		//전체 데이터 가져오기 
		System.err.println(dao.delete(2));
	}

}

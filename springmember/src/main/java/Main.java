import org.springframework.context.support.GenericXmlApplicationContext;

import daum.jeremy6019.service.MemberService;

public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
						"classpath:applicationContext.xml");
		MemberService service = 
				context.getBean(MemberService.class);
		//메소드 호출 
	 // System.err.println(service.insert());
		
		//메소드 호출 
	 // System.err.println(service.update());
		
	//  System.err.println(service.delete());
		
		//메소드 호출 
	  //service.allMember();
		
	//	service.getMember();
		

		
		
	}

}

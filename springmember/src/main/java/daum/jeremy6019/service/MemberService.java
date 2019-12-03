package daum.jeremy6019.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daum.jeremy6019.dao.MemberDao;
import daum.jeremy6019.dao.MemberMapper;
import daum.jeremy6019.domain.Member;

//Bean을 자동 생성하기 위한 어노테이션
@Service
public class MemberService {
	@Autowired
//	private MemberDao memberDao;
	private MemberMapper memberDao;
	
	//데이터 삽입하는 메소드 
	public boolean insert() {
		boolean result = false;
		//파라미터를 생성
		Member member = new Member();
		member.setEmail("bbb1234@daum.net");
		member.setPassword("9999");
		member.setName("김태인" );
		member.setNickname("귀요");
		member.setImage("default.png");
		Calendar cal = 
				new GregorianCalendar(2013, 2, 13);
		//jdbc에서는 java.sql.Date를 사용 
		//mybatis에서는 java.util.Date도 가능 
		member.setBirthday(new Date(cal.getTimeInMillis()));
		member.setPhone("0103333333");
		
		//Dao 메소드 호출 
		int r = memberDao.insert(member);
		
		//호출한 결과를 가지고 다른 클래스에 전달할 결과 데이터를 생성 
		if(r > 0)
			result = true;
		
		return result;
	}

	//데이터를 수정하는 메소드 
	public boolean update() {
		boolean result = false;
		//파라미터를 생성
		Member member = new Member();
		member.setEmail("jeremy6019@daum.net");
		member.setPassword("9999");
		member.setName("김기범" );
		member.setNickname("ITtrender");
		member.setImage("default.png");
		Calendar cal = 
				new GregorianCalendar(1975, 9, 8, 6, 0, 00);
		//jdbc에서는 java.sql.Date를 사용 
		//mybatis에서는 java.util.Date도 가능 
		member.setBirthday(new Date(cal.getTimeInMillis()));
		member.setPhone("01050386578");
		
		//Dao 메소드 호출 
		int r = memberDao.update(member);
		
		//호출한 결과를 가지고 다른 클래스에 전달할 결과 데이터를 생성 
		if(r >= 0)
			result = true;
		
		return result;
	}
	
	//데이터를 삭제하는 메소드 
	public boolean delete() {
		 boolean result = false;

		String email = "bbb@bbbb";
		 
		int r = memberDao.delete(email);
 
		if(r >= 0)
			result = true;
		
		return result;
	}
		
	//전체 데이터를 가져오는 메소드 
	public void allMember() {
		//웹이면 뷰에서 데이터를 출력하기 위해서 저장하는 작업을 합니다. 
		//여러 개를 리턴하는 메소드는 반복문을 사용할 수 있게 하기 위해서 
		//데이터가 없으면 size=0의 형태로 리턴 
		//NullPointException을 만들지 않기 위해서 
		List<Member> list = memberDao.allMember();
		for(Member member : list) {
			System.out.println(member);
		}
	}
	
	//한 개의 데이터를 가져오는 메소드 
	public void getMember() {
	     System.out.println(
	    		 memberDao.getMember("jeremy94@naver.com"));
	}
	
}

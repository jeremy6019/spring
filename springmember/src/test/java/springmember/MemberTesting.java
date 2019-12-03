package springmember;

import java.sql.Connection;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import daum.jeremy6019.domain.Member;

//이 코드는 복사하면 import가 안되는 경우가 있습니다. 
@RunWith(SpringJUnit4ClassRunner.class)
//설정 파일의 내용을 실행하도록 하는 설정 
@ContextConfiguration(
		locations= {"classpath:applicationContext.xml"})

public class MemberTesting {
	//동일한 자료형의 bean이 있으면 자동으로 주입 
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void connectionTest() {
		try {
			Connection con = dataSource.getConnection();
			System.err.println(con);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void myBatisTest() {
		Member member = new Member();
		member.setEmail("jerome94@naver.com");
		member.setPassword("0000");
		member.setName("사용자");
		member.setNickname("유저1" );
		member.setImage("default.png");
		Calendar cal = 
				new GregorianCalendar(1985,5,5);
		Date birthday = new Date(cal.getTimeInMillis());
		member.setBirthday(birthday);
		member.setPhone("0100000000");
		
		//insert구문 실행 
		//나온 결과값도 확인하고 데이터베이스도 확인 
		//데이터베이스에 삽입이되는데 결과가 이상하면 Service나 Controller에서 
		//이상한 작업을 수행하게 될 수 있습니다. 
		System.out.println(sqlSession.insert("member.insert", member));
	}
	
}

package springmember;

import org.junit.Test;

import daum.jeremy6019.domain.Member;

public class UnitTest {
	@Test
	public void testing() {
		Member member = new Member(); 
		member.setEmail("kkb@naver.com");
		System.err.println(member);
	}
}

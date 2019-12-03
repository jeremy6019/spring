package daum.jeremy6019.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import daum.jeremy6019.domain.Member;

@Repository
public interface MemberMapper {
	
	@Insert("insert into member "
			+ " values(#{email}, #{password}, #{name},"
			+ "#{nickname}, #{image}, #{birthday}, #{phone})")
	public int insert(Member member);
	
	@Update("update member set password=#{password}, name=#{name}, nickname=#{nickname},"
			+ "image=#{image}, birthday=#{birthday}, phone=#{phone} "
			+ " where email=#{email} ")
	public int update(Member member);
	
	@Delete("delete from member where email = #{email}")
	public int delete(String email);
	
	@Select("select * from member")
	public List<Member> allMember();
	
	@Select("select * from member where email = #{email}")
	public Map getMember(String email); 
	
}

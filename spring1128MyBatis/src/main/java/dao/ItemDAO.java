package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.Item;

//Bean(객체)을 자동으로 생성해주는 어노테이션 
@Repository
public class ItemDAO {
	//SqlSession 객체 주입받기 
	//동일한 자료형의 bean이 있으면 자동으로 대입됩니다. 
	@Autowired
	private SqlSession sqlSession;
	
	//전체 데이터 가져오는 메소드 
	public List<Item>list(){
		//여러 개를 리턴하는 메소드 
		//네임스페이스 , 아이디를 호출 
		//parameterType이 있으면 아이디 뒤에 대입 
		return sqlSession.selectList("item.list");
	}
	
	//itemid를 가지고 데이터 1개를 찾아오는 메소드 
	public Map get(int itemid){
		//1	개의 행만 가져오는 메소드 
		//데이터가 없으면 null 리턴 
		return sqlSession.selectOne("item.get", itemid);
	}
	
	//데이터 삽입하는 메소드 
	public int insert(Item item) {
		return sqlSession.insert("item.insert", item);
	}
	
	//데이터 삭제하는 메소드 
	public int delete(int itemid) {
		return sqlSession.delete("item.delete", itemid); 		
	}
	
}

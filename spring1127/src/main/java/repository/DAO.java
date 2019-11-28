package repository;

import vo.Item;

public class DAO {
	//접근 지정자를 default로 설정 
	//패키지 내에서만 호출 가능 
	public DAO(){}
	
	public Item get() {
		Item item = new Item();
		item.setNum(1);
		item.setName("김기범");
		item.setAge(45);
		return item;
	}
}

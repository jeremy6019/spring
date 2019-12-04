package spring1203hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skmns.dao.ItemDao;
import com.skmns.domain.Item;
import com.skmns.service.ItemService;

//JUnit에서 설정 파일을 사용할 수 있도록 해주는 설정 
@RunWith(SpringJUnit4ClassRunner.class)
//스프링 설정 파일 실행 
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class HibernateTest {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private ItemService itemService;
	
	@Test
	public void hibernateTest() {
		//itemService.insert();
		//itemService.update();
		//itemService.delete();
		//itemService.list();
		  itemService.get(1);
		
		//	System.err.println(sessionFactory);
		
	/*	
	    Item item = new Item();
		item.setCode(100);
		item.setName("캐딜락");
		item.setManufacture("GM");
		item.setPrice(130000000);
		itemDao.insert(item);
	*/	
		
	/*	
	    Item item = new Item();
		item.setCode(100);
		item.setName("캐딜락");
		item.setManufacture("GM");
		item.setPrice(145000000);
		itemDao.update(item);
	*/
		
	/*	
	    Item item = new Item();
		item.setCode(100);
		itemDao.delete(item);
	*/
	
	/*	
		List<Item> list = itemDao.allItem();
		for(Item item : list) {
			System.err.println(item);
		}
	*/
		
		Item item = itemDao.getItem(0);
		System.err.println(item);
		
	}

}

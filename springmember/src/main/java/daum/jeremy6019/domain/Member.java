package daum.jeremy6019.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//getter&setter, toString 이 생성됩니다. 
@Data
//매개변수가 없는 생성자 
@NoArgsConstructor
//모든 프로퍼티를 매개변수로 받는 생성자 생성 
@AllArgsConstructor
public class Member {

	private String email;
	private String password;
	private String name;
	private String nickname;
	private String image;
	private Date birthday;
	private String phone;
	
}

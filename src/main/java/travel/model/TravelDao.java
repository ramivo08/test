package travel.model;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myTravelDao")
public class TravelDao {

	private final String namespace="travel.TravelBean"; //mapper가 있는 travel.xml
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insertTravel(TravelBean travel) {

		//굳이 int로 받지 않아도 된다.
		int cnt = sqlSessionTemplate.insert(namespace+".InsertTravel",travel);//insert해야하므로 travel객체의 참조변수를 가지고간다.
		//sqlSessionTemplate객체의insert메서드
		System.out.println("cnt:"+cnt);
		
		return cnt;//굳이 리턴하지 않아도 된다.
	}
	
	
	public List<TravelBean> getTravelList() {
		
		List<TravelBean> lists = new ArrayList<TravelBean>();
		
		lists = sqlSessionTemplate.selectList(namespace+".GetTravelList");
		System.out.println("lists: "+lists.size());
		
		return lists;
	}
	
	
	
}

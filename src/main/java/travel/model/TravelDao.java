package travel.model;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myTravelDao")
public class TravelDao {

	private final String namespace="travel.TravelBean"; //mapper�� �ִ� travel.xml
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insertTravel(TravelBean travel) {

		//���� int�� ���� �ʾƵ� �ȴ�.
		int cnt = sqlSessionTemplate.insert(namespace+".InsertTravel",travel);//insert�ؾ��ϹǷ� travel��ü�� ���������� ��������.
		//sqlSessionTemplate��ü��insert�޼���
		System.out.println("cnt:"+cnt);
		
		return cnt;//���� �������� �ʾƵ� �ȴ�.
	}
	
	
	public List<TravelBean> getTravelList() {
		
		List<TravelBean> lists = new ArrayList<TravelBean>();
		
		lists = sqlSessionTemplate.selectList(namespace+".GetTravelList");
		System.out.println("lists: "+lists.size());
		
		return lists;
	}
	
	
	
}

package travel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import travel.model.TravelBean;
import travel.model.TravelDao;

@Controller
public class TravelInsertController {

	private final String command ="/insert.tv"; //�ݵ�� final ���δ�.
	private String getPage ="/travelInsertForm"; //final �ٿ��൵ ����.
	private String gotoPage ="redirect:/list.tv";//��Ϻ��⸦ ��û�Ѵ�.
	
	
	@Autowired
	private TravelDao travelDao;
	
	//insert.tv��û
	@RequestMapping(value=command,method=RequestMethod.GET)
	public String form() {
		
		return getPage;//form��û
	}
	
	
	//travelInsertForm.jsp -submit- post��û �Է�ó����û
	@RequestMapping(value=command,method=RequestMethod.POST)
	public ModelAndView Insert(@ModelAttribute("travel") @Valid TravelBean travel, BindingResult result) {
	//�޼����̸� �����ɷ� �ص� �ȴ�(�Ű������� �ִ°��, ������ ��)	
		
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			
			mav.setViewName(getPage);
			return mav;
		}
		
		int cnt = travelDao.insertTravel(travel);
		
		
		mav.setViewName(gotoPage);		
		return mav;
		
	}
	
}



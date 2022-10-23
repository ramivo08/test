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

	private final String command ="/insert.tv"; //반드시 final 붙인다.
	private String getPage ="/travelInsertForm"; //final 붙여줘도 좋다.
	private String gotoPage ="redirect:/list.tv";//목록보기를 요청한다.
	
	
	@Autowired
	private TravelDao travelDao;
	
	//insert.tv요청
	@RequestMapping(value=command,method=RequestMethod.GET)
	public String form() {
		
		return getPage;//form요청
	}
	
	
	//travelInsertForm.jsp -submit- post요청 입력처리요청
	@RequestMapping(value=command,method=RequestMethod.POST)
	public ModelAndView Insert(@ModelAttribute("travel") @Valid TravelBean travel, BindingResult result) {
	//메서드이름 같은걸로 해도 된다(매개변수가 있는경우, 구분이 됨)	
		
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



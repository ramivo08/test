package travel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import travel.model.TravelBean;
import travel.model.TravelDao;

@Controller
public class TravelListController {

		private final String command ="list.tv";
		private String getPage="/travelList";
	
		
		@Autowired
		private TravelDao travelDao;
		
		@RequestMapping(command)
		public ModelAndView doAction() {
			
			ModelAndView mav = new ModelAndView();
			
			List<TravelBean> lists = new ArrayList<TravelBean>();
			
			lists = travelDao.getTravelList();
			System.out.println("lists:"+lists);
			mav.addObject("lists", lists);
			
			mav.setViewName(getPage);
			return mav;
		}
}

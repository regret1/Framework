package com.mapping.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mapping.mvc.dto.AdressDto;
import com.mapping.mvc.dto.ScoreDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value="/command.do",method=RequestMethod.GET)
	public String getCommand(Model model, String name, @RequestParam("addr") String addrr, String phone) {
		System.out.println("name: " + name );
		System.out.println("addr: " + addrr );
		System.out.println("phone: " + phone );
		
		AdressDto dto = new AdressDto(name,addrr,phone);
		
		model.addAttribute("dto", dto);
		
		return "getcommand";
	}
	
	@RequestMapping(value="/command.do", method=RequestMethod.POST)
	public String postCommand(Model model, AdressDto dto) {		
		
		System.out.println("postCommand() method");
		System.out.println(dto.getName());
		System.out.println(dto.getAddr());
		System.out.println(dto.getPhone());
		model.addAttribute("dto", dto);
		return "postcommand";
	}
	
	//score.do 요청을 받아 처리하는 메소드 작성
	
	@RequestMapping(value="/score.do",method=RequestMethod.POST)
	public String	postScore(Model model,ScoreDto dto) {
		model.addAttribute("dto",dto);
		
		int sum = dto.getEng()+dto.getKor()+dto.getMath();
		double avg = sum/3;
		model.addAttribute("sum",sum);
		model.addAttribute("avg",avg);
		return "scoreres";
	}
	
}

package team.sports.matching;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	//바반마ㅓ라ㅣㄴ어라ㅣ널나ㅣ러나ㅣsadfdsf
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "member/index.tiles";
	}
	@RequestMapping("/Team/Member/Index.do")
	public String index() {
		return "member/index.tiles";
	}
	@RequestMapping("/Team/Matching/Betting.do")
	public String betting() {
		return "member/in-play.tiles";
	}
	@RequestMapping("/Team/Matching/Promotion.do")
	public String promotion() {
		return "member/promotion.tiles";
	}
	@RequestMapping("/Team/Matching/statostics.do")
	public String statistic() {
		return "member/statistics.tiles";
	}
	@RequestMapping("/Team/Matching/result.do")
	public String results() {
		return "member/result.tiles";
	}
	@RequestMapping("/Team/Matching/about.do")
	public String about() {
		return "member/about.tiles";
	}
	@RequestMapping("/Team/Matching/service.do")
	public String service() {
		return "member/service.tiles";
	}
	@RequestMapping("/Team/Matching/Login.do")
	public String login() {
		return "member/login.tiles";
	}
	@RequestMapping("/Team/Matching/Register.do")
	public String register() {
		return "member/registration.tiles";
	}
	@RequestMapping("/Team/Matching/FAQ.do")
	public String faq() {
		return "member/faq.tiles";
	}
	@RequestMapping("/Team/Matching/Privacy.do")
	public String privacy() {
		return "member/privacy.tiles";
	}
	@RequestMapping("/Team/Matching/Error.do")
	public String errors() {
		return "member/error-404.tiles";
	}
}

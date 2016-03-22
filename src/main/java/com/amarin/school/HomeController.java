package com.amarin.school;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
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
		
		return "home";
	}
	
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(Locale locale, Model model) {
		logger.info("Welcome Dashboard! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "dashboard";
	}
		
	
	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public ModelAndView addstudent() {
		
		ModelAndView model = new ModelAndView();		 
		model.setViewName("addstudent");
		return model;
	}
	
	@RequestMapping(value = "/applicantlist", method = RequestMethod.GET)
	public ModelAndView applicantlist() {	 

		ModelAndView model = new ModelAndView();		 
		model.setViewName("applicantlist");
		return model;
	}
	
	
	@RequestMapping(value = "/studentlist", method = RequestMethod.GET)
	public ModelAndView studentlist() {	 

		ModelAndView model = new ModelAndView();		 
		model.setViewName("studentlist");
		return model;
	}
	
	@RequestMapping(value = "/studentcategory", method = RequestMethod.GET)
	public ModelAndView studentcategory() {	 

		ModelAndView model = new ModelAndView();		 
		model.setViewName("studentcategory");
		return model;
	}
	
	@RequestMapping(value = "/listguardians", method = RequestMethod.GET)
	public ModelAndView listguardians() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("listguardians");
		return model;
	}
	
	@RequestMapping(value = "/complaint", method = RequestMethod.GET)
	public ModelAndView complaint() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("complaint");
		return model;
	}
	
	
	@RequestMapping(value = "/setup", method = RequestMethod.GET)
	public ModelAndView setup() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("setup");
		return model;
	}
	
	@RequestMapping(value = "/class", method = RequestMethod.GET)
	public ModelAndView classcors() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("class");
		return model;
	}
	@RequestMapping(value = "/subject", method = RequestMethod.GET)
	public ModelAndView subject() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("subject");
		return model;
	}
	
	@RequestMapping(value = "/batchgroup", method = RequestMethod.GET)
	public ModelAndView batches() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("batches");
		return model;
	}
	
	@RequestMapping(value = "/batchexam", method = RequestMethod.GET)
	public ModelAndView batchexam() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("batchexam");
		return model;
	}
	
	@RequestMapping(value = "/batchinternalscore", method = RequestMethod.GET)
	public ModelAndView batchinternalscore() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("batchinternalscore");
		return model;
	}
	
	@RequestMapping(value = "/gradename", method = RequestMethod.GET)
	public ModelAndView gradename() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("gradename");
		return model;
	}
	
	@RequestMapping(value = "/studentattendance", method = RequestMethod.GET)
	public ModelAndView studentattendance() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("studentattendance");
		return model;
	}
	
	@RequestMapping(value = "/attendanceregister", method = RequestMethod.GET)
	public ModelAndView attendanceregister() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("attendanceregister");
		return model;
	}
	@RequestMapping(value = "/viewfulltimetable", method = RequestMethod.GET)
	public ModelAndView viewfulltimetable() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("viewfulltimetable");
		return model;
	}
	@RequestMapping(value = "/setclasstiming", method = RequestMethod.GET)
	public ModelAndView setclasstiming() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("setclasstiming");
		return model;
	}
	
	@RequestMapping(value = "/settimetable", method = RequestMethod.GET)
	public ModelAndView settimetable() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("settimetable");
		return model;
	}
	
	@RequestMapping(value = "/fees", method = RequestMethod.GET)
	public ModelAndView fees() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("fees");
		return model;
	}
	
	@RequestMapping(value = "/collectfees", method = RequestMethod.GET)
	public ModelAndView collectfees() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("collectfees");
		return model;
	}
	
	@RequestMapping(value = "/paid", method = RequestMethod.GET)
	public ModelAndView paid() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("paid");
		return model;
	}
	
	@RequestMapping(value = "/unpaid", method = RequestMethod.GET)
	public ModelAndView unpaid() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("unpaid");
		return model;
	}
	
	@RequestMapping(value = "/feesschedule", method = RequestMethod.GET)
	public ModelAndView feesschedule() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("feesschedule");
		return model;
	}
	
	@RequestMapping(value = "/feespayment", method = RequestMethod.GET)
	public ModelAndView feespayment() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("feespayment");
		return model;
	}
	
	@RequestMapping(value = "/hostelfeesschedule", method = RequestMethod.GET)
	public ModelAndView hostelfeesschedule() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("hostelfeesschedule");
		return model;
	}
	
	@RequestMapping(value = "/hostelfeespayment", method = RequestMethod.GET)
	public ModelAndView hostelfeespayment() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("hostelfeespayment");
		return model;
	}
	
	@RequestMapping(value = "/applicant_report", method = RequestMethod.GET)
	public ModelAndView applicant_report() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("applicant_report");
		return model;
	}
	@RequestMapping(value = "/student_report", method = RequestMethod.GET)
	public ModelAndView student_report() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("student_report");
		return model;
	}
	@RequestMapping(value = "/gradesheet", method = RequestMethod.GET)
	public ModelAndView gradesheet() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("gradesheet");
		return model;
	}
	@RequestMapping(value = "/reportcard", method = RequestMethod.GET)
	public ModelAndView reportcard() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("reportcard");
		return model;
	}
	@RequestMapping(value = "/semester_report", method = RequestMethod.GET)
	public ModelAndView semester_report() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("semester_report");
		return model;
	}
	
	
	@RequestMapping(value = "/listbook", method = RequestMethod.GET)
	public ModelAndView listbook() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("listbook");
		return model;
	}
	@RequestMapping(value = "/addbook", method = RequestMethod.GET)
	public ModelAndView addbook() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("addbook");
		return model;
	}
	@RequestMapping(value = "/borrowbook", method = RequestMethod.GET)
	public ModelAndView borrowbook() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("borrowbook");
		return model;
	}
	@RequestMapping(value = "/returnbook", method = RequestMethod.GET)
	public ModelAndView returnbook() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("returnbook");
		return model;
	}
	@RequestMapping(value = "/viewbookdetails", method = RequestMethod.GET)
	public ModelAndView viewbookdetails() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("viewbookdetails");
		return model;
	}
	@RequestMapping(value = "/duedates", method = RequestMethod.GET)
	public ModelAndView duedates() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("duedates");
		return model;
	}
	@RequestMapping(value = "/addbookcategory", method = RequestMethod.GET)
	public ModelAndView addbookcategory() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("addbookcategory");
		return model;
	}
	@RequestMapping(value = "/viewstudentdetails", method = RequestMethod.GET)
	public ModelAndView viewstudentdetails() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("viewstudentdetails");
		return model;
	}
	@RequestMapping(value = "/viewauthors", method = RequestMethod.GET)
	public ModelAndView viewauthors() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("viewauthors");
		return model;
	}
	
	@RequestMapping(value = "/listallroute", method = RequestMethod.GET)
	public ModelAndView listallroute() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("listallroute");
		return model;
	}
	@RequestMapping(value = "/assignroute", method = RequestMethod.GET)
	public ModelAndView assignroute() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("assignroute");
		return model;
	}
	
	@RequestMapping(value = "/allotment", method = RequestMethod.GET)
	public ModelAndView allotment() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("allotment");
		return model;
	}
	
	
	@RequestMapping(value = "/vehicledetails", method = RequestMethod.GET)
	public ModelAndView vehicledetails() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("vehicledetails");
		return model;
	}
	@RequestMapping(value = "/routedetails", method = RequestMethod.GET)
	public ModelAndView routedetails() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("routedetails");
		return model;
	}
	
	@RequestMapping(value = "/transportmanage", method = RequestMethod.GET)
	public ModelAndView transportmanage() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("transportmanage");
		return model;
	}
	
	@RequestMapping(value = "/buslog", method = RequestMethod.GET)
	public ModelAndView buslog() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("buslog");
		return model;
	}
		
	@RequestMapping(value = "/listroomdetails", method = RequestMethod.GET)
	public ModelAndView listroomdetails() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("listroomdetails");
		return model;
	}
	@RequestMapping(value = "/searchroom", method = RequestMethod.GET)
	public ModelAndView searchroom() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("searchroom");
		return model;
	}
	@RequestMapping(value = "/hosteldetails", method = RequestMethod.GET)
	public ModelAndView hosteldetails() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("hosteldetails");
		return model;
	}
	@RequestMapping(value = "/addroomdetails", method = RequestMethod.GET)
	public ModelAndView addroomdetails() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("addroomdetails");
		return model;
	}
	@RequestMapping(value = "/allotrooms", method = RequestMethod.GET)
	public ModelAndView allotrooms() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("allotrooms");
		return model;
	}
	@RequestMapping(value = "/vacate", method = RequestMethod.GET)
	public ModelAndView vacate() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("vacate");
		return model;
	}
	@RequestMapping(value = "/hostelviewstudent", method = RequestMethod.GET)
	public ModelAndView hostelviewstudent() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("hostelviewstudent");
		return model;
	}
	
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public ModelAndView country() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("country");
		return model;
	}
	
	@RequestMapping(value = "/region", method = RequestMethod.GET)
	public ModelAndView region() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("region");
		return model;
	}
	
	@RequestMapping(value = "/state", method = RequestMethod.GET)
	public ModelAndView state() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("state");
		return model;
	}
	
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public ModelAndView city() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("city");
		return model;
	}
	@RequestMapping(value = "/currency", method = RequestMethod.GET)
	public ModelAndView currency() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("currency");
		return model;
	}
	
	@RequestMapping(value = "/userslist", method = RequestMethod.GET)
	public ModelAndView userslist() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("userslist");
		return model;
	}
	
	@RequestMapping(value = "/managerole", method = RequestMethod.GET)
	public ModelAndView managerole() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("managerole");
		return model;
	}
	
	@RequestMapping(value = "/buildingandrooms", method = RequestMethod.GET)
	public ModelAndView buildingandrooms() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("buildingandrooms");
		return model;
	}
	
	/*@RequestMapping(value = "/diseases", method = RequestMethod.GET)
	public ModelAndView diseases() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("diseases");
		return model;
	}
	@RequestMapping(value = "/studentcategory", method = RequestMethod.GET)
	public ModelAndView studentcategory1() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("studentcategory");
		return model;
	}
	@RequestMapping(value = "/batches", method = RequestMethod.GET)
	public ModelAndView batches1() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("batches");
		return model;
	}
	@RequestMapping(value = "/batchgroup", method = RequestMethod.GET)
	public ModelAndView batchgroup() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("batchgroup");
		return model;
	}*/
	
	
}


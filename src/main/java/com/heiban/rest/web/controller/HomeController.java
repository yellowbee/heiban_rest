package com.heiban.rest.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.heiban.rest.domain.College;
import com.heiban.rest.domain.Course;

@Controller
public class HomeController {

	/*
	 * @RequestMapping(value="/authentication", method = RequestMethod.POST)
	 * public ModelAndView authenticate(HttpServletResponse response) throws
	 * IOException{ return new ModelAndView("dashboard"); }
	 */
	/*@RequestMapping(value = "/college_list", method = RequestMethod.GET)
	public ModelAndView collegeList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(false);
		
		// if user has not loggin in yet or already logged out
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}
		return new ModelAndView("college_list");
	}
	
	@RequestMapping(value = "/find_my_college", method = RequestMethod.GET)
	public ModelAndView findMyCollege(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(false);
		
		// if user has not loggin in yet or already logged out
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}
		return new ModelAndView("find_my_college");
	}
	
	@RequestMapping(value = "/my_app", method = RequestMethod.GET)
	public ModelAndView myApp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(false);
		
		// if user has not loggin in yet or already logged out
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}
		return new ModelAndView("my_app");
	}
	
	@RequestMapping(value = "/college_report", method = RequestMethod.GET)
	public ModelAndView collegeReport(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(false);
		
		// if user has not loggin in yet or already logged out
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}
		return new ModelAndView("college_report");
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(false);
		
		// if user has not loggin in yet or already logged out
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}
		return new ModelAndView("dashboard");
	}

	@RequestMapping(value = "/college_search", method = RequestMethod.GET)
	public ModelAndView collegeSearch(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("user") == null) {
			return new ModelAndView("redirect:login");
		}
		
		return new ModelAndView("college_search");
	}*/

	@RequestMapping(value = "/search_colleges", method = RequestMethod.GET)
	public @ResponseBody List<College> search_colleges() throws IOException {
		ArrayList<College> collegeList = new ArrayList<College>();
		collegeList.add(new College("AKRON SCHOOL", "Akron", "OH"));
		collegeList.add(new College("BOWLING GREEN UNIVERSITY",
				"Bowling Green", "OH"));
		collegeList.add(new College("DAYTON UNIVERSITY", "Dayton", "OH"));
		collegeList.add(new College("OHIO STATE UNIVERSITY", "Columbus", "OH"));
		collegeList.add(new College("MIAMI UNIVERSITY", "Miami", "OH"));

		return collegeList;
	}
	
	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public @ResponseBody List<Course> findCourses() throws IOException {
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course("jisuanji", "123"));
		courseList.add(new Course("jinronggongcheng", "123"));
		courseList.add(new Course("shuxue", "123"));
		return courseList;
	}

}

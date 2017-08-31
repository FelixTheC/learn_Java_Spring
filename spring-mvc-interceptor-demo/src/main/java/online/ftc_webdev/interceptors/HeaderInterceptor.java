package online.ftc_webdev.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HeaderInterceptor extends HandlerInterceptorAdapter {

	//get method
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		request.setAttribute("greeting", "We hope you have a scary and funny filled Halloween!");
		String location = request.getParameter("locationName");
		
		if(location != null) {
			request.setAttribute("locationName", location);
		}
		
		return true;
	}

	//post method
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		String postLocation = request.getParameter("locationName");
		
		if(postLocation != null) {
			request.setAttribute("postLocation", postLocation);
		}
	}

	
	
}

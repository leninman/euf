package com.bod.securefactorbod.euf.controllers;



import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bod.securefactorbod.euf.model.Response;
import com.bod.securefactorbod.euf.services.IEufService;
import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;
import static org.springframework.http.HttpMethod.GET;
import org.springframework.web.bind.annotation.RequestBody;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;








@RestController
@RequestMapping("/euf")
public class Eufcontroller {

	@Autowired
	private HttpServletRequest request;

	@Autowired
	IEufService eufService;
	
	Response resp;
	
	/*@RequestMapping(path="/validatefinger",
                method=RequestMethod.GET)
	public Response validateFingerPrint(@RequestParam(name="shk") String shk,@RequestParam(name="finger") String finger) {
		resp=eufService.validate(shk,finger) ;
		return resp;
	}*/
        
        
        
        @GetMapping(path="/validatefinger")
	public Response validateFingerPrint(HttpServletRequest req) {
		 String shk=req.getParameter("shk");
                 String finger=req.getParameter("finger");
                resp=eufService.validate(shk,finger) ;
		return resp;
	}
        
//        @GetMapping("validatefinger/{shk}/{finger}")
//        public Response validateFingerPrint(@PathVariable(name="shk") String shk,@PathVariable(name="finger") String finger){
//           
//            resp=eufService.validate(shk,finger) ;
//		
//		return resp;
//        }
//        
        
	/*@RequestMapping(value = "/getfinger/{input:.+}", method = RequestMethod.GET)
	public ModelAndView getFinger(@PathVariable("input") String input) {*/
		
	@GetMapping(value = "/getfinger")
	public Map getFinger() {

		//ModelAndView model = new ModelAndView();

		try {

			//model.addObject("user-agent", this.getUserAgent());

			//model.addObject("headers", this.getHeadersInfo());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//return this.getUserAgent()+"    "+this.getHeadersInfo();
		
		//return this.getUserAgent();
		
		return this.getHeadersInfo();

		// return request.getHeader("user-agent");
	}

	// get user agent
	private String getUserAgent() {
		return request.getHeader("user-agent");
	}

	// get request headers
	private Map<String, String> getHeadersInfo() {

		Map<String, String> map = new HashMap<String, String>();

		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			map.put(key, value);
		}

		return map;

	}
	
	/*@Autowired
    private UserAgentParser userAgentParser;
	
	@GetMapping("/getFinger")
	@ResponseBody
	public String index(@RequestHeader("User-Agent") String userAgent) {
        Capabilities capabilities = userAgentParser.parse(userAgent);

        String browser = capabilities.getBrowser();
        String browserType = capabilities.getBrowserType();
        String browserMajorVersion = capabilities.getBrowserMajorVersion();
        String deviceType = capabilities.getDeviceType();
        String platform = capabilities.getPlatform();
        String platformVersion = capabilities.getPlatformVersion();

        return String.format("User-Agent: %s\nBrowser: %s, Type: %s, Version: %s, Device: %s, Platform: %s, PlatformVersion: %s", userAgent, browser, browserType, browserMajorVersion, deviceType, platform, platformVersion);
    }*/
	
	
	
}
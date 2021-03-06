package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called...");
	}	
	
	
	/* @ModelAttribute */ 
	@RequestMapping("doC")									//localhost:8080/web/doC?msg=ASJ
	public String doC( @ModelAttribute("msg") String msg) {	// @ModelAttribute는 자동으로 객체를 view까지 전달
		return "result";
	}	

	/* Model */ 
	@RequestMapping("/doD")
	public String doD(Model model) {		//model 은 객체 전달 가능
		ProductVO product = new ProductVO("Sample Project", 10000);	
		model.addAttribute(product);
		
		return "productDetail";
	}	

	
	/* RedirectAttributes */ 
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		rttr.addFlashAttribute("msg", "redirected Massage!");
		return "redirect:/doF";
	}	

	@RequestMapping("/doF")
	public void doF(@ModelAttribute("msg") String msg) {
		System.out.println(msg);
	}	
	
	/*json*/
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO vo = new ProductVO("샘플", 30000);
		return vo;
	}
}

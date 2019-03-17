package pl.jaceksysiak.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.jaceksysiak.web.dao.Offer;
import pl.jaceksysiak.web.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

 
	@RequestMapping("/")
	public String showHome(Model model){
		
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);

		return "home";
	}

}




































package org.munif.app;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.swing.event.ListSelectionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Qualifier;

import services.FruitService;
import services.VegetableService;
import services.YellowFruitService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {

	@Autowired
	@Qualifier("yellow")
	private FruitService yellowFruitService;

	@Autowired
	@Qualifier("red")
	private FruitService redFruitService;

	@Autowired
	@Qualifier("vegetable")
	private VegetableService vegetable;

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("FruitList", redFruitService.getFuits());
		return "home";
	}

	@RequestMapping(value = "/Details", method = RequestMethod.GET)
	public String Details(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		model.addAttribute("FruitList", yellowFruitService.getFuits());
		return "Details";
	}

	@RequestMapping(value = "/Veg/{number}", method = RequestMethod.GET)
	public String Veg(Locale locale, Model model, @PathVariable("number") int direction) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<String> vegs = vegetable.getVegetables();
		
		switch (direction) {
		case 1:
			Collections.sort(vegs);
			break;
	
		default:
			break;
		}
		model.addAttribute("VegetableList", vegs);
		return "Vegetables";
	}
}

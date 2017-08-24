/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Duban Camilo Bedoya - dcamilobj@gmail.com
 *
 */
@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String welcome()
	{
		return "Welcome to the Spring boot!!!";
	}
}

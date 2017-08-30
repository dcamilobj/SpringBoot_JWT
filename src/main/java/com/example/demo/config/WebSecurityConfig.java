/**
 * 
 */
package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Duban Camilo Bedoya - dcamilobj@gmail.com
 * @version 1.0
 */
@SuppressWarnings("SpringJavaAutowiringInspection") //Elimina los 'warnings' de este tipo
@Configuration  //Indica que la clase puede ser usado por el contenedor de spring como una fuente para definir @beans
@EnableWebSecurity //Para que este módulo(web security) soporte y se pueda integrar con Spring MVC
@EnableGlobalMethodSecurity(prePostEnabled = true) //De este forma aseguraremos nuestros métodos
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	//@Autowired    //Inicializa las variables 
	//private JwtAuthenticationEntryPoint unauthorizedHandler;

}

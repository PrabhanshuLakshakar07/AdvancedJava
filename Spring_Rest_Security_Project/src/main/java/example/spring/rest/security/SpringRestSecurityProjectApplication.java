package example.spring.rest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class SpringRestSecurityProjectApplication {

	
	@Bean
	public UserDetailsService getUserDeatailService() {
		UserDetails user1 =
				User.withUsername("James")
				.password(encoder().encode("james@123"))
				.roles("ADMIN").build();
		UserDetails user2 =
				User.withUsername("Williams")
				.password(encoder().encode("williams@123"))
				.roles("USER").build();
		
		UserDetailsService uds=
				new InMemoryUserDetailsManager(user1,user2);
		return uds;
		
		
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder(12);
		
		
	}
	
	@Bean
	public SecurityFilterChain
	getSecurityFilterChain(HttpSecurity http) throws Exception {
		
		//return http.build();
		
	return	http.authorizeHttpRequests(
				auth -> auth.requestMatchers("/doGreet").permitAll()
.requestMatchers("/doRegular").hasAnyRole("ADMIN","USER").requestMatchers("/doAdmin")
.hasAnyRole("Admin")
.anyRequest().authenticated()
				)
		
		.csrf(csrf ->csrf.disable())
		.formLogin(Customizer.withDefaults())
	   .httpBasic(Customizer.withDefaults()).build();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityProjectApplication.class, args);
	}

}

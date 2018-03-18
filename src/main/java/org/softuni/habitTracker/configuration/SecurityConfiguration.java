package org.softuni.habitTracker.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("//**").permitAll();
//                .antMatchers("/", "/users/register", "/assets/**", "/users/login").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin().loginPage("/users/login").permitAll()
//                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/").permitAll()
//                .and().exceptionHandling().accessDeniedPage("/unauthorized")
//                .and().csrf().csrfTokenRepository(csrfTokenRepository());
    }

    private CsrfTokenRepository csrfTokenRepository() {
        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
        repository.setSessionAttributeName("_csrf");
        return repository;
    }

}
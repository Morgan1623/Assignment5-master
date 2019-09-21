package BudgetBuddi.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    private static final String ADMIN_ROLE = "ADMIN";

    private static final String USER_ROLE = "USER";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication()
               .withUser("admin")
               .password(encoder().encode("admin123"))
               .roles(ADMIN_ROLE)
               .and()
               .withUser(("user"))
               .password(encoder().encode("user"))
               .roles(USER_ROLE);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/expense/getAll")
                .hasRole(ADMIN_ROLE)
                .and()
                .csrf().disable();
    }

    @Bean
    public PasswordEncoder encoder()
    {
        return new BCryptPasswordEncoder();
    }
}//class

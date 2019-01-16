package greenfox.springadvanced.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
public class TodoAppSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/*")
        .authenticated()
        .and()
        .formLogin()
        .and().logout()
        .and().csrf().disable();
  }

  // with predefined users
  @Autowired
  public void configureInMemory(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .withUser("adel").password("secure").roles("USER");
  }
/*
  // with a users table
  @Autowired
  public void configureMySql(AuthenticationManagerBuilder auth, DataSource dataSource) throws Exception {
    auth.jdbcAuthentication().dataSource(dataSource)
        .usersByUsernameQuery("select username, password, 1 from users where username=?")
        .authoritiesByUsernameQuery("select username, role from users where username=?");
  }

*/
}

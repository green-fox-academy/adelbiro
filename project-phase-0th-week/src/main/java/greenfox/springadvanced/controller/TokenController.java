package greenfox.springadvanced.controller;

import greenfox.springadvanced.model.JwtUser;
import greenfox.springadvanced.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/token")
public class TokenController {

  private JwtGenerator jwtGenerator;
  public TokenController(JwtGenerator jwtGenerator) {
    this.jwtGenerator = jwtGenerator;
  }

  @PostMapping("/{username}")
  public String generate(@RequestBody final JwtUser jwtUser) {
    jwtGenerator = new JwtGenerator();
    return jwtGenerator.generate(jwtUser);
  }
}

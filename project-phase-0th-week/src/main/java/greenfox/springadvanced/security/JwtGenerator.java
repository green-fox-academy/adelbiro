package greenfox.springadvanced.security;

import greenfox.springadvanced.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {

  public String generate(JwtUser jwtUser) {
    Claims claims = Jwts.claims()
        .setSubject(jwtUser.getUsername());
    claims.put("userId", String.valueOf(jwtUser.getId()));
    claims.put("role", jwtUser.getRole());


    // this is the jts token itself; secret code should be environmental variable
    return Jwts.builder()
        .setClaims(claims)
        .signWith(SignatureAlgorithm.HS512, "secret")
        .compact();
  }

}

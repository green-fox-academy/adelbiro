package greenfox.testing.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void sayGroot_testWithParam() throws Exception {
    this.mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void sayGroot_testWOParam() throws Exception {
    this.mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void arrowSpeed_goodParams() throws Exception {
    this.mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(100.0)));
  }

  @Test
  public void arrowSpeed_noParams() throws Exception {
    this.mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath(
            "$.error", is("You have to enter a distance and a time that are bigger than 0!")));
  }
}




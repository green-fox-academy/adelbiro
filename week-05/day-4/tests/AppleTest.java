import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppleTest {
  private Apple apple = new Apple();

  @Test
  public void testApple() {
    assertEquals("apple", apple.getApple());
  }
}

package greenfox.dependencies;

import greenfox.dependencies.coloring.BlueColor;
import greenfox.dependencies.coloring.RedColor;
import greenfox.dependencies.helloBeanWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

  @Autowired
  Printer printer;
  @Autowired
  BlueColor blueColor;

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    blueColor.printColor();
  }
}


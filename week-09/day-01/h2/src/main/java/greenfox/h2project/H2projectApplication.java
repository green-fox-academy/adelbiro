package greenfox.h2project;

import greenfox.h2project.model.Todo;
import greenfox.h2project.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2projectApplication implements CommandLineRunner {

  @Autowired
  TodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(H2projectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("learn ORM"));
    repository.save(new Todo("print list elements"));
  }
}


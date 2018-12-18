package greenfox.mysql_connect;

import greenfox.mysql_connect.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlConnectApplication implements CommandLineRunner {

  @Autowired
  TodoRepository repository;
  public static void main(String[] args) {
    SpringApplication.run(MysqlConnectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }

}


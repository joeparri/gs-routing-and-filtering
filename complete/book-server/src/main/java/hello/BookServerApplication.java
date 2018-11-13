package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class BookServerApplication {

  @RequestMapping(value = "/list-book")
  public List<String> getListBooks() {
	 List<String> bookList = new ArrayList<>();
	 bookList.add("Spring in Action");
	 bookList.add("Microservices Patterns");
	 
    return bookList;
  }

  public static void main(String[] args) {
    SpringApplication.run(BookServerApplication.class, args);
  }
}

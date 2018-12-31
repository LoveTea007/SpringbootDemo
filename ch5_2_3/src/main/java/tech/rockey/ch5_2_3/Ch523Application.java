package tech.rockey.ch5_2_3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "book")
@RestController
@SpringBootApplication
public class Ch523Application {
	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
		String index(){
		return "bookname is:" + bookName + " and bookAuthor is: " + bookAuthor;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch523Application.class, args);
	}

}


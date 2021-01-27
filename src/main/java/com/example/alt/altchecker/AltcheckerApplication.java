package com.example.alt.altchecker;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AltcheckerApplication {

	public static void main(String[] args) {
		//args will be path to uri
		String uri = "src/main/resources/static/userList.txt";
		if(uri.length() == 0) {
			throw new RuntimeException("No file path Provided");
		}
		AltController obj = new AltController(uri);
		obj.hitApis();
	}

}

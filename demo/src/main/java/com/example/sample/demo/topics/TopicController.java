package com.example.sample.demo.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic(1,"springframework"),
				new Topic(2,"java"),
				new Topic(3,"oracle")	
				);
	}
}

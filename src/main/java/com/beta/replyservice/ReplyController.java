package com.beta.replyservice;

import com.beta.model.V2ReplyModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.reflect.InvocationTargetException;

@RestController
public class ReplyController {

	@GetMapping("/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

//	@GetMapping("/reply/{message}")
//	public ReplyMessage replying(@PathVariable String message) {
//		return new ReplyMessage(message);
//	}

	@GetMapping("/v2/reply/{message}")
	public String replying(@PathVariable String message) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		try {
			 return new V2Reply(message).getV2ReplyModel().getResponseString();
		} catch (IllegalArgumentException e) {
			return e.getMessage();
		}
	}

}
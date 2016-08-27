package com.vig.shop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.vig.shop.service.RegisterService;

@Component
public class DemoHandler {

	@Autowired
	RegisterService rs;

	public UserBean initFlow() {
		return new UserBean();
	}

	public String validateDetails(UserBean userBean, MessageContext m) {

		String status = "success";
		if (userBean.getUserId().isEmpty()) {
			m.addMessage(new MessageBuilder().error().source("userId").defaultText("UserId cannot be Empty").build());
			status = "failure";
		}
		if (userBean.getEmail().isEmpty()) {
			m.addMessage(new MessageBuilder().error().source("email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if (userBean.getAge() == null) {
			m.addMessage(new MessageBuilder().error().source("age").defaultText("Age cannot be Empty").build());
			status = "failure";
		}
		if (userBean.getPass().isEmpty()) {
			m.addMessage(new MessageBuilder().error().source("pass").defaultText("Password cannot be Empty").build());
			status = "failure";
		}
		rs.saveOrUpdate(userBean);
		return status;
	}

}

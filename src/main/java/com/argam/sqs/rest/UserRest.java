package com.argam.sqs.rest;

import com.argam.sqs.bean.UserBean;
import com.argam.sqs.commons.SqsSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    private SqsSender sqsSender;

    public UserRest(SqsSender sqsSender) {
        this.sqsSender = sqsSender;
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserBean user) {
        sqsSender.send(user);
    }
}

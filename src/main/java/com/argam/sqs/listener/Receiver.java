package com.argam.sqs.listener;

import com.argam.sqs.bean.UserBean;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Receiver {

    @SqsListener("user-queue")
    public void receive(UserBean userBean) {
        System.out.println("New user is received ");
        System.out.println(userBean.toString());
        if (userBean.getAge() < 18) {
            System.out.println("The user is less than 18 years old");
            throw new RuntimeException();
        }
    }
}

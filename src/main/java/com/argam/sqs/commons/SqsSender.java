package com.argam.sqs.commons;

import com.argam.sqs.bean.UserBean;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class SqsSender {

    private final QueueMessagingTemplate queueMessagingTemplate;

    public SqsSender(QueueMessagingTemplate queueMessagingTemplate) {
        this.queueMessagingTemplate = queueMessagingTemplate;
    }


    public void send(UserBean userBean) {
        this.queueMessagingTemplate.convertAndSend("user-queue", userBean);
    }
}

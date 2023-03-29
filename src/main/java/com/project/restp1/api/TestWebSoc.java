package com.project.restp1.api;

import com.project.restp1.model.TestMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestWebSoc {

    @Data
    @AllArgsConstructor
    class WithTime {
        private String text1;
        private String text2;
        private String time;

    }

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public WithTime send(TestMessage message) {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new WithTime(message.getFrom(), message.getText(), time);
    }
}

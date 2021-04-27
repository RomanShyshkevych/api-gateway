package com.experimental.apigateway.listener.impl;

import com.experimental.apigateway.dto.MsgDto;
import com.experimental.apigateway.listener.MqListener;
import com.experimental.apigateway.service.StorageService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
@RequiredArgsConstructor
@EnableKafka
public class KafkaListenerMq implements MqListener {

    private final StorageService storageService;
    private final Gson gson;

    @Override
    @KafkaListener(topics = "api-gateway")
    public void onMessage(String msg) {
        MsgDto msgDto = gson.fromJson(msg, MsgDto.class);
        msgDto.setMsgBetweenServices(msgDto.getMsgBetweenServices() + " --> api-gateway here Second one");
        log.info("Save msg to Cache " + msgDto);
        storageService.addMsg(msgDto);
    }
}

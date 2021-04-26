package com.experimental.apigateway.listener.impl;

import com.experimental.apigateway.dto.MsgDto;
import com.experimental.apigateway.listener.MqListener;
import com.experimental.apigateway.service.StorageService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaListenerMq implements MqListener {

    private final StorageService storageService;
    private final Gson gson;

    @Override
    @KafkaListener(topics = "api-gateway", groupId = "foo")
    public void onMessage(String msg) {
        log.info(msg);
        storageService.addMsg(gson.fromJson(msg, MsgDto.class));
    }
}

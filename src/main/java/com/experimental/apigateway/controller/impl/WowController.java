package com.experimental.apigateway.controller.impl;

import com.experimental.apigateway.controller.IWowController;
import com.experimental.apigateway.dto.MsgDto;
import com.experimental.apigateway.service.Sender;
import com.experimental.apigateway.service.StorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/app/v1/message")
@RequiredArgsConstructor
@Slf4j
public class WowController implements IWowController {

    private final Sender sender;

    private final StorageService storageService;

    @Override
    public List<MsgDto> getMsg() {
        return storageService.getAllMsg();
    }

    @Override
    public boolean createMsg(MsgDto msgDto) {
        return sender.send(msgDto);
    }
}

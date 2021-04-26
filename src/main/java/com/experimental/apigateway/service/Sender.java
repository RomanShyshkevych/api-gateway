package com.experimental.apigateway.service;

import com.experimental.apigateway.dto.MsgDto;

public interface Sender {
    boolean send(MsgDto msgDto);
}

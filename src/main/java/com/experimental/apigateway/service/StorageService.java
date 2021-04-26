package com.experimental.apigateway.service;

import com.experimental.apigateway.dto.MsgDto;

import java.util.List;

public interface StorageService {
    List<MsgDto> getAllMsg();
    boolean addMsg(MsgDto msgDto);
}

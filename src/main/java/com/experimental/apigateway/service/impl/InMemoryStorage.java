package com.experimental.apigateway.service.impl;

import com.experimental.apigateway.cache.Cache;
import com.experimental.apigateway.dto.MsgDto;
import com.experimental.apigateway.service.StorageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStorage implements StorageService {

    @Override
    public List<MsgDto> getAllMsg() {
        return Cache.getAllMsg();
    }

    @Override
    public boolean addMsg(MsgDto msgDto) {
        return Cache.addMsg(msgDto);
    }
}

package com.experimental.apigateway.controller;

import com.experimental.apigateway.dto.MsgDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IWowController {
    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    List<MsgDto> getMsg();

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    boolean createMsg(@RequestBody MsgDto msgDto);
}

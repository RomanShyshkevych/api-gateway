package com.experimental.apigateway.cache;

import com.experimental.apigateway.dto.MsgDto;

import java.util.List;

public class Cache {
    private static List<MsgDto> listMsg;

    public static boolean addMsg(MsgDto msgDto) {
        return listMsg.add(msgDto);
    }

    public static List<MsgDto> getAllMsg() {
        return listMsg;
    }
}

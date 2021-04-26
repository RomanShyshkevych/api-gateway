package com.experimental.apigateway.listener;

public interface MqListener {
    void onMessage(String msg);
}

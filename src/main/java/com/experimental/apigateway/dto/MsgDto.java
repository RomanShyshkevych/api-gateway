package com.experimental.apigateway.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class MsgDto {
    private UUID activityId;
    private String msgBetweenServices;
}

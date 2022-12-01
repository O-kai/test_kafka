package com.example.test_kafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * todo description
 *
 * @author zkong_jsk
 * @date 2022/12/1 17:41
 */
@RestController
@RequestMapping(value = "/producer")
//@Api("kafka消息投递测试controller")
public class SendController {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    /***
     * 发送消息
     * topic:要发送的队列
     * msg:发送的消息
     */
    @GetMapping(value = "/send/{topic}/{msg}")
//    @ApiOperation("发送消息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "topic", value = "要发送的队列", required = true, dataType = "String"),
//            @ApiImplicitParam(name = "msg", value = "发送的消息", required = true, dataType = "String")
//    })
    public String send(@PathVariable(value = "topic") String topic, @PathVariable(value = "msg") String msg) {
        //消息发送
        kafkaTemplate.send(topic, msg);
        return "SUCCESS";
    }
}


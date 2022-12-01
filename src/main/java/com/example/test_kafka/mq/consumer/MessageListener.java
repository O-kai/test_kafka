package com.example.test_kafka.mq.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * todo description
 *
 * @author zkong_jsk
 * @date 2022/12/1 17:39
 */
@Component
public class MessageListener {
    @KafkaListener(topics = {"itmentu"}, groupId = "mentuGroup")
    public void listener(ConsumerRecord<String, String> record) {
        //获取消息
        String message = record.value();
        //消息偏移量
        long offset = record.offset();
        System.out.println("读取的消息：" + message + "\n当前偏移量：" + offset);
        System.out.println(record);
    }
}

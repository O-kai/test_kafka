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
public class MysqlMessageBoardListener {
    @KafkaListener(topics = {"demo_board"}, groupId = "mysqlGroup")
    public void listener(ConsumerRecord<String, String> record) {
        System.out.println("groupId = mysqlGroup1");
        System.out.println("获得数据库变动信息，MysqlMessageListener");
        //获取消息
        String message = record.value();
        //消息偏移量
        long offset = record.offset();
        System.out.println("读取的消息：" + message + "\n当前偏移量：" + offset);
        System.out.println(record);
    }

    @KafkaListener(topics = {"jsk_demo_board"}, groupId = "mysqlGroup2")
    public void listener2(ConsumerRecord<String, String> record) {
        System.out.println("groupId = mysqlGroup2");
        System.out.println("获得数据库变动信息，MysqlMessageListener");
        //获取消息
        String message = record.value();
        //消息偏移量
        long offset = record.offset();
        System.out.println("读取的消息：" + message + "\n当前偏移量：" + offset);
        System.out.println(record);
    }

    @KafkaListener(topics = {"demo_agency"}, groupId = "mysqlGroup")
    public void listener3(ConsumerRecord<String, String> record) {
        System.out.println("groupId = mysqlGroup3");
        System.out.println("获得数据库变动信息，MysqlMessageListener");
        //获取消息
        String message = record.value();
        //消息偏移量
        long offset = record.offset();
        System.out.println("读取的消息：" + message + "\n当前偏移量：" + offset);
        System.out.println(record);
    }

    @KafkaListener(topics = {"demo_country"}, groupId = "mysqlGroup")
    public void listener4(ConsumerRecord<String, String> record) {
        System.out.println("groupId = mysqlGroup4");
        System.out.println("获得数据库变动信息，MysqlMessageListener");
        //获取消息
        String message = record.value();
        //消息偏移量
        long offset = record.offset();
        System.out.println("读取的消息：" + message + "\n当前偏移量：" + offset);
        System.out.println(record);
    }
}

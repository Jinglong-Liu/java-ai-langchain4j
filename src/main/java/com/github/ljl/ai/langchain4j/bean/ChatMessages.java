package com.github.ljl.ai.langchain4j.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-25 20:43
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages")
public class ChatMessages {
    //唯一标识，映射到 MongoDB 文档的 _id 字段
    @Id
    private ObjectId id;
    private int messageId;
    private String content; //存储当前聊天记录列表的json字符串
}

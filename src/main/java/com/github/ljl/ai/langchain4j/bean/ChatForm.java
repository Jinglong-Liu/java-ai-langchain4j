package com.github.ljl.ai.langchain4j.bean;

import lombok.Data;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-25 21:57
 **/

@Data
public class ChatForm {
    private Long memoryId;//对话id
    private String message;//用户问题
}

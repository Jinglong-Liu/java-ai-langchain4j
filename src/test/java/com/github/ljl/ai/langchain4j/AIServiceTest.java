package com.github.ljl.ai.langchain4j;

import com.github.ljl.ai.langchain4j.assistant.Assistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-24 23:36
 **/

@SpringBootTest
public class AIServiceTest {

    @Resource
    private QwenChatModel qwenChatModel;

    @Test
    public void testChat() {
        //创建AIService
        Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        //调用service的接口
        String answer = assistant.chat("Hello");
        System.out.println(answer);
    }

    @Resource
    private Assistant assistant;

    @Test
    public void testAssistant() {
        String answer = assistant.chat("你是谁");
        System.out.println(answer);
    }
}

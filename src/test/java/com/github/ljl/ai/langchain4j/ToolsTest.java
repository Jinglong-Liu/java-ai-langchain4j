package com.github.ljl.ai.langchain4j;

import com.github.ljl.ai.langchain4j.assistant.SeparateChatAssistant;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-25 22:49
 **/

@SpringBootTest
public class ToolsTest {
    @Resource
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testCalculatorTools() {
        String answer = separateChatAssistant.chat(1, "1+2等于几，475695037565的平方根是多少？");
                //答案：3，689706.4865
                System.out.println(answer);
    }
}

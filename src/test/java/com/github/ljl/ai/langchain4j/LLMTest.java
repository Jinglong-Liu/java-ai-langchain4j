package com.github.ljl.ai.langchain4j;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-24 22:27
 **/

@SpringBootTest
public class LLMTest {
    @Test
    void TestDemo() {
        // //LangChain4j提供的代理服务器，该代理服务器会将演示密钥替换成真实密钥， 再将请求转
        // 发给OpenAI API
        //.baseUrl("http://langchain4j.dev/demo/openai/v1") //设置模型api地址（如
        //果apiKey="demo"，则可省略baseUrl的配置）
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo") //设置模型apiKey
                .modelName("gpt-4o-mini").build(); //设置模型名称
        //向模型提问
        String answer = model.chat("你好");
        //输出结果
        System.out.println(answer);
    }

    @Resource
    private OpenAiChatModel openAiChatModel;

    @Resource
    private QwenChatModel qwenChatModel;

    @Test
    void TestOpenAi() {
        //向模型提问
        // String answer = openAiChatModel.chat("你好");
        String answer = openAiChatModel.chat("你好");
        //输出结果
        System.out.println(answer);
    }
    @Test
    void TestQwen() {
        //向模型提问
        // String answer = openAiChatModel.chat("你好");
        String answer = qwenChatModel.chat("你好");
        //输出结果
        System.out.println(answer);
    }
}

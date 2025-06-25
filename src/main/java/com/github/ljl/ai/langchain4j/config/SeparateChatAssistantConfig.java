package com.github.ljl.ai.langchain4j.config;

import com.github.ljl.ai.langchain4j.store.MongoChatMemoryStore;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-25 19:53
 **/

@Configuration
public class SeparateChatAssistantConfig {

    //注入持久化对象
    @Resource
    private MongoChatMemoryStore mongoChatMemoryStore;

    @Bean
    ChatMemoryProvider chatMemoryProvider() {
        return memoryId -> MessageWindowChatMemory.builder()
                .id(memoryId)
                .maxMessages(10)
                .chatMemoryStore(mongoChatMemoryStore)//配置持久化对象
                .build();
    }
}

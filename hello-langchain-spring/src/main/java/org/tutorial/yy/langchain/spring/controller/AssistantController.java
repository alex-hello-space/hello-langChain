package org.tutorial.yy.langchain.spring.controller;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tutorial.yy.langchain.spring.assistant.Assistant;
import org.tutorial.yy.langchain.spring.service.AssistantService;

import static org.tutorial.yy.langchain.service.LangModel.getModel;

@RestController
public class AssistantController {

    @Autowired
    Assistant assistant;

    @Autowired
    AssistantService assistantService;

    public static Assistant qianFanAssistant;

    @PostConstruct
    public void init() {
        ChatLanguageModel model = getModel("qian_fan");
        qianFanAssistant = AiServices.create(Assistant.class, model);
    }

    @GetMapping("spring/chat")
    public String assistant(@RequestParam(value = "message", defaultValue = "hello") String message) {
        return assistant.chat(message, "礼貌");
    }

    @GetMapping("/chat")
    public String assistant2(@RequestParam(value = "message", defaultValue = "hello") String message) {
        return assistantService.chat(message, "礼貌");
    }
}
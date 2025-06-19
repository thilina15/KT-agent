package com.simple_chat.open_ai_chat.controller;

import com.simple_chat.open_ai_chat.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    // Constructor injection
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/message")
    public Object chat(@RequestBody String message) {
        return this.chatService.getReply(message);
    }

    @GetMapping("/test")
    public String test() {
        return "Chat controller is working!";
    }
}
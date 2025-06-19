package com.simple_chat.open_ai_chat.service;

import com.simple_chat.open_ai_chat.dto.ChatReplyDto;
import org.springframework.ai.chat.messages.*;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private final OpenAiChatModel chatModel;
    private final List<Message> messages;

    // Constructor injection
    public ChatService(OpenAiChatModel chatModel) {
        this.chatModel =chatModel;
        this.messages = new ArrayList<>();
        this.messages.add(new SystemMessage("you are a helpful assistant"));
    }

    public ChatReplyDto getReply(String message){
        this.messages.add(new UserMessage(message));
        Prompt prompt = new Prompt(this.messages);
        String reply = this.chatModel.call(prompt
        ).getResult().getOutput().getText();
        this.messages.add(new AssistantMessage(reply));
        return new ChatReplyDto(reply);
    }
}

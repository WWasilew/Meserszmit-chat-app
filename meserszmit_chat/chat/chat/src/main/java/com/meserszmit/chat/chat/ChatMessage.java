package com.meserszmit.chat.chat;

import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public ChatMessage(MessageType type, String sender) {
        this.type = type;
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public MessageType getType() {
        return type;
    }
    public void setType(MessageType type) {
        this.type = type;
    }
    public String getContent() {
        return content;
    }

    public static ChatMessage Build(MessageType type, String sender) {
        return new ChatMessage(type, sender);
    }
}


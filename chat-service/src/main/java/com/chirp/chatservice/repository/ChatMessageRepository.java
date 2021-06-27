package com.chirp.chatservice.repository;

import com.chirp.chatservice.model.ChatMessage;
import com.chirp.chatservice.model.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository <ChatMessage, String>{
    long countBySenderIdAndRecipientIdAndStatus(String senderId, String recipientId, MessageStatus status);

    List<ChatMessage> findByChatId(String chatId);
}

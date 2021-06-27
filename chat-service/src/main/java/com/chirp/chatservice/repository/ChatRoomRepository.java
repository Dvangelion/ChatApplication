package com.chirp.chatservice.repository;

import com.chirp.chatservice.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {
     Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}

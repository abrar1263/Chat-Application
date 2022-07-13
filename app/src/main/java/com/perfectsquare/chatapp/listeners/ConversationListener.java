package com.perfectsquare.chatapp.listeners;

import com.perfectsquare.chatapp.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}

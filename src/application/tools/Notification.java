package application.tools;

import application.model.Recipient;

public class Notification {
    private Recipient recipient;
    private String message;
    private boolean isRead;

    public Notification(Recipient user, String message) {
        this.recipient = user;
        this.message = message;
        this.isRead = false;
    }

    public Recipient getUser() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}

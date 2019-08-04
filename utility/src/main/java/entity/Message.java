package entity;

import java.io.Serializable;

public class Message implements Serializable {

    private String from;
    private String body;

    public Message(String from, String body) {
        this.from = from;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

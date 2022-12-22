package userClient.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private final int id;
    private final String ip;
    private int  identificationCode;
    private String name;
    private LocalDate dateTime;

    public User(int id, String ip, int identificationCode, String name, LocalDate dateTime) {
        this.id = id;
        this.ip = ip;
        this.identificationCode = identificationCode;
        this.name = name;
        this.dateTime = dateTime;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public int getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(int identification_code) {
        this.identificationCode = identification_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "User{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", identification_code=" + identificationCode +
                ", name='" + name + '\'' +
                '}';
    }
}

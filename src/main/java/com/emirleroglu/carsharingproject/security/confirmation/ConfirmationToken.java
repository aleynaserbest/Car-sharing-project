package com.emirleroglu.carsharingproject.security.confirmation;

import com.emirleroglu.carsharingproject.models.User;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ConfirmationToken {
    @SequenceGenerator(
            name = "confirmation_token_sequence",
            sequenceName = "confirmation_token_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "confirmation_token_sequence"
    )
    private Long id;


    @Column(nullable = false)
    private String token;

    private LocalDateTime confirmedAt;

    public ConfirmationToken(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public ConfirmationToken() {

    }

    public LocalDateTime getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(LocalDateTime confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)

    @JoinColumn(
            nullable = false,
            name = "user_id"
    )
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.example.multipleDB.model.primary;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address_line_1", nullable = false, columnDefinition = "TEXT DEFAULT ''")
    private String addressLine1;

    @Column(name = "address_line_2", columnDefinition = "TEXT DEFAULT NULL")
    private String addressLine2;

    @Column(name = "rooms", nullable = false)
    private int rooms;

    @Column(name = "currency", columnDefinition = "TEXT DEFAULT NULL")
    private String currency;

    @Column(name = "timezone", columnDefinition = "TEXT DEFAULT NULL")
    private String timezone;

    @Column(name = "star_rating", nullable = false, columnDefinition = "SMALLINT DEFAULT 5")
    private short starRating;

    @Column(name = "phone_number", columnDefinition = "TEXT DEFAULT NULL")
    private String phoneNumber;

    @Column(name = "email", columnDefinition = "TEXT DEFAULT NULL")
    private String email;

    @Column(name = "vat")
    private Double vat;

    public Hotel(String name, String addressLine1, String addressLine2, int rooms, String currency, String timezone, short starRating, String phoneNumber, String email, Double vat) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.rooms = rooms;
        this.currency = currency;
        this.timezone = timezone;
        this.starRating = starRating;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.vat = vat;
    }
}

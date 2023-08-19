package com.example.roombooking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "room")

public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String custName;
    private String custPhno;
    private Integer roomId;
}

package com.necatisahiin.purchase.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name="purchase")
public class Purchase {

    @Id
    @SequenceGenerator(
            name="purchase_seq",
            sequenceName = "purchase_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;
}

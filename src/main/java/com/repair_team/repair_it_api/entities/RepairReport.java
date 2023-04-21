package com.repair_team.repair_it_api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "repair_reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepairReport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repair_service_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private RepairService repairService;
    @Column(name = "price", nullable = false)
    private BigDecimal price;
    @Column(name = "comment", nullable = false, length = 200)
    private String comment;
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;
}
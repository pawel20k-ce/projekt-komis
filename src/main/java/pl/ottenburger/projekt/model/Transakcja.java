package pl.ottenburger.projekt.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transakcje")
public class Transakcja {



    @Column
    private String rodz_trans;
    @Column
    private Date data;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;


}

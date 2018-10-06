package pl.ottenburger.projekt.Transakcje;

import pl.ottenburger.projekt.model.Car;
import pl.ottenburger.projekt.model.Customer;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transakcje")
public class Transakcja {

    public Transakcja(String rodz_trans, Date data, Car car, Customer customer) {
        this.rodz_trans = rodz_trans;
        this.data = data;
        this.car = car;
        this.customer = customer;
    }

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


    public String getRodz_trans() {
        return rodz_trans;
    }

    public void setRodz_trans(String rodz_trans) {
        this.rodz_trans = rodz_trans;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

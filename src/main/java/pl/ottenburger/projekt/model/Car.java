package pl.ottenburger.projekt.model;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer rocznik;
    @Column
    private String marka;
    @Column
    private String model;
    @Column
    private Integer nr_oc;
    @Column
    private Integer nr_dowodu_rej;
    @Column
    private String typ_paliwa;
    @Column
    private Integer przebieg;
    @Column
    private Double silnik;
    @Column
    private Integer moc;
    @Column
    private String skrzynia_biegow;
    @Column
    private String VIN;
    @Column
    private String opis;
    @Column
    private Integer ilosc_jazd_probnych;

    public String getZdjecie() {
        return zdjecie;
    }

    public void setZdjecie(String zdjecie) {
        this.zdjecie = zdjecie;
    }

    @Column
    private String zdjecie;


    @Column
    private Integer cena;


    public Car() {
    }

    public Car(Integer rocznik, String marka, String model, Integer nr_oc, Integer nr_dowodu_rej, String typ_paliwa, Integer przebieg, Double silnik, Integer moc, String skrzynia_biegow, String VIN, String opis, Integer ilosc_jazd_probnych, String zdjecie, Integer cena) {
        this.rocznik = rocznik;
        this.marka = marka;
        this.model = model;
        this.nr_oc = nr_oc;
        this.nr_dowodu_rej = nr_dowodu_rej;
        this.typ_paliwa = typ_paliwa;
        this.przebieg = przebieg;
        this.silnik = silnik;
        this.moc = moc;
        this.skrzynia_biegow = skrzynia_biegow;
        this.VIN = VIN;
        this.opis = opis;
        this.ilosc_jazd_probnych = ilosc_jazd_probnych;
        this.zdjecie = zdjecie;
        this.cena = cena;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRocznik() {
        return rocznik;
    }

    public void setRocznik(Integer rocznik) {
        this.rocznik = rocznik;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNr_oc() {
        return nr_oc;
    }

    public void setNr_oc(Integer nr_oc) {
        this.nr_oc = nr_oc;
    }

    public Integer getNr_dowodu_rej() {
        return nr_dowodu_rej;
    }

    public void setNr_dowodu_rej(Integer nr_dowodu_rej) {
        this.nr_dowodu_rej = nr_dowodu_rej;
    }

    public String getTyp_paliwa() {
        return typ_paliwa;
    }

    public void setTyp_paliwa(String typ_paliwa) {
        this.typ_paliwa = typ_paliwa;
    }

    public Integer getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(Integer przebieg) {
        this.przebieg = przebieg;
    }

    public Double getSilnik() {
        return silnik;
    }

    public void setSilnik(Double silnik) {
        this.silnik = silnik;
    }

    public Integer getMoc() {
        return moc;
    }

    public void setMoc(Integer moc) {
        this.moc = moc;
    }

    public String getSkrzynia_biegow() {
        return skrzynia_biegow;
    }

    public void setSkrzynia_biegow(String skrzynia_biegow) {
        this.skrzynia_biegow = skrzynia_biegow;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getIlosc_jazd_probnych() {
        return ilosc_jazd_probnych;
    }

    public void setIlosc_jazd_probnych(Integer ilosc_jazd_probnych) {
        this.ilosc_jazd_probnych = ilosc_jazd_probnych;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }


}

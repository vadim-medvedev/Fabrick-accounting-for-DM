package entity;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Sofa {

    private LongProperty id;
    private StringProperty idDM;
    private StringProperty type;
    private ObservableList cloths;
    private ObjectProperty <LocalDate> deliveryDate;

    public Sofa(LongProperty id, StringProperty idDM, StringProperty type, ObservableList cloths, ObjectProperty<LocalDate> deliveryDate) {
        this.id = id;
        this.idDM = idDM;
        this.type = type;
        this.cloths = cloths;
        this.deliveryDate = deliveryDate;
    }

    public Sofa() {
    }

    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public String getIdDM() {
        return idDM.get();
    }

    public StringProperty idDMProperty() {
        return idDM;
    }

    public void setIdDM(String idDM) {
        this.idDM.set(idDM);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public ObservableList getCloths() {
        return cloths;
    }

    public void setCloths(ObservableList cloths) {
        this.cloths = cloths;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate.get();
    }

    public ObjectProperty<LocalDate> deliveryDateProperty() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate.set(deliveryDate);
    }


}

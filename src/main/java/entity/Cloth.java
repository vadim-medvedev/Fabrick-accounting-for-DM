package entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Cloth {

    private LongProperty id;
    private StringProperty name;
    private IntegerProperty count;
    private StringProperty provider;
    private ObjectProperty<LocalDate> dateDelivery;


    public Cloth() {
    }

    public Cloth(LongProperty id, StringProperty name, IntegerProperty count, StringProperty provider, ObjectProperty<LocalDate> dateDelivery) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.provider = provider;
        this.dateDelivery = dateDelivery;
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

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getCount() {
        return count.get();
    }

    public IntegerProperty countProperty() {
        return count;
    }

    public void setCount(int count) {
        this.count.set(count);
    }

    public String getProvider() {
        return provider.get();
    }

    public StringProperty providerProperty() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider.set(provider);
    }

    public LocalDate getDateDelivery() {
        return dateDelivery.get();
    }

    public ObjectProperty<LocalDate> dateDeliveryProperty() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDate dateDelivery) {
        this.dateDelivery.set(dateDelivery);
    }
}

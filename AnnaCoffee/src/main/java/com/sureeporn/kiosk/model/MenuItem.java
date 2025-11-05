package com.sureeporn.kiosk.model;
import java.util.Objects;
import java.math.BigDecimal;

public class MenuItem <T extends Enum<T>>  {
    private final String name;
    private final BigDecimal price;
    private final T category;

    public MenuItem(String name, BigDecimal price, T category) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is not valid");}

        if (price == null || price.signum() <= 0) {
            throw new IllegalArgumentException("Price is not valid");
        }

        if (category == null) {
            throw new IllegalArgumentException("Category Required");
        }

        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName () {
        return  this.name;
    }

    public BigDecimal getPrice () {
        return this.price;
    }

    public T getCategory() { return category; }

    @Override
    public String toString () {
        return name + " (" + category + ", " + price + ")";
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof MenuItem<?> m)) return false;
        return Objects.equals(name,m.name)
                && Objects.equals(price,m.price)
                && Objects.equals(category, m.category);
    }
    @Override
    public int hashCode(){ return Objects.hash(name,price,category); }

}



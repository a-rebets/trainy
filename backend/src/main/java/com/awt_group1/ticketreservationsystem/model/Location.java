package com.awt_group1.ticketreservationsystem.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Location {
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String locationId;
    private String addressLine;
    private String postalCode;
    private String city;
    private String country;
    private BigDecimal longtitude;
    private BigDecimal latitude;

    @Id
    @Column(name = "Location_Id", nullable = false, length = 36)
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "Address_Line", nullable = true, length = 255)
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @Basic
    @Column(name = "Postal_Code", nullable = true, length = 10)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "City", nullable = true, length = 100)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Country", nullable = true, length = 2)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "Longtitude", nullable = true, precision = 9, scale = 6)
    public BigDecimal getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(BigDecimal longtitude) {
        this.longtitude = longtitude;
    }

    @Basic
    @Column(name = "Latitude", nullable = true, precision = 8, scale = 6)
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(locationId, location.locationId) && Objects.equals(addressLine, location.addressLine) && Objects.equals(postalCode, location.postalCode) && Objects.equals(city, location.city) && Objects.equals(country, location.country) && Objects.equals(longtitude, location.longtitude) && Objects.equals(latitude, location.latitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, addressLine, postalCode, city, country, longtitude, latitude);
    }
}

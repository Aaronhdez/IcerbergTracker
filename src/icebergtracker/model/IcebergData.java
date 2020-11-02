/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icebergtracker.model;

import java.time.LocalDate;

public class IcebergData{
    private final LocalDate date;
    private final Iceberg iceberg;
    private final String coordinates;
    private final double volume;
    
    public IcebergData(LocalDate date, Iceberg iceberg, String coordinates, double volume) {
        this.date= date;
        this.iceberg= iceberg;
        this.coordinates= coordinates;
        this.volume= volume;
    }
    
    public LocalDate getDate() {
        return date;
    }
    public Iceberg getIceberg() {
        return iceberg;
    }
    public String getCoordinates() {
        return coordinates;
    }
    
    public double getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return iceberg + ", en fecha: " + date+ ", volumen: " + volume+ ", cooordenadas: " + coordinates;
    }
}

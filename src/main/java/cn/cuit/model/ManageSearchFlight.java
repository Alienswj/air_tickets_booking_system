package cn.cuit.model;

import lombok.Data;

@Data
public class ManageSearchFlight {
    private String airId;
    private String airline;
    private String departure;
    private String destination;
    private int minPrice=0;
    private int maxPrice=0;
}

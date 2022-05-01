package com.github.sechols22.weddingplanner.models.wedding;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@SuppressWarnings("unused")
@Document(collection="Wedding")
public class Wedding {

    @Id
    private String id;

    private Venue venue;
    private Catering catering;
    private Date weddingDate = new Date();

    private String last_name;
    private String groom;
    private String bride;
    private String officiant;
    private String maid_of_honor;
    private String best_man;

    private List<String> brides_maids;
    private List<String> grooms_men;
    private List<String> guests;
    private List<String> colors;

    private List<Flower> flowers;

    private double budget;
    private double estimated_cost;

    public Wedding() {

    }
}

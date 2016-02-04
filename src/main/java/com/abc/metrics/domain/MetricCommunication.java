package com.abc.metrics.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by scamisay on 27/01/16.
 */
public class MetricCommunication extends Metric {

    @Id
    private String id;

    private Integer facebookReads;
    private Integer facebookReadsGoal;

    public MetricCommunication() {
    }

    public MetricCommunication(String id, Integer facebookReads, Integer facebookReadsGoal) {
        this.id = id;
        this.facebookReads = facebookReads;
        this.facebookReadsGoal = facebookReadsGoal;
    }

    @Override
    public Double calculateCurrent() {
        return new Double(facebookReads)/facebookReadsGoal * MAX_MULTIPLIER;
    }

    @Override
    public Double calculateHistoric(Date aDate) {
        return null;
    }

    public String getId() {
        return id;
    }

    public Integer getFacebookReads() {
        return facebookReads;
    }

    public Integer getFacebookReadsGoal() {
        return facebookReadsGoal;
    }

    public void setFacebookReads(Integer facebookReads) {
        this.facebookReads = facebookReads;
    }

    public void setFacebookReadsGoal(Integer facebookReadsGoal) {
        this.facebookReadsGoal = facebookReadsGoal;
    }
}

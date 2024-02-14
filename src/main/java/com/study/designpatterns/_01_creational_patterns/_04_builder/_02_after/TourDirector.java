package com.study.designpatterns._01_creational_patterns._04_builder._02_after;

import com.study.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("Cancun Trip")
                .nightAndDays(3, 4)
                .startDate(LocalDate.of(2020, 12, 12))
                .whereToStay("Hotel")
                .addPlan(1, "Visit Chichen Itza")
                .addPlan(2, "Visit Tulum")
                .addPlan(3, "Visit Coba")
                .getPlan();
    }

    public TourPlan jejuTrip() {
        return tourPlanBuilder.title("Jeju Trip")
                .startDate(LocalDate.of(2020, 10, 10))
                .getPlan();
    }
}

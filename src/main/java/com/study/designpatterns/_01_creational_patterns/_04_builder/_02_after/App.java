package com.study.designpatterns._01_creational_patterns._04_builder._02_after;

import com.study.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
//        TourPlan plan = builder.title("칸쿤 여행")
//                .nightAndDays(2, 3)
//                .startDate(LocalDate.of(2020, 12, 12))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인하고 짐 풀기")
//                .addPlan(1, "조식 부페에서 식사")
//                .getPlan();
//
//        TourPlan tamraPlan = builder.title("제주도")
//                .startDate(LocalDate.of(2020, 10, 10))
//                .getPlan();

        // 디렉터 사용
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = tourDirector.cancunTrip();
        TourPlan tamraPlan = tourDirector.jejuTrip();
    }
}

package com.test.service.activities;

import com.test.dto.ActivitiesDto_DB;

import java.util.ArrayList;

public interface ActivitiesService {
    void addActivities(String name, String category, String target, String date,
                       String link, String poster, String benefits, String host);
    ArrayList<ActivitiesDto_DB> getActivities();
}

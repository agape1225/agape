package com.test.service.activities;
import com.test.dao.ActivitiesDao;
import com.test.dto.ActivitiesDto_DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ActivitiesServiceImp implements ActivitiesService {

    @Autowired
    ActivitiesDao activitiesDao;

    @Override
    public void addActivities(String name, String category, String target, String date,
                              String link, String poster, String benefits, String host) {

        activitiesDao.addActivities(name, category, target, date, link, poster, benefits, host);

    }

    @Override
    public ArrayList<ActivitiesDto_DB> getActivities() {
        return activitiesDao.getActivities();
    }
}

package com.test.mapper;

import com.test.dto.ActivitiesDto_DB;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface ActivitiesMapper {
    void addActivities(@Param("name") String name, @Param("category") String category,
                       @Param("target") String target, @Param("date")String date,
                       @Param("link") String link, @Param("poster") String poster,
                       @Param("benefits") String benefits, @Param("host") String host);

    ArrayList<ActivitiesDto_DB> getActivities();

    void deleteActivities(@Param("number") String number);
}

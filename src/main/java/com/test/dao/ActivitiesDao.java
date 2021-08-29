package com.test.dao;

import com.test.dto.ActivitiesDto_DB;
import com.test.dto.TestDto;
import com.test.mapper.ActivitiesMapper;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ActivitiesDao {

    @Autowired
    SqlSession sqlSession;

    public void addActivities(String name, String category, String target, String date,
                         String link, String poster, String benefits, String host){
        try{

            System.out.println("start addActivities Dao");
            ActivitiesMapper activitiesMapper = sqlSession.getMapper(ActivitiesMapper.class);
            activitiesMapper.addActivities(name, category, target, date, link, poster, benefits, host);
            System.out.println("end addActivities Dao");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<ActivitiesDto_DB> getActivities(){
        try{

            System.out.println("start addActivities Dao");
            ActivitiesMapper activitiesMapper = sqlSession.getMapper(ActivitiesMapper.class);
            System.out.println("end addActivities Dao");

            return activitiesMapper.getActivities();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void deleteActivities(String number){
        try{

            System.out.println("start deleteActivities Dao");
            ActivitiesMapper activitiesMapper = sqlSession.getMapper(ActivitiesMapper.class);
            System.out.println("end deleteActivities Dao");

            activitiesMapper.deleteActivities(number);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

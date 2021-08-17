package com.test.dao;

import com.test.dto.AdminLoginDto;
import com.test.mapper.AdminLoginMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class AdminLoginDao {
    @Autowired
    SqlSession sqlSession;

    public ArrayList<AdminLoginDto> getLoginInfo() {
        try {
            System.out.println("start admin login dao");
            AdminLoginMapper adminLoginMapper = sqlSession.getMapper(AdminLoginMapper.class);
            ArrayList<AdminLoginDto> loginInfo = adminLoginMapper.getLoginInfo();

            System.out.println("end admin login dao");

            return loginInfo;

        } catch (Exception e) {
            return null;

        }



    }
}
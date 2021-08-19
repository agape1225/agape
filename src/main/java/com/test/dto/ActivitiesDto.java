package com.test.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Getter
@Setter
public class ActivitiesDto {
    String name;
    String category;
    String target;
    String date;
    String link;
    MultipartFile poster;
    String benefits;
    String host;
}

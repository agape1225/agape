package com.test.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
public class ActivitiesDto_DB {
    int num;
    String name;
    String category;
    String target;
    String date;
    String link;
    String poster;
    String benefits;
    String host;
}

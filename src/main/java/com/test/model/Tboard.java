package com.test.model;

import lombok.Data;

@Data
public class Tboard {
    private String boardNo;
    private String boardGb;
    private String title;
    private String content;
    private String useYn;
    private String insertDate;
    private String insertId;
    private String modifyDate;
    private String modifyId;
}

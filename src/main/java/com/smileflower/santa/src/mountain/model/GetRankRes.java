package com.smileflower.santa.src.mountain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GetRankRes {
    private int ranking;
    private int userIdx;
    private String userName;
    private String userImage;
    private int flagCount;
    private String agoTime;
    public GetRankRes(int ranking,int userIdx,String userName,String userImage,int flagCount, String agoTime){
        this.ranking=ranking;
        this.userIdx=userIdx;
        this.userName=userName;
        this.userImage=userImage;
        this.flagCount=flagCount;
        this.agoTime= agoTime;
    }

}
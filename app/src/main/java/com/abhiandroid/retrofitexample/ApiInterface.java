package com.abhiandroid.retrofitexample;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface ApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("/adduser")     // API's endpoints
    public void registration(@Field("userName") String userName,
                             @Field("mobileNo") String mobileNo,
                             @Field("emailAddress") String emailAddress,
                             @Field("password") String password,
                             @Field("isDeleted") String isDeleted,
                             @Field("StartTrip") String StartTrip,
                             @Field("EndTrip") String EndTrip,
                             @Field("StartLoc") String StartLoc,
                             @Field("EndLoc") String EndLoc,
                             @Field("SpeedDes01") String SpeedDes01,
                             @Field("SpeedDes02") String SpeedDes02,
                             @Field("SpeedDes03") String SpeedDes03,
                             @Field("SpeedDes04") String SpeedDes04,
                             @Field("SpeedDes05") String SpeedDes05,
                             @Field("OverAcel") String OverAcel,
                             @Field("HarshBrake") String HarshBrake,
                             @Field("SmoothBrake") String SmoothBrake,
                             @Field("SmoothDrive") String SmoothDrive,
                             @Field("RapidAcel") String RapidAcel,
                             @Field("NaturalDecel") String NaturalDecel,
                             @Field("IdleTime") String IdleTime,
                             @Field("AvgSpeed") String AvgSpeed,
                             @Field("AvgRPM") String AvgRPM,
                             @Field("MaxSpeed") String MaxSpeed,
                             @Field("MaxRPM") String MaxRPM,
                             @Field("UsualSpeed") String UsualSpeed,
                             @Field("UsualRPM") String UsualRPM,
                             @Field("MedianSpeed") String MedianSpeed,
                             @Field("MedianRPM") String MedianRPM,                             Callback<SignUpResponse> callback);
// In registration method @Field used to set the keys and String data type is representing its a string type value and callback is used to get the response from api and it will set it in our POJO class

/*
    public void registration(@Field("StartTrip") String StartTrip,
                             @Field("EndTrip") String EndTrip,
                             @Field("StartLoc") String StartLoc,
                             @Field("EndLoc") String EndLoc,
                             @Field("SpeedDes01") String SpeedDes01,
                             @Field("SpeedDes02") String SpeedDes02,
                             @Field("SpeedDes03") String SpeedDes03,
                             @Field("SpeedDes04") String SpeedDes04,
                             @Field("SpeedDes05") String SpeedDes05,
                             @Field("OverAcel") String OverAcel,
                             @Field("HarshBrake") String HarshBrake,
                             @Field("SmoothBrake") String SmoothBrake,
                             @Field("SmoothDrive") String SmoothDrive,
                             @Field("RapidAcel") String RapidAcel,
                             @Field("NaturalDecel") String NaturalDecel,
                             @Field("IdleTime") String IdleTime,
                             @Field("AvgSpeed") String AvgSpeed,
                             @Field("AvgRPM") String AvgRPM,
                             @Field("MaxSpeed") String MaxSpeed,
                             @Field("MaxRPM") String MaxRPM,
                             @Field("UsualSpeed") String UsualSpeed,
                             @Field("UsualRPM") String UsualRPM,
                             @Field("MedianSpeed") String MedianSpeed,
                             @Field("MedianRPM") String MedianRPM,
                             Callback<SignUpResponse> callback);*/


}

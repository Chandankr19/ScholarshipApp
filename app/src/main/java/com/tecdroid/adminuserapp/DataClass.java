package com.tecdroid.adminuserapp;

public class DataClass {

    private  String dataTitle;
    private  String dataLang;
    private String dataImage;
    private String dataDesc;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataLang() {
        return dataLang;
    }

    public String getDataImage() {
        return dataImage;
    }

    public String getDataDesc() {
        return dataDesc;
    }


    public DataClass(String dataTitle, String dataLang, String dataDesc, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataLang = dataLang;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
    }

    public DataClass(){

    }

}

package pers.tornado.datav.entity;

import java.util.List;

public class DatavTemplate {

    private int templateID;
    private int userID;
    private String templatePicUrl;
    private int screenStretch;
    private List<DatavTemplateScreendef> screendef;
    private String backgroundColor;
    private String backgroundImage;
    private int disabled;

    public DatavTemplate() {
    }

    @Override
    public String toString() {
        return "DatavTemplate{" +
                "templateID=" + templateID +
                ", userID=" + userID +
                ", templatePicUrl='" + templatePicUrl + '\'' +
                ", screenStretch='" + screenStretch + '\'' +
                ", screendef=" + screendef +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", backgroundImage='" + backgroundImage + '\'' +
                ", disabled=" + disabled +
                '}';
    }

    public DatavTemplate(int templateID, int userID, String templatePicUrl, int screenStretch, List<DatavTemplateScreendef> screendef, String backgroundColor, String backgroundImage, int disabled) {
        this.templateID = templateID;
        this.userID = userID;
        this.templatePicUrl = templatePicUrl;
        this.screenStretch = screenStretch;
        this.screendef = screendef;
        this.backgroundColor = backgroundColor;
        this.backgroundImage = backgroundImage;
        this.disabled = disabled;
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getTemplatePicUrl() {
        return templatePicUrl;
    }

    public void setTemplatePicUrl(String templatePicUrl) {
        this.templatePicUrl = templatePicUrl;
    }

    public int getScreenStretch() {
        return screenStretch;
    }

    public void setScreenStretch(int screenStretch) {
        this.screenStretch = screenStretch;
    }

    public List<DatavTemplateScreendef> getScreendef() {
        return screendef;
    }

    public void setScreendef(List<DatavTemplateScreendef> screendef) {
        this.screendef = screendef;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }
}

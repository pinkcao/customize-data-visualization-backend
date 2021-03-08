package pers.tornado.datav.entity;

import java.util.List;
import java.util.Map;

public class DatavTemplateVo {

    private int templateID;
    private int userID;
    private String templatePicUrl;
    private Map<String, Object> screenStretch;
    private List<DatavTemplateScreendef> screendef;
    private Map<String, Object> backgroundStyle;
    private int disabled;

    @Override
    public String toString() {
        return "DatavTemplateVo{" +
                "templateID=" + templateID +
                ", userID=" + userID +
                ", templatePicUrl='" + templatePicUrl + '\'' +
                ", screenStretch=" + screenStretch +
                ", screendef=" + screendef +
                ", backgroundStyle=" + backgroundStyle +
                ", disabled=" + disabled +
                '}';
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

    public Map<String, Object> getScreenStretch() {
        return screenStretch;
    }

    public void setScreenStretch(Map<String, Object> screenStretch) {
        this.screenStretch = screenStretch;
    }

    public List<DatavTemplateScreendef> getScreendef() {
        return screendef;
    }

    public void setScreendef(List<DatavTemplateScreendef> screendef) {
        this.screendef = screendef;
    }

    public Map<String, Object> getBackgroundStyle() {
        return backgroundStyle;
    }

    public void setBackgroundStyle(Map<String, Object> backgroundStyle) {
        this.backgroundStyle = backgroundStyle;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public DatavTemplateVo() {
    }

    public DatavTemplateVo(int templateID, int userID, String templatePicUrl, Map<String, Object> screenStretch, List<DatavTemplateScreendef> screendef, Map<String, Object> backgroundStyle, int disabled) {
        this.templateID = templateID;
        this.userID = userID;
        this.templatePicUrl = templatePicUrl;
        this.screenStretch = screenStretch;
        this.screendef = screendef;
        this.backgroundStyle = backgroundStyle;
        this.disabled = disabled;
    }
}

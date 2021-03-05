package pers.tornado.datav.entity;

public class DatavTemplateScreendef {

    private int templateID;
    private int screenIndex;
    private String screenTitle;
    private String screenType;
    private int screenValue;

    @Override
    public String toString() {
        return "DatavTemplateScreendef{" +
                "templateID=" + templateID +
                ", screenIndex=" + screenIndex +
                ", screenTitle='" + screenTitle + '\'' +
                ", screenType='" + screenType + '\'' +
                ", screenValue=" + screenValue +
                '}';
    }

    public DatavTemplateScreendef(int templateID, int screenIndex, String screenTitle, String screenType, int screenValue) {
        this.templateID = templateID;
        this.screenIndex = screenIndex;
        this.screenTitle = screenTitle;
        this.screenType = screenType;
        this.screenValue = screenValue;
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }

    public int getScreenIndex() {
        return screenIndex;
    }

    public void setScreenIndex(int screenIndex) {
        this.screenIndex = screenIndex;
    }

    public String getScreenTitle() {
        return screenTitle;
    }

    public void setScreenTitle(String screenTitle) {
        this.screenTitle = screenTitle;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getScreenValue() {
        return screenValue;
    }

    public void setScreenValue(int screenValue) {
        this.screenValue = screenValue;
    }

    public DatavTemplateScreendef() {
    }
}

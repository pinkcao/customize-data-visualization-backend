package pers.tornado.datav.entity;

public class DatavTemplateScreenStretchVo {
    private String screenStretch;
    private int templateID;

    @Override
    public String toString() {
        return "DatavTemplateScreenStretchVo{" +
                "screenStretch='" + screenStretch + '\'' +
                ", templateID=" + templateID +
                '}';
    }

    public String getScreenStretch() {
        return screenStretch;
    }

    public void setScreenStretch(String screenStretch) {
        this.screenStretch = screenStretch;
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }

    public DatavTemplateScreenStretchVo() {
    }

    public DatavTemplateScreenStretchVo(String screenStretch, int templateID) {
        this.screenStretch = screenStretch;
        this.templateID = templateID;
    }
}

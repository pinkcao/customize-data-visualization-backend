package pers.tornado.datav.entity;

public class ComponentDetail {
    private int componentDetailID;
    private int componentTabDataDetailID;
    private String title;
    private String componentName;
    private String picurl;
    private int disabled;

    public ComponentDetail(int componentDetailID, int componentTabDataDetailID, String title, String componentName, String picurl, int disabled) {
        this.componentDetailID = componentDetailID;
        this.componentTabDataDetailID = componentTabDataDetailID;
        this.title = title;
        this.componentName = componentName;
        this.picurl = picurl;
        this.disabled = disabled;
    }

    public ComponentDetail() {
    }

    public int getComponentDetailID() {
        return componentDetailID;
    }

    public void setComponentDetailID(int componentDetailID) {
        this.componentDetailID = componentDetailID;
    }

    public int getComponentTabDataDetailID() {
        return componentTabDataDetailID;
    }

    public void setComponentTabDataDetailID(int componentTabDataDetailID) {
        this.componentTabDataDetailID = componentTabDataDetailID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "ComponentDetail{" +
                "componentDetailID=" + componentDetailID +
                ", componentTabDataDetailID=" + componentTabDataDetailID +
                ", title='" + title + '\'' +
                ", componentName='" + componentName + '\'' +
                ", picurl='" + picurl + '\'' +
                ", disabled=" + disabled +
                '}';
    }
}

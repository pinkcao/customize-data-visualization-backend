package pers.tornado.datav.entity;

import java.util.List;

public class ComponentTabDataDetail {
    private int showDataID;
    private int vshow;
    private String text;
    private int componentTabDataDetailID;
    private int disabled;
    private List<ComponentDetail> ComponentDetailList;

    public ComponentTabDataDetail(int showDataID, int vshow, String text, int componentTabDataDetailID, int disabled, List<ComponentDetail> componentDetailList) {
        this.showDataID = showDataID;
        this.vshow = vshow;
        this.text = text;
        this.componentTabDataDetailID = componentTabDataDetailID;
        this.disabled = disabled;
        ComponentDetailList = componentDetailList;
    }

    public List<ComponentDetail> getComponentDetailList() {
        return ComponentDetailList;
    }

    public void setComponentDetailList(List<ComponentDetail> componentDetailList) {
        ComponentDetailList = componentDetailList;
    }

    public ComponentTabDataDetail() {
    }

    public int getShowDataID() {
        return showDataID;
    }

    public void setShowDataID(int showDataID) {
        this.showDataID = showDataID;
    }

    public int getVshow() {
        return vshow;
    }

    public void setVshow(int vshow) {
        this.vshow = vshow;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getComponentTabDataDetailID() {
        return componentTabDataDetailID;
    }

    public void setComponentTabDataDetailID(int componentTabDataDetailID) {
        this.componentTabDataDetailID = componentTabDataDetailID;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "ComponentTabDataDetail{" +
                "showDataID=" + showDataID +
                ", vshow=" + vshow +
                ", text='" + text + '\'' +
                ", componentTabDataDetailID=" + componentTabDataDetailID +
                ", disabled=" + disabled +
                '}';
    }
}

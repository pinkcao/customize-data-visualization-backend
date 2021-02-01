package pers.tornado.datav.entity;

import java.util.List;

public class ComponentTabData {

    private int showDataID;
    private String className;
    private int disabled;
    private List<ComponentTabDataDetail> showData;

    public ComponentTabData(int showDataID, String className, int disabled, List<ComponentTabDataDetail> showData) {
        this.showDataID = showDataID;
        this.className = className;
        this.disabled = disabled;
        this.showData = showData;
    }

    public ComponentTabData() {
    }

    public int getShowDataID() {
        return showDataID;
    }

    public void setShowDataID(int showDataID) {
        this.showDataID = showDataID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public List<ComponentTabDataDetail> getShowData() {
        return showData;
    }

    public void setShowData(List<ComponentTabDataDetail> showData) {
        this.showData = showData;
    }

    @Override
    public String toString() {
        return "ComponentTabData{" +
                "showDataID=" + showDataID +
                ", className='" + className + '\'' +
                ", disabled=" + disabled +
                ", showData=" + showData +
                '}';
    }
}

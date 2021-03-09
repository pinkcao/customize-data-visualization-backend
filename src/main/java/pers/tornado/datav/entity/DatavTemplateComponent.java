package pers.tornado.datav.entity;

import java.util.Map;

public class DatavTemplateComponent {

    private int templateID;
    private String name;
    private String title;
    private String subTitle;
    private int width;
    private int height;
    private int top;
    private int left;
    private int deg;
    private boolean draggable;
    private boolean resizable;
    private boolean parentLimitation;
    private boolean active;
    private boolean ifshow;
    private int index;
    private int zindex;
    private Map<String, Object> dataSource;
    private Map<String, Object> style;

    public Map<String, Object> getDataSource() {
        return dataSource;
    }

    public void setDataSource(Map<String, Object> dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, Object> getStyle() {
        return style;
    }

    public void setStyle(Map<String, Object> style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "DatavTemplateComponent{" +
                "templateID=" + templateID +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", top=" + top +
                ", left=" + left +
                ", deg=" + deg +
                ", draggable=" + draggable +
                ", resizable=" + resizable +
                ", parentLimitation=" + parentLimitation +
                ", active=" + active +
                ", ifshow=" + ifshow +
                ", index=" + index +
                ", zindex=" + zindex +
                ", dataSource=" + dataSource +
                ", style=" + style +
                '}';
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public boolean isDraggable() {
        return draggable;
    }

    public void setDraggable(boolean draggable) {
        this.draggable = draggable;
    }

    public boolean isResizable() {
        return resizable;
    }

    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }

    public boolean isParentLimitation() {
        return parentLimitation;
    }

    public void setParentLimitation(boolean parentLimitation) {
        this.parentLimitation = parentLimitation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isIfshow() {
        return ifshow;
    }

    public void setIfshow(boolean ifshow) {
        this.ifshow = ifshow;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getZindex() {
        return zindex;
    }

    public void setZindex(int zindex) {
        this.zindex = zindex;
    }

    public DatavTemplateComponent() {
    }
}

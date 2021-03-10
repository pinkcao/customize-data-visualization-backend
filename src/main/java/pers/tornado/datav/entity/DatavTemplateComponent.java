package pers.tornado.datav.entity;

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
    private boolean disabled;
    private int index;
    private int zindex;
    private DatavTemplateComponentDataSource dataSource;
    private DatavTemplateComponentStyle style;

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
                ", disabled=" + disabled +
                ", index=" + index +
                ", zindex=" + zindex +
                ", dataSource=" + dataSource +
                ", style=" + style +
                '}';
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public DatavTemplateComponentDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DatavTemplateComponentDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setStyle(DatavTemplateComponentStyle style) {
        this.style = style;
    }

    public DatavTemplateComponentStyle getStyle() {
        return style;
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

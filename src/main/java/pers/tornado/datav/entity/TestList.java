package pers.tornado.datav.entity;

import java.util.Map;

public class TestList {
    private int zindex;
    private int height;
    private int width;
    private Map<String, Object> style;
    private Map<String, Object> dataSource;

    public TestList(int zindex, int height, int width, Map<String, Object> style, Map<String, Object> dataSource) {
        this.zindex = zindex;
        this.height = height;
        this.width = width;
        this.style = style;
        this.dataSource = dataSource;
    }

    public TestList() {
    }

    public int getZindex() {
        return zindex;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Map<String, Object> getStyle() {
        return style;
    }

    public Map<String, Object> getDataSource() {
        return dataSource;
    }

    public void setZindex(int zindex) {
        this.zindex = zindex;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setStyle(Map<String, Object> style) {
        this.style = style;
    }

    public void setDataSource(Map<String, Object> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "testList{" +
                "zindex=" + zindex +
                ", height=" + height +
                ", width=" + width +
                ", style=" + style +
                ", dataSource=" + dataSource +
                '}';
    }
}

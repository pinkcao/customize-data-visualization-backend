package pers.tornado.datav.entity;

public class DatavTemplateScreendef {

    private int templateID;
    private int index;
    private String title;
    private String type;
    private int value;

    public DatavTemplateScreendef(int templateID, int index, String title, String type, int value) {
        this.templateID = templateID;
        this.index = index;
        this.title = title;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DatavTemplateScreendef{" +
                "templateID=" + templateID +
                ", index=" + index +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DatavTemplateScreendef() {
    }

    public DatavTemplateScreendef(int index, String title, String type, int value) {
        this.index = index;
        this.title = title;
        this.type = type;
        this.value = value;
    }
}

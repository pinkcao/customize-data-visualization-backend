package pers.tornado.datav.entity;

public class DatavTemplateBackgroundVo {

    private String backgroundColor;
    private String backgroundImage;
    private int templateID;

    @Override
    public String toString() {
        return "DatavTemplateBackgroundVo{" +
                "backgroundColor='" + backgroundColor + '\'' +
                ", backgroundImage='" + backgroundImage + '\'' +
                ", templateID=" + templateID +
                '}';
    }

    public DatavTemplateBackgroundVo() {
    }

    public DatavTemplateBackgroundVo(String backgroundColor, String backgroundImage, int templateID) {
        this.backgroundColor = backgroundColor;
        this.backgroundImage = backgroundImage;
        this.templateID = templateID;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }
}

package pers.tornado.datav.entity;

public class DatavTemplateComponentStyleVo {

    private int templateID;
    private int index;
    private float opacity;
    private Boolean legendvis;
    private Boolean titlevis;
    private String titlepos;
    private String fontColor;

    @Override
    public String toString() {
        return "DatavTemplateComponentStyleVo{" +
                "templateID=" + templateID +
                ", index=" + index +
                ", opacity=" + opacity +
                ", legendvis=" + legendvis +
                ", titlevis=" + titlevis +
                ", titlepos='" + titlepos + '\'' +
                ", fontColor='" + fontColor + '\'' +
                '}';
    }

    public DatavTemplateComponentStyleVo() {
    }

    public DatavTemplateComponentStyleVo(DatavTemplateComponent datavTemplateComponent) {
        this.templateID = datavTemplateComponent.getTemplateID();
        this.index = datavTemplateComponent.getIndex();
        this.opacity = datavTemplateComponent.getStyle().getOpacity();
        this.legendvis = datavTemplateComponent.getStyle().getLegendvis();
        this.titlevis = datavTemplateComponent.getStyle().getTitlevis();
        this.titlepos = datavTemplateComponent.getStyle().getTitlepos();
        this.fontColor = datavTemplateComponent.getStyle().getFontColor();
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
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

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }
    public Boolean getLegendvis() {
        return legendvis;
    }

    public void setLegendvis(Boolean legendvis) {
        this.legendvis = legendvis;
    }

    public Boolean getTitlevis() {
        return titlevis;
    }

    public void setTitlevis(Boolean titlevis) {
        this.titlevis = titlevis;
    }
    public String getTitlepos() {
        return titlepos;
    }

    public void setTitlepos(String titlepos) {
        this.titlepos = titlepos;
    }
}

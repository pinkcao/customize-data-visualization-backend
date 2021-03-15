package pers.tornado.datav.entity;

public class DatavTemplateComponentStyleVo {

    private int templateID;
    private int index;
    private float opacity;
    private boolean legendvis;
    private boolean titlevis;
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
        this.legendvis = datavTemplateComponent.getStyle().isLegendvis();
        this.titlevis = datavTemplateComponent.getStyle().isTitlevis();
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

    public boolean isLegendvis() {
        return legendvis;
    }

    public void setLegendvis(boolean legendvis) {
        this.legendvis = legendvis;
    }

    public boolean isTitlevis() {
        return titlevis;
    }

    public void setTitlevis(boolean titlevis) {
        this.titlevis = titlevis;
    }

    public String getTitlepos() {
        return titlepos;
    }

    public void setTitlepos(String titlepos) {
        this.titlepos = titlepos;
    }
}

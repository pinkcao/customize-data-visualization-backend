package pers.tornado.datav.entity;

public class DatavTemplateComponentStyle {

    private float opacity;
    private Boolean legendvis;
    private Boolean titlevis;
    private String titlepos;
    private String fontColor;


    @Override
    public String toString() {
        return "DatavTemplateComponentStyle{" +
                "opacity=" + opacity +
                ", legendvis=" + legendvis +
                ", titlevis=" + titlevis +
                ", titlepos='" + titlepos + '\'' +
                ", fontColor='" + fontColor + '\'' +
                '}';
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }


    public String getTitlepos() {
        return titlepos;
    }

    public void setTitlepos(String titlepos) {
        this.titlepos = titlepos;
    }

    public DatavTemplateComponentStyle() {
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
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
}

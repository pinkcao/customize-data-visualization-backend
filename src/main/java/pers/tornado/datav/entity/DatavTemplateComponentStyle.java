package pers.tornado.datav.entity;

public class DatavTemplateComponentStyle {

    private float opacity;
    private boolean legendvis;
    private boolean titlevis;
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
}

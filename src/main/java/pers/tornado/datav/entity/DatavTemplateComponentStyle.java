package pers.tornado.datav.entity;

public class DatavTemplateComponentStyle {

    private float opacity;
    private int legendvis;
    private int titlevis;
    private String titlepos;

    @Override
    public String toString() {
        return "DatavTemplateComponentStyle{" +
                "opacity=" + opacity +
                ", legendvis=" + legendvis +
                ", titlevis=" + titlevis +
                ", titlepos='" + titlepos + '\'' +
                '}';
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public int getLegendvis() {
        return legendvis;
    }

    public void setLegendvis(int legendvis) {
        this.legendvis = legendvis;
    }

    public int getTitlevis() {
        return titlevis;
    }

    public void setTitlevis(int titlevis) {
        this.titlevis = titlevis;
    }

    public String getTitlepos() {
        return titlepos;
    }

    public void setTitlepos(String titlepos) {
        this.titlepos = titlepos;
    }

    public DatavTemplateComponentStyle() {
    }

    public DatavTemplateComponentStyle(float opacity, int legendvis, int titlevis, String titlepos) {
        this.opacity = opacity;
        this.legendvis = legendvis;
        this.titlevis = titlevis;
        this.titlepos = titlepos;
    }
}

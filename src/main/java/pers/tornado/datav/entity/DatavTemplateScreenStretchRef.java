package pers.tornado.datav.entity;

public class DatavTemplateScreenStretchRef {

    private int screenStretch;
    private String screenStretchMethod;

    public DatavTemplateScreenStretchRef(int screenStretch, String screenStretchMethod) {
        this.screenStretch = screenStretch;
        this.screenStretchMethod = screenStretchMethod;
    }

    public DatavTemplateScreenStretchRef() {
    }

    @Override
    public String toString() {
        return "DatavTemplateScreenStretchRef{" +
                "screenStretch=" + screenStretch +
                ", screenStretchMethod='" + screenStretchMethod + '\'' +
                '}';
    }

    public int getScreenStretch() {
        return screenStretch;
    }

    public void setScreenStretch(int screenStretch) {
        this.screenStretch = screenStretch;
    }

    public String getScreenStretchMethod() {
        return screenStretchMethod;
    }

    public void setScreenStretchMethod(String screenStretchMethod) {
        this.screenStretchMethod = screenStretchMethod;
    }
}

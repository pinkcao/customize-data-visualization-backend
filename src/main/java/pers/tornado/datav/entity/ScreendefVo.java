package pers.tornado.datav.entity;

import java.util.List;

public class ScreendefVo {
    private List<DatavTemplateScreendef> screenDef;

    @Override
    public String toString() {
        return "ScreendefVo{" +
                "screenDef=" + screenDef +
                '}';
    }

    public List<DatavTemplateScreendef> getScreenDef() {
        return screenDef;
    }

    public void setScreenDef(List<DatavTemplateScreendef> screenDef) {
        this.screenDef = screenDef;
    }

    public ScreendefVo() {
    }

    public ScreendefVo(List<DatavTemplateScreendef> screenDef) {
        this.screenDef = screenDef;
    }
}

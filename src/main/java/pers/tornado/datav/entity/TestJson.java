package pers.tornado.datav.entity;

public class TestJson {
    private String textColumn;
    private int ID;

    public TestJson(String textColumn, int ID) {
        this.textColumn = textColumn;
        this.ID = ID;
    }

    public TestJson() {
    }

    public String getTextColumn() {
        return textColumn;
    }

    public void setTextColumn(String textColumn) {
        this.textColumn = textColumn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "TestJson{" +
                "textColumn='" + textColumn + '\'' +
                ", ID=" + ID +
                '}';
    }
}

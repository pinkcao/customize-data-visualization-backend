package pers.tornado.datav.entity;

public class DatavTemplateComponentDatasource {

    private String data;
    private String dataSourceType;
    private int APISwitch;
    private String APIURL;
    private String APIMethod;
    private int APIInterval;
    private String APIHeader;
    private int IntervalID;

    @Override
    public String toString() {
        return "DatavTemplateComponentDatasource{" +
                "data='" + data + '\'' +
                ", dataSourceType='" + dataSourceType + '\'' +
                ", APISwitch=" + APISwitch +
                ", APIURL='" + APIURL + '\'' +
                ", APIMethod='" + APIMethod + '\'' +
                ", APIInterval=" + APIInterval +
                ", APIHeader='" + APIHeader + '\'' +
                ", IntervalID=" + IntervalID +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public int getAPISwitch() {
        return APISwitch;
    }

    public void setAPISwitch(int APISwitch) {
        this.APISwitch = APISwitch;
    }

    public String getAPIURL() {
        return APIURL;
    }

    public void setAPIURL(String APIURL) {
        this.APIURL = APIURL;
    }

    public String getAPIMethod() {
        return APIMethod;
    }

    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    public int getAPIInterval() {
        return APIInterval;
    }

    public void setAPIInterval(int APIInterval) {
        this.APIInterval = APIInterval;
    }

    public String getAPIHeader() {
        return APIHeader;
    }

    public void setAPIHeader(String APIHeader) {
        this.APIHeader = APIHeader;
    }

    public int getIntervalID() {
        return IntervalID;
    }

    public void setIntervalID(int intervalID) {
        IntervalID = intervalID;
    }

    public DatavTemplateComponentDatasource() {
    }

    public DatavTemplateComponentDatasource(String data, String dataSourceType, int APISwitch, String APIURL, String APIMethod, int APIInterval, String APIHeader, int intervalID) {
        this.data = data;
        this.dataSourceType = dataSourceType;
        this.APISwitch = APISwitch;
        this.APIURL = APIURL;
        this.APIMethod = APIMethod;
        this.APIInterval = APIInterval;
        this.APIHeader = APIHeader;
        IntervalID = intervalID;
    }
}

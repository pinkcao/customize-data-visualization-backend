package pers.tornado.datav.entity;

public class DatavTemplateComponentDataSource {

    private String data;
    private String dataSourceOptions;
    private String dataSourceType;
    private boolean APISwitch;
    private String APIURL;
    private String APIMethod;
    private int APIInterval;
    private String APIHeader;
    private int IntervalID;

    @Override
    public String toString() {
        return "DatavTemplateComponentDatasource{" +
                "data='" + data + '\'' +
                ", dataSourceOptions='" + dataSourceOptions + '\'' +
                ", dataSourceType='" + dataSourceType + '\'' +
                ", APISwitch=" + APISwitch +
                ", APIURL='" + APIURL + '\'' +
                ", APIMethod='" + APIMethod + '\'' +
                ", APIInterval=" + APIInterval +
                ", APIHeader='" + APIHeader + '\'' +
                ", IntervalID=" + IntervalID +
                '}';
    }

    public String getDataSourceOptions() {
        return dataSourceOptions;
    }
    public boolean isAPISwitch() {
        return APISwitch;
    }

    public void setAPISwitch(boolean APISwitch) {
        this.APISwitch = APISwitch;
    }
    public void setDataSourceOptions(String dataSourceOptions) {
        this.dataSourceOptions = dataSourceOptions;
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

    public DatavTemplateComponentDataSource() {
    }

}

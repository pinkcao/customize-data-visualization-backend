package pers.tornado.datav.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatavTemplateComponentDataSource {

    private String data;
    private String dataSourceOptions;
    private String dataSourceType;
    @JsonProperty("APISwitch")
    private boolean APISwitch;
    @JsonProperty("APIURL")
    private String APIURL;
    @JsonProperty("APIMethod")
    private String APIMethod;
    @JsonProperty("APIInterval")
    private int APIInterval;
    @JsonProperty("APIHeader")
    private String APIHeader;
    @JsonProperty("IntervalID")
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataSourceOptions() {
        return dataSourceOptions;
    }

    public void setDataSourceOptions(String dataSourceOptions) {
        this.dataSourceOptions = dataSourceOptions;
    }

    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @JsonProperty("APISwitch")
    public boolean isAPISwitch() {
        return APISwitch;
    }
    @JsonProperty("APISwitch")
    public void setAPISwitch(boolean APISwitch) {
        this.APISwitch = APISwitch;
    }
    @JsonProperty("APIURL")
    public String getAPIURL() {
        return APIURL;
    }
    @JsonProperty("APIURL")
    public void setAPIURL(String APIURL) {
        this.APIURL = APIURL;
    }
    @JsonProperty("APIMethod")
    public String getAPIMethod() {
        return APIMethod;
    }
    @JsonProperty("APIMethod")
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }
    @JsonProperty("APIInterval")
    public int getAPIInterval() {
        return APIInterval;
    }
    @JsonProperty("APIInterval")
    public void setAPIInterval(int APIInterval) {
        this.APIInterval = APIInterval;
    }
    @JsonProperty("APIHeader")
    public String getAPIHeader() {
        return APIHeader;
    }
    @JsonProperty("APIHeader")
    public void setAPIHeader(String APIHeader) {
        this.APIHeader = APIHeader;
    }
    @JsonProperty("IntervalID")
    public int getIntervalID() {
        return IntervalID;
    }
    @JsonProperty("IntervalID")
    public void setIntervalID(int intervalID) {
        IntervalID = intervalID;
    }

    public DatavTemplateComponentDataSource() {
    }

}

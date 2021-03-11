package pers.tornado.datav.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatavTemplateComponentDataSourceVo {

    private int templateID;
    private int index;
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

    public DatavTemplateComponentDataSourceVo(int templateID, int index, String data, String dataSourceOptions, String dataSourceType, boolean APISwitch, String APIURL, String APIMethod, int APIInterval, String APIHeader, int intervalID) {
        this.templateID = templateID;
        this.index = index;
        this.data = data;
        this.dataSourceOptions = dataSourceOptions;
        this.dataSourceType = dataSourceType;
        this.APISwitch = APISwitch;
        this.APIURL = APIURL;
        this.APIMethod = APIMethod;
        this.APIInterval = APIInterval;
        this.APIHeader = APIHeader;
        IntervalID = intervalID;
    }

    public DatavTemplateComponentDataSourceVo(DatavTemplateComponentDataSource datavTemplateComponentDataSource) {
        this.data = datavTemplateComponentDataSource.getData();
        this.dataSourceOptions = datavTemplateComponentDataSource.getDataSourceOptions();
        this.dataSourceType = datavTemplateComponentDataSource.getDataSourceType();
        this.APISwitch = datavTemplateComponentDataSource.isAPISwitch();
        this.APIURL = datavTemplateComponentDataSource.getAPIURL();
        this.APIMethod = datavTemplateComponentDataSource.getAPIMethod();
        this.APIInterval = datavTemplateComponentDataSource.getAPIInterval();
        this.IntervalID = datavTemplateComponentDataSource.getIntervalID();
    }

    public DatavTemplateComponentDataSourceVo(DatavTemplateComponent datavTemplateComponent) {
        this.templateID = datavTemplateComponent.getTemplateID();
        this.index = datavTemplateComponent.getIndex();
        this.data = datavTemplateComponent.getDataSource().getData();
        this.dataSourceOptions = datavTemplateComponent.getDataSource().getDataSourceOptions();
        this.dataSourceType = datavTemplateComponent.getDataSource().getDataSourceType();
        this.APISwitch = datavTemplateComponent.getDataSource().isAPISwitch();
        this.APIURL = datavTemplateComponent.getDataSource().getAPIURL();
        this.APIMethod = datavTemplateComponent.getDataSource().getAPIMethod();
        this.APIInterval = datavTemplateComponent.getDataSource().getAPIInterval();
        this.IntervalID = datavTemplateComponent.getDataSource().getIntervalID();
    }

    @Override
    public String toString() {
        return "DatavTemplateComponentDataSourceVo{" +
                "templateID=" + templateID +
                ", index=" + index +
                ", data='" + data + '\'' +
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

    public DatavTemplateComponentDataSourceVo() {
    }
}

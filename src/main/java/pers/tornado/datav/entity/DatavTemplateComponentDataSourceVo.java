package pers.tornado.datav.entity;

public class DatavTemplateComponentDataSourceVo {

    private int templateID;
    private int index;
    private String data;
    private String dataSourceOptions;
    private String dataSourceType;
    private boolean APISwitch;
    private String APIURL;
    private String APIMethod;
    private int APIInterval;
    private String APIHeader;
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

    public boolean isAPISwitch() {
        return APISwitch;
    }

    public void setAPISwitch(boolean APISwitch) {
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

    public DatavTemplateComponentDataSourceVo() {
    }
}

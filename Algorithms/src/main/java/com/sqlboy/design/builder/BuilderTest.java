package com.sqlboy.design.builder;

public class BuilderTest {
    public static void main(String[] args) {
        new Automobile("2.0T", "双离合", "非独立悬架", null, null, "有电尾门", "有并线辅助");
        new Automobile("2.0T", "双离合", "非独立悬架", null, "有倒车雷达", null, "有并线辅助");
        new Automobile("2.0T", "双离合", "非独立悬架", "ACC", null, null, "有并线辅助");
    }
}

class Automobile {

    /**
     * 发动机
     */
    private String engine;

    /**
     * 变速箱
     */
    private String gearbox;

    /**
     * 底盘悬架
     */
    private String chassisSuspension;

    /**
     * ACC 自适应巡航
     */
    private String acc;

    /**
     * 倒车雷达
     */
    private String reversingRadar;

    /**
     * 电动尾门
     */
    private String electricTailgate;

    /**
     * 变道辅助
     */
    private String laneChangeAssist;

    public Automobile(String engine, String gearbox, String chassisSuspension, String acc, String reversingRadar, String electricTailgate, String laneChangeAssist) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.chassisSuspension = chassisSuspension;
        this.acc = acc;
        this.reversingRadar = reversingRadar;
        this.electricTailgate = electricTailgate;
        this.laneChangeAssist = laneChangeAssist;
    }
}

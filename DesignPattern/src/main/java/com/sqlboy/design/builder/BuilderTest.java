package com.sqlboy.design.builder;

interface Builder {
    void setAcc(String acc);

    void setReversingRadar(String reversingRadar);

    void setElectricTailgate(String electricTailgate);

    void setLaneChangeAssist(String laneChangeAssist);
}

public class BuilderTest {
    public static void main(String[] args) {
//        new Automobile("2.0T", "双离合", "非独立悬架", null, null, "有电尾门", "有并线辅助");
//        new Automobile("2.0T", "双离合", "非独立悬架", null, "有倒车雷达", null, "有并线辅助");
//        new Automobile("2.0T", "双离合", "非独立悬架", "ACC", null, null, "有并线辅助");

        // 指挥者
        AutomobileDirector director = new AutomobileDirector();
        // 具体建造者
        AutomobileBuilder builder1 = new AutomobileBuilder("2.0T", "双离合", "独立悬架");
        AutomobileBuilder builder2 = new AutomobileBuilder("2.0T", "双离合", "独立悬架");
        AutomobileBuilder builder3 = new AutomobileBuilder("2.0T", "双离合", "独立悬架");

        // 建造第一种车型
        director.constructCityCar(builder1);
        Automobile cityCar = builder1.build();
        System.out.println(cityCar);

        // 建造第二种车型
        director.constructSportsCar(builder2);
        Automobile sportsCar = builder2.build();
        System.out.println(sportsCar);

        // 建造第三种车型
        director.constructSUV(builder3);
        Automobile suv = builder3.build();
        System.out.println(suv);

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

    public Automobile(String engine, String gearbox, String chassisSuspension) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.chassisSuspension = chassisSuspension;
    }

    public Automobile(String engine, String gearbox, String chassisSuspension, String acc, String reversingRadar, String electricTailgate, String laneChangeAssist) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.chassisSuspension = chassisSuspension;
        this.acc = acc;
        this.reversingRadar = reversingRadar;
        this.electricTailgate = electricTailgate;
        this.laneChangeAssist = laneChangeAssist;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void setChassisSuspension(String chassisSuspension) {
        this.chassisSuspension = chassisSuspension;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public void setReversingRadar(String reversingRadar) {
        this.reversingRadar = reversingRadar;
    }

    public void setElectricTailgate(String electricTailgate) {
        this.electricTailgate = electricTailgate;
    }

    public void setLaneChangeAssist(String laneChangeAssist) {
        this.laneChangeAssist = laneChangeAssist;
    }

    @Override
    public String toString() {
        return "Automobile{" + "engine='" + engine + '\'' + ", gearbox='" + gearbox + '\'' + ", chassisSuspension='" + chassisSuspension + '\'' + ", acc='" + acc + '\'' + ", reversingRadar='" + reversingRadar + '\'' + ", electricTailgate='" + electricTailgate + '\'' + ", laneChangeAssist='" + laneChangeAssist + '\'' + '}';
    }
}

class AutomobileBuilder implements Builder {

    private Automobile automobile;

    public AutomobileBuilder(String engine, String gearbox, String chassisSuspension) {
        automobile = new Automobile(engine, gearbox, chassisSuspension);
    }

    @Override
    public void setAcc(String acc) {
        automobile.setAcc(acc);
    }

    @Override
    public void setReversingRadar(String reversingRadar) {
        automobile.setReversingRadar(reversingRadar);
    }

    @Override
    public void setElectricTailgate(String electricTailgate) {
        automobile.setElectricTailgate(electricTailgate);
    }

    @Override
    public void setLaneChangeAssist(String laneChangeAssist) {
        automobile.setLaneChangeAssist(laneChangeAssist);
    }

    public Automobile build() {
        return automobile;
    }
}

class AutomobileDirector {
    public void constructSportsCar(Builder builder) {
        builder.setAcc("有ACC");
        builder.setElectricTailgate("有电尾门");
        builder.setLaneChangeAssist("有并线辅助");
        builder.setReversingRadar("有倒车雷达");
    }

    public void constructCityCar(Builder builder) {
        builder.setAcc("有ACC");
        builder.setReversingRadar("有倒车雷达");
    }

    public void constructSUV(Builder builder) {
        builder.setAcc("有ACC");
        builder.setElectricTailgate("有电尾门");
        builder.setLaneChangeAssist("有并线辅助");
    }
}
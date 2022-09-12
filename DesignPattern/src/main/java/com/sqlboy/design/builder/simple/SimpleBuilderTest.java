package com.sqlboy.design.builder.simple;

public class SimpleBuilderTest {
    public static void main(String[] args) {
        Automobile automobile = new Automobile.Builder("2.0T", "双离合", "独立悬架")
                .setAcc("有ACC")
                .setElectricTailgate("有电尾门")
                .setReversingRadar("有倒车雷达")
                .build();

        System.out.println(automobile);
    }
}

class Automobile {
    private String engine;
    private String gearbox;
    private String chassisSuspension;
    private String acc;
    private String reversingRadar;
    private String electricTailgate;
    private String laneChangeAssist;

    private Automobile(Builder builder) {
        this.engine = builder.engine;
        this.gearbox = builder.gearbox;
        this.chassisSuspension = builder.chassisSuspension;
        this.acc = builder.acc;
        this.reversingRadar = builder.reversingRadar;
        this.electricTailgate = builder.electricTailgate;
        this.laneChangeAssist = builder.laneChangeAssist;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "engine='" + engine + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", chassisSuspension='" + chassisSuspension + '\'' +
                ", acc='" + acc + '\'' +
                ", reversingRadar='" + reversingRadar + '\'' +
                ", electricTailgate='" + electricTailgate + '\'' +
                ", laneChangeAssist='" + laneChangeAssist + '\'' +
                '}';
    }

    public static class Builder {
        private String engine;
        private String gearbox;
        private String chassisSuspension;
        private String acc;
        private String reversingRadar;
        private String electricTailgate;
        private String laneChangeAssist;

        public Builder(String engine, String gearbox, String chassisSuspension) {
            this.engine = engine;
            this.gearbox = gearbox;
            this.chassisSuspension = chassisSuspension;
        }

        public Builder setAcc(String acc) {
            this.acc = acc;
            return this;
        }

        public Builder setReversingRadar(String reversingRadar) {
            this.reversingRadar = reversingRadar;
            return this;
        }

        public Builder setElectricTailgate(String electricTailgate) {
            this.electricTailgate = electricTailgate;
            return this;
        }

        public Builder setLaneChangeAssist(String laneChangeAssist) {
            this.laneChangeAssist = laneChangeAssist;
            return this;
        }

        public Automobile build() {
            return new Automobile(this);
        }
    }
}
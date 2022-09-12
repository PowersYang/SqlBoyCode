package com.sqlboy.design.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        StrategyContext strategy = new StrategyContext();

        strategy.backHome(new TaxiStrategy(), 10);
        strategy.backHome(new DidiStrategy(), 10);
        strategy.backHome(new SubwayStrategy(), 10);
        strategy.backHome(new WalkStrategy(), 10);
    }

    public static void backHome(String way, float distance) {
        float fee;
        switch (way) {
            case "taxi":
                // 出租车的起步价为15，超过2公里每公里5块
                if (distance <= 2) {
                    fee = 15;
                } else {
                    fee = (distance - 2) * 5 + 15;
                }
                System.out.println("出租车需要 " + fee + " 元");
                break;
            case "didi":
                // didi的计费方式和出租车一样，但是最近统一优惠10块
                if (distance <= 2) {
                    fee = 15;
                } else {
                    fee = (distance - 2) * 5 + 15 - 10;
                }
                System.out.println("滴滴需要 " + fee + " 元");
                break;
            case "subway":
                fee = (int) (distance / 5) * 2;
                System.out.println("地铁需要 " + fee + " 元");
                break;
            default:
                break;
        }
    }

}

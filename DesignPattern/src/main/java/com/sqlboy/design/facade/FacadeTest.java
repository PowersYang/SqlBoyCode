package com.sqlboy.design.facade;

public class FacadeTest {
    public static void main(String[] args) {
        //        Customer customer = new Customer();
        //        HotelFrontDesk hotelFrontDesk = new HotelFrontDesk();
        //        Chef chef = new Chef();
        //        Cleaner cleaner = new Cleaner();
        //
        //        customer.bookHotel();
        //        hotelFrontDesk.confirmOrder();
        //        customer.register();
        //        customer.enjoy();
        //        chef.cook();
        //        customer.eatBreakfast();
        //        customer.leave();
        //        cleaner.clean();

        Facade facade = new Facade();
        facade.bookHotel();
        facade.customerEnjoy();
        facade.leave();
    }
}

class Facade {

    private Customer customer;
    private HotelFrontDesk hotelFrontDesk;
    private Chef chef;
    private Cleaner cleaner;

    public Facade() {
        this.customer = new Customer();
        this.hotelFrontDesk = new HotelFrontDesk();
        this.chef = new Chef();
        this.cleaner = new Cleaner();
    }

    /**
     * 预订酒店
     */
    public void bookHotel() {
        customer.bookHotel();
        hotelFrontDesk.confirmOrder();
    }

    /**
     * 入住酒店
     */
    public void customerEnjoy() {
        customer.register();
        customer.enjoy();
        chef.cook();
        customer.eatBreakfast();
    }

    /**
     * 顾客离开
     */
    public void leave() {
        customer.leave();
        cleaner.clean();
    }

}

/**
 * 顾客类
 */
class Customer {

    public void bookHotel() {
        System.out.println("顾客预订酒店");
    }

    public void register() {
        System.out.println("在酒店登记，办理入住");
    }

    public void enjoy() {
        System.out.println("顾客入住");
    }

    public void eatBreakfast() {
        System.out.println("顾客吃早餐");
    }

    public void leave() {
        System.out.println("顾客离店");
    }
}

/**
 * 酒店前台类
 */
class HotelFrontDesk {
    public void confirmOrder() {
        System.out.println("酒店前台确认订单");
    }
}

/**
 * 厨师
 */
class Chef {
    public void cook() {
        System.out.println("厨师准备早餐");
    }
}

/**
 * 清洁阿姨
 */
class Cleaner {
    public void clean() {
        System.out.println("清洁阿姨打扫房间");
    }
}




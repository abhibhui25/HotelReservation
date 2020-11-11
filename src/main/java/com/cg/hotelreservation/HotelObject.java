package com.cg.hotelreservation;

public class HotelObject {
    public String hotelName;
    public int rating;
    public int rateWeekdayRegular;
    public int rateWeekendRegular;
    public int rateWeekdayReward;
    public int rateWeekendReward;
    public int totalBill=0;

    public HotelObject(String hotelName, int rate_regular) {
        this.hotelName = hotelName;
        this.rateWeekdayRegular = rate_regular;
    }

    public HotelObject(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Hotel Object "+hotelName+" created";
    }

    public void setWeekendRates(int rateWeekend) {
        this.rateWeekendRegular=rateWeekend;
        System.out.println("Weekend Rates Updated");
    }

    public void addRating(int rating) {
        this.rating=rating;
        System.out.println("Rating "+rating+" stars added.");
    }

    public void addRewardRate(int rateWeekdayReward,int rateWeekendReward) {
        this.rateWeekdayReward=rateWeekdayReward;
        this.rateWeekendReward=rateWeekendReward;
        System.out.println("Reward Weekday/Weekend Rates Updated");
    }

    public int getRating() {
        return (-1)*rating;
    }

    public void display() {
        System.out.println("Hotel Name: "+hotelName);
        System.out.println("Regular Weekday Rate: "+rateWeekdayRegular);
        System.out.println("Regular Weekend Rate: "+rateWeekendRegular);
        System.out.println("Reward Weekday Rate: "+rateWeekdayReward);
        System.out.println("Reward Weekend Rate: "+rateWeekendReward);
        System.out.println();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRateWeekdayRegular() {
        return rateWeekdayRegular;
    }

    public void setRateWeekdayRegular(int rate_regular) {
        this.rateWeekdayRegular = rate_regular;
    }

    public int getTotalBill() {
        return totalBill;
    }
}

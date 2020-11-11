package com.cg.hotelreservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;
public class HotelReservation {

    static Scanner sc=new Scanner(System.in);
    private static ArrayList<HotelObject> hotelList;

    public HotelReservation() {
        hotelList = new ArrayList<HotelObject>();
    }

    public void addToList(HotelObject hotel) {
        hotelList.add(hotel);
    }

    public boolean addHotel(String hotelName, int rateWeekdayRegular) {

        HotelObject hotel = new HotelObject(hotelName,rateWeekdayRegular);
        addToList(hotel);
        return true;
    }

    public static void main( String[] args )
    {
        HotelReservation buildObj = new HotelReservation();
        buildObj.addHotel("Lakewood", 110);
        buildObj.addHotel("Bridgewood", 160);
        buildObj.addHotel("Ridgewood", 220);
        System.out.println( "Welcome to Hotel Reservation Program" );

    }
}

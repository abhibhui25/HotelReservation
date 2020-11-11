package com.cg.hotelreservation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {

    private HotelReservation hotelReservation;

    @Before
    public void init() {
        hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 110);
        hotelReservation.addHotel("Bridgewood", 160);
        hotelReservation.addHotel("Ridgewood", 220);
    }

    //Testing for creation of 3 hotels
    @Test
    public void whenLakewoodAdded_ShouldReturnTrue()
    {
        assertTrue(hotelReservation.addHotel("Lakewood", 110));
    }


}

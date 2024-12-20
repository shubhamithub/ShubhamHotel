package com.phegondev.ShubhamHotel.service.interfac;

import com.phegondev.ShubhamHotel.dto.Response;
import com.phegondev.ShubhamHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}

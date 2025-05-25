package com.example.hotelbookingmanagement.service.interfac;

import com.example.hotelbookingmanagement.dto.Response;
import com.example.hotelbookingmanagement.model.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
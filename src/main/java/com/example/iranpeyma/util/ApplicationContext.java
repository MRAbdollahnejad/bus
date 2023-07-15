package com.example.iranpeyma.util;

import com.example.iranpeyma.repository.CityRepository;
import com.example.iranpeyma.repository.TicketRepository;
import com.example.iranpeyma.repository.TripRepository;
import com.example.iranpeyma.repository.UserRepository;
import com.example.iranpeyma.repository.impl.CityRepositoryImpl;
import com.example.iranpeyma.repository.impl.TicketRepositoryImpl;
import com.example.iranpeyma.repository.impl.TripRepositoryImpl;
import com.example.iranpeyma.repository.impl.UserRepositoryImpl;
import com.example.iranpeyma.service.CityService;
import com.example.iranpeyma.service.TicketService;
import com.example.iranpeyma.service.TripService;
import com.example.iranpeyma.service.UserService;
import com.example.iranpeyma.service.impl.CityServiceImpl;
import com.example.iranpeyma.service.impl.TicketServiceImpl;
import com.example.iranpeyma.service.impl.TripServiceImpl;
import com.example.iranpeyma.service.impl.UserServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ApplicationContext {
    private static final EntityManager em =
            Persistence.createEntityManagerFactory(
                    "default"
            ).createEntityManager();

    private static CityRepository cityRepository;
    private static TicketRepository ticketRepository;
    private static TripRepository tripRepository;
    private static UserRepository userRepository;

    private static CityService cityService;
    private static TicketService ticketService;
    private static TripService tripService;
    private static UserService userService;

    public static CityRepository getCityRepository() {
        if (cityRepository == null) {
            cityRepository = new CityRepositoryImpl(em);
        }
        return cityRepository;
    }
    public static TicketRepository getTicketRepository() {
        if (ticketRepository == null) {
            ticketRepository = new TicketRepositoryImpl(em);
        }
        return ticketRepository;
    }
    public static TripRepository getTripRepository() {
        if (tripRepository == null) {
            tripRepository = new TripRepositoryImpl(em);
        }
        return tripRepository;
    }
    public static UserRepository getUserRepository() {
        if (userRepository == null) {
            userRepository = new UserRepositoryImpl(em);
        }
        return userRepository;
    }

    public static CityService getCityService() {
        if (cityService == null) {
            cityService = new CityServiceImpl(
                    getCityRepository()
            );
        }
        return cityService;
    }
    public static TicketService getTicketService() {
        if (ticketService == null) {
            ticketService = new TicketServiceImpl(
                    getTicketRepository()
            );
        }
        return ticketService;
    }
    public static TripService getTripService() {
        if (tripService == null) {
            tripService = new TripServiceImpl(
                    getTripRepository()
            );
        }
        return tripService;
    }
    public static UserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImpl(
                    getUserRepository()
            );
        }
        return userService;
    }
}

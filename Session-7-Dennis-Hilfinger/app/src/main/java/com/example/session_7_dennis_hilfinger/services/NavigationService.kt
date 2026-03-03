package com.example.session_7_dennis_hilfinger.services

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.session_7_dennis_hilfinger.ui.pages.AboutPage
import com.example.session_7_dennis_hilfinger.ui.pages.AmenitiesPage
import com.example.session_7_dennis_hilfinger.ui.pages.FlightSearch
import com.example.session_7_dennis_hilfinger.ui.pages.SeatReservationPage
import com.example.session_7_dennis_hilfinger.ui.pages.StartPage

@Composable
fun NavigationApp(context: Context, modifier: Modifier) {
    val navController = rememberNavController();
    NavHost(
        navController = navController,
        startDestination = StartPageRoute,
        modifier = modifier
    ) {
        composable<StartPageRoute> {
            StartPage(
                onNavigateToFlightSearch = {navController.navigate(FlightSearchRoute)},
                onNavigateToSeatReservation = {navController.navigate(SeatReservationRoute)},
                onNavigateToAmenities = {navController.navigate(AmenitiesRoute)},
                onNavigateToAbout = {navController.navigate(AboutRoute)}
            )
        }

        composable<FlightSearchRoute> {
            FlightSearch()
        }
        composable<SeatReservationRoute> {
            SeatReservationPage()
        }
        composable<AmenitiesRoute> {
            AmenitiesPage()
        }
        composable<AboutRoute> {
            AboutPage()
        }
    }


}
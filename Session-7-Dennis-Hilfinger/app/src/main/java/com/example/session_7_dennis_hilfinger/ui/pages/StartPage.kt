package com.example.session_7_dennis_hilfinger.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun StartPage(onNavigateToFlightSearch: () -> Unit,
             onNavigateToSeatReservation: () -> Unit,
             onNavigateToAmenities: () -> Unit,
             onNavigateToAbout: () -> Unit) {
    Column() {
        Button(
            onClick = {onNavigateToFlightSearch()}
        ) {
            Text("Flight Search")
        }
        Button(
                onClick = {onNavigateToSeatReservation()}
                ) {
            Text("Seat Reservation")
        }
        Button(
            onClick = {onNavigateToAmenities()}
        ) {
            Text("Amenities List")
        }
        Button(
            onClick = {onNavigateToAbout()}
        ) {
            Text("About Airline")
        }
    }
}
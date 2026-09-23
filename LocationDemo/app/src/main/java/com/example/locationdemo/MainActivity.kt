package com.example.locationdemo

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import android.os.Bundle
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
// Exercise 1: Uncomment below import statement (after adding play-services-location)
// import com.google.android.gms.location.*
// Exercise 2: Uncomment below import statements (after adding play-services-maps)
// import com.google.android.gms.maps.CameraUpdateFactory
// import com.google.android.gms.maps.GoogleMap
// import com.google.android.gms.maps.SupportMapFragment
// import com.google.android.gms.maps.model.LatLng
// import com.google.android.gms.maps.model.PolylineOptions

class MainActivity : AppCompatActivity() {

    private lateinit var locationTextView: TextView
    // Exercise 2: Uncomment below fields once the imports above are enabled
    // private var mMap: GoogleMap? = null
    // private val pathPoints = mutableListOf<LatLng>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
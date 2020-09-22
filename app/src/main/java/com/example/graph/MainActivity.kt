package com.example.graph

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val series = LineGraphSeries(arrayOf<DataPoint>(
                DataPoint(0.0, 1.0),
                DataPoint(1.0, 5.0),
                DataPoint(2.0, 3.0),
                DataPoint(7.0, 4.0),
                DataPoint(13.0,15.0),
                DataPoint(19.0, 21.0),
                DataPoint(27.0, 29.0)
        ))

        graph.addSeries(series)

        graph.getViewport().setScalable(true);
        graph.getViewport().setScrollable(true);

        val datapoints = Array<DataPoint>(5, {DataPoint(it.toDouble(), 2.0*it.toDouble())})
        //graph.addSeries(LineGraphSeries<DataPoint>(datapoints))

    }
}
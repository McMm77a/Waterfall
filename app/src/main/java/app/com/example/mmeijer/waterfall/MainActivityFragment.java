package app.com.example.mmeijer.waterfall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String[] forecastArray = {
          "Today - Sunny - 88/63",
          "Today - Sunny - 88/63",
          "Today - Sunny - 88/63",
          "Today - Sunny - 88/63",
          "Today - Sunny - 88/63",
          "Today - Sunny - 88/63",
          "Today - Sunny - 88/63"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}

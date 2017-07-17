package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
    ArrayList<Info> infos;
    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = (ListView) findViewById(R.id.listViewInfo);
        infos = new ArrayList<Info>();

        caInfo = new CustomAdapter(this, R.layout.employee_row, infos);
        lvInfo.setAdapter(caInfo);

        Info item1 = new Info("John", "Software Technical Leader", 3400);
        infos.add(item1);

        Info item2 = new Info("May", "Programmer", 2200);
        infos.add(item2);
    }
}

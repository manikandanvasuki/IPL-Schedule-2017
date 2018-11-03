package mahisarashyu.iplschedule21century;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class scheduleActivity extends ListFragment {

    String[] Matches;//={"Ramachandran","Ramachandran"};
    String[] venue;//={"vasuki"," vasuki"};
    String[] Match_date;

    //int[] image={R.drawable.mumbai_indians, R.drawable.delhi_daredevils};
    int[] Left_image={R.drawable.srh, R.drawable.rps, R.drawable.gl, R.drawable.kxip, R.drawable.rcb, R.drawable.srh, R.drawable.mi, R.drawable.kxip, R.drawable.rps, R.drawable.mi, R.drawable.kkr, R.drawable.rcb, R.drawable.gl, R.drawable.kkr, R.drawable.dd, R.drawable.mi, R.drawable.rcb,R.drawable.dd, R.drawable.srh, R.drawable.gl, R.drawable.srh, R.drawable.kxip, R.drawable.kkr, R.drawable.rps, R.drawable.mi, R.drawable.gl, R.drawable.kkr, R.drawable.mi, R.drawable.rcb, R.drawable.rps , R.drawable.rcb, R.drawable.kkr, R.drawable.kxip, R.drawable.rps, R.drawable.gl, R.drawable.kxip, R.drawable.srh, R.drawable.mi, R.drawable.rps, R.drawable.dd, R.drawable.kkr, R.drawable.dd, R.drawable.rcb, R.drawable.srh, R.drawable.dd, R.drawable.rcb, R.drawable.kxip, R.drawable.srh, R.drawable.kxip, R.drawable.gl, R.drawable.mi, R.drawable.dd, R.drawable.gl, R.drawable.kkr, R.drawable.rps, R.drawable.dd, R.drawable.tbd, R.drawable.tbd, R.drawable.tbd, R.drawable.tbd };
    int[] Right_image={R.drawable.rcb, R.drawable.mi, R.drawable.kkr, R.drawable.rps, R.drawable.dd, R.drawable.gl, R.drawable.kkr, R.drawable.rcb, R.drawable.dd, R.drawable.srh, R.drawable.kxip, R.drawable.mi, R.drawable.rps, R.drawable.srh, R.drawable.kxip, R.drawable.gl, R.drawable.rps, R.drawable.kkr, R.drawable.kxip, R.drawable.rcb, R.drawable.dd, R.drawable.mi, R.drawable.gl, R.drawable.srh, R.drawable.dd, R.drawable.kxip, R.drawable.rcb, R.drawable.rps, R.drawable.srh, R.drawable.kkr, R.drawable.gl, R.drawable.dd, R.drawable.srh, R.drawable.rcb, R.drawable.mi, R.drawable.dd, R.drawable.kkr, R.drawable.rcb, R.drawable.gl, R.drawable.srh, R.drawable.rps, R.drawable.gl, R.drawable.kxip, R.drawable.rps, R.drawable.mi, R.drawable.kkr, R.drawable.gl, R.drawable.mi, R.drawable.kkr, R.drawable.dd, R.drawable.kxip, R.drawable.rps, R.drawable.srh, R.drawable.mi, R.drawable.kxip, R.drawable.rcb, R.drawable.tbd, R.drawable.tbd, R.drawable.tbd, R.drawable.tbd};
    SimpleAdapter adapter;

    ArrayList<HashMap<String, String>> data= new ArrayList<HashMap<String, String>>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstacneState) {

        HashMap<String, String> map= new HashMap<String, String>();

        Resources res=getResources();
        Matches = res.getStringArray(R.array.matches);
        venue = res.getStringArray(R.array.venue);
        Match_date = res.getStringArray(R.array.match_date);

        for(int i=0;i<Matches.length;i++){
            map= new HashMap<String, String>();
            //map.put("Matches", Matches[i]);
            //map.put("Images", Integer.toString(image[i]));
            //map.put("venue", venue[i]);
            map.put("Left_Image", Integer.toString(Left_image[i]));
            map.put("Matches", Matches[i]);
            map.put("Match_date", Match_date[i]);
            map.put("Venue", venue[i]);
            map.put("Right_Image", Integer.toString(Right_image[i]));
            data.add(map);
        }

        String[] from={"Left_Image","Matches","Match_date","Venue","Right_Image"};
        int[] to={R.id.left_image_view,R.id.matches_text_view, R.id.match_date_text_view, R.id.venue_text_view,R.id.right_image_view};

        adapter = new SimpleAdapter(getActivity(), data, R.layout.schedule_activity, from, to);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, saveInstacneState);
    }

    @Override
    public void onStart() {
        super.onStart();
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),data.get(position).get("Venue"), Toast.LENGTH_SHORT).show();
                //Intent i= new Intent(getActivity(), testActivity.class);
                //startActivity(i);
            }
        });
    }
}

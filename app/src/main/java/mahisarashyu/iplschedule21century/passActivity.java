package mahisarashyu.iplschedule21century;


import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by Manikandan R on 2/26/2017.
 */

public class passActivity extends ListFragment {


    //int[] delhi_value={0,2,4,6,8};
    //int[] pune_value={1,2,3};
    int[] delhi_value={4,8,14,17,20,24,31,35,39,41,44,49,51,55};
    int[] pune_value={1,3,8,12,16,23,27,29,33,38,40,43,51,54};
    int[] mumbai_value={1,6,9,11,15,21,24,27,34,37,44,47,50,53};
    int[] kolkata_value={2,6,10,13,17,22,26,29,31,36,40,45,48,53};
    int[] hyderabad_value={0,5,9,13,18,20,23,28,32,36,39,43,47,52};
    int[] bangalore_value={0,4,7,11,16,19,26,28,30,33,37,42,45,55};
    int[] punjab_value={3,7,10,14,18,21,25,32,35,42,46,48,50,54};
    int[] gujarat_value={2,5,12,15,19,22,25,30,34,38,41,46,49,52};

    String passValue;

    Context context;
    public void setPassValue(String passValue) {
        this.passValue = passValue;
    }

    public String getPassValue() {

        return passValue;
    }

    String[] Matches;//={"Ramachandran","Ramachandran"};
    String[] venue;//={"vasuki"," vasuki"};
    String[] Match_date;


    //int[] image={R.drawable.mumbai_indians, R.drawable.delhi_daredevils};
    int[] Left_image={R.drawable.srh, R.drawable.rps, R.drawable.gl, R.drawable.kxip, R.drawable.rcb, R.drawable.srh, R.drawable.mi, R.drawable.kxip, R.drawable.rps, R.drawable.mi, R.drawable.kkr, R.drawable.rcb, R.drawable.gl, R.drawable.kkr, R.drawable.dd, R.drawable.mi, R.drawable.rcb,R.drawable.dd, R.drawable.srh, R.drawable.gl, R.drawable.srh, R.drawable.kxip, R.drawable.kkr, R.drawable.rps, R.drawable.mi, R.drawable.gl, R.drawable.kkr, R.drawable.mi, R.drawable.rcb, R.drawable.rps , R.drawable.rcb, R.drawable.kkr, R.drawable.kxip, R.drawable.rps, R.drawable.gl, R.drawable.kxip, R.drawable.srh, R.drawable.mi, R.drawable.rps, R.drawable.dd, R.drawable.kkr, R.drawable.dd, R.drawable.rcb, R.drawable.srh, R.drawable.dd, R.drawable.rcb, R.drawable.kxip, R.drawable.srh, R.drawable.kxip, R.drawable.gl, R.drawable.mi, R.drawable.dd, R.drawable.gl, R.drawable.kkr, R.drawable.rps, R.drawable.dd  };
    int[] Right_image={R.drawable.rcb, R.drawable.mi, R.drawable.kkr, R.drawable.rps, R.drawable.dd, R.drawable.gl, R.drawable.kkr, R.drawable.rcb, R.drawable.dd, R.drawable.srh, R.drawable.kxip, R.drawable.mi, R.drawable.rps, R.drawable.srh, R.drawable.kxip, R.drawable.gl, R.drawable.rps, R.drawable.kkr, R.drawable.kxip, R.drawable.rcb, R.drawable.dd, R.drawable.mi, R.drawable.gl, R.drawable.srh, R.drawable.dd, R.drawable.kxip, R.drawable.rcb, R.drawable.rps, R.drawable.srh, R.drawable.kkr, R.drawable.gl, R.drawable.dd, R.drawable.srh, R.drawable.rcb, R.drawable.mi, R.drawable.dd, R.drawable.kkr, R.drawable.rcb, R.drawable.gl, R.drawable.srh, R.drawable.rps, R.drawable.gl, R.drawable.kxip, R.drawable.rps, R.drawable.mi, R.drawable.kkr, R.drawable.gl, R.drawable.mi, R.drawable.kkr, R.drawable.dd, R.drawable.kxip, R.drawable.rps, R.drawable.srh, R.drawable.mi, R.drawable.kxip, R.drawable.rcb};
    SimpleAdapter adapter;

    ArrayList<HashMap<String, String>> data= new ArrayList<HashMap<String, String>>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstacneState) {

        HashMap<String, String> map= new HashMap<String, String>();
        data.clear();

        Resources res=getResources();
        Matches = res.getStringArray(R.array.matches);
        venue = res.getStringArray(R.array.venue);
        Match_date = res.getStringArray(R.array.match_date);

        String team_name;//=getPassValue();
        String delhi_team="Delhi";
        String pune_team="Pune";
        String mumbai_team="Mumbai";
        String kolkata_team="Kolkata";
        String hyderabad_team="Hyderabad";
        String bangalore_team="Bangalore";
        String punjab_team="Punjab";
        String gujarat_team="Gujarat";

        //boolean a=team_name.equals(delhi_team);

        //if(team_name.compareTo(delhi_team) == 0)

        SharedPreferences sharedpreferences1 = getActivity().getSharedPreferences(exactTeam.MyPREFERENCES, 0);
        String xxx = sharedpreferences1.getString("teamName", "");
        Log.v("madhaaan",xxx);

        team_name=xxx;

        if(team_name.equalsIgnoreCase(delhi_team))
        {
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<delhi_value.length;j++)
                {
                    if(i == delhi_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
        }
        else if(team_name.equalsIgnoreCase(pune_team)){
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<pune_value.length;j++)
                {
                    if(i == pune_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
        }
        else if(team_name.equalsIgnoreCase(bangalore_team)){
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<bangalore_value.length;j++)
                {
                    if(i == bangalore_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
        }
        else if(team_name.equalsIgnoreCase(punjab_team)){
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<punjab_value.length;j++)
                {
                    if(i == punjab_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
        }
        else if(team_name.equalsIgnoreCase(gujarat_team)){
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<gujarat_value.length;j++)
                {
                    if(i == gujarat_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
        }
        else if(team_name.equalsIgnoreCase(hyderabad_team)){
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<hyderabad_value.length;j++)
                {
                    if(i == hyderabad_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
        }
        else if(team_name.equalsIgnoreCase(mumbai_team)){
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<mumbai_value.length;j++)
                {
                    if(i == mumbai_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
        }
        else if(team_name.equalsIgnoreCase(kolkata_team)){
            for(int i=0;i<Matches.length;i++){

                for(int j=0;j<kolkata_value.length;j++)
                {
                    if(i == kolkata_value[j])
                    {
                        map= new HashMap<String, String>();
                        map.put("Left_Image", Integer.toString(Left_image[i]));
                        map.put("Matches", Matches[i]);
                        map.put("Match_date", Match_date[i]);
                        map.put("Venue", venue[i]);
                        map.put("Right_Image", Integer.toString(Right_image[i]));
                        data.add(map);
                    }
                }

            }
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
                //Toast.makeText(getActivity(),data.get(position).get("Venue"), Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(),getPassValue(),Toast.LENGTH_SHORT).show();
                //Intent i= new Intent(getActivity(), testActivity.class);
                //startActivity(i);
            }
        });
    }
}

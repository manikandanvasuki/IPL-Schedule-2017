package mahisarashyu.iplschedule21century;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class TeamDetails extends Fragment {

    String team_name;
    private AdView mAdMobAdView;
    private AdView mAdMobAdView_foot;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle saveInstacneState) {

        SharedPreferences sharedpreferences1 = getActivity().getSharedPreferences(exactTeam.MyPREFERENCES, 0);
        team_name = sharedpreferences1.getString("teamName", "");

        View rootview = inflater.inflate(R.layout.activity_team_details, container, false);

        mAdMobAdView = (AdView) rootview.findViewById(R.id.admob_adview_head);
        AdRequest adRequest = new AdRequest.Builder()
               .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
               .addTestDevice("574199C5F2808D4C0328F88E982E40D5")// Add your real device id here
                .build();
        mAdMobAdView.loadAd(adRequest);

        mAdMobAdView_foot = (AdView) rootview.findViewById(R.id.admob_adview_footer);
        AdRequest adRequestfoot = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("574199C5F2808D4C0328F88E982E40D5")// Add your real device id here
                .build();
        mAdMobAdView_foot.loadAd(adRequestfoot);

        ImageView imgvw = (ImageView) rootview.findViewById(R.id.details_imageview);
        TextView ownertxtvw=(TextView) rootview.findViewById(R.id.owner_circle);
        TextView captaintxtvw=(TextView) rootview.findViewById(R.id.captain_circle);
        TextView wintxtvw=(TextView) rootview.findViewById(R.id.win_circle);
        TextView hightottxtvw=(TextView) rootview.findViewById(R.id.highest_total);
        TextView lowtottxtvw=(TextView) rootview.findViewById(R.id.lowest_total);
        TextView mostrunstxtvw=(TextView) rootview.findViewById(R.id.most_runs);
        TextView mostwicktxtvw=(TextView) rootview.findViewById(R.id.most_wickets);
        TextView htotopptxtvw=(TextView) rootview.findViewById(R.id.highest_total_oppn);
        TextView ltotopptxtvw=(TextView) rootview.findViewById(R.id.lowest_total_oppn);
        TextView bestperipltxtvw=(TextView) rootview.findViewById(R.id.best_performance);

        Resources res=getResources();

        String pune=res.getString(R.string.pune_team);
        String mumbai="mumbai";
        String delhi="delhi";
        String bangalore="bangalore";
        String gujarat="gujarat";
        String hyderabad="hyderabad";
        String kolkata="kolkata";
        String punjab="punjab";

        Log.v("details", pune);

        if(team_name.equalsIgnoreCase(pune)){
            imgvw.setImageResource(R.drawable.rps_team);
            ownertxtvw.setText("Sanjiv Goenka Group");
            captaintxtvw.setText("Steve Smith");
            wintxtvw.setText("35.71%");
            hightottxtvw.setText("195/3 vs Gujarat Lions");
            lowtottxtvw.setText("133/8 vs Sunrisers Hyderabad");
            mostrunstxtvw.setText("MS Dhoni - 3272");
            mostwicktxtvw.setText("R Ashwin - 100");
            htotopptxtvw.setText("196/7 by Gujarat Lions");
            ltotopptxtvw.setText("118/10 by Sunrisers Hyderabad");
            bestperipltxtvw.setText("7th Place - 2016");

        }


        else if(team_name.equalsIgnoreCase(mumbai))
        {
            imgvw.setImageResource(R.drawable.mi_team);
            ownertxtvw.setText("Reliance Industries");
            captaintxtvw.setText("Rohit Sharma");
            wintxtvw.setText("56.73%");
            hightottxtvw.setText("218/7 vs Delhi Daredevils");
            lowtottxtvw.setText("87/10 vs Kings XI Punjab");
            mostrunstxtvw.setText("Rohit Sharma - 3874");
            mostwicktxtvw.setText("Malinga - 143");
            htotopptxtvw.setText("235/2 by  Royal Challengers Bangalore");
            ltotopptxtvw.setText("67/10 by Kolkata Knight Riders");
            bestperipltxtvw.setText("Champions - 2013, 2015");
        }

        else if(team_name.equalsIgnoreCase(gujarat))
        {
            imgvw.setImageResource(R.drawable.gl_team);
            ownertxtvw.setText("Intex Technologies");
            captaintxtvw.setText("Suresh Raina");
            wintxtvw.setText("56.25%");
            hightottxtvw.setText("196/7 vs Rising Pune Supergaints");
            lowtottxtvw.setText("104/10 vs Royal Challengers Bangalore");
            mostrunstxtvw.setText("Suresh Raina - 4098");
            mostwicktxtvw.setText("Dwayne Bravo - 122");
            htotopptxtvw.setText("248/3 by Royal Challengers Bangalore");
            ltotopptxtvw.setText("124/8 by Kolkata Knight Riders");
            bestperipltxtvw.setText("Playoffs - 2016");
        }

        else if(team_name.equalsIgnoreCase(kolkata))
        {
            imgvw.setImageResource(R.drawable.kkr_team);
            ownertxtvw.setText("SR Khan, J.Chawla, J.Mehta");
            captaintxtvw.setText("Gautam Gambhir");
            wintxtvw.setText("52.67%");
            hightottxtvw.setText("222/3 vs Royal Challengers Bangalore");
            lowtottxtvw.setText("67/10 vs Mumbai Indians ");
            mostrunstxtvw.setText("Gautam Gambhir - 3635");
            mostwicktxtvw.setText("Piyush Chawla - 120");
            htotopptxtvw.setText("204/2 by Kings XI Punjab");
            ltotopptxtvw.setText("81/10 by Rajasthan Royals");
            bestperipltxtvw.setText("Champions - 2012, 2014");
        }

        else if(team_name.equalsIgnoreCase(delhi))
        {
            imgvw.setImageResource(R.drawable.dd_team);
            ownertxtvw.setText("GMR Group");
            captaintxtvw.setText("Zaheer Khan");
            wintxtvw.setText("43.12%");
            hightottxtvw.setText("231/4 vs Kings XI Punjab");
            lowtottxtvw.setText("80/10 vs Sunrisers Hyderabad");
            mostrunstxtvw.setText("JP Duminy - 1993");
            mostwicktxtvw.setText("Amit Mishra - 124");
            htotopptxtvw.setText("225/5 by Chennai Super Kings");
            ltotopptxtvw.setText("92/10 by Mumbai Indians");
            bestperipltxtvw.setText("Playoffs - 2008, 2009, 2012");
        }

        else if(team_name.equalsIgnoreCase(bangalore))
        {
            imgvw.setImageResource(R.drawable.rcb);
            ownertxtvw.setText("United Spirits");
            captaintxtvw.setText("Virat Kohli");
            wintxtvw.setText("51.47%");
            hightottxtvw.setText("263/5 vs Pune Warriors India");
            lowtottxtvw.setText("70/10 vs Rajasthan Royals");
            mostrunstxtvw.setText("Virat Kohli - 4110");
            mostwicktxtvw.setText("Shane Watson - 81");
            htotopptxtvw.setText("232/2 by Kings XI Punjab");
            ltotopptxtvw.setText("58/10 by Rajasthan Royals");
            bestperipltxtvw.setText("Runners up - 2009, 2011, 2016");
        }

        else if(team_name.equalsIgnoreCase(hyderabad))
        {
            imgvw.setImageResource(R.drawable.srh_team);
            ownertxtvw.setText("Sun Network");
            captaintxtvw.setText("David Warner");
            wintxtvw.setText("51.69%");
            hightottxtvw.setText("208/7 vs Royal Challengers Bangalore");
            lowtottxtvw.setText("113/10 vs Mumbai Indians");
            mostrunstxtvw.setText("David warner - 3373");
            mostwicktxtvw.setText("Ashish Nehra - 98");
            htotopptxtvw.setText("227/4 by  Royal Challengers Bangalore");
            ltotopptxtvw.setText("80/10  Delhi Daredevils");
            bestperipltxtvw.setText("Champions - 2016");
        }

        else if(team_name.equalsIgnoreCase(punjab))
        {
            imgvw.setImageResource(R.drawable.kxip_team);
            ownertxtvw.setText("KPH Dream Cricket");
            captaintxtvw.setText("Glenn Maxwell");
            wintxtvw.setText("46.26%");
            hightottxtvw.setText("232/2 vs Royal Challengers Bangalore");
            lowtottxtvw.setText("88/10 vs Royal Challengers Bangalore");
            mostrunstxtvw.setText("Murali Vijay - 2511");
            mostwicktxtvw.setText("Mohit Sharma - 70");
            htotopptxtvw.setText("240/5 by Chennai Super Kings");
            ltotopptxtvw.setText("87/10 by Mumbai Indians");
            bestperipltxtvw.setText("Runners up - 2014");
        }

        return rootview;
    }
}
package mahisarashyu.iplschedule21century;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Manikandan R on 3/9/2017.
 */

public class Bestxi extends ListFragment {

    int[] delhi_value={8,0,2,7,13,12,14,25,16,17,18};
    int[] pune_value={1,2,0,5,6,10,9,12,17,18,19};
    int[] mumbai_value={0,2,1,7,14,11,12,19,24,18,20};
    int[] kolkata_value={0,7,1,3,10,11,12,13,19,17,20};
    int[] hyderabad_value={0,1,12,6,9,5,8,7,14,16,17};
    int[] bangalore_value={2,0,1,9,3,7,10,11,13,20,16};
    int[] punjab_value={0,10,12,2,8,4,13,14,19,21,24};
    int[] gujarat_value={2,1,0,13,11,14,10,8,20,15,17};


    String[] pricePlayers_temp;;// = {"500 Cr", "200 Cr"};
    String[] namePlayers_temp;//,namePlayers; // = {"Pandya", "Pandya"};
    int[] imgPlayers_temp={R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya,R.drawable.krunal_pandya};
    String[] runPlayers_temp;// = {"1000", "2000"};
    String[] bestPlayers_temp;// = {"120", "110"};
    String[] strikeratePlayers_temp;// = {"30", "20"};
    String[] wicketPlayers_temp;// = {"30", "20"};
    String[] bestrightPlayers_temp;// = {"30", "10"};
    String[] econPlayers_temp;// = {"30", "2.3"};

    String[] namePlayers;
    int[] imgPlayers;
    String[] pricePlayers;
    String[] runPlayers;
    String[] bestPlayers;//=new St
    String[] strikeratePlayers;//=
    String[] wicketPlayers;//=new
    String[] bestrightPlayers;//=n
    String[] econPlayers;//=new St

    ListView lv;

    String team_name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstacneState) {


        View rootview = inflater.inflate(R.layout.dialog, container, false);

        SharedPreferences sharedpreferences1 = getActivity().getSharedPreferences(exactTeam.MyPREFERENCES, 0);
        team_name = sharedpreferences1.getString("teamName", "");

        String mumbai_team="mumbai";
        String delhi_team="delhi";
        String pune_team="pune";
        String bangalore_team="bangalore";
        String gujarat_team="gujarat";
        String hyderabad_team="hyderabad";
        String kolkata_team="kolkata";
        String punjab_team="punjab";


        Resources res=getResources();

        if(team_name.equalsIgnoreCase(mumbai_team))
        {
            namePlayers_temp = res.getStringArray(R.array.mumbaiAll);
            pricePlayers_temp = res.getStringArray(R.array.mumbaiPrice);
            runPlayers_temp = res.getStringArray(R.array.mumbaiRuns);
            bestPlayers_temp = res.getStringArray(R.array.mumbaiHighestScore);
            strikeratePlayers_temp= res.getStringArray(R.array.mumbaiStrikeRate);
            wicketPlayers_temp= res.getStringArray(R.array.mumbaiWickets);
            bestrightPlayers_temp= res.getStringArray(R.array.mumbaiBestBowl);
            econPlayers_temp= res.getStringArray(R.array.mumbaiEconomy);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<mumbai_value.length;j++)
                    {
                        if(i == mumbai_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else if(team_name.equalsIgnoreCase(delhi_team)){
            namePlayers_temp = res.getStringArray(R.array.allPlayersNameDelhi);
            pricePlayers_temp = res.getStringArray(R.array.allPlayersPriceDelhi);
            runPlayers_temp = res.getStringArray(R.array.allPlayersRunsDelhi);
            bestPlayers_temp = res.getStringArray(R.array.allPlayersRunsBestDelhi);
            strikeratePlayers_temp= res.getStringArray(R.array.allPlayersStrikeRateDelhi);
            wicketPlayers_temp= res.getStringArray(R.array.allPlayersWicketsDelhi);
            bestrightPlayers_temp= res.getStringArray(R.array.allPlayersBowlBestDelhi);
            econPlayers_temp= res.getStringArray(R.array.allPlayersEcoRateDelhi);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<delhi_value.length;j++)
                    {
                        if(i == delhi_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else if(team_name.equalsIgnoreCase(pune_team)){
            namePlayers_temp = res.getStringArray(R.array.puneAll);
            pricePlayers_temp = res.getStringArray(R.array.punePrice);
            runPlayers_temp = res.getStringArray(R.array.puneRuns);
            bestPlayers_temp = res.getStringArray(R.array.puneHighestScore);
            strikeratePlayers_temp= res.getStringArray(R.array.puneStrikeRate);
            wicketPlayers_temp= res.getStringArray(R.array.puneWickets);
            bestrightPlayers_temp= res.getStringArray(R.array.puneBestBowl);
            econPlayers_temp= res.getStringArray(R.array.puneEconomy);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<pune_value.length;j++)
                    {
                        if(i == pune_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else if(team_name.equalsIgnoreCase(bangalore_team)){
            namePlayers_temp = res.getStringArray(R.array.bangaloreAll);
            pricePlayers_temp = res.getStringArray(R.array.bangalorePrice);
            runPlayers_temp = res.getStringArray(R.array.bangaloreRuns);
            bestPlayers_temp = res.getStringArray(R.array.bangaloreHighestScore);
            strikeratePlayers_temp= res.getStringArray(R.array.bangaloreStrikeRate);
            wicketPlayers_temp= res.getStringArray(R.array.bangaloreWickets);
            bestrightPlayers_temp= res.getStringArray(R.array.bangaloreBestBowl);
            econPlayers_temp= res.getStringArray(R.array.bangaloreEconomy);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<bangalore_value.length;j++)
                    {
                        if(i == bangalore_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else if(team_name.equalsIgnoreCase(gujarat_team)){
            namePlayers_temp = res.getStringArray(R.array.gujaratAll);
            pricePlayers_temp = res.getStringArray(R.array.gujaratPrice);
            runPlayers_temp = res.getStringArray(R.array.gujaratRuns);
            bestPlayers_temp = res.getStringArray(R.array.gujaratHighestScore);
            strikeratePlayers_temp= res.getStringArray(R.array.gujaratStrikeRate);
            wicketPlayers_temp= res.getStringArray(R.array.gujaratWickets);
            bestrightPlayers_temp= res.getStringArray(R.array.gujaratBestBowl);
            econPlayers_temp= res.getStringArray(R.array.gujaratEconomy);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<gujarat_value.length;j++)
                    {
                        if(i == gujarat_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else if(team_name.equalsIgnoreCase(hyderabad_team)){
            namePlayers_temp = res.getStringArray(R.array.hyderabadAll);
            pricePlayers_temp = res.getStringArray(R.array.hyderabadPrice);
            runPlayers_temp = res.getStringArray(R.array.hyderabadRuns);
            bestPlayers_temp = res.getStringArray(R.array.hyderabadHighestScore);
            strikeratePlayers_temp= res.getStringArray(R.array.hyderabadStrikeRate);
            wicketPlayers_temp= res.getStringArray(R.array.hyderabadWickets);
            bestrightPlayers_temp= res.getStringArray(R.array.hyderabadBestBowl);
            econPlayers_temp= res.getStringArray(R.array.hyderabadEconomy);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<hyderabad_value.length;j++)
                    {
                        if(i == hyderabad_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else if(team_name.equalsIgnoreCase(kolkata_team)){
            namePlayers_temp = res.getStringArray(R.array.kolkataAll);
            pricePlayers_temp = res.getStringArray(R.array.kolkataPrice);
            runPlayers_temp = res.getStringArray(R.array.kolkataRuns);
            bestPlayers_temp = res.getStringArray(R.array.kolkataHighestScore);
            strikeratePlayers_temp= res.getStringArray(R.array.kolkataStrikeRate);
            wicketPlayers_temp= res.getStringArray(R.array.kolkataWickets);
            bestrightPlayers_temp= res.getStringArray(R.array.kolkataBestBowl);
            econPlayers_temp= res.getStringArray(R.array.kolkataEconomy);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<kolkata_value.length;j++)
                    {
                        if(i == kolkata_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else if(team_name.equalsIgnoreCase(punjab_team)){
            namePlayers_temp = res.getStringArray(R.array.punjabAll);
            pricePlayers_temp = res.getStringArray(R.array.punjabPrice);
            runPlayers_temp = res.getStringArray(R.array.punjabRuns);
            bestPlayers_temp = res.getStringArray(R.array.punjabHighestScore);
            strikeratePlayers_temp= res.getStringArray(R.array.punjabStrikeRate);
            wicketPlayers_temp= res.getStringArray(R.array.punjabWickets);
            bestrightPlayers_temp= res.getStringArray(R.array.punjabBestBowl);
            econPlayers_temp= res.getStringArray(R.array.punjabEconomy);

            String[] test_pricePlayers=new String[11];
            String[] test_namePlayers=new String[11];
            int[] test_imgPlayers=new int[11];
            String[] test_runPlayers=new String[11];
            String[] test_bestPlayers=new String[11];
            String[] test_strikeratePlayers=new String[11];
            String[] test_wicketPlayers=new String[11];
            String[] test_bestrightPlayers=new String[11];
            String[] test_econPlayers=new String[11];

            {
                for(int i=0;i<namePlayers_temp.length;i++){

                    for(int j=0;j<punjab_value.length;j++)
                    {
                        if(i == punjab_value[j])
                        {

                            test_namePlayers[j]=namePlayers_temp[i];
                            test_pricePlayers[j]=pricePlayers_temp[i];
                            test_imgPlayers[j]=imgPlayers_temp[i];
                            test_runPlayers[j]=runPlayers_temp[i];
                            test_bestPlayers[j]=bestPlayers_temp[i];
                            test_strikeratePlayers[j]=strikeratePlayers_temp[i];
                            test_wicketPlayers[j]=wicketPlayers_temp[i];
                            test_bestrightPlayers[j]=bestrightPlayers_temp[i];
                            test_econPlayers[j]=econPlayers_temp[i];


                        }
                    }

                }
            }

            namePlayers=test_namePlayers;
            pricePlayers=test_pricePlayers;
            imgPlayers=test_imgPlayers;
            runPlayers=test_runPlayers;
            bestPlayers=test_bestPlayers;
            strikeratePlayers=test_strikeratePlayers;
            wicketPlayers=test_wicketPlayers;
            bestrightPlayers=test_bestrightPlayers;
            econPlayers=test_econPlayers;


        }

        else
        {
            namePlayers=namePlayers_temp;
            pricePlayers=pricePlayers_temp;
            imgPlayers=imgPlayers_temp;
            runPlayers=runPlayers_temp;
            bestPlayers=bestPlayers_temp;
            strikeratePlayers=strikeratePlayers_temp;
            wicketPlayers=wicketPlayers_temp;
            bestrightPlayers=bestrightPlayers_temp;
            econPlayers=econPlayers_temp;
        }

        lv = (ListView) rootview.findViewById(R.id.list_view);
        playerAdapter playeradapter = new playerAdapter(getActivity(), pricePlayers, imgPlayers, namePlayers, runPlayers, bestPlayers, strikeratePlayers, wicketPlayers, bestrightPlayers, econPlayers);
        lv.setAdapter(playeradapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Toast.makeText(getActivity(), namePlayers[position], Toast.LENGTH_SHORT).show();

            }
        });

        return rootview;

    }
}




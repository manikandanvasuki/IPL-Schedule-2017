package mahisarashyu.iplschedule21century;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class exactTeam extends AppCompatActivity {

    passActivity tm1;
    public static final String MyPREFERENCES = "MyIplTeams" ;
    //String team_name1 = getIntent().getStringExtra("key");

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exact_team);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);




        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exact_team, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            //String team_name1 = getIntent().getStringExtra("key");
            switch (position){
                case 0:
                    String team_name1 = getIntent().getStringExtra("key");
                    //passActivity tm1;

                    SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString("teamName", team_name1);
                    editor.commit();

                    TeamDetails tmdtl=new TeamDetails();
                    //String team_name = getIntent().getStringExtra("key");
                    //int team_name=getIntent().getIntExtra("key");
                    //currentTeam ctm=new currentTeam();
                    //ctm.setPassValue(team_name);
                    return tmdtl;
                case 1:
                    String team_name2 = getIntent().getStringExtra("key");
                    ////passActivity tm1;
//
                    //SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                    //SharedPreferences.Editor editor = sharedpreferences.edit();
                    //editor.putString("teamName", team_name1);
                    //editor.commit();

                    //SharedPreferences sharedpreferences1 = getSharedPreferences(exactTeam.MyPREFERENCES, 0);
                    //String xx = sharedpreferences.getString("teamName", "");
                    //Log.v("madhan",xx);

                    if(tm1==null)
                    {tm1=new passActivity();}
                    tm1.setPassValue(team_name2);
                    //Log.v("mani", team_name1);
                    return tm1;
                case 2:
                    players player=new players();
                    return player;
                case 3:
                    Bestxi top=new Bestxi();
                    return top;
                case 4:
                    Batsman bts=new Batsman();
                    return bts;
                case 5:
                    Bowler bwl=new Bowler();
                    return bwl;
                case 6:
                    Wicketkeeper wkpr=new Wicketkeeper();
                    return wkpr;
                case 7:
                    Allrounder allround=new Allrounder();
                    return allround;
                case 8:
                    Coach ch=new Coach();
                    return ch;
                case 9:
                    disclaimer disclaim=new disclaimer();
                    return disclaim;

                default:
                    return null;

            }
        }

        @Override
        public int getCount() {
            // Show 10 total pages.
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    String Teamname = getIntent().getStringExtra("key");
                    //Log.v("key",s);
                    return Teamname;
                case 1:
                    return "Matches";
                case 2:
                    return "All Players";
                case 3:
                    return "Best XI";
                case 4:
                    return "Batsman";
                case 5:
                    return "Bowler";
                case 6:
                    return "Wicket Keeper";
                case 7:
                    return "All Rounder";
                case 8:
                    return "Coach";
                case 9:
                    return "Disclaimer";

            }
            return null;
        }
    }
}

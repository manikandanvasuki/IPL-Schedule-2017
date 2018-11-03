package mahisarashyu.iplschedule21century;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class teamActivity extends Fragment {

    private AdView mAdMobAdView;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle saveInstacneState) {
        View rootview = inflater.inflate(R.layout.team_activity, container, false);

        mAdMobAdView = (AdView) rootview.findViewById(R.id.admob_adview);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("574199C5F2808D4C0328F88E982E40D5")// Add your real device id here
                .build();
        mAdMobAdView.loadAd(adRequest);

        TextView dtv=(TextView) rootview.findViewById(R.id.Delhi);
        dtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Feroz Shah Kotla, Delhi", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","delhi");
                startActivity(it);
            }
        });

        TextView ptv=(TextView) rootview.findViewById(R.id.Punjab);
        ptv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"PCA IS Bindra Stadium, Mohali \n Holkar Stadium, Indore", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","punjab");
                startActivity(it);
            }
        });

        TextView gtv=(TextView) rootview.findViewById(R.id.Gujrat);
        gtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Saurashtra Cricket Association Stadium, Rajkot \n Green Park Stadium, Kanpur", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","gujarat");
                startActivity(it);
            }
        });

        TextView htv=(TextView) rootview.findViewById(R.id.Hyderabad);
        htv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Rajiv Gandhi International Cricket Stadium, Hyderabad", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","hyderabad");
                startActivity(it);
            }
        });

        TextView btv=(TextView) rootview.findViewById(R.id.Bangalore);
        btv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"M. Chinnaswamy Stadium, Bangalore", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","bangalore");
                startActivity(it);
            }
        });

        TextView mtv=(TextView) rootview.findViewById(R.id.Mumbai);
        mtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Wankhede Stadium, Mumbai", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","mumbai");
                startActivity(it);
            }
        });

        TextView pntv=(TextView) rootview.findViewById(R.id.Pune);
        pntv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Maharashtra Cricket Association Stadium, Pune", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","pune");
                startActivity(it);
            }
        });

        TextView ktv=(TextView) rootview.findViewById(R.id.Kolkata);
        ktv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Eden Gardens, Kolkata", Toast.LENGTH_LONG).show();
                //Toast.makeText(v.getContext(),"Delhi", Toast.LENGTH_SHORT).show();
                Intent it= new Intent(getActivity(), exactTeam.class);
                it.putExtra("key","kolkata");
                startActivity(it);
            }
        });

        return rootview;
    }


}





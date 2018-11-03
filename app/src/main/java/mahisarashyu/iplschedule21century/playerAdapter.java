package mahisarashyu.iplschedule21century;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Manikandan R on 2/23/2017.
 */

public class playerAdapter extends ArrayAdapter<String> {

    Context c;
    //String[] players;
    //int[] images;
    String[] pricePlayers;
    int[] imgPlayers;
    String[] namePlayers;
    String[] runPlayers;
    String[] bestPlayers;
    String[] strikeratePlayers;
    String[] wicketPlayers;
    String[] bestrightPlayers;
    String[] econPlayers;

    LayoutInflater inflater;

    //public playerAdapter(Context contxt, String[] players, int[] images){
    public playerAdapter(Context contxt, String[] pricePlayers, int[] imgPlayers, String[] namePlayers, String[] runPlayers, String[] bestPlayers, String[] strikeratePlayers,String[] wicketPlayers,String[] bestrightPlayers, String[] econPlayers){
        super(contxt,R.layout.players,pricePlayers);

        this.c=contxt;
        //this.players=players;
        //this.images=images;
        this.pricePlayers=pricePlayers;
        this.imgPlayers=imgPlayers;
        this.namePlayers=namePlayers;
        this.runPlayers=runPlayers;
        this.bestPlayers=bestPlayers;
        this.strikeratePlayers=strikeratePlayers;
        this.wicketPlayers=wicketPlayers;
        this.bestrightPlayers=bestrightPlayers;
        this.econPlayers=econPlayers;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.players, null);
        }

        TextView pricetext=(TextView) convertView.findViewById(R.id.players_price_text_view);
        ImageView imageview1=(ImageView) convertView.findViewById(R.id.players_img);
        TextView nametext=(TextView) convertView.findViewById(R.id.player_name);
        TextView lefttext1=(TextView) convertView.findViewById(R.id.player_lefttext1);
        TextView lefttext2=(TextView) convertView.findViewById(R.id.player_lefttext2);
        TextView lefttext3=(TextView) convertView.findViewById(R.id.player_lefttext3);
        TextView righttext1=(TextView) convertView.findViewById(R.id.player_righttext1);
        TextView righttext2=(TextView) convertView.findViewById(R.id.player_righttext2);
        TextView righttext3=(TextView) convertView.findViewById(R.id.player_righttext3);

       // textview1.setText(players[position]);
        //imageview1.setImageResource(images[position]);

        pricetext.setText(pricePlayers[position]);
        imageview1.setImageResource(imgPlayers[position]);
        nametext.setText(namePlayers[position]);
        lefttext1.setText("Runs : "+runPlayers[position]);
        lefttext2.setText("Best : "+bestPlayers[position]);
        lefttext3.setText("Strike Rate : "+strikeratePlayers[position]);
        righttext1.setText("Wicket : "+wicketPlayers[position]);
        righttext2.setText("Best : "+bestrightPlayers[position]);
        righttext3.setText("Econ : "+econPlayers[position]);

        return convertView;
    }
}

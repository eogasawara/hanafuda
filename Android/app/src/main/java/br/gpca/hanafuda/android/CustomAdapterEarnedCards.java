package br.gpca.hanafuda.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import br.gpca.hanafuda.kernel.Card;

public class CustomAdapterEarnedCards extends ArrayAdapter<Card> {

    /*
     * Used to instantiate layout XML file into its corresponding View objects
     */
    private final LayoutInflater inflater;

    /*
     * each list item layout ID
     */
    private final int resourceId;

    public CustomAdapterEarnedCards(Context context, int resource, ArrayList<Card> objects) {
        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //get the card from position
        Card card = getItem(position);

        // get a new View no matter recycling or ViewHolder FIXME
        convertView = inflater.inflate(resourceId, parent, false);

        //get all object from view image
        int valor = card.getID();
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        //size of image in screen
        switch (image.getLayoutParams().height) {//Params in px
            case 200://=40dp xxxhdpi
                image.getLayoutParams().height = 140;
                image.getLayoutParams().width = 140;
                break;
            case 150://=50dp xxhdpi
                image.getLayoutParams().height = 100;
                image.getLayoutParams().width = 100;
                break;
            case 120://=40dp xxhdpi
                image.getLayoutParams().height = 80;
                image.getLayoutParams().width = 80;
            case 100://=50dp xhdpi
                image.getLayoutParams().height = 60;
                image.getLayoutParams().width = 60;
                break;
            case 90:
                image.getLayoutParams().height = 80;
                image.getLayoutParams().width = 80;
                break;
            case 80://40 dp xhdpi
                image.getLayoutParams().height = 70;
                image.getLayoutParams().width = 70;
                break;
            case 70:
                image.getLayoutParams().height = 60;
                image.getLayoutParams().width = 60;
                break;
            case 60://=40dp hdpi
                image.getLayoutParams().height = 50;
                image.getLayoutParams().width = 50;
                break;
            case 50:
                image.getLayoutParams().height = 40;
                image.getLayoutParams().width = 40;
                break;
            case 40://=40dp mdpi
                image.getLayoutParams().height = 30;
                image.getLayoutParams().width = 30;
                break;
            case 30://=40dp ldpi
                image.getLayoutParams().height = 20;
                image.getLayoutParams().width = 20;
                break;
        }

        //image cards
        switch (valor) {
            case 0:
                image.setImageResource(R.drawable.card0);
                break;
            case 1:
                image.setImageResource(R.drawable.card1);
                break;
            case 2:
                image.setImageResource(R.drawable.card2);
                break;
            case 3:
                image.setImageResource(R.drawable.card3);
                break;
            case 4:
                image.setImageResource(R.drawable.card4);
                break;
            case 5:
                image.setImageResource(R.drawable.card5);
                break;
            case 6:
                image.setImageResource(R.drawable.card6);
                break;
            case 7:
                image.setImageResource(R.drawable.card7);
                break;
            case 8:
                image.setImageResource(R.drawable.card8);
                break;
            case 9:
                image.setImageResource(R.drawable.card9);
                break;
            case 10:
                image.setImageResource(R.drawable.card10);
                break;
            case 11:
                image.setImageResource(R.drawable.card11);
                break;
            case 12:
                image.setImageResource(R.drawable.card12);
                break;
            case 13:
                image.setImageResource(R.drawable.card13);
                break;
            case 14:
                image.setImageResource(R.drawable.card14);
                break;
            case 15:
                image.setImageResource(R.drawable.card15);
                break;
            case 16:
                image.setImageResource(R.drawable.card16);
                break;
            case 17:
                image.setImageResource(R.drawable.card17);
                break;
            case 18:
                image.setImageResource(R.drawable.card18);
                break;
            case 19:
                image.setImageResource(R.drawable.card19);
                break;
            case 20:
                image.setImageResource(R.drawable.card20);
                break;
            case 21:
                image.setImageResource(R.drawable.card21);
                break;
            case 22:
                image.setImageResource(R.drawable.card22);
                break;
            case 23:
                image.setImageResource(R.drawable.card23);
                break;
            case 24:
                image.setImageResource(R.drawable.card24);
                break;
            case 25:
                image.setImageResource(R.drawable.card25);
                break;
            case 26:
                image.setImageResource(R.drawable.card26);
                break;
            case 27:
                image.setImageResource(R.drawable.card27);
                break;
            case 28:
                image.setImageResource(R.drawable.card28);
                break;
            case 29:
                image.setImageResource(R.drawable.card29);
                break;
            case 30:
                image.setImageResource(R.drawable.card30);
                break;
            case 31:
                image.setImageResource(R.drawable.card31);
                break;
            case 32:
                image.setImageResource(R.drawable.card32);
                break;
            case 33:
                image.setImageResource(R.drawable.card33);
                break;
            case 34:
                image.setImageResource(R.drawable.card34);
                break;
            case 35:
                image.setImageResource(R.drawable.card35);
                break;
            case 36:
                image.setImageResource(R.drawable.card36);
                break;
            case 37:
                image.setImageResource(R.drawable.card37);
                break;
            case 38:
                image.setImageResource(R.drawable.card38);
                break;
            case 39:
                image.setImageResource(R.drawable.card39);
                break;
            case 40:
                image.setImageResource(R.drawable.card40);
                break;
            case 41:
                image.setImageResource(R.drawable.card41);
                break;
            case 42:
                image.setImageResource(R.drawable.card42);
                break;
            case 43:
                image.setImageResource(R.drawable.card43);
                break;
            case 44:
                image.setImageResource(R.drawable.card44);
                break;
            case 45:
                image.setImageResource(R.drawable.card45);
                break;
            case 46:
                image.setImageResource(R.drawable.card46);
                break;
            case 47:
                image.setImageResource(R.drawable.card47);
                break;
        }


        return convertView;
    }
}

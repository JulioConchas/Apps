package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jc.moviles_2_1.R;

public class page_fragment extends Fragment{
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_page_fragment,container,false);
        textView = (TextView)view.findViewById(R.id.textView);
        Bundle bundle = getArguments();
        switch(bundle.getInt("count")){
            case 1:
                view = inflater.inflate(R.layout.fragment_semestre_one_f,container,false);
                //textView.setText("Primer Semetre");
                break;
            case 2:
                view = inflater.inflate(R.layout.fragment_semestre_two,container,false);
                //textView.setText("Segundo Semestre");
                break;
            case 3:
                view = inflater.inflate(R.layout.fragment_semestre_three,container,false);
                //textView.setText("Tercer Semestre");
                break;
            case 4:
                textView.setText("Cuarto Semestre");
                break;
            case 5:
                textView.setText("Quinto Semestre");
                break;
            case 6:
                textView.setText("Sexto Semestre");
                break;
            case 7:
                textView.setText("Septimo Semestre");
                break;
            case 8:
                textView.setText("Octavo Semestre");
                break;
            case 9:
                textView.setText("Noveno Semestre");
                break;
        }
        //String message = Integer.toString(bundle.getInt("count"));
        //
        return view;
    }

}

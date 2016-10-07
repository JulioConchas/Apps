package layout;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jc.moviles_2_1.DB;
import com.example.jc.moviles_2_1.R;


public class encabezado extends Fragment {
    private TextView tv_name,tv_degree;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_encabezado,container,false);
        tv_name = (TextView)view.findViewById(R.id.tv_name);
        tv_degree = (TextView)view.findViewById(R.id.tv_degree);
        return view;
    }

}

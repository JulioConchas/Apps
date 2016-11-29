package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jc.moviles_3.R;

/**
 * Author: Julio Conchas
 * Email: conchasjimenez@gmail.com
 */
public class Login extends Fragment{
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment_login,container,false);
            return view;
        }
    }



package j.e.c.navigationmvvm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

public class ChooseReciverFragment extends Fragment {

Button btn1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_choose_reciver,container,false);

        return view;

    }


    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn1 = view.findViewById(R.id.send);
        final EditText amountTv = (EditText) getView().findViewById(R.id.edt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

      String text = amountTv.getText().toString().trim();


                NavDirections action = ChooseReciverFragmentDirections.actionChooseReciverFragmentToSendreciverFragment(text);
                Navigation.findNavController(view).navigate(action);


            }
        });
    }
}

package mx.edu.isc.tesoem.eduarx.p2p5_7s21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    Button btnp1, btnp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnp1=findViewById(R.id.button2);
        btnp2=findViewById(R.id.button3);

        Fragment funo = new PrimeroFragment();
        Fragment fdos = new  SegundoFragment();


        btnp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                f1.replace(R.id.fragmentContainerView,funo).commit();
            }
        });
        btnp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f2 = getSupportFragmentManager().beginTransaction();
                f2.replace(R.id.fragmentContainerView,fdos).commit();
            }
        });
    }
}
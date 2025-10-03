package ph.me.domek_w_gorach;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView polubienia;
    Button plus;
    Button minus;
    private int licznik = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        polubienia=findViewById(R.id.textView2);
        plus=findViewById(R.id.button2);
        minus=findViewById(R.id.button3);

        if(savedInstanceState!=null){
            licznik = savedInstanceState.getInt("PUNKTY");
            polubienia.setText(String.valueOf(licznik+" Polubień"));
        }

        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        licznik++;
                        polubienia.setText(String.valueOf(licznik+" Polubień"));
                    }
                }
        );
        minus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (licznik>0){
                            licznik--;
                            polubienia.setText(String.valueOf(licznik+" Polubień"));
                        }
                    }
                }
        );
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("PUNKTY", licznik);
    }
}
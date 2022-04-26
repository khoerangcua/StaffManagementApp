package dangbao.st.ueh.edu.vn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

import com.mikhaellopez.circularimageview.CircularImageView;

public class HomeActivity extends AppCompatActivity {

CircularImageView avatarCircularImageView;
Button diemDanhButton;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        avatarCircularImageView = findViewById(R.id.avatarCircularImageView);
        diemDanhButton = findViewById(R.id.diemdanhbutton);
        avatarCircularImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AccountSettingActivity.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeActionContentDescription(R.drawable.backarrow);
        diemDanhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QRCheckActivity.class);
                startActivity(intent);
            }
        });

    }
}
package dangbao.st.ueh.edu.vn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class AccountSettingActivity extends AppCompatActivity {

    AccountInfor accountInfor;
    AccountPass accountPass;
    Button accountInforButton;
    Button accountPassButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);
        accountInfor = new AccountInfor();
        accountPass = new AccountPass();
        accountInforButton = findViewById(R.id.accountInForButton);
        accountPassButton = findViewById(R.id.accountPassButton);
        accountInforButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(accountInfor);
            }
        });
        accountPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(accountPass);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.constraint_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
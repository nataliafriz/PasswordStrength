package cl.desafiolatam.passwordstrength;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import cl.desafiolatam.passwordstrength.databinding.ActivityMainBinding;
import cl.desafiolatam.passwordstrength.presenters.IPresenterView;
import cl.desafiolatam.passwordstrength.presenters.Presenter;

public class MainActivity extends AppCompatActivity implements IPresenterView {
    public ActivityMainBinding binding;
    private Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        presenter = new Presenter(this);
        binding.editTextTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                  presenter.evaluatePass(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void showWeak() {
        binding.textView.setText(R.string.weak);
        binding.textView.setBackgroundColor(Color.RED);
    }

    @Override
    public void showMedium() {
        binding.textView.setText(R.string.medium);
        binding.textView.setBackgroundColor(Color.YELLOW);

    }

    @Override
    public void showStrong() {
        binding.textView.setText(R.string.strong);
        binding.textView.setBackgroundColor(Color.GREEN);

    }
}
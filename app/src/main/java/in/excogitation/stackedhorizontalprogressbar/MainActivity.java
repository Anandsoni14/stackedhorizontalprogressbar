package in.excogitation.stackedhorizontalprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import in.excogitation.lib.StackedHorizontalProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int primary_pts = 4;
        int secondary_pts = 3;
        int max = 10;

        StackedHorizontalProgressBar stackedHorizontalProgressBar;
        stackedHorizontalProgressBar = (StackedHorizontalProgressBar) findViewById(R.id.stackedhorizontalprogressbar);
        stackedHorizontalProgressBar.setMax(max);
        stackedHorizontalProgressBar.setProgress(primary_pts);
        stackedHorizontalProgressBar.setSecondaryProgress(primary_pts + secondary_pts);
    }
}

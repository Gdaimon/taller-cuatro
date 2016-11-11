package gdaimon.list.firebase.app.com.taller_cuatro;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

	private  static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
	@BindView( R.id.btnMapa )
	Button btnMapa;
	@BindView( R.id.btnSalir )
	Button btnSalir;
	@BindView( R.id.btnCamara )
	Button btnCamara;
	@BindView( R.id.activity_main )
	RelativeLayout activityMain;

	@Override
	protected void onCreate ( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
		ButterKnife.bind( this );
	}


	@OnClick(R.id.btnMapa)
	public void verMapa(View view) {
		Intent intent = new Intent( this, MapsActivity.class);
		startActivity(intent);
	}

	@OnClick(R.id.btnSalir)
	public void salirApp(View view){
	finish();
	}

	@OnClick(R.id.btnCamara)
	public void activarCamara(View view){
		Intent intent = new Intent( MediaStore.ACTION_IMAGE_CAPTURE);
// start the image capture Intent
		startActivityForResult( intent,  CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
	}

}

package com.sourabh.imagepinchzoom;


import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
	Matrix matrix = new Matrix();
	Matrix savedMatrix = new Matrix();
	PointF startPoint = new PointF();
	PointF midPoint = new PointF();
	float oldDist = 1f;
	static final int NONE = 0;
	static final int DRAG = 1;
	static final int ZOOM = 2;
	int mode = NONE;
	ZoomImageView ZoomImageView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ZoomImageView = (ZoomImageView) findViewById(R.id.zoomimg);
		Bitmap bitmapImage = BitmapFactory.decodeResource(
				getApplicationContext().getResources(), R.drawable.image);
		ZoomImageView.setImageBitmap(bitmapImage);

	}


}

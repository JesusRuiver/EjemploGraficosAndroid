package comunicacionactividades.examples.org.ejemplograficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EjemploGraficosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }

    public class EjemploView extends View {
        public EjemploView(Context context) {
            super(context);
        }

        private void dibujarFigura(int numeroLado, int ancho, Canvas canvas) {
            int xi, yi, xf, yf;

            xf = canvas.getWidth() / 2;
            yf = canvas.getHeight() / 2;

            yi = yf;
            xi = xf - ancho / 2;

            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);

            xf = xi +10;
            yf = yi;

            canvas.drawLine(xi,yi,xf,xf, pincel);



        }

        private void dibujaFigura2 (Canvas canvas){
            Paint pincel = new Paint();
            Path trazo = new Path();

            trazo.moveTo(50,100);
            trazo.lineTo(100,100);
            trazo.lineTo(100,200);
            trazo.lineTo(200,200);
            trazo.lineTo(200,100);
            trazo.lineTo(100,100);

            canvas.drawColor(Color.BLUE);
            canvas.drawPath(trazo,pincel);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Path trazo = new Path();
            //trazo.addCircle(getWidth()/2, getHeight()/2, 100, Path.Direction.CCW);
            trazo.moveTo(50,100);
            trazo.cubicTo(60,70,150,90,200,110);
            trazo.lineTo(300,200);


            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            //canvas.drawCircle(150, 150, 100, pincel);
            canvas.drawPath(trazo, pincel);

            pincel.setStrokeWidth(1);
            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Desarrollo de aplicaciones para moviles con Android", trazo, 10, 40, pincel);


            Paint pincelRojo = new Paint(); //Mejor generar dos pinceles en vez de uno
            pincelRojo.setColor(Color.RED);

            canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, 50, pincelRojo);


            //pincel.setColor(Color.argb(127,255,0,0));
            //pincel.setColor(0x7FFF0000);
            /*pincel.setColor(getResources().getColor(R.color.color_circulo));
            canvas.drawCircle(150, 250, 100, pincel);*/


        }
    }
}

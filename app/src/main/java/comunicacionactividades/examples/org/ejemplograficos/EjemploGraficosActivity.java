package comunicacionactividades.examples.org.ejemplograficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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

            
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(150, 150, 100, pincel);


            Paint pincelRojo = new Paint(); //Mejor generar dos pinceles en vez de uno
            pincelRojo.setColor(Color.RED);

            canvas.drawCircle(75, 75, 50, pincelRojo);


            //pincel.setColor(Color.argb(127,255,0,0));
            //pincel.setColor(0x7FFF0000);
            pincel.setColor(getResources().getColor(R.color.color_circulo));
            canvas.drawCircle(150, 250, 100, pincel);


        }
    }
}

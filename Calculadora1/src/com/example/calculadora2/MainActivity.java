package com.example.calculadora2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	
	double operador1=0, operador2=0, resultado=0;
	int operacion=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//obtener valor de los botones
		//0
		Button button0=(Button) findViewById(R.id.btn0);
		button0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_cero();
			}
		});
		
		
		//1
		Button button1=(Button) findViewById(R.id.btn1);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_uno();
			}
		});
		
		
		//2
		Button button2=(Button) findViewById(R.id.btn2);
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_dos();
			}
		});
		
		
		
		//3
		Button button3=(Button) findViewById(R.id.btn3);
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_tres();
			}
		});
		
		
		//4
		Button button4=(Button) findViewById(R.id.btn4);
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_cuatro();
			}
		});
		
		
		//5
		Button button5=(Button) findViewById(R.id.btn5);
		button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_cinco();
			}
		});
		
		
		
		//6
		Button button6=(Button) findViewById(R.id.btn6);
		button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_seis();
			}
		});
		
		
		
		//7
		Button button7=(Button) findViewById(R.id.btn7);
		button7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_siete();
			}
		});
		
		
		//8
		Button button8=(Button) findViewById(R.id.btn8);
		button8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_ocho();
			}
		});
		
		
		//9
		Button button9=(Button) findViewById(R.id.btn9);
		button9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_nueve();
			}
		});
		
		Button buttonpto=(Button) findViewById(R.id.btnpto);
		buttonpto.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_pto();
			}
		});
		
		
		//suma
		Button buttonsuma=(Button) findViewById(R.id.btnsuma);
		buttonsuma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_suma();
			}
		});
		
		
		Button buttonresta=(Button) findViewById(R.id.btnresta);
		buttonresta.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_resta();
			}
		});
		
		Button buttonmult=(Button) findViewById(R.id.btnmultiplicacion);
		buttonmult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_mult();
			}
		});
		
		Button buttondiv=(Button) findViewById(R.id.btndivision);
		buttondiv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_div();
			}
		});
		
		Button buttonres=(Button) findViewById(R.id.btnresultado);
		buttonres.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_igual();
			}
		});
		
		
		Button buttonborrar=(Button) findViewById(R.id.btnborrar);
		buttonborrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				button_borrar();
			}
		});
		// termino de botones
	}
	
	
	public void button_borrar()
	{
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		txt_r.invalidate();
		txt_r.setText("0");
		operador1=0;
		operador2=0;
		resultado=0;
		operacion=0;
		
	}
	
	
	
	
	
	//metodos de botones
	public void button_cero(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==false)
		{
			numero=numero+"0";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_uno(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="1";
		}
		else
		{
			numero=numero+"1";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_dos(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="2";
		}
		else
		{
			numero=numero+"2";
		}
		txt_r.setText(numero.toString());
	}
	
	public void button_tres(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="3";
		}
		else
		{
			numero=numero+"3";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_cuatro(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="4";
		}
		else
		{
			numero=numero+"4";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_cinco(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="5";
		}
		else
		{
			numero=numero+"5";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_seis(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="6";
		}
		else
		{
			numero=numero+"6";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_siete(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="7";
		}
		else
		{
			numero=numero+"7";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_ocho(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			txt_r.setText(" ");
			numero="8";
		}
		else
		{
			numero=numero+"8";
		}
		txt_r.setText(numero.toString());
	}
	
	
	public void button_nueve(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero="9";
		}
		else
		{
			numero=numero+"9";
		}
		txt_r.setText(numero.toString());
	}
	
	public void button_pto(){
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		if(numero.equalsIgnoreCase("0")==true)
		{
			numero=".";
		}
		else
		{
			numero=numero+".";
		}
		txt_r.setText(numero.toString());
	}
	//termino de metodos
	
	
	
	//metodo para obtener y parsear los numeros
	public void button_suma()
	{
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		operador1=Double.parseDouble(numero);
		operacion=1;
		numero="0";
		txt_r.setText(numero);
		
	}
	
	public void button_resta()
	{
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		operador1=Double.parseDouble(numero);
		operacion=2;
		numero="0";
		txt_r.setText(numero);
		
	}
	
	public void button_mult()
	{
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		operador1=Double.parseDouble(numero);
		operacion=3;
		numero="0";
		txt_r.setText(numero);
		
	}
	
	public void button_div()
	{
		
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		operador1=Double.parseDouble(numero);
		operacion=1;
		numero="4";
		txt_r.setText(numero);
		
	}//final de los metodos de obtencion y parseo
	
	
	
	
	
	//metodo boton que da el resultado
	public void button_igual()
	{
		EditText txt_r=(EditText) findViewById(R.id.txtresultado);
		String numero=txt_r.getText().toString();
		operador2=Double.parseDouble(numero);
		switch(operacion){
		case 1: resultado=(operador1 + operador2);
		break;
		case 2: resultado=(operador1 - operador2);
		break;
		case 3: resultado=(operador1 * operador2);
		break;
		case 4: resultado=(operador1 / operador2);
		break;
		}
		
		numero=String.valueOf(resultado);
		operacion=0;
		txt_r.setText(numero);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

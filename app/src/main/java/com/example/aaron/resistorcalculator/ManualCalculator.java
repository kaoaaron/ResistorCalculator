package com.example.aaron.resistorcalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ManualCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualcalculator);

        final Button band1 = (Button)findViewById(R.id.band1);
        final Button band2 = (Button)findViewById(R.id.band2);
        final Button band3 = (Button)findViewById(R.id.band3);
        final Button band4 = (Button)findViewById(R.id.band4);
        final Button band5 = (Button)findViewById(R.id.band5);
        final Button band6 = (Button)findViewById(R.id.band6);
        final Button band7 = (Button)findViewById(R.id.band7);

        final Button four = (Button)findViewById(R.id.fourband);
        final Button five = (Button)findViewById(R.id.fiveband);
        final Button six = (Button)findViewById(R.id.sixband);

        four.setBackgroundResource(android.R.drawable.btn_default);
        six.setBackgroundResource(android.R.drawable.btn_default);
        five.setBackgroundColor(0xFF00FF00);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                four.setBackgroundColor(0xFF00FF00);
                five.setBackgroundResource(android.R.drawable.btn_default);
                six.setBackgroundResource(android.R.drawable.btn_default);
                band5.setVisibility(View.GONE);
                band6.setVisibility(View.GONE);
                band7.setVisibility(View.GONE);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                four.setBackgroundResource(android.R.drawable.btn_default);
                five.setBackgroundColor(0xFF00FF00);
                six.setBackgroundResource(android.R.drawable.btn_default);
                band5.setVisibility(View.GONE);
                band6.setVisibility(View.GONE);
                band7.setVisibility(View.VISIBLE);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                four.setBackgroundResource(android.R.drawable.btn_default);
                five.setBackgroundResource(android.R.drawable.btn_default);
                six.setBackgroundColor(0xFF00FF00);
                band5.setVisibility(View.VISIBLE);
                band6.setVisibility(View.VISIBLE);
                band7.setVisibility(View.GONE);
            }
        });

        band1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),band1);
                popup.getMenuInflater().inflate(R.menu.bandmenu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch((String)item.getTitle()){
                            case "Black":
                                band1.setBackgroundColor(Color.BLACK);
                                break;

                            case "Brown":
                                band1.setBackgroundColor(getResources().getColor(R.color.Brown));
                                break;

                            case "Red":
                                band1.setBackgroundColor(Color.RED);
                                break;

                            case "Orange":
                                band1.setBackgroundColor(getResources().getColor(R.color.Orange));
                                break;

                            case "Yellow":
                                band1.setBackgroundColor(Color.YELLOW);
                                break;

                            case "Green":
                                band1.setBackgroundColor(Color.GREEN);
                                break;

                            case "Blue":
                                band1.setBackgroundColor(Color.BLUE);
                                break;

                            case "Violet":
                                band1.setBackgroundColor(Color.MAGENTA);
                                break;

                            case "Grey":
                                band1.setBackgroundColor(Color.GRAY);
                                break;

                            case "White":
                                band1.setBackgroundColor(Color.WHITE);
                                break;

                            case "Gold":
                                band1.setBackgroundColor(getResources().getColor(R.color.Gold));
                                break;

                            case "Silver":
                                band1.setBackgroundColor(getResources().getColor(R.color.Silver));
                                break;

                        }
                        return true;
                    }
                });

                popup.show();
            }
        });

        band2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),band2);
                popup.getMenuInflater().inflate(R.menu.bandmenu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch((String)item.getTitle()){
                            case "Black":
                                band2.setBackgroundColor(Color.BLACK);
                                break;

                            case "Brown":
                                band2.setBackgroundColor(getResources().getColor(R.color.Brown));
                                break;

                            case "Red":
                                band2.setBackgroundColor(Color.RED);
                                break;

                            case "Orange":
                                band2.setBackgroundColor(getResources().getColor(R.color.Orange));
                                break;

                            case "Yellow":
                                band2.setBackgroundColor(Color.YELLOW);
                                break;

                            case "Green":
                                band2.setBackgroundColor(Color.GREEN);
                                break;

                            case "Blue":
                                band2.setBackgroundColor(Color.BLUE);
                                break;

                            case "Violet":
                                band2.setBackgroundColor(Color.MAGENTA);
                                break;

                            case "Grey":
                                band2.setBackgroundColor(Color.GRAY);
                                break;

                            case "White":
                                band2.setBackgroundColor(Color.WHITE);
                                break;

                            case "Gold":
                                band2.setBackgroundColor(getResources().getColor(R.color.Gold));
                                break;

                            case "Silver":
                                band2.setBackgroundColor(getResources().getColor(R.color.Silver));
                                break;

                        }
                        return true;
                    }
                });

                popup.show();
            }
        });

        band3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),band3);
                popup.getMenuInflater().inflate(R.menu.bandmenu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch((String)item.getTitle()){
                            case "Black":
                                band3.setBackgroundColor(Color.BLACK);
                                break;

                            case "Brown":
                                band3.setBackgroundColor(getResources().getColor(R.color.Brown));
                                break;

                            case "Red":
                                band3.setBackgroundColor(Color.RED);
                                break;

                            case "Orange":
                                band3.setBackgroundColor(getResources().getColor(R.color.Orange));
                                break;

                            case "Yellow":
                                band3.setBackgroundColor(Color.YELLOW);
                                break;

                            case "Green":
                                band3.setBackgroundColor(Color.GREEN);
                                break;

                            case "Blue":
                                band3.setBackgroundColor(Color.BLUE);
                                break;

                            case "Violet":
                                band3.setBackgroundColor(Color.MAGENTA);
                                break;

                            case "Grey":
                                band3.setBackgroundColor(Color.GRAY);
                                break;

                            case "White":
                                band3.setBackgroundColor(Color.WHITE);
                                break;

                            case "Gold":
                                band3.setBackgroundColor(getResources().getColor(R.color.Gold));
                                break;

                            case "Silver":
                                band3.setBackgroundColor(getResources().getColor(R.color.Silver));
                                break;

                        }
                        return true;
                    }
                });

                popup.show();
            }
        });

        band4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),band4);
                popup.getMenuInflater().inflate(R.menu.bandmenu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch((String)item.getTitle()){
                            case "Black":
                                band4.setBackgroundColor(Color.BLACK);
                                break;

                            case "Brown":
                                band4.setBackgroundColor(getResources().getColor(R.color.Brown));
                                break;

                            case "Red":
                                band4.setBackgroundColor(Color.RED);
                                break;

                            case "Orange":
                                band4.setBackgroundColor(getResources().getColor(R.color.Orange));
                                break;

                            case "Yellow":
                                band4.setBackgroundColor(Color.YELLOW);
                                break;

                            case "Green":
                                band4.setBackgroundColor(Color.GREEN);
                                break;

                            case "Blue":
                                band4.setBackgroundColor(Color.BLUE);
                                break;

                            case "Violet":
                                band4.setBackgroundColor(Color.MAGENTA);
                                break;

                            case "Grey":
                                band4.setBackgroundColor(Color.GRAY);
                                break;

                            case "White":
                                band4.setBackgroundColor(Color.WHITE);
                                break;

                            case "Gold":
                                band4.setBackgroundColor(getResources().getColor(R.color.Gold));
                                break;

                            case "Silver":
                                band4.setBackgroundColor(getResources().getColor(R.color.Silver));
                                break;

                        }
                        return true;
                    }
                });

                popup.show();
            }
        });

        band5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),band5);
                popup.getMenuInflater().inflate(R.menu.bandmenu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch((String)item.getTitle()){
                            case "Black":
                                band5.setBackgroundColor(Color.BLACK);
                                break;

                            case "Brown":
                                band5.setBackgroundColor(getResources().getColor(R.color.Brown));
                                break;

                            case "Red":
                                band5.setBackgroundColor(Color.RED);
                                break;

                            case "Orange":
                                band5.setBackgroundColor(getResources().getColor(R.color.Orange));
                                break;

                            case "Yellow":
                                band5.setBackgroundColor(Color.YELLOW);
                                break;

                            case "Green":
                                band5.setBackgroundColor(Color.GREEN);
                                break;

                            case "Blue":
                                band5.setBackgroundColor(Color.BLUE);
                                break;

                            case "Violet":
                                band5.setBackgroundColor(Color.MAGENTA);
                                break;

                            case "Grey":
                                band5.setBackgroundColor(Color.GRAY);
                                break;

                            case "White":
                                band5.setBackgroundColor(Color.WHITE);
                                break;

                            case "Gold":
                                band5.setBackgroundColor(getResources().getColor(R.color.Gold));
                                break;

                            case "Silver":
                                band5.setBackgroundColor(getResources().getColor(R.color.Silver));
                                break;

                        }
                        return true;
                    }
                });

                popup.show();
            }
        });

        band6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),band6);
                popup.getMenuInflater().inflate(R.menu.bandmenu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch((String)item.getTitle()){
                            case "Black":
                                band6.setBackgroundColor(Color.BLACK);
                                break;

                            case "Brown":
                                band6.setBackgroundColor(getResources().getColor(R.color.Brown));
                                break;

                            case "Red":
                                band6.setBackgroundColor(Color.RED);
                                break;

                            case "Orange":
                                band6.setBackgroundColor(getResources().getColor(R.color.Orange));
                                break;

                            case "Yellow":
                                band6.setBackgroundColor(Color.YELLOW);
                                break;

                            case "Green":
                                band6.setBackgroundColor(Color.GREEN);
                                break;

                            case "Blue":
                                band6.setBackgroundColor(Color.BLUE);
                                break;

                            case "Violet":
                                band6.setBackgroundColor(Color.MAGENTA);
                                break;

                            case "Grey":
                                band6.setBackgroundColor(Color.GRAY);
                                break;

                            case "White":
                                band6.setBackgroundColor(Color.WHITE);
                                break;

                            case "Gold":
                                band6.setBackgroundColor(getResources().getColor(R.color.Gold));
                                break;

                            case "Silver":
                                band6.setBackgroundColor(getResources().getColor(R.color.Silver));
                                break;

                        }
                        return true;
                    }
                });

                popup.show();
            }
        });

        band7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),band7);
                popup.getMenuInflater().inflate(R.menu.bandmenu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch((String)item.getTitle()){
                            case "Black":
                                band7.setBackgroundColor(Color.BLACK);
                                break;

                            case "Brown":
                                band7.setBackgroundColor(getResources().getColor(R.color.Brown));
                                break;

                            case "Red":
                                band7.setBackgroundColor(Color.RED);
                                break;

                            case "Orange":
                                band7.setBackgroundColor(getResources().getColor(R.color.Orange));
                                break;

                            case "Yellow":
                                band7.setBackgroundColor(Color.YELLOW);
                                break;

                            case "Green":
                                band7.setBackgroundColor(Color.GREEN);
                                break;

                            case "Blue":
                                band7.setBackgroundColor(Color.BLUE);
                                break;

                            case "Violet":
                                band7.setBackgroundColor(Color.MAGENTA);
                                break;

                            case "Grey":
                                band7.setBackgroundColor(Color.GRAY);
                                break;

                            case "White":
                                band7.setBackgroundColor(Color.WHITE);
                                break;

                            case "Gold":
                                band7.setBackgroundColor(getResources().getColor(R.color.Gold));
                                break;

                            case "Silver":
                                band7.setBackgroundColor(getResources().getColor(R.color.Silver));
                                break;

                        }

                        return true;
                    }
                });

                popup.show();
            }
        });
    }
}

# Number-Separator
It can separate number by comma (0,000) 


 final DigiCutter digiCutter=new DigiCutter();// Call Libs + Positive
        digiCutter.NumberSeparator(anyNumber); // It's Separate EditText by comma (0,000) in typing mode

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double backINTNumber=digiCutter.backIntNumber(anyNumber);// Convert String to number

                backINTNumber=backINTNumber*0.0475;

                TextView textView= findViewById(R.id.textView);
                TextView textView1= findViewById(R.id.textView1);
                // Take double value and convert to text by control rate (.00000)
                textView.setText(digiCutter.showNumberDouble(backINTNumber,".0"));
                // Take double value but convert to Integer then text
                textView1.setText(digiCutter.showNumber(backINTNumber));
            }
        });

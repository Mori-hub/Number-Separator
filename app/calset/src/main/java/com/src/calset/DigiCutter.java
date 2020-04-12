package com.src.calset;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

import java.text.DecimalFormat;

public class DigiCutter {

    //  Text Watcher and Chang to , in EditText
    public void NumberSeparator(final EditText editText){
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                editText.removeTextChangedListener(this);
                editor(editText);
                editText.addTextChangedListener(this);
            }
        });

    }


    //  Add , and separator 3 digit
    private void editor(EditText alpha) {
        String string=alpha.getText().toString();
        if (!TextUtils.isEmpty(string)){
            String textWC=string.replaceAll(",","");
            double number =Double.parseDouble(textWC);
            String formattedNumber= splitDigits(number);
            alpha.setText(formattedNumber);
            alpha.setSelection(formattedNumber.length());

        }
    }
    //  String to Number Methods  - Edit Text
    public double backIntNumber(EditText beta) {
        if (!TextUtils.isEmpty(beta.getText())){
            String string=beta.getText().toString();
            String textWC=string.replaceAll(",","");
            return Double.parseDouble(textWC);
        } else return 0;


    }

    //  Integer Number
    public String showNumber(double gama){
        DecimalFormat decimalFormat = new DecimalFormat("0,000");
        return decimalFormat.format(gama);
    }
    //  Integer Double and rate
    public String showNumberDouble(double gama,String rate){
        DecimalFormat decimalFormat = new DecimalFormat("0,000"+rate);
        return decimalFormat.format(gama);
    }

    private String splitDigits(double number) {
        return new DecimalFormat("#,###").format(number);

    }

}

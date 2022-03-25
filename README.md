
# Number Separator

This is kind of a number separator. it can seperate number by comma (,) like (000,000,000,000.00)
## Features

- Digital Numbers
- Support English and Persian 
- Easy Use
- Cross platform


## Installation

Install my-project with https://jitpack.io/

```bash
  dependencies {
	        implementation 'com.github.Mori-hub:Number-Separator:0.1.0'
	}
```
    
## Usage/Examples

```javascript
    final DigiCutter digiCutter=new DigiCutter();// Call Libs + Positive digiCutter.NumberSeparator(anyNumber); // It's Separate EditText by comma (0,000) in typing mode

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double backINTNumber=digiCutter.backIntNumber(anyNumber);// Convert String to number from Edit Text

            backINTNumber=backINTNumber*0.0475; //Just example

            TextView tvDouble= findViewById(R.id.textView);
            TextView tvInt= findViewById(R.id.textView1);

            // Take double value and convert to text by control rate (.00000)
            tvDouble.setText(digiCutter.showNumberDouble(backINTNumber,".0"));
            
            // Take double value but convert to Integer then text
            tvInt.setText(digiCutter.showNumber(backINTNumber));
        }
    });
```


## Screenshots



## 🚀 About Me
I'm a full stack developer...


## 🛠 Skills
Java, Kotlin, CSS....


## Tech Stack

**Important:** For Gradle 7.2 & jitpack.io Please use this way : https://stackoverflow.com/a/71603699/12272687

**Update:** March 2022


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Mori-hub)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/)


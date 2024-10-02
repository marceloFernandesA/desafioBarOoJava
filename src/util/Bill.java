package util;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double feeding(){
        return (beer * 5) + (barbecue * 7) + (softDrink * 3);
    }
    public double ticket(){
        if (gender == 'M'){
                return 10;
        } else {
            return 8;
        }
    }
    public double couver(){
        if(feeding() <30){
            return 4;
        }else {
          return 0;
        }
    }
    public double total(){
        return couver() + ticket() + feeding();
    }






}

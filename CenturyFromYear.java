/*
  An algorithm that will tell you the century
  when you insert an specific year
*/


public Class centuryFromYear{
  public static void main(String args[]){
    centuryFromYear(1905);
  }

  int centuryFromYear(int year) {
    int start = 1, end =100, y =1, ans = 0;
    do{
        if ((year >= start) && (year <= end)){
            ans = y;
            break;
        }else{
            start += 100;
            end += 100;
            y += 1;
        }
    }while (1 > 0);
    return ans;
}
}

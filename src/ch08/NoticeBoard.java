package ch08;

public class NoticeBoard {
    static int getTotalPage(int m, int n){
        if(m%n == 0){
            return m/n;
        }else{
        return m/n+1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getTotalPage(5, 10));
        System.out.println(getTotalPage(15, 10));
        System.out.println(getTotalPage(25, 10));
        System.out.println(getTotalPage(30, 10));

    }
}

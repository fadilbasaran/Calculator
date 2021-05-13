
import java.util.Scanner;


public class Main {
    
   /*
    Method Overloading kullanarak bir tane hesap makinesi tasarlamya çalışınız.
    Toplama ve Çarpma Metodlarını 2 veya 3 parametre olacak şekilde tasarlayınız.
    
    */
    public static int toplama(int a,int b){//iki parametreli topmlama
       
        return a+b;
    }
     public static int toplama(int a,int b, int c){//Üç parametreli topmlama
         return a+b+c;
    }
     public static int carpma(int a,int b){//İki parametreli çarpma
        return a*b;
    }
     public static int carpma(int a,int b, int c){//üç parametreli çarpma
         return a*b*c;
    }
      public static double bolme(double a,double b){
        return (double)a/b;//Sonucu double çevirip gönderiyoruz
    }
       public static int cikarma(int a,int b){
        return a-b;
    }
     
          
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String islemler="1.Topmlama İşlemi\n"
                        +"2.Çıkarma işlemi\n"
                        +"3.bölme işlemi\n"
                        +"4.Çarpma işlemi\n"
                        +"0.Programdan Çık\n";
        
        System.out.println("********************************************");
        System.out.println(islemler);
        System.out.println("********************************************");
        
        while (true) {            
            System.out.print("işlemi Seçiniz: ");//İşlem Seçimi isteniyor
            String islem=scan.nextLine();
            
            if (islem.equals("0")) {//İşlem seçimi 0 ise programdan çıkış yapılacak
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){//işlem seçimi 1 ise toplama
                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3): ");//Kaç parmatrenin toplanacağı seçilecek
                
                int kacsayi=scan.nextInt();
                
                if(kacsayi==2){
                    System.out.print("a:");
                    int a=scan.nextInt();
                    System.out.print("b:");
                    int b=scan.nextInt();
                    scan.nextLine();
                    /*
                    //nextLine'dan sonra bir tane nextInt alıyoruz, tekrar döngümüz başa dönecek
                    ve tekrardan nexLine alacak burdam ters "\n" bir karakter gibi alacak, o yüzden
                    nextLine kullanarak bunun önüne geçecez bunu önüne geçecez
                    
                    */
                    System.out.println("Girilen sayıların toplamları : "+(toplama(a, b)));
                }
                
                else if(kacsayi==3){
                    System.out.print("a:");
                    int a=scan.nextInt();
                    System.out.print("b:");
                    int b=scan.nextInt();
                    System.out.print("c:");
                    int c=scan.nextInt();
                    scan.nextLine();
                    /*
                    //nextLine'dan sonra bir tane nextInt alıyoruz, tekrar döngümüz başa dönecek
                    ve tekrardan nexLine alacak burdam ters "\n" bir karakter gibi alacak, o yüzden
                    nextLine kullanarak bunun önüne geçecez bunu önüne geçecez
                    
                    */
                    System.out.println("Girilen sayıların toplamları : "+(toplama(a, b, c)));
                }
            
                
            
            
            }
            else if(islem.equals("2")){//işlem 2 ise çıkarma işlmei yapılacak
                    System.out.print("a:");
                    int a=scan.nextInt();
                    System.out.print("b:");
                    int b=scan.nextInt();
                    scan.nextLine();
                        
                    System.out.println("Girilen sayıların farkları: "+(cikarma(a, b)));
            }
            else if(islem.equals("3")){
                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");//Kaç parametrenin çarpılacağı seçilecek
                
                int kacsayi=scan.nextInt();
                
                if(kacsayi==2){
                    System.out.print("a:");
                    int a=scan.nextInt();
                    System.out.print("b:");
                    int b=scan.nextInt();
                    scan.nextLine();
                    /*
                    //nextLine'dan sonra bir tane nextInt alıyoruz, tekrar döngümüz başa dönecek
                    ve tekrardan nexLine alacak burdam ters "\n" bir karakter gibi alacak, o yüzden
                    nextLine kullanarak bunun önüne geçecez bunu önüne geçecez
                    
                    */
                    System.out.println("Girilen sayıların çarpımları : "+(carpma(a, b)));
                }
                
                else if(kacsayi==3){
                    System.out.print("a:");
                    int a=scan.nextInt();
                    System.out.print("b:");
                    int b=scan.nextInt();
                    System.out.print("c:");
                    int c=scan.nextInt();
                    scan.nextLine();
                    /*
                    //nextLine'dan sonra bir tane nextInt alıyoruz, tekrar döngümüz başa dönecek
                    ve tekrardan nexLine alacak burdam ters "\n" bir karakter gibi alacak, o yüzden
                    nextLine kullanarak bunun önüne geçecez bunu önüne geçecez
                    
                    */
                    System.out.println("Girilen sayıların çarpımları : "+(carpma(a, b, c)));
                }
            
                
            }
            else if(islem.equals("4")){//İşlem 3 ise bölme işlemi yapılacak
                    System.out.print("a:");
                    int a=scan.nextInt();
                    System.out.print("b:");
                    int b=scan.nextInt();
                    scan.nextLine();
                        
                    System.out.println("Girilen sayıların bölümü: "+(bolme(a, b)));
            }
            else{
                System.out.println("Geçersiz işlem");
            }
                
        }
    }
}

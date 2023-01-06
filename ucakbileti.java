import java.util.Scanner;

public class ucakbileti {


    public static void main(String[] args) {
        int km,yas; double perkm=0.10;
        int yolculuktipi;
        Scanner input=new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz: ");
        km=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        double total1=km*perkm;
        double total2=(km*perkm)*2;
    System.out.print("Yolculuk tipini giriniz(Tek yön=1,gidiş-dönüş=2):  ");
    yolculuktipi=input.nextInt();

    if(yolculuktipi==1){
        if(yas<12){
            total1=(km*perkm)-(km*perkm)/2;
            System.out.print("toplam tutar: "+total1);
        }else if((yas>12)&&(yas<24)){
            total1=(km*perkm)-((km*perkm)/10);
            System.out.print("toplam tutar: "+total1);
        } else if (yas > 65) {
            total1=(km*perkm)-((km*perkm)%30);
        }else{
            System.out.print("toplam tutar: "+total1);
        }
        }else if(yolculuktipi==2){
        if(yas<12){
            total2=((km*perkm)-(km*perkm)/2)*2;
            System.out.print("toplam tutar: "+total2);
        }else if((yas>12)&&(yas<24)){
            total2=((km*perkm)-(km*perkm)/10)*2;
            System.out.print("toplam tutar: "+total2);
        } else if (yas > 65) {
            total2=((km*perkm)-((km*perkm)%30)*2);
            System.out.print("toplam tutar: "+total2);
        }else{
            System.out.print("toplam tutar: "+total2);
        }
    }else{
        System.out.print("hatalı girdiniz");
    }

    }
    }














































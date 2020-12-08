
public class Main {
    public static void main(String[] args) {
        /*
        nonstatic VE static Inner classlar bizim classımızın birer üyesiydi
        normal bir metod biz özellik gibi classın üyesiydi
        Ancak Lokal Inner classlar metodların bir üyesi oluyor
        metodların içibde bir değişken tanımlarmış gibi belirli bir işlem yaparmış gibi metodların içinde classlarımızı tanımlıyoruz
        bu classlar bizim Lokal Inner Classlarımız oluyor
        Lokal Inner Classlara biz başka metodlardan erişemiyoruz
        Çünkü bunlar tanımlamaları gereği sadece ve sadece metoda özgüdür
        Lokal Inner classlarda public static gibi anahtar kelimeler kullanamıyoruz
        Bunun sebebi ise public static gibi anahtar kelimeler sadece classın bir özelliği veya classın bir metodu olduğu zaman kullanılıyor
        
        */
        
        class Alan{//bu tanımlamayı yaparken public veya static gibi anahtar kelime kullanımlarına izin vermiyor JAVA
            public void daire_alan(int yarı_cap){
                System.out.println("DAİRENİZİN ALANI : "+ (yarı_cap*yarı_cap*Math.PI));
            }
        }
        Alan alan = new Alan();//Lokal Inner Classlar sayesinde basit bir obje oluşturma gerçekleştirebildik
        alan.daire_alan(10);
        Alan alan1 = new Alan();
        alan1.daire_alan(3);
        /*
        Lokal Inner class faydaları = 
        Eğer siz bir class tanımlayacaksanız ve hemen bir obje oluşturmak istiyorsanız Başka bir dosyqada bunu yapmanıza gerek yok bunu Lokal Inner Class olarak tanımlayabilirsiniz
        
        */
  
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

package day08.work;

import java.util.Arrays;
import java.util.Scanner;

public class sta {
//    public int num;

    public void count(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串数字");
        String numss=sc.next();
        String strs[]=numss.split("");
        String nums[]=new String[strs.length];
        Arrays.fill(nums,"");
        int counts[]=new int[strs.length];
        int i=0;
        int j=0;
        int m=0;
        for (i=0;i<strs.length;i++){
            for (j=0;j<strs.length;j++){
                if (nums[j].equals(strs[i])){
                    counts[j]++;
                    break;
                }
            }
            if (j== strs.length){
                nums[m]=strs[i];
                counts[m]=1;
                m++;
            }

        }
        System.out.println(m);
        for (int z=0;z<m;z++){
            System.out.println("数字"+nums[z]+"出现了"+counts[z]+"次");
        }
        System.out.println(numss);

    }

    public static void main(String[] args) {
        sta s=new sta();
        s.count();
    }
}
//做法2
class sta2{
    Scanner sc=new Scanner(System.in);
    public void count2(){
        System.out.println("请输入一串数字");
        String a=sc.next();
        String nums[]=a.split("");
        int b[]=new int[nums.length];
        int c[]={0,0,0,0,0,0,0,0,0,0};
//        for (int i=0;i<nums.length;i++){
//            switch (nums[i]){
//                case "1":c[1]++;break;
//                case "2":c[2]++;break;
//                case "3":c[3]++;break;
//                case "4":c[4]++;break;
//                case "5":c[5]++;break;
//                case "6":c[6]++;break;
//                case "7":c[7]++;break;
//                case "8":c[8]++;break;
//                case "9":c[9]++;break;
//                case "0":c[10]++;break;
//            }
//        }
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);  //ascii码
            c[ch-48]++;
        }
        for (int z=0;z<10;z++){
            if (c[z]==0){
                continue;
            }
            System.out.println("数字"+z+"出现了"+c[z]+"次");

        }
    }

    public static void main(String[] args) {
        sta2 s=new sta2();
        s.count2();
    }
}


//方法3
class sta3 {
    public String nums;
    public int counts;
    public void setCounts(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一串字符串");
        String a=sc.next();
        String b[]=a.split("");
        sta3[] s=new sta3[b.length];
        for (int x=0;x<b.length;x++){
            s[x]=new a("",0);
        }
        int i,j,m=0;
        for(i=0;i<b.length;i++){
            for (j=0;j<b.length;j++){
                if (s[j].nums.equals(b[i])){//用==比的是地址
                    s[j].counts++;
                    break;
                }
            }
            if (j==b.length){
                s[m]=new a(b[i],1);;
                m++;
            }
        }
        for (int x=0;x<m;x++){
            System.out.println(s[x].nums+"出现的次数是"+s[x].counts);
        }
    }

    public static void main(String[] args) {
        sta3 s=new sta3();
        s.setCounts();
    }
}
class a extends sta3{
    public a(String nums,int counts){
        super.nums=nums;
        super.counts=counts;
    }
}


//
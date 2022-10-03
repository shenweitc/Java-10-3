package Demo;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr=new Goods[3];
        Goods g1=new Goods("01","一号",12.2,50);
        Goods g2=new Goods("02","二号",15.2,50);
        Goods g3=new Goods("03","三号",16.2,50);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            Goods good=arr[i];
            System.out.println(good.getId()+" "+good.getName()+" "+good.getPrice());
        }
    }
}

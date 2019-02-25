package study.leetcode;

import java.util.List;

/**
 * [0-1背包问题]有一个背包，背包容量是M=150kg。有7个物品，物品不可以分割成任意大小。（这句很重要）
 要求尽可能让装入背包中的物品总价值最大，但不能超过总容量。
 物品 A B C D E F G
 重量 35kg 30kg 6kg 50kg 40kg 10kg 25kg
 价值 10 40 30 50 35 40 30
 ---------------------
 作者：changyuanchn
 来源：CSDN
 原文：https://blog.csdn.net/changyuanchn/article/details/51417796
 版权声明：本文为博主原创文章，转载请附上博文链接！
 */
public class Package {
    private List<Product> productList;
    public static final int MAX_WEIGHT = 150;

    public int getValue(){
        if(ifExceedMaxWeight()){
            return 0;
        }
        int totalValue = 0;
        for (int i = 0; i < productList.size() ; i++) {
            totalValue = productList.get(i).getValue();
        }
        return totalValue;
    }
    public boolean ifExceedMaxWeight(){
        int totalWeight = 0;
        for (int i = 0; i < productList.size() ; i++) {
            totalWeight = productList.get(i).getWeight();
        }
        return totalWeight > MAX_WEIGHT ? false:true;
    }


    class Product{
        private String name;
        private int weight;
        private int value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}

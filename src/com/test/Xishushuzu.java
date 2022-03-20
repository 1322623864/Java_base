package com.test;

public class Xishushuzu {
    public static void main(String[] args) {
        int[][] arrays1 = new int[11][11];
        arrays1[2][1]=1;
        arrays1[3][2]=2;
        for (int[] ints : arrays1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("=============================");
        //转换
        //获取有效值的个数
        int num = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(arrays1[i][j]!=0){
                    num++;
                }
            }
        }
        //创建一个稀疏数组
        int[][] arrays2 = new int[num+1][3];
        arrays2[0][0]=11;
        arrays2[0][1]=11;
        arrays2[0][2]=num;
        //遍历原本二维数组，把非零的值存入稀疏数组
        int count = 0;
        for (int i = 0; i < arrays1.length; i++) {
            for (int j = 0; j < arrays1[i].length; j++) {
                if(arrays1[i][j]!=0){
                    count ++;
                    arrays2[count][0]=i;
                    arrays2[count][1]=j;
                    arrays2[count][2]=arrays1[i][j];
                }

            }

        }
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println(arrays2[i][0]+"\t"+arrays2[i][1]+"\t"+arrays2[i][2]+"\t");

        }
    }

}

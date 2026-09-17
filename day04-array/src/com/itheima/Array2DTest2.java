package com.itheima;

public class Array2DTest2 {
    public static void main(String[] args) {
        // 规则数组
        System.out.println("=== 规则数组 ===");
        createArray2D(3, 4);
        
        // 不规则数组（每行长度不同）
        System.out.println("\n=== 不规则数组 ===");
        createJaggedArray2D();
    }

    public static void createArray2D(int r, int l) {
        int array2D[][] = new int[r][l];
        int count=1;
        for(int i=0;i<array2D.length;i++){
            for(int j=0;j<array2D[i].length;j++){
                array2D[i][j]=count++;
                System.out.print(array2D[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
        // 第一步：完成所有交换（洗牌）
        int temp = 0;
        int m = 0;
        int n = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                m = (int)(Math.random() * r);
                n = (int)(Math.random() * l);
                temp = array2D[m][n];
                array2D[m][n] = array2D[i][j];
                array2D[i][j] = temp;
            }
        }
        
        // 第二步：打印交换后的最终结果
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    // 不规则数组洗牌
    public static void createJaggedArray2D() {
        // 创建不规则二维数组：每行长度不同
        int[][] array2D = new int[3][];
        array2D[0] = new int[]{1, 2, 3};           // 第 0 行：3 个元素
        array2D[1] = new int[]{4, 5, 6, 7};        // 第 1 行：4 个元素
        array2D[2] = new int[]{8, 9};              // 第 2 行：2 个元素
        
        System.out.println("原始数组：");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        // 计算总元素个数
        int totalElements = 0;
        for (int i = 0; i < array2D.length; i++) {
            totalElements += array2D[i].length;
        }
        
        // 洗牌：把二维数组当成一维来处理
        int temp = 0;
        int randomIndex = 0;
        int m = 0, n = 0;
        
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                // 生成 0 ~ totalElements-1 的随机索引
                randomIndex = (int)(Math.random() * totalElements);
                
                // 把一维索引转换成二维坐标
                m = 0;
                n = randomIndex;
                while (n >= array2D[m].length) {
                    n -= array2D[m].length;
                    m++;
                }
                
                // 交换
                temp = array2D[m][n];
                array2D[m][n] = array2D[i][j];
                array2D[i][j] = temp;
            }
        }
        
        System.out.println("洗牌后：");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


package com.struct.search;

import java.util.Arrays;

//二分法查找
//时间复杂度 log2(n) 空间复杂度：log2(n )
public class binarySearch {

    public static void main(String[] args) {
        //数组
        int [] array={1,55,66,9,12,777,899,88};
        //查找的元素
        int key=898;
        //先数组排序
        Arrays.sort(array);
        //查找的元素索引,默认-1
        int index=-1;
        if(index==-1){
            System.out.println("不存在");
        }
        else {
            System.out.println(key+"索引"+search(array,key,0,array.length-1));
        }

  }


    //二分法查找递归思想
    private static  int search(int[]array,int key,int low,int high){
        //递归结束条件
        if(low>high){
            return -1;
        }
        //求中间索引
        int mid=(low+high)/2;
        //如果相等
        if(key==array[mid]){
            return mid;
        }else{
            //如果小于
            if(key<array[mid]){
                return search(array,key,low,mid-1);
            }
            //如果大于
            else {
                return  search(array,key,mid+1,high);
            }
       }

    }
}

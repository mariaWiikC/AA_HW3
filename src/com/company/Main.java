package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] data = {-4, 11, 7, -12, 6, 1};
        int[] data2 = {-4, 11, 7, -12, 6, 1};

        //sequential sort
        System.out.println("Sequential Sort");
        for (int i = 0; i < data.length - 1; i++)
        {
            int indexSmallest = i;

            for (int j = i + 1; j < data.length; j++)
            {
                if (data[j] < data[indexSmallest])
                    indexSmallest = j;
            }
            if (i != indexSmallest)
            {
                swap(data, i, indexSmallest);
                //printing
                for (int d : data)
                    System.out.print(d + " ");
                System.out.println();
            }
        }
        
        System.out.println();
        //bubble sort
        System.out.println("Bubble Sort");

        boolean changed = true;

        while (changed)
        {
            changed = false;
            for (int i = 1; i < data2.length; i++)
            {
                if (data2[i - 1] > data2[i])
                {
                    swap(data2, i - 1, i);
                    changed = true;
                }
            }
            for (int d : data2)
                System.out.print(d + " ");
            System.out.println();
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

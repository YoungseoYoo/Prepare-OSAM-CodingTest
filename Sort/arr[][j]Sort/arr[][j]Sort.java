// costs = [][];

Comparator<int[]> c1 = (a,b)->{ return a[j]-b[j]; }; // j�� ���ϴ� ��(col)�� index�� �־���
Arrays.sort(costs,c1); // costs �ڸ��� ������ �迭�� �־���
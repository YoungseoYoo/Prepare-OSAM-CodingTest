// costs = [][];

Comparator<int[]> c1 = (a,b)->{ return a[j]-b[j]; }; // j에 원하는 열(col)의 index를 넣어줌
Arrays.sort(costs,c1); // costs 자리에 이차원 배열을 넣어줌
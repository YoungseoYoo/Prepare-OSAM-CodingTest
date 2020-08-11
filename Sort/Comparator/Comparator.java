// x좌표가 증가하는 순, x좌표가 같으면 y좌표가 감소하는 순으로 정렬

// Comparator interface를 이용
class MyComparator implements Comparator<Point>{
  @Override
  public int compare(Point p1, Point p2){
    if (p1.x > p2.x){
      return 1; // x에 대해서는 오름차순
    }
    else if (p1.x == p2.x){
      if (p1.y < p2.y){ // y에 대해서는 내림차순
        return 1;
      }
    }
    return -1;
  }
}
// main에서 사용법
List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x, y));
MyComparator myComparator = new MyComparator();
Collections.sort(pointList, myComparator);

// Comparator 익명 클래스 이용
Comparator<Point> myComparator = new Comparator<Point>(){
  @Ovverride
  public int compare(Point p1, Point p2){
    if (p1.x > p2.x){
      return 1; // x에 대해서는 오름차순
    }
    else if (p1.x == p2.x){
      if (p1.y < p2.y){ // y에 대해서는 내림차순
        return 1;
      }
    }
    return -1;
  }
};

List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x, y));
Collections.sort(pointList, myComoparator);
// x좌표가 증가하는 순, x좌표가 같으면 y좌표가 감소하는 순으로 정렬
class Point implements Comparable<Point> {
  int x, y;

  @Override
  public int compareTo(Point p){
    if (this.x > p.x){
      return 1; // x에 대해서는 오름차순
    }
    else if (this.x == p.x){
      if (this.y < p.y){ // y에 대해서는 내림차순
        return 1;
      }
    }
    return -1;
  }
}

// main에서 사용법
List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x, y));
Collections.sort(pointList);
// x��ǥ�� �����ϴ� ��, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ����
class Point implements Comparable<Point> {
  int x, y;

  @Override
  public int compareTo(Point p){
    if (this.x > p.x){
      return 1; // x�� ���ؼ��� ��������
    }
    else if (this.x == p.x){
      if (this.y < p.y){ // y�� ���ؼ��� ��������
        return 1;
      }
    }
    return -1;
  }
}

// main���� ����
List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x, y));
Collections.sort(pointList);
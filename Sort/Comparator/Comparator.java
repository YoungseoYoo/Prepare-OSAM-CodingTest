// x��ǥ�� �����ϴ� ��, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ����

// Comparator interface�� �̿�
class MyComparator implements Comparator<Point>{
  @Override
  public int compare(Point p1, Point p2){
    if (p1.x > p2.x){
      return 1; // x�� ���ؼ��� ��������
    }
    else if (p1.x == p2.x){
      if (p1.y < p2.y){ // y�� ���ؼ��� ��������
        return 1;
      }
    }
    return -1;
  }
}
// main���� ����
List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x, y));
MyComparator myComparator = new MyComparator();
Collections.sort(pointList, myComparator);

// Comparator �͸� Ŭ���� �̿�
Comparator<Point> myComparator = new Comparator<Point>(){
  @Ovverride
  public int compare(Point p1, Point p2){
    if (p1.x > p2.x){
      return 1; // x�� ���ؼ��� ��������
    }
    else if (p1.x == p2.x){
      if (p1.y < p2.y){ // y�� ���ؼ��� ��������
        return 1;
      }
    }
    return -1;
  }
};

List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x, y));
Collections.sort(pointList, myComoparator);
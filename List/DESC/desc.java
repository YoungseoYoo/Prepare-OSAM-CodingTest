// Comparartor나 Collections를 사용하여 내림차순 가능
// 단, byte, char, double, short, long, int, float 같은 Primitive Type의 배열에는 적용 불가
// Integer, String 등의 Wrapper "Class"를 이용해야만 함

Integer[] iArr = new Integer[] {1, 2, 6, 3, 8};
String[] sArr = new String[] {"a", "d", "b", "c", "e"};

Arrays.sort(iArr, Comparator.reverseOrder());
Arrays.sort(sArr, Collections.reverseOrder());

// iArr >> {8, 6, 3, 2, 1}
// sArr >> {"e", "d", "c", "b", "a"}
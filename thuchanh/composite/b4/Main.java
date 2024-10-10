package thuchanh.composite.b4;

public class Main {
  public static void main(String[] args) {
    SubjectComposite khoaHoc = new SubjectComposite("64.CNTT-CLC2");
    SubjectComposite nam1 = new SubjectComposite("Năm 1");
    SubjectComposite ky1 = new SubjectComposite("Học kỳ 1");
    SubjectComposite ky2 = new SubjectComposite("Học kỳ 2");
    SubjectComposite kyHe = new SubjectComposite("Học kỳ hè");

    SubjectLeaf toan1 = new SubjectLeaf("Đại số tiến tính",2);
    SubjectLeaf toan2 = new SubjectLeaf("Tích phân",2);
    SubjectLeaf toan3 = new SubjectLeaf("Xác Suất thống kê",2);

    SubjectLeaf nhapMonLT = new SubjectLeaf("Nhập môn lập trình",3);
    SubjectLeaf THDC = new SubjectLeaf("Tin học đại cương",3);
    SubjectLeaf toanRR = new SubjectLeaf("Toán rời rạc",3);

    ky1.add(toan1);
    ky1.add(toan2);
    ky1.add(toan3);

    ky2.add(nhapMonLT);
    ky2.add(THDC);
    ky2.add(toanRR);

    nam1.add(ky1);
    nam1.add(ky2);

    khoaHoc.add(nam1);
    System.out.println(khoaHoc.getTreeSubject(0));
    System.out.println(khoaHoc.getTotalCredits());
  }
}

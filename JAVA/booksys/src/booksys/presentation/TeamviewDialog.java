package booksys.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import booksys.application.domain.BookingSystem;
import booksys.application.domain.Teamview;

public class TeamviewDialog extends JFrame {

	Container contentPane; // 컨테이너 생성

	int tablecount[] = { 0, 0, 0, 0, 0, 0, 0, 0 };

	int[] arcAngle = new int[8];
	Color[] color = { Color.RED, Color.BLUE, // 색상
			Color.MAGENTA, Color.ORANGE, Color.GREEN, Color.GRAY, Color.black, Color.PINK };

	String[] itemName = { "1번", "2번", // 테이블 번호
			"3번", "4번", "5번", "6번", "7번", "8번" };
	JLabel[] ff = new JLabel[8]; // 텍스트필드
	JLabel t12 = new JLabel("총 이용 팀은"); // 텍스트필드
	ChartPanel chartPanel = new ChartPanel(); // 차트패널
	ChartPanel2 chartPanel2 = new ChartPanel2(); // 차트패널

	public TeamviewDialog() { // 생성자

		String viewdate = BookingSystem.dateday;

		Teamview team = new Teamview();
		ArrayList<String> reservationlist = new ArrayList<>();
		ArrayList<String> walkinlist = new ArrayList<>();

		reservationlist = team.reservationview(viewdate);

		walkinlist = team.walkview(viewdate);

		int sum = 0;
		int tablenumber = 0;

		for (int i = 0; i < reservationlist.size(); i++) {

			String[] array = reservationlist.get(i).split(",");

			for (int j = 0; j < array.length - 1; j++) {
				sum += Integer.parseInt(array[j]);
				tablenumber = Integer.parseInt(array[j + 1]);
			}

			for (int k = 1; k <= 8; k++) {
				if (tablenumber == k) {
					tablecount[k - 1] += 1;
					break;
				}
			}

		}

		for (int i = 0; i < walkinlist.size(); i++) {

			String[] array = walkinlist.get(i).split(",");

			for (int j = 0; j < array.length - 1; j++) {
				sum += Integer.parseInt(array[j]);
				tablenumber = Integer.parseInt(array[j + 1]);
			}

			for (int k = 1; k <= 8; k++) {
				if (tablenumber == k) {
					tablecount[k - 1] += 1;
					break;
				}
			}

		}

		System.out.println("인원총합:" + sum);
		System.out.println("테이블: " + tablecount);

		JLabel t11 = new JLabel("총 이용 고객: " + sum + "명"); // 텍스트필드

		setTitle("통계");
		contentPane = getContentPane(); // 컨테이너 갯
		contentPane.add(chartPanel2, BorderLayout.SOUTH);
		contentPane.add(t11, BorderLayout.WEST);
		contentPane.add(chartPanel, BorderLayout.CENTER);

		setSize(800, 400);
		setVisible(true);
		drawChart(); // 차트 메소드 호출
	}

	void drawChart() { // 차트를 그린다
		int sum = 0; // 초기값 0
		for (int i = 0; i < tablecount.length; i++) { // 데이터 값만큼 루프

			// 여기에 테이블 순서대로 몇팀인지 파악해서 숫자 넣어주면됌
			sum += tablecount[i];
		}
		if (sum == 0)
			return;

		for (int i = 0; i < tablecount.length; i++) {
			arcAngle[i] = (int) Math.round((double) tablecount[i] / (double) sum * 360);
			chartPanel.repaint(); // 차트패널의 PAINT호출
		}
	}

	class InputPanel extends JPanel { // 입력패널
		public InputPanel() {
			for (int i = 0; i < tablecount.length; i++) {
				ff[i] = new JLabel("<html> " + tablecount[i] + "팀" + "<br/></html>");
				add(new JLabel(itemName[i]));
				add(ff[i]);
			}

		}
	}

	class ChartPanel2 extends JPanel { // 차트 표시 패널

		public void paintComponent(Graphics g) {

			super.paintComponent(g);// 부모 패인트호출

			int startAngle = 0;

			for (int i = 0; i < tablecount.length; i++) {
				g.setColor(color[i]);
				g.drawString(itemName[i] + ": " + tablecount[i] + "팀", 50 + i * 70, 10);
			}

			for (int i = 0; i < tablecount.length; i++) {
				g.setColor(color[i]);
				g.fillArc(150, 50, 200, 200, startAngle, arcAngle[i]);
				startAngle = startAngle + arcAngle[i];
			}
		}
	}

	class ChartPanel extends JPanel { // 차트 표시 패널

		public void paintComponent(Graphics g) {

			super.paintComponent(g);// 부모 패인트호출

			int startAngle = 0;

			for (int i = 0; i < tablecount.length; i++) {
				g.setColor(color[i]);
				g.drawString(itemName[i] + Math.round(arcAngle[i] * 100 / 360) + "%", 10 + i * 70, 20);

			}

			for (int i = 0; i < tablecount.length; i++) {
				g.setColor(color[i]);
				g.fillArc(150, 50, 200, 200, startAngle, arcAngle[i]);
				startAngle = startAngle + arcAngle[i];
			}
		}
	}

	public static void main(String args[]) {
		TeamviewDialog a = new TeamviewDialog();
	}

}
package controller;

import java.util.Scanner;

import model.vo.AdultM;
import model.vo.DisCountable;
import model.vo.FamilyM;
import model.vo.Movie;
import model.vo.User;

public class MovieManager {

	Scanner sc = new Scanner(System.in);

	private User user = null;
	private Movie[] mArr = new Movie[4];

	{
		mArr[0] = new AdultM("법죄와의 전쟁", 15000, "범죄", 50, 19, 19);
		mArr[1] = new FamilyM("박물관이 살아있다", 10000, "가족", 30, 9);
		mArr[2] = new AdultM("아저씨", 15000, "액션", 50, 23, 19);
		mArr[3] = new FamilyM("겨울왕국", 10000, "애니메이션", 30, 14);

	}

	public MovieManager() {

	}

	public void insertMember(User user) {
		this.user = user;
	}

	public User myPage() {

		return user;
	}

	public Movie[] selectAll() {

		for (int i = 0; i < mArr.length; i++) {
			System.out.println((i + 1) + "번 영화 : " + mArr[i].toString());
		}
		return mArr;

	}

	public int checkaNum() {

		System.out.println("관람하실 성인의 숫자를 입력하세요 : ");
		int aNum = sc.nextInt();
		sc.nextLine();

		return aNum;

	}

	public int checkkNum() {
		System.out.println("관람하실 어린이의 숫자를 입력하세요 : ");
		int kNum = sc.nextInt();
		sc.nextLine();

		return kNum;

	}

	public int reservation(int index) {

		int result = 0;

		if (mArr[index] instanceof AdultM) {
			if (checkkNum() > 0 && checkaNum() > 0) {
				result = 1; // 아동동반
			} else if (((AdultM) mArr[index]).getAccessAge() > user.getAge()) {
				result = 2; // 나이제한
			}
		} else {

			if (mArr[index].getmTime() < 12 || user.getBirth() == DisCountable.today || user.getCouponCount() > 0) { // 조조할인
				result = 3;
				// 예매를 요청한 영화에 인덱스 번호를 가지고 있는 영화의 좌석수를 예매한 사람 만큼 빼준다.
				mArr[index].setmSeat(mArr[index].getmSeat() - (checkaNum() + checkkNum()));
			} else {
				// 예매를 요청한 영화에 인덱스 번호를 가지고 있는 영화의 좌석수를 예매한 사람 만큼 빼준다.
				mArr[index].setmSeat(mArr[index].getmSeat() - (checkaNum() + checkkNum()));
				result = 0;
			}

		}
		// instanceof 사용 (영화 4가지 모두 동일) //전달 받은 mArr의 index 객체가 FamilyM을 참조하고 있으면 //해당
		// 영화의 getmTime()와 예매 할 회원의 관람인원들 나이를 비교하여 나이가 적을 경우 //result를 1로 초기화 -> 나이제한으로
		// 대여 불가(청소년 물가 영화만!)

		// 예매 가능 할 경우, 회원의 Couponcount이 있을 경우, 할인 적용 //할인 적용 후, 회원의 남은 Couponcount 개수 확인
		// 후 영화 티켓 총 가격 확인 //조조할인나 생일할인 경우, 영화 티켓 총 가격에서 할인 후 영화 티켓 총 가격 확인 //할인이 없는 경우
		// 영화 티켓 총 가격 확인

		return result;

	}

	public void checkSeat() {

		for (int i = 0; i < mArr.length; i++) {

			System.out.println((i + 1) + "번 영화의 남은 좌석은" + mArr[i].getmSeat());

		}

	}
}

package ex2._2;

public class Exercise2 {

	public static void main(String[] args) {
		// 会員インスタンスを生成する
		Partner aPartner = new Partner();

		// 各会員インスタンスに会員情報を設定する
		aPartner.modifyPartnerInfo(args[0], args[1], args[2], args[3]);

		// 各会員インスタンスに設定された会員情報を表示する
		String memberStr = aPartner.getPartnerString();
		System.out.println(memberStr);
	}
}

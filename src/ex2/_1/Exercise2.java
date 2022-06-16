package ex2._1;

public class Exercise2 {

	public static void main(String[] args) {
		// 会員インスタンスを生成する
		Partner aPartner = new Partner();

		// 各会員インスタンスに会員情報(中田さん)を設定する
		aPartner.modifyPartnerInfo("1125", "中田", "東京都", "03-0000-2222");

		// 各会員インスタンスに設定された会員情報を表示する
		String memberStr = aPartner.getPartnerString();
		System.out.println(memberStr);
	}
}

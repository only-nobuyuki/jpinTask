package ex2._3;

class Exercise2 {

	/**
	 * メインメソッドです。
	 *
	 * @param args 起動パラメータ
	 */
	public static void main(String[] args) {
		// 会員インスタンスを生成する
		Partner aPartner = new Partner();

		// 各会員インスタンスに会員情報(豆田さん)を設定する
		aPartner.modifyPartnerInfo("1125", "豆田", "東京都", "03-0000-2222");

		// 各会員インスタンスに設定された会員情報を表示する
		String memberStr = aPartner.getPartnerString();
		System.out.println(memberStr);

		System.out.println();

		// 各会員インスタンスに会員情報を設定する
		if (args.length == 4) {
			aPartner.modifyPartnerInfo(args[0], args[1], args[2], args[3]);

			// 各会員インスタンスに設定された会員情報を表示する
			memberStr = aPartner.getPartnerString();
			System.out.println(memberStr);
		}
	}
}

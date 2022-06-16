package ex1._2;

/**
 * メインクラスです。
 *
 */
class Exercise2 {
	/**
	 * メインメソッドです。
	 *
	 * @param args
	 *            起動パラメータ
	 */
	public static void main(String[] args) {
		// セクションインスタンス(人事部)を生成する
		Section parsonnel = new Section();

		// 各セクションインスタンスにセクション名を設定する
		parsonnel.setName("人事部");
		parsonnel.printName();
	}
}

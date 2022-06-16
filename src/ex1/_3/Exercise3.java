package ex1._3;

/**
 * メインクラスです。
 *
 */
public class Exercise3 {
	/**
	 * メインメソッドです。
	 *
	 * @param args
	 *            起動パラメータ
	 */
	public static void main(String[] args) {
		// セクションインスタンス(人事部)を生成する
		Section parsonnel = new Section();
		// セクションインスタンス(営業部)を生成する
		Section sales = new Section();
		// セクションインスタンス(技術部)を生成する
		Section technology = new Section();

		// 各セクションインスタンスにセクション名を設定する
		parsonnel.setName("人事部");
		sales.setName("営業部");
		technology.setName("技術部");

		// 各セクションインスタンスに設定されたセクション名を表示する
		parsonnel.printName();
		sales.printName();
		technology.printName();
	}
}

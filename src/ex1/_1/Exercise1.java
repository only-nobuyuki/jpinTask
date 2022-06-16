package ex1._1;

/**
 * メインクラスです。
 *
 */
class Exercise1 {
	/**
	 * メインメソッドです。
	 *
	 * @param args
	 *            起動パラメータ
	 */
	public static void main(String[] args) {
		// セクションインスタンス(人事部)を生成
		Section parsonnel = new Section();
		parsonnel.setName("人事部");
		String name = parsonnel.getName();
		System.out.println(name);
	}
}

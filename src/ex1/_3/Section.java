package ex1._3;

/**
 * セクション(Department)クラスです。
 */
class Section {
	/** セクション名 */
	String name;

	/**
	 * セクション名を設定します。
	 *
	 * @param paramName
	 *            セクション名
	 */
	String getName() {
		return name;
	}

	/**
	 * セクション名を取得します。
	 *
	 * @return セクション名
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * セクション名を表示します。
	 */
	void printName() {
		System.out.println("セクション名は、" + name + "です");
	}
}

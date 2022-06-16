package ex1._1;

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
	void setName(String paramName) {
		name = paramName;
	}

	/**
	 * セクション名を取得します。
	 *
	 * @return セクション名
	 */
	String getName() {
		return name;
	}
}

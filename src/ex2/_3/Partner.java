package ex2._3;

/**
 * 会員(Partner)クラスです。
 */
class Partner {
	/** 会員番号 */
	String number;

	/** 氏名 */
	String name;

	/** 住所 */
	String address;

	/** 電話番号 */
	String tel;

	   /**
     * 会員情報を設定します。
     *
     * @param paramNumber  会員番号
     * @param paramName  氏名
     * @param paramAddress 住所
     * @param paramTel 電話番号
     */
	void modifyPartnerInfo(String paramNumber, String paramName,
			String paramAddress, String paramTel) {
		number = paramNumber;
		name = paramName;
		address = paramAddress;
		tel = paramTel;
	}

    /**
     * 会員情報を表示します。
     */
    String getPartnerString() {
        return "会員番号：" + number + " 氏名：" + name + " 住所：" + address
                + " 電話番号：" + tel;
    }
}

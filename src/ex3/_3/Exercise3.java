package ex3._3;

public class Exercise3 {

	public static void main(String[] args) {
		int IndexCallArrayElemwnt = 0;
		if (args.length % 2 == 0) {
			for (int i = 0; i < args.length / 2; i++) {
				Item aItem = new Item();
				aItem.setName(args[IndexCallArrayElemwnt]);
				aItem.setPrice(Integer.parseInt(args[IndexCallArrayElemwnt + 1]));
				IndexCallArrayElemwnt = IndexCallArrayElemwnt + 2;
				aItem.printItenInfo();
			}
		} else {
			System.out.println("商品情報(商品名、価格)は、ペアで入力してください");
		}
	}
}

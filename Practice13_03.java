public class Practice13_03 {
	public static void main(String[] args) {


		Greeting greetJapan = new Greeting();
		Greeting greetKorea = new Greeting();
		Greeting greetUnknown = new Greeting();

		String japan = "日本";
        String korea = "韓国";
        String unknown = "その他";

		greetJapan.country = japan;
		greetKorea.country = korea;
		greetUnknown.country = unknown;

		System.out.println(greetJapan.country + "は " + greetJapan.greet(japan));
		System.out.println(greetKorea.country + "は " + greetJapan.greet(korea));
        System.out.println(greetUnknown.country + "は " + greetJapan.greet(unknown));
	}
}

class Greeting {
    String country;

    public String greet(String country) {
        return switch (country) {
            case "日本" -> "こんにちは";
            case "韓国" -> "アンニョンハセヨ";
            default -> "わかりません";
        };
    }
}
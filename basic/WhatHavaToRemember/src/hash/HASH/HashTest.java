package hash.HASH;

public class HashTest {
	public static void main(String[] args) {
		GeneralHashFunctionLibrary hash = new GeneralHashFunctionLibrary();
		long apHash = hash.APHash("wushengda");
		System.out.println(apHash);
		System.out.println("wushengda".hashCode());
	}
	
	
}

package java0110;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 1);
		System.arraycopy(oldStrArray, 1, newStrArray, 2, 1);
		System.arraycopy(oldStrArray, 2, newStrArray, 4, 1);
		for (int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}

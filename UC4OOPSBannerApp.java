public class UC4OOPSBannerApp {
    public static void main(String[] args) {

        // Step 1: Create String Array
        String[] banner = new String[7];

        // Step 2: Populate Array using String.join()
        banner[0] = String.join("", " ***     *** ", " ****** ", " ****** ");
        banner[1] = String.join("", "**   ** **   ** ", "**    ** ", "**      ");
        banner[2] = String.join("", "**   ** **   ** ", "**    ** ", "**      ");
        banner[3] = String.join("", "**   ** **   ** ", " ****** ", " ****** ");
        banner[4] = String.join("", "**   ** **   ** ", "**       ", "     ** ");
        banner[5] = String.join("", "**   ** **   ** ", "**       ", "     ** ");
        banner[6] = String.join("", " ***     *** ", "**        ", " ****** ");

        // Step 3: Enhanced For Loop for Printing
        for (String line : banner) {
            System.out.println(line);
        }

        // Step 4: Program Exit
    }
}

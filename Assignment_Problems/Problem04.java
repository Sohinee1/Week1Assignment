public class Problem04 {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        int highest = Integer.MIN_VALUE;
        int index = 0;
        String section = "";

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "Section A";
                index = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        if (totalA == totalB) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        System.out.println("Highest Quantity: " + highest + " in " + section
                + " at position " + (index + 1));
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};
        analyzeInventory(sectionA, sectionB);
    }
}

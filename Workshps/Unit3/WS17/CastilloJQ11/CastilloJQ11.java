public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int[] array = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter the " + i + " number:");
            array[i] = ent.nextInt();
            sum += array[i];

        }
        System.out.print("The total sum is: " + sum);
    }

}
  public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {4, 7, 4, 9, 50};
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum = sum + array[x];
        }
        float average = sum / array.length;
        System.out.printf("Sum: %d. average: %f", sum, average);
    }

}

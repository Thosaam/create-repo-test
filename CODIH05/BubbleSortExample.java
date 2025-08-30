public class BubbleSortExample {
    static void bubbleSort(int[] Liste) {

        int n = Liste.length;

        int temp = 0;

        for(int i=0; i < n; i++){

            for(int j=1; j < (n-i); j++){

                if(Liste[j-1] > Liste[j]){

//swap elements

                    temp = Liste[j-1];

                    Liste[j-1] = Liste[j];

                    Liste[j] = temp;

                }

            }

        }

    }
}

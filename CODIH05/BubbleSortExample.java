public class BubbleSortExample {
    static void bubbleSort(int[] Liste) {

        int n = Liste.length;

        int temp = 0;
        boolean getauscht;

        for(int i=0; i < n; i++){
             getauscht= false;

            for(int j=1; j < (n-i); j++){

                if(Liste[j-1] > Liste[j]){

//swap elements

                    temp = Liste[j-1];

                    Liste[j-1] = Liste[j];

                    Liste[j] = temp;

                    getauscht=true;
                    }
                }
            if (!getauscht) {
            break;
            }
            }

        }

    }
}

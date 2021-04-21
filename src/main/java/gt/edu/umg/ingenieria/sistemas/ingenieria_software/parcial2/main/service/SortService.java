package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.main.service;

public class SortService {
    public String[] sortWords(String option){
        String[] result = new String[0];
        switch (option){
            case "1":
                // bubbleSortApplication();
                break;
            case "2":
                // insertionSortApplication();
                break;
            case "3":
                // quickSortApplication();
                break;
            case "4":
                // selectionSortApplication();
                break;

            case "5":
                // shellSortApplication();
                break;
        }
        return result;
    }
}

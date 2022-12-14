package com.java.AirlineProject;

public class DataBase {
    //1-3-8-9
    private String cities[] = {"1. New York City", "2. Chicago", "3. Charleston", "4. Las Vegas", "5. Seattle",
            "6. San Francisco", "7. Washington DC", "8. New Orleans", "9. Palm Springs", "10. San Diego",
            "11. Portland", "12. Orlando", "13. Honolulu", "14. Miami Beach", "15. Boston"};
    private int milesAndCities[][] = {
            {1, 0, 712, 700, 2192, 2354, 2543, 239, 1225, 2378, 2428, 2454, 939, 4983, 1090, 190},
            {2, 712, 0, 760, 1514, 1721, 1846, 594, 836, 1652, 1732, 1739, 1005, 4249, 1197, 867},
            {3, 700, 760, 0, 2005, 2415, 2391, 444, 630, 2099, 2150, 2411, 317, 4758, 490, 819},
            {4, 2192, 1514, 2005, 0, 872, 414, 2089, 1509, 181, 258, 763, 2039, 2758, 2174, 2381},
            {5, 2354, 1721, 2415, 872, 0, 679, 2328, 2086, 987, 1064, 129, 2554, 2680, 2733, 2485},
            {6, 2543, 1846, 2391, 414, 679, 0, 2419, 1923, 421, 447, 536, 2446, 2398, 2585, 2704},
            {7, 239, 594, 444, 2089, 2328, 2419, 0, 966, 2211, 2253, 2350, 759, 4837, 920, 399},
            {8, 1225, 836, 630, 1509, 2086, 1923, 966, 0, 1561, 1599, 2050, 551, 4205, 675, 1368},
            {9, 2378, 1652, 2099, 181, 987, 421, 2211, 1561, 0, 85, 873, 2108, 2663, 2232, 2517},
            {10, 2428, 1732, 2150, 258, 1064, 447, 2253, 1599, 85, 0, 933, 2149, 2614, 2267, 2578},
            {11, 2454, 1739, 2411, 763, 129, 536, 2350, 2050, 873, 933, 0, 2526, 2603, 1353, 2533},
            {12, 939, 1005, 317, 2039, 2554, 2446, 759, 551, 2108, 2149, 2526, 0, 4757, 192, 1121},
            {13, 4983, 4249, 4758, 2758, 2680, 2398, 4837, 4205, 2663, 2614, 2603, 4757, 0, 4862, 5095},
            {14, 1090, 1197, 490, 2174, 2733, 2585, 920, 675, 2232, 2267, 1353, 192, 4862, 0, 1258},
            {15, 190, 867, 819, 2381, 2485, 2704, 399, 1368, 2517, 2578, 2533, 1121, 5095, 1258, 0}};

    public String[] getCities() {
        return cities;
    }

    public int[][] getMiles() {
        return milesAndCities;
    }

    public void showCities(String[] cities) {
        for (int i = 0; i < (cities.length) / 3; i++) {
            System.out.printf("%-17s\t\t%-17s\t\t%-17s\n", cities[i], cities[i + 5], cities[i + 10]);
        }
    }
}

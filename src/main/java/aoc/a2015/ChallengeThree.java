package aoc.a2015;

public class ChallengeThree {
    int[][] houses = new int[10][20];
    int i = 0, j = 0;
    int count = 0;

    public ChallengeThree() {
        houses[0][0] = 1;
    }

    void sendGifts(String directions) {
        for (char direction : directions.toCharArray()) {
            switch (direction) {
                case '^':
                    houses[++i][j]++;
                    break;
                case '>':
                    houses[i][++j]++;
                    break;
                case '<':
                    houses[i][--j]++;
                    break;
                case 'v':
                    houses[--i][j]++;
                    break;
            }
        }
    }

    public int countHouses(int[][] houses) {
        for (int[] house : houses) {
            for (int f = 0; f < houses.length; f++) {
                if (house[f] >= 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String... args) {
        ChallengeThree ct = new ChallengeThree();
        String directions = "^>v<><^^><>>>>>>>>>>>>>";
        ct.sendGifts(directions);
        System.out.println(ct.countHouses(ct.houses) + " houses have received at least 1 gift.");
    }
}

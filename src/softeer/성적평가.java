package softeer;

import java.util.*;
import java.io.*;

public class 성적평가 {
    private static class Person implements Comparable<Person> {
        int score, index;

        public Person(int score, int index) {
            this.score = score;
            this.index = index;
        }

        public String toString() {
            return "Person = [score = " + score + ", index = " + index + "]";
        }

        public int compareTo(Person o) {
            if (this.score - o.score < 0) return 1;
            else if (this.score - o.score > 0) return -1;
            return 0;
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            Person[] people = new Person[N];
            int ranking[][] = new int[4][N];

            ArrayList<Person> peopleList = new ArrayList<>();

            for (int j = 0; j < N; j++) {

                Person temp = new Person(Integer.parseInt(st.nextToken()), j);
                people[j] = temp;
                peopleList.add(temp);

            }

            peopleList.sort(null);
            System.out.println(peopleList.toString()); //

            int rank = 1;
            int count = 0;

            for (int j = 0; j < N; j++) {
                StringBuilder sb = new StringBuilder();

                peopleList.get(j);

                // 3에다가 현재 점수 더하기

            }

        }

    }
}